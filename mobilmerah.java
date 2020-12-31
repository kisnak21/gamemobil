import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class mobilmerah extends parent
{
    int speed = 5;
    
    public void act() 
    {
       mobilmerah a = new mobilmerah();
       Actor i = getOneIntersectingObject(mobilmerah.class);
       move(speed);
       checkdouble(i);
       end();
    }    
}
