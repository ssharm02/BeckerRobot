
/**
 * File name: GetThings1.java
 * 
 * Description: Create the code that will enable karel to pick up all
 * the things. Do it as efficiently as possible using your methods.
 */

import becker.robots.*;

public class Exercise5 {
    
    public static void main(String[] args) {
        
        // Create the city
        City brampton = new City();
        
        // Create the robot at intersection of Street 1 Avenue 0 facing East
        Robot karel = new Robot(brampton, 1, 0, Direction.EAST);
        
        // Create 6 things in a line
        Thing t1 = new Thing(brampton, 1, 1);
        Thing t2 = new Thing(brampton, 1, 1);
        Thing t3 = new Thing(brampton, 1, 2);
        Thing t4 = new Thing(brampton, 1, 2);
        Thing t5 = new Thing(brampton, 1, 2);
        Thing t6 = new Thing(brampton, 1, 4);
        Intersection i= new Intersection(brampton,1,1);
        
        //call all the methods
        int countThingsInBackpack;
        //call method and face a particular direction
        faceDirection(karel,Direction.SOUTH);
        //goto target street since initial street is different
        goTOStreet(karel,4); 
        //call face direction method to face the correct direction
        faceDirection1(karel,Direction.EAST);
        //goto correct avenue and collect the things
        goTOAvenue(karel,1);
       //call goto the intersection method and pick up all things
        goTointersection(karel,i);
        faceDirection2(karel, Direction.EAST);
       // System.out.println("The number of things in robos backpack are " + counThingsInBackpack(karel));
    }
    //face direction method
    public static void faceDirection(Robot r,Direction dir){
      while(r.getDirection() !=dir)
    {
        r.turnLeft();
    }
    }
    //goto street method
    public static void goTOStreet(Robot s,int i){
      while (s.getStreet() !=i){
        s.move();
    }  
    }
    //face direction method
     public static void faceDirection1(Robot r,Direction dir1){
      while(r.getDirection() !=dir1)
    {
        r.turnLeft();
    }
    }
     //goto avenue
   public static void goTOAvenue(Robot m,int j){
       while(m.getAvenue() !=j){
           m.move();
       }
   }
   //goto intersection method
   public static void goTointersection(Robot r, Intersection i)
  {
      while(r.getAvenue() != i.getAvenue())
      {
          r.move();
      }
      while(r.getStreet() != i.getStreet())
      {
          faceDirection(r, Direction.NORTH);
          r.move();
      }
  }
   //pick things up
  public static void faceDirection2(Robot r, Direction dir) 
  {
    while (r.getDirection() != dir)
    {
        r.turnLeft();
    }
       do{
      r.pickThing();
      
      }   while(r.countThingsInBackpack()<2);
       r.move();
       do{
      r.pickThing();
      
      }   while(r.countThingsInBackpack()<5);
       r.move();
       r.move();
       do{
      r.pickThing();
      
      }   while(r.countThingsInBackpack()<6);
       r.move();
               
  }
  

}