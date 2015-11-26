/*
 * GamesDAO
 * ruicouto in 20/nov/2015
 */
package swingapp.data;

import swingapp.business.Game;
import swingapp.business.Games;

/**
 * DAO for games. Not actually implemented!
 * @author ruicouto
 */
public class GamesDAO {
    /**
     * Load the games from persistence.
     * Persistence is not actually implemented!
     * @return The persisted games
     */
    public static Games getGames() {
        Games games = new Games();
        games.getGames().add(new Game("PC", "Fallout 4", 5, false, true, true));
        games.getGames().add(new Game("PC", "No Man's sky", 5, false, true, true));
        games.getGames().add(new Game("PS4", "GTA V", 5, false, true, true));
        games.getGames().add(new Game("PS4", "Gran Turismo 6", 5, true, true, true));
        games.getGames().add(new Game("Xbox one", "HALO 5", 5, false, true, true));
        games.getGames().add(new Game("3DS", "The legend of Zelda: Majora Mask", 5, true, true, true));
        games.getGames().add(new Game("WII", "Xenoblade Chronicles", 4, false, false, true));
        games.getGames().add(new Game("NES", "Super Mario Bros 3", 4, false, false, true));
        return games;
    }
    
    /**
     * Save the games.
     * @param games Games to persist.
     */
    public static void saveGames(Games games) {
        //TODO
        System.err.println("Persistency is not implemented!");
    }
}
