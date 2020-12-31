import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class mobilbiru extends Actor
{
    int score=0;
    public void act() 
    {
       getWorld().showText("score : " + score, 70, 30);
       checkkey();
       end();
       addscore();
    }    
     public void checkkey() {
         if(Greenfoot.isKeyDown("left")) {
             if(getX()>=100) {
                 setLocation(getX() -2, getY()); 
                 
                }
            }
            if(Greenfoot.isKeyDown("right")) {
             if(getX()<=398) {
                 setLocation(getX() +2, getY()); 
                 
                }
            }
            if(Greenfoot.isKeyDown("up")) {
                 setLocation(getX(), getY() -2); 

            }
            if(Greenfoot.isKeyDown("down")) {
                 setLocation(getX(), getY() +2); 

            }
        }
        public void end(){
            if(isTouching(mobilmerah.class)){
                Greenfoot.stop();
                getWorld().showText("Game Over! \n Score : " + score, 250, 300);
            }
        }
        public void addscore(){
            if(isTouching(coin.class)){
                score = score + 20;
                removeTouching(coin.class);
            }
        }
                
            
}
