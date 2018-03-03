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
public class DeliverParacel {
    public static void main (String[] args) {
        City toronto = new City(10,10);
        Robot aa = new Robot(toronto,2,1,Direction.EAST);
        Thing xBox = new Thing(toronto, 3,3);
        xBox.getIcon().setLabel("xBox");
        
        for (int i = 1; i < 3; i++) 
        {
        aa.move();
        }
        for(int i = 1; i < 4; i++)
        {
         aa.turnLeft();
        }
        aa.move();
        aa.pickThing();
        for(int i = 1; i < 3; i++)
        {
        aa.move();
        }
        for(int i = 1; i<4; i++) 
        {
            aa.turnLeft();
        }
        for (int i =1; i<3; i++)
        {
            aa.move();
        }
        for(int i =1; i<4; i++)
        {
            aa.turnLeft();
        }
        aa.putThing();
        
        for(int i = 1; i < 6; i++)
        {
            aa.move();
        }
        }
    }

