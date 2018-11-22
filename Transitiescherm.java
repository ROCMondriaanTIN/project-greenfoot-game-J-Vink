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
        Collectable.goudenMunten.clear();
        Collectable.zilverenMunten.clear();
    }
    
    void voegMuntenToe(){
        GoudenMunt gMunt1 = new GoudenMunt(500, 2594, 1);
        Collectable.goudenMunten.add(gMunt1);
        GoudenMunt gMunt2 = new GoudenMunt(700, 2594, 1);
        Collectable.goudenMunten.add(gMunt2);
        GoudenMunt gMunt3 = new GoudenMunt(800, 2594, 1);
        Collectable.goudenMunten.add(gMunt3);
        GoudenMunt gMunt4 = new GoudenMunt(1000, 2594, 1);
        Collectable.goudenMunten.add(gMunt4);
        
    }
}
