/*
 * Course: PROG10082, Section 10082-63753
 * Sarthak Sharma, 030202551
 * Summary:
 */

/**
 *
 * @author SarthaksComp
 */
import becker.robots.*;

public class GoAroundRoadBlock {
public static void main(String[] args) {
// Set up the initial situation       
City ny = new City();


Wall blockAve0 = new Wall(ny, 0, 2, Direction.WEST);
Wall blockAve1 = new Wall(ny, 1, 2, Direction.WEST);

Robot karel = new Robot(ny,0,6,Direction.EAST);
karel.getIcon().setLabel("karel");
Robot mark = new Robot(ny, 0, 2, Direction.WEST);
mark.getIcon().setLabel("mark");
Robot ann = new Robot(ny, 0, 1, Direction.EAST);
ann.getIcon().setLabel("ann");
// mark goes around the roadblock
mark.turnLeft();  //what happens if you remove this line?
for (int i =1; i < 3; i++)
{
    mark.move();
}

for (int i =1; i < 4; i++)
{
mark.turnLeft();
}
for (int i = 1; i < 3; i++)
{
    mark.move();
}
for (int i =1; i < 4; i++)
{
mark.turnLeft();
}
mark.move();
mark.move();

// ann goes to meet mark
for (int i = 1; i < 3; i++)
{
ann.turnLeft();
}
ann.move();

//move karel
for (int i = 1; i < 4; i++)
{
  karel.turnLeft();
}
for (int i = 1; i < 3; i++)
{
    karel.move();
}
for (int i = 1; i < 4; i++)
{
 karel.turnLeft();   
}
for (int i = 1; i < 7; i++)
{
    karel.move();
}
for (int i = 1; i < 4; i++)
{
    karel.turnLeft();
}
for (int i = 1; i < 3; i++)
{
    karel.move();
}
}
}
