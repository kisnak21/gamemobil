import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class pohon extends parent
{
    int speed=5;
    public void act() 
    {
       pohon a = new pohon();
       Actor i = getOneIntersectingObject(pohon.class);
       move(speed);
       checkdouble(i);
       end();
    }    
}
