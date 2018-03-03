/**
 * File name: GetThings1.java
 * 
 * Description: Create the code that will enable karel to pick up all
 * the things. Do it as efficiently as possible using your methods.
 */

import becker.robots.*;

public class GetThings2 {
    
    public static void main(String[] args) {
        
        // Create the city
        City brampton = new City();
        
        // Create the robot at intersection of Street 1 Avenue 0 facing East
        Robot karel = new Robot(brampton, 1, 0, Direction.EAST);
        int answer;
        // Create 6 things in a line
        Thing t1 = new Thing(brampton, 1, 1);
        Thing t2 = new Thing(brampton, 1, 1);
        Thing t3 = new Thing(brampton, 1, 2);
        Thing t4 = new Thing(brampton, 1, 2);
        Thing t5 = new Thing(brampton, 1, 2);
        Thing t6 = new Thing(brampton, 1, 4);
        //call face method and ask the robot to face West
        //faceDirection(karel, Direction.SOUTH);
        goToStreet(karel, 9);
        Intersection i = new Intersection (brampton, 9, 0);
        //set target street
        goToStreet(karel, 1);
//goToStreet(karel, street);
        //goToAvveneu();
        //int targetStr = (brampton, 1, 2);
        //faceDirection();
    // main class ends
    }    
    private int direction = 0; // robot starts at east
     //initial set direction method   
    //public static void faceDirection(Robot karel, Direction dir) {
    // while (karel.getDirection () != dir)
     //{
      //   karel.turnLeft();
    // }
    
    
    //get the robot to move to set street
    public static void goToStreet (Robot karel, int street) {
     while (karel.getStreet() < street)
    //whille loop for the method starts
     {
       //karel.direction == 1;
       
       
        
    }
    while (karel.frontIsClear())
    {
        karel.move();
    }
    }

    public static void goToAvenue (Robot r, int street) {
    
    //karel.getAvenue() < 5;
    
    }
    public static void goToIntersection (Robot r, int street) {
    }
    public int distanceFromStreet(Robot karel, int targetStr) {
    
        int answer;
        if (karel.getStreet() > targetStr) {
        answer = karel.getStreet() - targetStr;
        }
        else {
            answer = targetStr - karel.getStreet();
             }
            return answer;
                    }
       }
        
