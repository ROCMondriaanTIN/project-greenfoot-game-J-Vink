import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class Collectable here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Collectable extends Mover{
    public static ArrayList<GoudenMunt> goudenMunten = new ArrayList();
    public static ArrayList<ZilverenMunt> zilverenMunten = new ArrayList();
    public static ArrayList<Diamant> diamanten = new ArrayList();
    public static ArrayList<Sleutel> sleutels = new ArrayList();
    public static GreenfootSound coin = new GreenfootSound("Coin pickup.mp3");
    public static GreenfootSound diamond = new GreenfootSound("Diamond.mp3");
    public static GreenfootSound keys = new GreenfootSound("Keys.mp3");
}
