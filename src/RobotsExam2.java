/*
* Course: PROG10082, Section 1159_63753
* Wladyslaw Bronowicki, 991 402 577
* Program Description
*/


import becker.robots.*;

public class RobotsExam2 {

    public static void main(String[] args) {

        City toronto = new City();

        Robot karel = new Robot(toronto, 1, 0, Direction.EAST);

        Thing t1 = new Thing(toronto, 1, 1);

        Thing t2 = new Thing(toronto, 1, 2);

        Thing t3 = new Thing(toronto, 1, 3);

        Thing t4 = new Thing(toronto, 2, 2);

        Thing t5 = new Thing(toronto, 3, 2);

        //write your code here

 goToIntersection(karel, 1, 3, true);
 faceDirection(karel, Direction.WEST);
 karel.move();
 goToIntersection(karel, 3, 2, true);
 goToIntersection(karel, 4, 1, false);
 faceDirection(karel, Direction.EAST);
 karel.putThing();
 karel.move();
 karel.putThing();
 karel.move();
 putAll(karel);
 karel.move();



    }

 public static void pickAll(Robot bob){

  while(bob.canPickThing()){
   bob.pickThing();  

  }

 } 
 public static void putAll(Robot bob){

  while(bob.countThingsInBackpack() > 0){
   bob.putThing();  
  }
 }
 
 public static void faceDirection(Robot bob, Direction wantsToFace){
  while(bob.getDirection() != wantsToFace){
   bob.turnLeft();
  }
 }

 public static void moveSpaces(Robot bob, int spaces, boolean pickthings){
  
  pickAll(bob);

  for(int i = 0; i < spaces; i++){
   
   bob.move();
   if(pickthings)
   pickAll(bob);

  }

 }

 
 public static void goToIntersection(Robot bob, int street, int ave, boolean pickthings){

  if(bob.getStreet() < street){
   
   faceDirection(bob, Direction.SOUTH);

  }
  else{

   faceDirection(bob, Direction.NORTH);

  }
                System.out.println(Math.abs(bob.getStreet() - street));
  moveSpaces(bob,Math.abs(bob.getStreet() - street), pickthings);


  
  if(bob.getAvenue() < ave){
   
   faceDirection(bob, Direction.EAST);

  }
  else{

   faceDirection(bob, Direction.WEST);

  }
  moveSpaces(bob,Math.abs(bob.getAvenue() - ave), pickthings);
  System.out.println(Math.abs(bob.getAvenue() - ave));
  


 }



}