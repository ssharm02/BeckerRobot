
import becker.robots.*;

public class ExamPractice2 {

    public static void main(String[] args) {

        City toronto = new City();

        Robot karel = new Robot(toronto, 1, 5, Direction.EAST);
        Intersection i = new Intersection(toronto, 1, 6);
        Thing t1 = new Thing(toronto, 1, 1);
        Thing t2 = new Thing(toronto, 1, 2);
        Thing t3 = new Thing(toronto, 1, 3);
        Thing t4 = new Thing(toronto, 2, 2);
        Thing t6 = new Thing(toronto, 3, 2);

        //if front is clear robot picks things
        
//        goToIntersection(karel, 1, 1);
//        pickAll(karel);
//        goToIntersection(karel, 1,2);
//        pickAll(karel);
//        goToIntersection(karel, 1,3);
//        pickAll(karel);
//        //faceDirection(karel, Direction.WEST);
//        //collect the three things
//        
//        //turn around and head back to the intersection 1,3
//        
//        goToIntersection(karel, 1,2);
        
        //face south at the intersection
        //faceDirection(karel, Direction.SOUTH);
//        goToStreet(karel, 2);
//        goToAvenue(karel,2);
//        pickAll(karel);
//        goToStreet(karel,3);
//        goToAvenue(karel,2);
//        pickAll(karel);
//        //picked up the remain objects
//        
//        
//        //faceDirection (karel, Direction.WEST);
//        goToAvenue(karel, 1);
//        putAll(karel);
//        goToIntersection(karel, 4,1);
//        pickAll(karel);
//        goToIntersection(karel, 4,2);
//        putAll(karel);
//        goToIntersection(karel, 4,3);
//        putAll(karel);
        
        
        //TESTING AVENUE AND STREET METHODS
        
        //
        ///goToStreet(karel, 2);
        goToAvenue(karel,1);
    }

    public static void goToIntersection(Robot r, int street, int avenue) {
        goToStreet(r, street);
        goToAvenue(r, avenue);
    }
    public static void goToStreet(Robot r, int street) {
        while (r.getStreet() != street) {
            if (r.getStreet() < street) {
                faceDirection(r, Direction.SOUTH);

            } else {
                faceDirection(r, Direction.NORTH);
            }
            r.move();
        }
    }
    public static void goToAvenue(Robot r, int avenue) {
        while (r.getAvenue() != avenue) {
            if (r.getAvenue() < avenue) {
                faceDirection(r, Direction.EAST);
            } else {
                faceDirection(r, Direction.WEST);
            }
            r.move();
        }
    }
    public static void pickAll(Robot r) {
        while (r.canPickThing()) {
            r.pickThing();     
        }
    }
    public static void faceDirection(Robot r, Direction dir) {
        while (r.getDirection() != dir) {
            r.turnLeft();
        }
    }
    public static void putAll(Robot r) {
        while (r.countThingsInBackpack() != 0 ) {
            r.putThing();
        }
    }
//end of the public class
}
