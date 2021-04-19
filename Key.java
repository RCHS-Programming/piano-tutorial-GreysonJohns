import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

public class Key extends Actor
{
    private boolean isDown;
    private String key;
    private String sound;
    
    /**
     * Create a new key linked to a given keyboard key, and with a given sound.
     */
    public Key(String keyName, String soundFile)
    {
        key = keyName;
        sound = soundFile;
    }

    /**
     * Do the action for this key.
     */
    public void act()
    {
        if(!isDown && Greenfoot.isKeyDown(key))
        {
           setImage("white-key-down.png");
           play();
           isDown = true;
        }
        if (isDown && !Greenfoot.isKeyDown(key))
        {
            setImage("white-key.png");
            isDown = false;
        }
    }
    
    /*
     * Play the note for the Key
     */
    public void play()
    {
        Greenfoot.playSound(sound);
    }
}