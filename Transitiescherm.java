import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Transitiescherm here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Transitiescherm extends World
{
    /**
     * Constructor for objects of class Transitiescherm.
     * 
     */
    public Transitiescherm()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1); 
        this.setBackground("bg.png");
        KarakterTransitie p1 = new KarakterTransitie(1);
        KarakterTransitie p2 = new KarakterTransitie(2);
        KarakterTransitie p3 = new KarakterTransitie(3);
        addObject(p1, 400, 650);
        addObject(p2, 500, 650);
        addObject(p3, 600, 650);
        resetMunten();
        voegMuntenToe();
    }
    
    void resetMunten(){
        Collectable.zilverenMuntWereld1.clear();
        Collectable.zilverenMuntWereld2.clear();
        Collectable.zilverenMuntWereld3.clear();
        Collectable.zilverenMuntWereld4.clear();
        Collectable.goudenMuntWereld1.clear();
        Collectable.goudenMuntWereld2.clear();
        Collectable.goudenMuntWereld3.clear();
        Collectable.goudenMuntWereld4.clear();
    }
    
    void voegMuntenToe(){
        //addObject(new GoudenMunt(), 500, 2594);
        //addObject(new GoudenMunt(), 200, 1274);
        
        GoudenMunt munt1 = new GoudenMunt(500, 2650);
        Collectable.goudenMuntWereld1.add(munt1);
    }
}
