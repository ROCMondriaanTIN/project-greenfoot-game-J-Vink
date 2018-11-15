import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Startscherm here.
 * 
 * @author (Jeffrey Vink) 
 * @version (a version number or a date)
 */
public class Startscherm extends World
{

    /**
     * Constructor for objects of class Startscherm.
     * 
     */
    public Startscherm()
    {    
        // Create a new world with 1000*800 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1); 
        this.setBackground("bg.png");
        Hero.levens = 2;
        Start start = new Start();
        addObject(start, 500, 650);
        voegObjectenToe();
    }
    
    void voegObjectenToe(){
        Diamant diamant1 = new Diamant(1200, 2100);
        Collectable.wereld1.add(diamant1);
        Diamant diamant2 = new Diamant(1200, 2000);
        Collectable.wereld1.add(diamant2);
        Diamant diamant3 = new Diamant(1200, 1900);
        Collectable.wereld1.add(diamant3);
    }
    
    
}
