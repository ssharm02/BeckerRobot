
import becker.robots.*;
/*
 * Course: PROG10082, Section 10082-63753
 * Sarthak Sharma, 030202551
 * Summary:
 */

/**
 *
 * @author SarthaksComp
 */
public class Assignment4 {

    public static void main(String[] args) {
        //set up new city for the assingment

        City toronto = new City();

        int count = 1;
        for (int i = 0; i < ((int) (1 + Math.random() * 4)); i++) {
            Thing newthing = new Thing(toronto, 1, 0);
            count++;
        }

        Robot robo1 = new Robot(toronto, 0, 6, Direction.WEST);
        robo1.getIcon().setLabel("MrRobo");

        makeWalls(toronto);

        //move robot to the first thing inside the walls
        moveSpace(robo1, 4);
        robo1.turnLeft();
        moveSpace(robo1, 2);
        turnRight(robo1);
        moveSpace(robo1, 1);
        turnRight(robo1);
        moveSpace(robo1, 2);
        robo1.turnLeft();
        moveSpace(robo1, 1);
        robo1.turnLeft();
        robo1.move();
        for (int j = 1; j < count; j++) {
            robo1.pickThing();
        }
        //goto avenue 2,2
        robo1.turnLeft();
        robo1.turnLeft();
        robo1.move();
        turnRight(robo1);
        moveSpace(robo1, 1);
        turnRight(robo1);
        moveSpace(robo1, 2);
        robo1.turnLeft();
        moveSpace(robo1, 1);

        //drop even things
        if (count == 2) {
            robo1.putThing();
        } //drop odd things
        else if (count == 3) {
            robo1.putThing();
            moveSpace(robo1, 1);
            robo1.putThing();
        } //drop even things
        else if (count == 4) {
            robo1.putThing();
            turnRight(robo1);
            moveSpace(robo1, 1);
            robo1.putThing();
            moveSpace(robo1, 1);
            robo1.putThing();
        } else {
            robo1.putThing();
            moveSpace(robo1, 1);
            robo1.putThing();
            moveSpace(robo1, 1);
            robo1.putThing();
            moveSpace(robo1, 1);
            robo1.putThing();
        }
    }

    //move method

    public static void moveSpace(Robot robo1, int a) {
        for (int i = 0; i < a; i++) {
            robo1.move();
        }
    }
//turn right method

    public static void turnRight(Robot rob) {
        for (int count = 1; count <= 3; count++) {
            rob.turnLeft();
        }
    }

    //method that creates the walls

    private static void makeWalls(City city) {
        Wall blockAve0 = new Wall(city, 0, 0, Direction.NORTH);
        Wall blockAve3 = new Wall(city, 0, 1, Direction.NORTH);
        Wall blockAve7 = new Wall(city, 1, 0, Direction.SOUTH);
        Wall blockAve6 = new Wall(city, 1, 0, Direction.EAST);
        Wall blockAve1 = new Wall(city, 0, 0, Direction.WEST);
        Wall blockAve2 = new Wall(city, 1, 0, Direction.WEST);
        Wall blockAve4 = new Wall(city, 0, 1, Direction.EAST);
        Wall blockAve5 = new Wall(city, 1, 1, Direction.EAST);
    }

//main method ends
}
