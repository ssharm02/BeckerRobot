public static void pickAll(Robot nameOfRobot) {
 while (nameOfRobot.canPickThing()) {
  nameOfRobot.pickThing();
 }
}
public static void faceDirection(Robot nameOfRobot, Direction direction) {
 while (nameOfRobot.getDirection() != direction) {
  nameOfRobot.turnLeft();
 }
}
public static void goToStreet(Robot nameOfRobot, int street) {
 while (nameOfRobot.getStreet() != street) {
  if (nameOfRobot.getStreet() < street) {
   faceDirection(nameOfRobot, Direction.SOUTH);
  }
  else {
   faceDirection (nameOfRobot, Direction.NORTH);
  }
  nameOfRobot.move();
 } 
}
public static void goToAvenue(Robot nameOfRobot, int avenue) {
 while (nameOfRobot.getAvenue() != avenue) {
  if (nameOfRobot.getAvenue() < avenue) {
   faceDirection(nameOfRobot, Direction.EAST);
  }
  else {
   faceDirection (nameOfRobot, Direction.WEST);
  }
  nameOfRobot.move();
 } 
}
public static void goToIntersection(Robot nameOfRobot, int street, int avenue) {
 goToStreet(nameOfRobot, street);
 goToAvenue(nameOfRobot, avenue);
}
public static void putAll(Robot nameOfRobot) {
    while (nameOfRobot.countThingsInBackpack() != 0) {
        nameOfRobot.putThing();
    }
}