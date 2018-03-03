import becker.robots.*;

public class ROBOTest {

    public static void main(String[] arg) {
        City to = new City();
        makeWalls(to);
        Robot bob = new Robot(to, 1, 1, Direction.EAST, 50);

        makeWalls(to);
        makeThings(to);
        int i = 0;

        do {
            moveTowall(bob);
            ChangeDir(bob);
            moveTowall(bob);
            i++;
        } while (i < 6);
    }

    public static void makeWalls(City to) {
        for (int i = 1; i < 9; i++) {
            Wall w1 = new Wall(to, 1, i, Direction.NORTH);
            Wall w2 = new Wall(to, i, 8, Direction.EAST);
            Wall w3 = new Wall(to, 8, i, Direction.SOUTH);
            Wall w4 = new Wall(to, i, 1, Direction.WEST);
        }
    }

    public static void makeThings(City to) {
        for (int i = 0; i < 20; i++) {
            Thing species = new Thing(to, (int) (1 + Math.random() * 8), (int) (1 + Math.random() * 8));
        }
    }

    public static void turnRight(Robot bob) {
        bob.turnLeft();
        bob.turnLeft();
        bob.turnLeft();
    }

    public static void moveTowall(Robot bob) {
        while (bob.frontIsClear()) {
            pickThings(bob);
            bob.move();
            pickThings(bob);

        }

    }

    public static void ChangeDir(Robot bob) {
        if (bob.getDirection() == Direction.EAST) {
            turnRight(bob);
            bob.move();
            turnRight(bob);

        } else {
            bob.turnLeft();
            bob.move();
            bob.turnLeft();
        }
    }

    public static void pickThings(Robot s) {
        while (s.canPickThing()) {
            s.pickThing();
        }

    }

}
