import becker.robots.*;

public class MovetoWall2 {
    public static void main(String[] args) {
        // create a new city object called 'Toronto'
        City toronto = new City();
        
        // create a new robot object in Toronto at the intersection
        // of street 3 and avenue 2.  It is initially pointing East
        Robot karel = new Robot(toronto, 3, 2, Direction.EAST);
        
        // create a book at the intersection of street 5 and avenue 1
        Thing book = new Thing(toronto, 5, 1);
        book.getIcon().setLabel("book");
        
        // create a ball at the intersection of street 5 and avenue 5
        Thing ball = new Thing(toronto, 5, 5);
        ball.getIcon().setLabel("ball");
        
        // create an iPod at the intersection of street 3 and avenue 5 
        Thing iPod = new Thing(toronto, 3, 5);
        iPod.getIcon().setLabel("iPod");
        
        // make some walls (these don't need to have object variables!)
        makeWalls(toronto);
        
        // WRITE YOUR CODE BELOW THIS LINE
        // face North
        karel.turnLeft();
        
        moveSpace(karel,3);// move up to street 0
        
        
        // face East
        turnRight(karel);
        
        // move to avenue 5
        moveSpace(karel,3);
        
        // face South
        turnRight(karel);
        
        // move to street 3
        moveSpace(karel,3);
        
        // pick up the iPod
        karel.pickThing();
        
        // move to street 5
        moveSpace(karel,2);  
        
        // pick up the ball
        karel.pickThing();
        
        // face West
        turnRight(karel);
        
        // move to avenue 1
        moveSpace(karel,4); 
        
        // pick up the book
        karel.pickThing();
        
        // go to street 0 avenue 0
        karel.move();
        turnRight(karel);
        moveSpace(karel,5);
        
        // put down the book
        karel.putThing();
        
        // go to street 1 avenue 3
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        moveSpace(karel,3);
        
        // put down the ball
        karel.putThing();
        
        // go down to street 4 
        turnRight(karel);
        moveSpace(karel,3);
        
        // put down the iPod
        karel.putThing();
    }
    
    // Method to make a robot turn right using three left turns.
    public static void turnRight(Robot rob) {
        for (int count = 1; count <= 3; count++) {
            rob.turnLeft();
        }
    }
    public static void moveSpace(Robot ann, int a){
        for (int i=0; i < a; i++)
            ann.move();
    }
    
    // Private method to create some walls
    private static void makeWalls(City city) {
        new Wall(city, 1, 3, Direction.EAST);
        new Wall(city, 2, 3, Direction.EAST);
        new Wall(city, 3, 3, Direction.EAST);
        new Wall(city, 4, 3, Direction.EAST);
        new Wall(city, 4, 3, Direction.SOUTH);
        new Wall(city, 4, 2, Direction.SOUTH);
    }
}