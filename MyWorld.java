import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(460, 819, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        mobilbiru mobilbiru = new mobilbiru();
        addObject(mobilbiru,186,561);
        mobilbiru.setLocation(217,562);
        mobilbiru.setLocation(229,573);
        mobilbiru.setLocation(191,581);
    }

    public void act(){
        if(Greenfoot.getRandomNumber(100)<1) {
            addObject(new mobilmerah(), Greenfoot.getRandomNumber(150) + 150, 0);
        }
        if(Greenfoot.getRandomNumber(5)<2) {
            addObject(new pohon(), Greenfoot.getRandomNumber(100) , 0);
            addObject(new pohon(), Greenfoot.getRandomNumber(120) + 450, 0);
        }
        if(Greenfoot.getRandomNumber(300)<2) {
            addObject(new coin(), Greenfoot.getRandomNumber(150)  +150 , 0);
            
        }
    }
        
}
