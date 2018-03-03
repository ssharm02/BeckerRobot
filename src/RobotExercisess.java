
/**
 * INFO16029
 *
 * This class is used as a demo/exercise to introduce students
 * to Becker's robot world.
 * 
 * @author Paul Bonenfant,Georg Feil modified by Parul Kantaria
 */
import becker.robots.*;

public class RobotExercisess {
   public static void main(String[] args) {
      // create a new city object called 'Toronto'
      City toronto = new City();
      
      // create a new robot object in Toronto at the intersection
      // of street 3 and avenue 2.  It is initially pointing East
      Robot karel = new Robot(toronto, 3, 2, Direction.EAST);
      karel.getIcon().setLabel("karel");
      // create a book at the intersection of street 5 and avenue 1
      Thing book = new Thing(toronto, 5, 1);
      book.getIcon().setLabel("book");
      
      // create a ball at the intersection of street 5 and avenue 5
      Thing ball = new Thing(toronto, 5,5);
      ball.getIcon().setLabel("ball");
      
      // create an iPod at the intersection of street 3 and avenue 5 
      Thing iPod = new Thing(toronto, 3, 5);
      iPod.getIcon().setLabel("iPod");
      
      // make some walls (these don't need to have object variables!)
      new Wall(toronto, 1, 3, Direction.EAST);
      new Wall(toronto, 2, 3, Direction.EAST);
      new Wall(toronto, 3, 3, Direction.EAST);
      new Wall(toronto, 4, 3, Direction.EAST);
      new Wall(toronto, 4, 3, Direction.SOUTH);
      new Wall(toronto, 4, 2, Direction.SOUTH);
      
      // WRITE YOUR CODE BELOW THIS LINE

      for (int i =1; i < 2; i++) 
      {
          karel.turnLeft();
      }
      for (int i =1; i < 4; i++)
      {
          karel.move();
      }
      turnRight(karel);
      for (int i = 1; i < 4; i++)
      {
          karel.move();
      }
      turnRight(karel);
      for(int i = 1; i < 4; i++)
      {
          karel.move();
      }
      karel.pickThing();
   
   karel.move();
   karel.move();
   karel.pickThing();
   turnRight(karel);
   for (int i = 1; i < 5; i++)
   {
       karel.move();
   }
   karel.pickThing();
   turnRight(karel);
   
   for (int i = 1; i < 5; i++)
   {
       karel.move();
   }
       turnRight(karel);
       karel.move();
       karel.move();
       karel.putThing(iPod);
       karel.turnLeft();
       karel.move();
       karel.turnLeft();
       for (int i = 1; i < 4; i++)
       {
           karel.move();
       }
       karel.putThing(book);
       karel.turnLeft();
       karel.turnLeft();
       
       for(int i =1; i < 5; i++)
       {
           karel.move();
       }
       turnRight(karel);
       for(int i =1; i < 4; i++)
       {
           karel.move();
           
       }
     karel.putThing();
     karel.move();
     
      
   }
   

   // Method to make a robot turn right using three left turns.
   public static void turnRight(Robot rob) {
       for (int count = 1; count <= 3; count++) {
           rob.turnLeft();
       }
   }
}
