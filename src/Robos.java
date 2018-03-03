/*************** runtime.java**************/
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Launch;
 
import becker.robots.*;
 
/**
 *
 * @author Jean-Mathieu
 */
public class Robos {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City city = new City(15, 12);
        RobotImproved aRobot = new RobotImproved(city, 2, 2, Direction.EAST);
         
        createWalls(city);
        createThings(city);
         
        if(!aRobot.goToAvenue(4,10)){
            System.out.println("We coult not reach the avenue...");
        }
        if(!aRobot.goToStreet(10,4)){
            System.out.println("We could not reach the street...");
        }
 
    }
 
    private static void createWalls(City city) {
        int i = 5;
        int y = 0;
        Wall w1 = new Wall(city, i, y++, Direction.SOUTH);
        Wall w2 = new Wall(city, i, y++, Direction.SOUTH);
        Wall w3 = new Wall(city, i, y++, Direction.SOUTH);
        Wall w4 = new Wall(city, i, y++, Direction.SOUTH);
        Wall w5 = new Wall(city, i, y++, Direction.SOUTH);
        Wall w6 = new Wall(city, i, y++, Direction.SOUTH);
        Wall w7 = new Wall(city, i, y++, Direction.SOUTH);
        Wall w8 = new Wall(city, i, y++, Direction.SOUTH);
        Wall w9 = new Wall(city, i, y++, Direction.SOUTH);
        Wall w10 = new Wall(city, i, y++, Direction.SOUTH);
         
        //Wall w11 = new Wall(city, 2, 2, Direction.SOUTH);
        Wall w111 = new Wall(city, 2, 1, Direction.SOUTH);
        Wall w1111 = new Wall(city, 2, 3, Direction.SOUTH);
        Wall w12 = new Wall(city, 2, 3, Direction.EAST);
        Wall w13 = new Wall(city, 2, 1, Direction.NORTH);
        Wall w133 = new Wall(city, 2, 2, Direction.NORTH);
        Wall w1333 = new Wall(city, 2, 3, Direction.NORTH);
        Wall w14 = new Wall(city, 2, 1, Direction.WEST);
    }
 
    private static void createThings(City city) {
        for (int i = 3; i < 15; i++) {
            Thing th = new Thing(city, 3, i);
        }
    }
 
}
 
/*************** RobotImproved.java**************/
 
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Launch;
 
import becker.robots.*;
 
/**
 *
 * @author Jean-Mathieu
 */
public class RobotImproved extends RobotSE {
 
    public RobotImproved(City c, int street, int avenue, Direction d) {
        super(c, street, avenue, d, 100);
    }
 
    /**
     * 
     * @param street GoTo Location
     * @param avenue Check if we are at the correct location
     * @return true if we are fine or false if we are stuck
     */
    public boolean goToStreet(int street,int avenue) {
        int counter = 0;
        if (this.getStreet() < street) {
            faceSouth();
        } else {
            faceNorth();
        }
        while (this.getStreet() != street) {
            System.out.println("Counter Street: " + counter);
            if (counter < 30) {
                if (counter >= 4) {
                    if (!this.frontIsClear()) {
                        this.turnLeft();
                        if (this.frontIsClear()) {
                            move();
                            if (!this.frontIsClear()) {
                                this.turnLeft();
                            }
                        }
                    } else {
                        this.turnLeft();
                        if (this.frontIsClear()) {
                            move();
                            counter--;
                            if (this.getStreet() < street) {
                                faceSouth();
                            } else {
                                faceNorth();
                            }
                        }
 
                    }
                    counter++;
                } else {
                    System.out.println("Less then 4 Street...");
                    if (this.frontIsClear()) {
                        move();
                        if (this.getStreet() < street) {
                                faceSouth();
                            } else {
                                faceNorth();
                            }
                    }else{
                        this.turnLeft();
                        counter++;
                    }
                }
                if (!frontIsClear()) {
                    counter++;
                } else {
                    counter--;
                }
            } else {
                return false;
            }
        }
        if(this.getAvenue()!= avenue){
             goToAvenue(avenue,street);
        }
        return true;
    }
 
    /**
     * 
     * @param avenue GoToLocation
     * @param street Check if we are at the correct location
     * @return true if we are fine or false if we are stuck
     */
    public boolean goToAvenue(int avenue,int street) {
        int counter = 0;
        if (this.getAvenue() < avenue) {
            faceEast();
        } else {
            faceWest();
        }
        while (this.getAvenue() != avenue) {
            System.out.println("Counter Avenue: " + counter);
            if (counter < 30) {
                if (counter >= 4) {
                    if (!this.frontIsClear()) {
                        this.turnRight();
                        if (this.frontIsClear()) {
                            move();
                            if (!this.frontIsClear()) {
                                this.turnRight();
                            }
                        }
                    } else {
                        this.turnRight();
                        if (this.frontIsClear()) {
                            move();
                            counter--;
                            if (this.getAvenue() < avenue) {
                                faceEast();
                            } else {
                                faceWest();
                            }
                        }
                    }
                    if (!frontIsClear()) {
                        counter++;
                    } else {
                        counter--;
                    }
 
                } else {
                    System.out.println("Less then 4 Avenue...");
                    if (this.frontIsClear()) {
                        move();
                    }
                    if (!this.frontIsClear()) {
                        this.turnRight();
                        counter++;
                    }
                }
            } else {
                return false;
            }
        }
        if(this.getStreet()!= street){
             goToStreet(street,avenue);
        }
        return true;
    }
 
    public void pickAll() {
        if (this.canPickThing()) {
            this.pickThing();
        }
    }
 
    public void putAll() {
        if (!this.canPickThing()) {
            this.putThing();
        }
    }
 
    public boolean pickAllAtIntersection(int street, int avenue) {
        goToStreet(street,avenue);
        goToAvenue(avenue,street);
        pickAll();
        return true;
    }
 
    public boolean putAllAtIntersection(int street, int avenue) {
        goToStreet(street,avenue);
        goToAvenue(avenue,street);
        putAll();
        return true;
    }
 
    public void move() {
        super.move();
    }
 
    public void faceEast() {
        while (this.getDirection() != Direction.EAST) {
            this.turnRight();
        }
    }
 
    public void faceWest() {
        while (this.getDirection() != Direction.WEST) {
            this.turnRight();
        }
    }
 
    public void faceNorth() {
        while (this.getDirection() != Direction.NORTH) {
            this.turnRight();
        }
    }
 
    public void faceSouth() {
        while (this.getDirection() != Direction.SOUTH) {
            this.turnRight();
        }
    }
}