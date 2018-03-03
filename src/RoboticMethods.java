import becker.robots.*;
public class RoboticMethods
{
  public static void main(String[] args) 
  {
     //Class city class name toronto = new(object creation) City (object)(10, 10 grid)
     City toronto = new City(10, 10);
     //Robot class (robot name me) = new robot object(placed in the city of toronto, placement and direction)
     Robot me = new Robot(toronto, 3, 0, Direction.EAST, 10); 
     moveSpaces(me,3);
     turnRight(me);
     moveSpaces(me,3);
}
public static void turnRight(Robot r)
{ 
    for (int i = 0; i < 3; i++) 
    { 
        r.turnLeft(); 
    } 
}
public static void moveSpaces(Robot robot, int numberOfSpaces)
{ 
    for (int i = 0; i < numberOfSpaces; i++)
    { 
        robot.move(); 
    } 
}

}
