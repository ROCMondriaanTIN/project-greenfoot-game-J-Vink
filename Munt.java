import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Munt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Munt extends Hud
{
    public int muntX;
    public int muntY;
    public int id;
    public int wereld;
    public static int sID;
    protected char type;
    String image;
    /**
     * Act - do whatever the Munt wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(){
        for (Actor hero : getIntersectingObjects(Hero.class)) {
            if (hero != null) {
                if(type == 'g'){
                    Hero.munten+=2;
                Collectable.goudenMunten.remove(id);
                }
                else{Hero.munten++;
                Collectable.zilverenMunten.remove(id);}
                getWorld().removeObject(this);
                break;
            }
        }
    }    
    public Munt(){
    }
    public Munt(int x, int y, int wereld, char type){
        if(type == 'b'){
            this.image = "coinBronze.png";
            this.muntX = muntX;
            this.muntY = muntY;
            this.id = sID;
            this.wereld = wereld;
        }
        if(type == 'g'){
            this.image = "coinGold.png";
            this.muntX = muntX;
            this.muntY = muntY;
            this.id = sID;
            this.wereld = wereld;
        }
    }
}
