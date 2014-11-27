/*
 * Games
 * ruicouto in 25/nov/2014
 */
package swingapp.business;

import java.util.ArrayList;

/**
 * Container class for games
 * @author ruicouto
 */
public class Games {
    /** The game list */
    private ArrayList<Game> games;

    /**
     * Default constructor. No parameters required
     */
    public Games() {
        games = new ArrayList<Game>();
    }

    /**
     * Get the game list
     * @return 
     */
    public ArrayList<Game> getGames() {
        return games;
    }        
    
}
