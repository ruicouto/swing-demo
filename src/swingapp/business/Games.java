/*
 * Games
 * ruicouto in 25/nov/2014
 */
package swingapp.business;

import java.util.ArrayList;
import java.util.Observable;
import swingapp.data.GamesDAO;

/**
 * Container class for games.
 * This class could act as facade for the system itself
 * @author ruicouto
 */
public class Games extends Observable {
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
    
    /**
     * Add a new game.
     * Triggers a notification on the observer, if number of games is over 10.
     * @param game 
     */
    public void addGame(Game game) {
        games.add(game);
        GamesDAO.saveGames(this);
        setChanged();
        String message = games.size()>10?"You have over 10 games!":"";
        notifyObservers(message);
    }
    
}
