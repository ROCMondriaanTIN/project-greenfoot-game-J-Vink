import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class Hud here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hud extends Actor
{
    public static char type;
    static ArrayList<Munt> munten = new ArrayList();
    
    static Key key = new Key();
    public static boolean firstStart;
    public static boolean update;
    
    void update(){
        // HUD interface.
        if(Hero.munten > Startscherm.hudMunten){
            getWorld().addObject(munten.get(Startscherm.hudMunten), (900-(10*Startscherm.hudMunten)), 48);
            Startscherm.hudMunten++;
        }
        // Reset munten in HUD wanneer er 40 muntjes zijn verzameld.
        if(Hero.muntWaarde >= 20){
            Hero.muntWaarde -= 20;
            munten.clear();
            getWorld().removeObjects(getWorld().getObjects(Munt.class));
            Hero.levens++;
        }
        // Heart
        if(Hero.levens > Startscherm.hudLevens){
            getWorld().addObject(new Heart(),(50+(60*Startscherm.hudLevens)), 50);
            Startscherm.hudLevens++;
        }
        //Diamanten
        Diamanten.update = true;
            
        update = false;
    }
    
    public static void reset(){
        Startscherm.hudLevens = 0;
        Startscherm.hudMunten = 0;
        munten.clear();
    }
    
    void setup(){
        firstStart = false;
        getWorld().addObject(new Window(11, 165 , 60), 110, 125);
        getWorld().addObject(new Diamanten(), 110, 125);
        getWorld().addObject(new DiamantImg(), 57, 125);
        
        // Heart
        while(Startscherm.hudLevens < Hero.levens){
            getWorld().addObject(new Heart(),(50+(60*Startscherm.hudLevens)), 50);
            Startscherm.hudLevens++;
        }
        
        switch(Hero.wereld){
            case 1:
                key.setImage("hud_key1_disabled.png");
            break;
            case 2:
                key.setImage("hud_key2_disabled.png");
            break;
            case 3:
                key.setImage("hud_key3_disabled.png");
            break;
            case 4:
                key.setImage("hud_key0_disabled.png");
            break;
        }
        getWorld().addObject(new Window(55, 253, 60), 850, 50);
        getWorld().addObject(new Munt('g'), 948, 48);
        Startscherm.hudMunten=0;
        while(Startscherm.hudMunten < munten.size()){
            getWorld().addObject(munten.get(Startscherm.hudMunten), (900-(10*Startscherm.hudMunten)), 48);
            Startscherm.hudMunten++;
        }
        
    }
    
    public void act() 
    {
        if(firstStart == true) {setup();}
        if(update == true) {update();}
    }  

}
