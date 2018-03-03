import becker.robots.*;
public class RoboticMethods2
{
  public static void main(String[] args) 
  {
    // int i;
     //int g;
      City toronto = new City(10, 10);
     Robot me = new Robot(toronto, 3, 0, Direction.EAST, 10); 
     Wall w=new Wall(toronto,3,3,Direction.EAST);
     Wall w1=new Wall(toronto,4,3,Direction.EAST);
     Wall w2=new Wall(toronto,5,3,Direction.EAST);
       
     //create robot
       Robot me1 = new Robot(toronto, 2, 0, Direction.EAST, 10); 
       //individual things
       //
       //create random things
      
       generateThings(toronto);
       
       //Thing t1=new Thing(toronto,2,1);
      // Thing t2=new Thing(toronto,2,2);
      /// Thing t3=new Thing(toronto,2,3);
       //Thing t4=new Thing(toronto,2,4);
       
       me.move();
       moveToWall(me);

       me1.move();
       pickAll(me1);
      
}
//method declearation 1 move while the way is clear
private static void moveToWall(Robot robot)
  { 
      while (robot.frontIsClear())
      { 
            robot.move(); 
      } 
 }
//method decleration 2 pick asll the objects
public static void pickAll(Robot r)
  {
    while(r.canPickThing())
    {
        r.pickThing();
        r.move();
    }
}
 public static void generateThings(City city){
      int g = (int) (1+Math.random()*4);
              for (int i = 1; i <= g; i++){
      Thing newthing = new Thing (city, 1,0);
      System.out.println("the value of g is " + g);
      System.out.println("the value of i is " + i);
}
 }
}
