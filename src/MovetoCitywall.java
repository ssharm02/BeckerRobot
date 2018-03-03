import becker.robots.*;


public class MovetoCitywall {
    public static void main(String[] args) {
      
        // Set up the initial situation
        City ny = new City();
        new Wall(ny, 0, 3, Direction.WEST);
        new Wall(ny, 1, 3, Direction.WEST);
        new Wall(ny, 5, 2, Direction.SOUTH);
        new Wall(ny, 5, 3, Direction.SOUTH);
     
        Thing iPod = new Thing(ny, 0, 3);
        iPod.getIcon().setLabel("iPod");
      
        Thing book = new Thing(ny, 1, 2);
        book.getIcon().setLabel("book");

        Robot mark = new Robot(ny, 0, 6, Direction.WEST);
        mark.getIcon().setLabel("mark");
        Robot ann = new Robot(ny, 0, 0, Direction.EAST);
        ann.getIcon().setLabel("ann");
      
        // WRITE YOUR CODE BELOW THIS LINE
        moveSpace(mark,3);
        mark.pickThing();
        //deliver St5 to Ave2
        mark.turnLeft();
        moveSpace(mark,5);
        turnRight(mark);
        mark.move();
        
        //ann pick book
        moveSpace(ann,2);
        turnRight(ann);
        ann.move();
        ann.pickThing();
        moveSpace(ann,4);
        
        mark.putThing();
        ann.putThing();
    }
    public static void turnRight(Robot rob) {
        for (int count = 1; count <= 3; count++) {
            rob.turnLeft();
        }
    }
    public static void moveSpace(Robot ann, int a){
        for (int i=0; i < a; i++)
            ann.move();
    }
    public static void movetoWall(Robot a){
        while(a.frontIsClear()){
            a.move();
        }
    }
}