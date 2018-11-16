import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Diamant here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Diamant extends Collectable
{
    public int diaX;
    public int diaY;
    public int id;
    public Diamant(){
        setImage("Diamond" + Greenfoot.getRandomNumber(3) + ".png");
    }
    public Diamant(int x, int y) {
        super();
        this.diaX = x;
        this.diaY = y;
    }

    @Override
    public void act() {
        applyVelocity();
        
        for (Actor hero : getIntersectingObjects(Hero.class)) {
            if (hero != null) {
                Hero.diamanten++;
                getWorld().removeObject(this);
                Collectable.wereld1.remove(id);
                break;
            }
        }
    }
}
