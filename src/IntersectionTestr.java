import becker.robots.*;
public class IntersectionTestr
{
  public static void main(String[] args)
  {
     City city = new City(10,10);
     Robot rob= new Robot(city, 2, 0, Direction.EAST);
     Intersection a = new Intersection(city, 4, 3);
     goTointersection(rob,a);
  }

  public static void goTointersection(Robot r, Intersection i)
  {
      while(r.getAvenue() != i.getAvenue())
      {
          r.move();
      }
      while(r.getStreet() != i.getStreet())
      {
          faceDirection(r, Direction.SOUTH);
          r.move();
      }
  }
  public static void faceDirection(Robot r, Direction dir) 
  {
    while (r.getDirection() != dir)
    {
        r.turnLeft();
    }
  }
}
  