import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SlantedL here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SlantedL extends Tile
{
    private static int id;
    public SlantedL(String image, int width, int heigth) {
        super(image, width, heigth);
        setImage(image);
        getImage().scale(width, heigth);
        if (CollisionEngine.DEBUG) {
            getImage().drawString("ID: " + id, 10, 10);
        }
        _id = id;
        id++;
    }  
}
