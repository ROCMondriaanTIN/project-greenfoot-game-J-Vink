import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Water extends Tile{
    private static int id;
    public Water(String image, int width, int heigth) {
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
