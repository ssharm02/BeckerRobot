import becker.robots.*;
public class Roboticmethods21
{
  public static void main(String[] args)
  {
     City city = new City(10,10);
     Robot robbie= new Robot(city, 1, 1, Direction.EAST);
     faceDirection(robbie, Direction.SOUTH);
     goToStreet(robbie,3);
      
     Robot rob= new Robot(city, 2, 0, Direction.EAST);
     Intersection a = new Intersection(city, 2, 3);
     goTointersection(rob,a);
     
     Robot me = new Robot(city, 4, 0, Direction.EAST, 5); 
      me.move();
      putAll(me);

  }
  //robot faces particular direction
  public static void faceDirection(Robot r, Direction dir) 
  {
    while (r.getDirection() != dir)
    {
        r.turnLeft();
    }
  }
  public static void goToStreet(Robot r, int street)
  {
     while(r.getStreet() != street)
     {
         r.move();
     }
  }
  public static void goTointersection(Robot r, Intersection i)
  {
      if(r.getIntersection() != i)
      {
          r.move();
          r.move();
      }
  }
  public static void putAll(Robot r)
  {
    int t=r.countThingsInBackpack(); 
    while(t>0)
    {
        r.putThing();
        r.move();
        t--;        
    }
  }

}