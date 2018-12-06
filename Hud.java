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
    
    public void update(){
        // HUD interface.
        // Heart
        if(Hero.levens > Startscherm.hudLevens){
            getWorld().removeObjects(getWorld().getObjects(Heart.class));
            Startscherm.hudLevens = 0;
            for(int i = 0; Startscherm.hudLevens < Hero.levens; i++){
                getWorld().addObject(new Heart(),(50+(60*Startscherm.hudLevens)), 50);
                Startscherm.hudLevens++;
            }
        }
        //Sleutel
        if(Hero.hasKey == false){
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
        }
        // Munten
        /*if(Hero.munten > Startscherm.hudMunten){
                for(int i = 0; Startscherm.hudMunten < Hero.munten; i++){
                    if(munten.get(munten.size()-1).type == 'g'){
                        getWorld().addObject(new Munt('g'), (950-(10*Startscherm.hudMunten)), 50);
                    }
                    else if(munten.get(munten.size()-1).type == 'z'){
                        getWorld().addObject(new Munt('z'), (950-(10*Startscherm.hudMunten)), 50);
                    }
                    Startscherm.hudMunten++;
                }
        }*/
        if(Hero.munten > Startscherm.hudMunten){
            getWorld().removeObjects(getWorld().getObjects(Munt.class));
            Startscherm.hudMunten = 0;
            for(int i = 0; i < munten.size(); i++){
                getWorld().addObject(munten.get(i), (950-(10*i)), 50);
            }
        }
        // Reset munten in HUD wanneer er 40 muntjes zijn verzameld.
        if(Hero.muntWaarde >= 20){
            Hero.muntWaarde -= 20;
            munten.clear();
            getWorld().removeObjects(getWorld().getObjects(Munt.class));
            Hero.levens++;
        }
        
        //Diamanten
        //addObject(new Diamanten(), 50, 110);
    }
    
    public static void reset(){
        Startscherm.hudLevens = 0;
        Startscherm.hudMunten = 0;
        munten.clear();
    }
    public void act() 
    {
        update();
    }  

}
