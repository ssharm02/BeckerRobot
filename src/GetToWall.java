import becker.robots.*;
//import javax.swing.JOptionPane;

public class GetToWall {
    
    public static void main(String[] arg) {
        
        // Create the city
        City newYork = new City();
        new Wall(newYork, 1, 5, Direction.EAST);
        
        // Create a robot
        Robot karel = new Robot(newYork, 1, 0, Direction.EAST);
        // WRITE YOUR CODE BELOW THIS LINE    
        
        System.out.println();
        int move;
        move = moveToWall(karel);
        System.out.println(move);
    }
    public static int moveToWall(Robot a){
        int moves = 0;
        while(a.frontIsClear()){
            a.move();
        moves++;
        }
        return moves;
        
    }
}