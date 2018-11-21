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
    static ArrayList<Munt> munten = new ArrayList<Munt>();
    private int aantalMunten=0;
    public void update(){
        // HUD interface.
        // Heart
        if(Hero.levens > Startscherm.hudLevens){
            for(int i = 0; i < Hero.levens; i++){
                getWorld().addObject(new Heart(),(50+(60*i)), 50);
                Startscherm.hudLevens++;
            }
        }
        // Munten
        if(Hero.munten > Startscherm.hudMunten){
            for(int i = 0; Startscherm.hudMunten < Hero.munten; i++){
                //if(munten.get(i).type == 'z'){}
                if((Hero.munten-Startscherm.hudMunten) > 1){
                    getWorld().addObject(Collectable.goudenMunten.get(i), (950-(10*aantalMunten)), 50);
                }
                
                //addObject(new Munt(),(950-(10*Startscherm.hudMunten)), 50);
                if(munten.get(i).type == 'g'){Startscherm.hudMunten += 2;}
                else{Startscherm.hudMunten++;}
                aantalMunten++;
            }
        }
        // Reset munten in HUD wanneer er 40 muntjes zijn verzameld.
        if(Hero.munten >= 40){
            Hero.munten = (Hero.munten-40);
            Startscherm.hudMunten = 0;
            getWorld().removeObjects(getWorld().getObjects(Munt.class));
            Hero.levens++;
        }
        
        //Diamanten
        //addObject(new Diamanten(), 50, 110);
    }
    
    public static void reset(){
        Startscherm.hudLevens = 0;
        Startscherm.hudMunten = 0;
    }
    public void act() 
    {
        update();
    }  

}
