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
public class Robots {
    public static void main (String [] args ) {
        // new = object creation keyword
        // new City class ojbect
        // new Robot object
        
        //first 10 street second argument avenue
        //screen kown as city 
        City toronto = new City(10,10);
        //robot creation pass parameteres
        //robot created in toronto city
        //second street and first avenue
        //directions also required
        //one city multiple robots
        Robot aa = new Robot(toronto,5,5,Direction.WEST);
        aa.getIcon().setLabel("BOB");
       //aa.setColor(Color.yellow);
        //Robot bb = new Robot(toronto,5,6,Direction.WEST);
        //bb.getIcon().setLabel("Dofus");
       //Robot cc = new Robot(toronto,7,2,Direction.SOUTH);
        
        Thing t1 = new Thing(toronto, 3,3);
        t1.getIcon().setLabel("Dob");
        Thing t2 = new Thing(toronto, 4,4);
        t2.getIcon().setLabel("Sarthak");
        Thing t3 = new Thing(toronto, 5,5);
        t3.getIcon().setLabel("Hello");
        Thing t4 = new Thing(toronto,6,6);
        t4.getIcon().setLabel("Horse");
        
   
        Wall w1 = new Wall(toronto,5,2, Direction.EAST);
        Wall w2 = new Wall(toronto,6,2, Direction.EAST);
        
        
        //int getStreet = 0;
        
        //System.out.println("the current position of the robot is " + getStreet(aa));
        
        while (aa.countThingsInBackpack() < 4)
        {   aa.move();
            aa.pickThing();
        }
        while (aa.frontIsClear()) {
         aa.move();
         }
        
        
           aa.turnLeft();
           aa.move();
         }
                
        
       
        
        //for (int i =0; i<3; i++) 
        //{
          //  bb.move();
        //}
       // bb.turnLeft();
        //bb.move();
        //bb.pickThing();
       
        //for (int i = 0; i<2; i++)
        //{

            
    //}
}

