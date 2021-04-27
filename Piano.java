import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * A piano that can be played with the computer keyboard.
 * 
 * @author: M. Kolling
 * @version: 0.1
 */
public class Piano extends World
{
    private String[] whiteKeys ={ "a", "s", "d", "f", "g", "h", "j", "k", "l", ";", "'", "\\" };
    private String[] whiteNotes ={ "3c", "3d", "3e", "3f", "3g", "3a", "3b", "4c", "4d", "4e", "4f", "4g" };
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
            addObject(new Key(whiteKeys[i], whiteNotes[i] + ".wav", "white-key.png", "white-key-down.png"), 54 + 63*i, 140);
        } 
    }
}