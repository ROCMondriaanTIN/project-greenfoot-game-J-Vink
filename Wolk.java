import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Wolk here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Wolk extends Mover
{
    /**
     * Act - do whatever the Wolk wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int walkRange;
    private int xMin;
    private int xMax;
    private boolean firstAct;
    private int speed;
    public Wolk(){
        super();
        setImage("cloud" + Greenfoot.getRandomNumber(2) + ".png");
        getImage().mirrorHorizontally();
        walkRange = 5000;
        firstAct = true;
        speed = Greenfoot.getRandomNumber(3)+1;
    }
    public void act() 
    {
        int x = getX();
        int y = getY();

        if (firstAct) {
            firstAct = false;
            xMin = 0;
            xMax = 7060;
        }

        velocityX = speed;
        applyVelocity();
        if (getX() >= xMax) {
            speed *= -1;
            x = xMax;
            getImage().mirrorHorizontally();
        } else if (getX() <= xMin) {
            speed *= -1;
            x = xMin;
            getImage().mirrorHorizontally();
        }
    }    
}
