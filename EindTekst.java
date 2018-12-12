import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EindTekst here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EindTekst extends Actor
{
    public EindTekst(){
        if(Hero.diamanten < 4)
        setImage(new GreenfootImage("Gefeliciteerd! Je hebt het laatste level gehaald! \nAlleen liggen er hier en daar nog een paar diamanten in één van de levels! \nAls je het huis knopje indrukt, zal je helemaal opnieuw beginnen. \n Met de knop er boven zal je een level opnieuw kunnen spelen voor extra \nmuntjes en diamanten! \n Wanneer je meer diamanten verzamelt. zul je een grotere schatkist ontvangen!", 25, Color.WHITE, new Color(0, 0, 0, 0)));
        else setImage(new GreenfootImage("WAUW! Je hebt alle diamanten verzameld! Gefeliciteerd met je wel verdiende schatkist!", 30, Color.WHITE, new Color(0, 0, 0, 0)));
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
