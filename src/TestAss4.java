public class TestAss4 {
  public static void main(String[]args)
  {
    City toronto = new City(10,10);
    Robot aa=new Robot(toronto,0,6,Direction.WEST);
    for(int i=0;i<=1;i++){
    Wall w= new Wall(toronto,i,0,Direction.WEST);
    }
    for(int a=0;a<=1;a++){
    Wall w4= new Wall(toronto,0,a,Direction.NORTH);
    }
    for(int b=0;b<=1;b++){
    Wall w6= new Wall(toronto,b,1,Direction.EAST);
    }
     Wall w2= new Wall(toronto,1,0,Direction.SOUTH);
    Wall w3= new Wall(toronto,1,0,Direction.EAST);
 
     int num= (int)(Math.random()*4);
    for(int i=0;i<=num;i++){
    Thing t = new Thing(toronto,1,0);
    }
       while(aa.frontIsClear()){aa.move();}
      if(!aa.frontIsClear()){ aa.turnLeft();}
   
    aa.move();aa.move();  
     for(int i=0;i<=2;i++)
    {aa.turnLeft();}
 
    aa.move();
    for(int i=0;i<=2;i++)
    {aa.turnLeft();} 
    
    for(int i=0; i<=6;i++){
    if(aa.frontIsClear()){
    aa.move(); 
    {while( aa.canPickThing())
         aa.pickThing();
     }
    }
   if(!aa.frontIsClear()){
      aa.turnLeft();
      }
   }
  
    aa.turnLeft();
    aa.move();
    for(int i=0;i<=2;i++)
    {aa.turnLeft();}
    aa.move();
    aa.move();
 
  
int b=aa.countThingsInBackpack();
if(b%2==0){
       aa.turnLeft();aa.move();
       for(int i=0;i<b;i++){
            aa.putThing();
            aa.move();}
}
else{
aa.turnLeft();
aa.move();
 for(int i=0;i<=2;i++)
    {aa.turnLeft();}
  for(int i=0;i<b;i++){
            aa.putThing();
            aa.move();}
}
  
  
  }
}/*

    

