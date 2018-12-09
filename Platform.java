import greenfoot.*;
 
public class Platform extends Mover
{
    private int walkRange;
    private int xMin;
    private int xMax;
    private boolean firstAct;
    private int speed;
    // the value of the above fields should be supplied when creating the platform
    public Platform(boolean toMoveVertically)
    {
        setImage("platform_grass.png");
        walkRange = 140;
        firstAct = true;
        speed = 1;
    }
    private Hero player;
    public void setPlayer(Hero actor)
    {
        player = actor;
    }
    // the act method for movement (ignoring player for now)
    public void act()
    {
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
    }
}
/*import greenfoot.*;
 
public class Platform extends Actor
{
    private boolean movesVertically; // 'false' = moves horizontally
    private int loCoord, hiCoord; // the turn-around coordinates
    private int direction = 1; // starts off moving right or down
    // the value of the above fields should be supplied when creating the platform
    public Platform(boolean toMoveVertically, int loValue, int hiValue)
    {
        movesVertically = toMoveVertically;
        loCoord = loValue;
        hiCoord = hiValue;
    }
    private Hero player;
    
    public void setPlayer(Hero actor)
    {
        player = actor;
    }
    public void act()
    {
        if (movesVertically)
        {
            setLocation(getX(), getY()+direction);
            if ( (direction < 0 && getY() < loCoord) || (direction > 0 && getY() > hiCoord) ) direction *= -1;
        }
        else
        {
            setLocation(getX()+direction, getY());
            if ( (direction < 0 && getX() < loCoord) || (direction > 0 && getX() > hiCoord) ) direction *= -1;
        }
    }
}
/*import greenfoot.*;

/**
 *
 * @author R. Springer
 
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
}*/
