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
public class ExamRoboCode {
    public static void main (String [] args) {
        
        City tokyo = new City (10,10);
        Robot karel = new Robot (tokyo, 1,0, Direction.EAST);
        Thing thing1 = new Thing (tokyo, 1,1);
        Thing thing2 = new Thing (tokyo, 1,2);
        Thing thing3 = new Thing (tokyo,1,3);
        Thing thing4 = new Thing (tokyo, 2,2);
        Thing thing5 = new Thing (tokyo, 3,2);
        //main intersection set where the robot has to turn
        Intersection test = new Intersection (tokyo, 1,2);
        //new intersection where the robot has to drop the thing
       //invoke methods to move the robot and coolect things
        
        pickAll(tokyo, karel, test);
        putAll(tokyo, karel, test);
        
    //main method ends   
    }
    //face direction method 
    public static void faceDirection (Robot robo, Direction dir) {
        
        while (robo.getDirection () != dir) {
        robo.turnLeft();
    }
    //face direction method ends
    }

    
    //method to pick all objects in the city with the faceDirection method included in the method
    public static void pickAll(City city, Robot robo, Intersection i) {
    //pick the initial first three things
        while (robo.countThingsInBackpack() < 3) {
        robo.move();
        robo.pickThing();
    }
    //declare direction method to turn the robot around
    faceDirection(robo, Direction.WEST);
    robo.move();
    
    faceDirection(robo, Direction.SOUTH);
    //when there are three things in the backpack
   if (robo.countThingsInBackpack() < 5) {
       //faceDirection(robo, Direction.SOUTH);
       while (robo.countThingsInBackpack() != 5) {
       robo.move();
       robo.canPickThing();
       robo.pickThing();
   }
    }
    }
//
public static void putAll(City city, Robot robo, Intersection i) {
while (robo.countThingsInBackpack() == 5){
    robo.move();
    faceDirection(robo, Direction.WEST);
    robo.move();
    robo.putThing();
    faceDirection(robo, Direction.EAST);
    if(robo.countThingsInBackpack() == 4) {
        robo.move();
        robo.putThing();
    }
    if (robo.countThingsInBackpack() == 3) {
        robo.move();
        robo.putThing();
    }
}
}    
public static void goToIntersection (Robot robo, Intersection i) {
        while (robo.getAvenue() != i.getAvenue()) {
            robo.turnLeft();
            robo.turnLeft();
            robo.move();
            robo.turnLeft();
        }
   
        }

    
}
    
    

