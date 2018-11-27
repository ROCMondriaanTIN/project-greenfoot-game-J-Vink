import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bridge here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bridge extends Tile
{
    private static int id;
    public Bridge(String image, int width, int heigth) {
        super(image, width, heigth);
        setImage(image);
        getImage().scale(width, heigth);
        if (CollisionEngine.DEBUG) {
            getImage().drawString("ÏD: " + id, 10, 10);
        }
        _id = id;
        id++;
    }  
}
