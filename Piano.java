import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * A piano that can be played with the computer keyboard.
 * 
 * @author: M. Kolling
 * @version: 0.1
 */
public class Piano extends World
{
    /**
     * Make the piano.
     */
    public Piano() 
    {
        super(800, 340, 1);
        makeKeys();
    }
    
    /*
     * Place keys on board.
     */
    public void makeKeys()
    {
        for (int i=0; i<12; i=i+1)
        {
            addObject(new Key("g","3a.wav"), 54 + 63*i, 140);
        } 
    }
}