import becker.robots.*;
public class RobotExamCodeTest4 {
  
    public static void main(String[] args) {
        
        City toronto = new City();
        
        Robot karel = new Robot(toronto, 1, 0, Direction.EAST);

        Thing t1 = new Thing(toronto, 1, 1);
        Thing t2 = new Thing(toronto, 1, 2);
        Thing t3 = new Thing(toronto, 1, 3);
        Thing t4 = new Thing(toronto, 2, 2);
        Thing t6 = new Thing(toronto, 3, 2);



//invoke all the methods to move the robot and collect things 
        
       goToIntersection(karel,1,4);

       goToIntersection(karel,1,2);
       goToIntersection(karel,2,2);
       goToIntersection(karel,3,2);
       goToIntersection(karel,4,1);
       putAll(karel);
       goToIntersection(karel,4,2);
       putAll(karel);
       goToIntersection(karel,4,3);
       putAll(karel);
       goToIntersection(karel,4,4);
       
//main class ends
}
public static void pickAll(Robot r){
while (r.canPickThing()){
r.pickThing();
}
}
public static void putAll(Robot r) {
    while (r.countThingsInBackpack () != 0) {
        r.putThing();
    }
}
public static void faceDirection (Robot r, Direction dir) {
 while (r.getDirection() != dir) {
    r.turnLeft();
 }
    
//direction method ends    
}
public static void goToStreet(Robot r, int street){
while (r.getStreet() != street) {
    if (r.getStreet() < street) {
        if(r.canPickThing())
            r.pickThing();
        faceDirection(r, Direction.SOUTH);
    }
    else {
        faceDirection(r, Direction.NORTH);
        
    }
    r.move();
}
//street method ends    
}


public static void goToAvenue (Robot r, int avenue) {
while (r.getAvenue() != avenue) {
    if (r.getAvenue() < avenue ) {
           if (r.canPickThing())
            r.pickThing();
        faceDirection(r, Direction.EAST);
    
    }
    else
    {
        faceDirection(r, Direction.WEST);
    }
    r.move();
}
//goToAvenue method ends
}

public static void goToIntersection (Robot r, int street, int avenue) {
goToStreet(r, street);
goToAvenue(r, avenue);

// end of gotointersection method
}

//end of main class
}
