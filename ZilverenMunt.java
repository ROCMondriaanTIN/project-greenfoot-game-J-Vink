import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ZilverenMunt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ZilverenMunt extends Collectable{
    public int muntX;
    public int muntY;
    public int wereld;
    public int id;
    public static int sID;
    
    public ZilverenMunt(){
        setImage("coinSilver.png");
    }
    public ZilverenMunt(int x, int y, int wereld) {
        super();
        setImage("coinSilver.png");
        this.muntX = x;
        this.muntY = y;
        this.wereld = wereld;
        this.id = sID;
        sID++;
    }

    @Override
    public void act() {
        applyVelocity();
        
        for (Actor hero : getIntersectingObjects(Hero.class)) {
            if (hero != null) {
                Hud.munten.add(new Munt('z'));
                Hero.munten++;
                Hero.muntWaarde++;
                getWorld().removeObject(this);
                Collectable.zilverenMunten.remove(this);
                Hud.update = true;
                Collectable.coin.play();
                break;
            }
        }
    }
}
