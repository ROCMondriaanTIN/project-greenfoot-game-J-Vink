
import greenfoot.*;

/**
 *
 * @author R. Springer
 */
public class Platform extends Mover {

    private int walkRange;
    private int xMin;
    private int xMax;
    private boolean firstAct;
    private int speed;

    public Platform(String type, int walkRange) {
        super();
        setImage("platform_" + type + ".png");
        getImage().mirrorHorizontally();
        this.walkRange = walkRange;
        firstAct = true;
        speed = 1;
    }

    @Override
    public void act() {
        int x = getX();
        int y = getY();

        if (firstAct) {
            firstAct = false;
            xMin = x - walkRange / 2;
            xMax = x + walkRange / 2;
        }

        velocityX = speed;
        applyVelocity();
        if (getX() >= xMax) {
            speed *= -1;
            x = xMax;
            getImage().mirrorHorizontally();
        } else if (getX() <= xMin) {
            speed *= -1;
            x = xMin;
            getImage().mirrorHorizontally();
        }
        setLocation(getX(), getY()-1); // move up 1 pixel
        Actor p = getOneIntersectingObject(Hero.class); // get player on platform, if any
        setLocation(getX(), getY()+1); // move down 1 pixel
    }
}
