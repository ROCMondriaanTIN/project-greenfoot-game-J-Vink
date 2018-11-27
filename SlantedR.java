import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SlantedR here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SlantedR extends Tile
{
    private static int id;
    public SlantedR(String image, int width, int heigth) {
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
