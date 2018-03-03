import becker.robots.*;

public class NewClass {
    public static void main(String[] args){
    City toronto = new City(10,10);
    
    Robot luis = new Robot(toronto, 0, 0, Direction.EAST);
    createThing(toronto);
    makeWalls(toronto);
        
    
        goToIntersection(luis,0,7);
        goToIntersection(luis,1,7);
        goToIntersection(luis,1,0);
        goToIntersection(luis,2,0);
        goToIntersection(luis,2,7);
        goToIntersection(luis,3,7);
        goToIntersection(luis,3,0);
        goToIntersection(luis,4,0);
        goToIntersection(luis,4,7);
        goToIntersection(luis,5,7);
        goToIntersection(luis,5,0);
        
    }
    public static void makeWalls(City c){
        for(int i=0;i<8;i++){
             new Wall(c, 0, i, Direction.NORTH);
             
             
                new Wall(c, 5, i, Direction.SOUTH);
        }
         for(int i=0;i<6;i++){
              new Wall(c,i,0,Direction.WEST);
                new Wall(c, i,7, Direction.EAST);
         }
    }
    
    
    public static void createThing(City toronto){
        for(int i = 0; i < 15; i++){
            Thing ball = new Thing(toronto, (int)(0+Math.random()*5), (int)(1+Math.random()*7));
        }
    }
    public static void faceDirection(Robot a, Direction dir){
       while (a.getDirection()!= dir){
            a.turnLeft();
       }
    }
    public static void goToStreet(Robot r, int str){
       int diff = r.getStreet()-str;
       if(diff < 0){
           faceDirection(r,Direction.SOUTH);
           for(int i=0; i <(Math.abs(diff)); i++){
                  r.move();
                  
               while(r.canPickThing()){
                   r.pickThing();
               }
               
           }
       }
       else{
           faceDirection(r,Direction.NORTH);
           for(int i=0; i <(Math.abs(diff)); i++){
               r.move();
               while(r.canPickThing()){
                   r.pickThing();
               }
               
            }
       }
    }
    
    public static void goToAvenue(Robot r, int ave) { 
        int diff = r.getAvenue()-ave;

       if(diff < 0){
           faceDirection(r,Direction.EAST);
           for(int i=0; i <(Math.abs(diff)); i++){
                  r.move();
               while(r.canPickThing()){
                   r.pickThing();
               }

           }
       }
       else{
           faceDirection(r,Direction.WEST);
           for(int i=0; i <(Math.abs(diff)); i++){
               r.move();
               while(r.canPickThing()){
                   r.pickThing();
               }
               
            }
       }
    }

    public static void goToIntersection(Robot b,int street, int avenue) {
        
        goToStreet(b,street);
        goToAvenue(b,avenue);
    }
}