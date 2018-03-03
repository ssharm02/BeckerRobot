
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
public class Assignment5 {

    public static void main(String[] args) {
        City tokyo = new City(10, 10);
        Robot robo1 = new Robot(tokyo, 0, 0, Direction.EAST);
        //invokes the things methods that places at least 16 things insidet the walls 
        createthings(tokyo);
        createWalls(tokyo);
       
        
        //invoke gotointersection method to go through maze
        goToIntersection(robo1,0,7);
        goToIntersection(robo1,1,7);
        goToIntersection(robo1,1,0);
        goToIntersection(robo1,2,0);
        goToIntersection(robo1,2,7);
        goToIntersection(robo1,3,7);
        goToIntersection(robo1,3,0);
        goToIntersection(robo1,4,0);
        goToIntersection(robo1,4,7);
        goToIntersection(robo1,5,7);
        goToIntersection(robo1,5,0);
        
        
        
    }

    //method to create the walls
    public static void createWalls(City city) {
        for(int i=0;i<8;i++){
             new Wall(city, 0, i, Direction.NORTH);
             
             
                new Wall(city, 5, i, Direction.SOUTH);
        }
         for(int i=0;i<6;i++){
              new Wall(city,i,0,Direction.WEST);
                new Wall(city, i,7, Direction.EAST);
         }
    }
    



    //robot only picks up things

    public static void pickThingsUp(Robot r) {

        if (r.canPickThing()) {
            r.pickThing();
        }
    }

    //direction method if needed  

    public static void faceDirection(Robot r, Direction dir) {
        while (r.getDirection() != dir) {
            r.turnLeft();
        }
    }

    //method for the way is blocked 

    public static void getToIntersection(Robot r) {
        while (!r.frontIsClear()) {
            faceDirection(r, Direction.NORTH);
            r.move();
            r.turnLeft();
            

          if (r.canPickThing())
             r.pickThing();
        }
    }

    public static void moveSpace(Robot r) {
        while (r.frontIsClear()) {
            r.move();
        }
        if (r.canPickThing()) {
            r.pickThing();
        }
    }

    //makes the robot turn right
    public static void turnRight(City city, Robot r) {
        for (int i = 0; i < 3; i++) {
            r.turnLeft();
        }
    }
    public static void goToStreet(Robot r, int str){
       int diff = r.getStreet()-str;
       if(diff < 0){
           faceDirection(r,Direction.SOUTH);
           for(int i=0; i <(Math.abs(diff)); i++){
                  r.move();
                  
               while(r.canPickThing()){
                   r.pickThing();
               }
               
           }
       }
       else{
           faceDirection(r,Direction.NORTH);
           for(int i=0; i <(Math.abs(diff)); i++){
               r.move();
               while(r.canPickThing()){
                   r.pickThing();
               }
               
            }
       }
    }
    
    public static void goToAvenue(Robot r, int ave) { 
        int diff = r.getAvenue()-ave;

       if(diff < 0){
           faceDirection(r,Direction.EAST);
           for(int i=0; i <(Math.abs(diff)); i++){
                  r.move();
               while(r.canPickThing()){
                   r.pickThing();
               }

           }
       }
       else{
           faceDirection(r,Direction.WEST);
           for(int i=0; i <(Math.abs(diff)); i++){
               r.move();
               while(r.canPickThing()){
                   r.pickThing();
               }
               
            }
       }
    }
    public static void goToIntersection(Robot b,int street, int avenue) {
        
        goToStreet(b,street);
        goToAvenue(b,avenue);
    }
    
    public static void createthings(City city) {
        for (int i = 1; i <= 16; i++) {
            Thing randomthing = new Thing(city, (int) (0 + Math.random() * 5), (int) (1 + Math.random() * 7));
            System.out.println("The value of i " + i);
        }

    }
}
