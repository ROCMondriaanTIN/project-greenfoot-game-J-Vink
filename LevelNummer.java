import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelNummer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelNummer extends Actor
{
    public int level;
    public static boolean levelSelected;
    /**
     * Act - do whatever the LevelNummer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public LevelNummer(int nummer){
        if(Hero.sleutels >= (nummer - 1)) setImage("hud_" + nummer + ".png");
        else{
            setImage("Button_13.png");
            getImage().scale(75, 75);
        }
        this.level = nummer;
    }
    public void act() 
    {
        click();
    }
    
    private void click(){
        if(Greenfoot.mouseClicked(this)){
            switch(this.level){
                case 1:
                    getWorld().removeObjects(getWorld().getObjects(LevelOmlijning.class));
                    getWorld().addObject(new LevelOmlijning(), 702, 435);
                    LevelNummer.levelSelected = true;
                    StartTransitie.level = this.level;
                    break;
                case 2:
                    if(Hero.sleutels >=1){
                        getWorld().removeObjects(getWorld().getObjects(LevelOmlijning.class));
                        getWorld().addObject(new LevelOmlijning(), 702, 515);
                        LevelNummer.levelSelected = true;
                        StartTransitie.level = this.level;
                    }
                    break;
                case 3:
                    if(Hero.sleutels >=2){
                        getWorld().removeObjects(getWorld().getObjects(LevelOmlijning.class));
                        getWorld().addObject(new LevelOmlijning(), 702, 595);
                        LevelNummer.levelSelected = true;
                        StartTransitie.level = this.level;
                    }
                    break;
                case 4:
                    if(Hero.sleutels >=3){
                        getWorld().removeObjects(getWorld().getObjects(LevelOmlijning.class));
                        getWorld().addObject(new LevelOmlijning(), 702, 675);
                        LevelNummer.levelSelected = true;
                        StartTransitie.level = this.level;
                    }
                    break;
                }
        }
    }
}
