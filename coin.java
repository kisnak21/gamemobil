import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class coin extends parent
{
    int speed=4;
    public void act() 
    {
       coin a = new coin();
       Actor i = getOneIntersectingObject(mobilmerah.class);
       move(speed);
       checkdouble(i);
       end();
    }    
}
