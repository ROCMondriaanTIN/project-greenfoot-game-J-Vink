import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Diamant here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Diamant extends Collectable
{
    public int wereld;
    public int diaX;
    public int diaY;
    public int id;
    public Diamant(){
        setImage("Diamond" + Greenfoot.getRandomNumber(3) + ".png");
    }
    public Diamant(int wereld, int x, int y) {
        super();
        setImage("Diamond" + Greenfoot.getRandomNumber(3) + ".png");
        this.wereld = wereld;
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
                Collectable.diamond.play();
                Collectable.diamanten.remove(this);
                Hud.update = true;
                break;
            }
        }
    }
}
