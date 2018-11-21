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
    public int id;
    public static int sID;
    public ZilverenMunt(){
        super();
        setImage("coinSilver.png");
        this.id = sID;
        sID++;
    }
    public ZilverenMunt(int x, int y) {
        super();
        setImage("coinSilver.png");
        Collectable.colNr++;
        this.muntX = x;
        this.muntY = y;
    }

    @Override
    public void act() {
        applyVelocity();
        
        for (Actor hero : getIntersectingObjects(Hero.class)) {
            if (hero != null) {
                Hero.munten++;
                getWorld().removeObject(this);
                 switch(Hero.wereld){
                     case 1:
                     Collectable.zilverenMuntWereld1.remove(id);
                     break;
                     case 2:
                     Collectable.zilverenMuntWereld2.remove(id);
                     break;
                     /*case 3:
                     Collectable.zilverenMuntWereld3.remove(id);
                     break;
                     case 4:
                     Collectable.zilverenMuntWereld4.remove(id);
                     break; */
                    }
                break;
            }
        }
    }
}
