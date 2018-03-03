
import becker.robots.*;
//import javax.swing.JOptionPane;

public class MovetoWall {

    public static void main(String[] arg) {

        // Create the city
        City newYork = new City();
        //new Wall(newYork, 1, 5, Direction.EAST);
        //Exam Review question 4 thing code
        //Thing thing1 = new Thing (newYork, 4,1);
        //Thing thing2 = new Thing (newYork, 4,2);
        //Thing thing3 = new Thing (newYork, 4,3);
        //Thing thing4 = new Thing (newYork, 4,4);
        //Thing thing5 = new Thing (newYork, 4,5);
        //Thing thing6 = new Thing (newYork, 4,6);
           new Wall (newYork, 1, 4, Direction.WEST);
           Thing thing1 = new Thing (newYork, 2,2);
           Thing thing2 = new Thing (newYork,2,3);
           Thing thing3 = new Thing (newYork,2,4);
           
        // Create a robot
        Robot karel = new Robot(newYork, 4, 3, Direction.EAST);
        // WRITE YOUR CODE BELOW THIS LINE    
        
        int size = 2;
        for (int i = 0; i < size; i++) {
            karel.move();
            karel.turnLeft();
        }
        //while (karel.frontIsClear()) {
        //   karel.pickThing();
       //}
       
        
        
        //karel.move();
        //while (karel.canPickThing()) {
          //  karel.pickThing();
            //karel.move();
           // int back = karel.countThingsInBackpack();
            //System.out.println("things" + back);
        //}
        
        
        //karel.move();
        //while (true) {
          //  karel.pickThing();
            //karel.move();
            //while loop ends
       // }
        
        //if (karel.frontIsClear()) {
           // karel.move();
            //karel.pickThing();
            //karel.move();
            //karel.turnLeft();
            //karel.turnLeft();
        //}
        
       // int size = 2;
       // for (int i = 0; i < size; i++) {
            //karel.move();
            //karel.turnLeft();
           // karel.move();
      //  }

//question 4 exam code 
        //while (karel.frontIsClear()) {
        //  karel.move();
        // karel.move();
        //karel.pickThing();
        //}
        //System.out.println();
        //int move;
        //move = moveToWall(karel);
        //System.out.println(move);
    }
    //public static int moveToWall(Robot a){
    //  int moves = 0;
    //while(a.frontIsClear()){
    //  a.move();
    // moves++;
    //}
    //return moves;

}

