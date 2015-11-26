/*
 * Game
 * ruicouto in 25/nov/2014
 */
package swingapp.business;

/**
 * Representation of a videogame
 * @author ruicouto
 */
public class Game {
    /** The target platform: ps3, ps4, xbox, pc, wii, etc. */
    private String platform;
    /** The game name */
    private String name;
    /** The rating (considering 0 ot 5) */
    private int rating;
    /** If the game was already finished */
    private boolean finished;
    /** If owned */
    private boolean have;
    /** If wanted */
    private boolean want;

    /**
     * Default constructor. All parameters are required.
     * @param platform
     * @param name
     * @param rating
     * @param finished
     * @param have
     * @param want 
     */
    public Game(String platform, String name, int rating, boolean finished, boolean have, boolean want) {
        this.platform = platform;
        this.name = name;
        this.rating = rating;
        this.finished = finished;
        this.have = have;
        this.want = want;
    }

    /**
     * Get target platform
     * @return 
     */
    public String getPlatform() {
        return platform;
    }

    /**
     * Set target platform
     * @param platform 
     */
    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * Get game name
     * @return 
     */   
    public String getName() {
        return name;
    }

    /**
     * Define game name
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get game rating
     * @return 
     */
    public int getRating() {
        return rating;
    }

    /**
     * Define game rating
     * @param rating 
     */
    public void setRating(int rating) {
        this.rating = rating;
    }

    /**
     * Is the game finished?
     * @return 
     */
    public boolean isFinished() {
        return finished;
    }

    /**
     * Define if the game is finished
     * @param finished 
     */
    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    /**
     * Is the game owned?
     * @return 
     */
    public boolean isHave() {
        return have;
    }

    /**
     * Set if game is owned
     * @param have 
     */
    public void setHave(boolean have) {
        this.have = have;
    }

    /**
     * Want the game?
     * @return 
     */
    public boolean isWant() {
        return want;
    }

    /**
     * Defines if uses the game
     * @param want 
     */
    public void setWant(boolean want) {
        this.want = want;
    }

    /**
     * Showing platform and name
     * @return 
     */
    @Override
    public String toString() {
        return getPlatform() + " - " + getName();
    }
    
    
    
}
