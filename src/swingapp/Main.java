/*
 * Main
 * ruicouto in 25/nov/2014
 */
package swingapp;

import swingapp.business.Game;
import swingapp.business.Games;
import swingapp.presentation.MainGui;

/**
 *
 * @author ruicouto
 */
public class Main {
    public static void main(String[] args) {
        Games games = new Games();
        games.getGames().add(new Game("PS3", "The elder scrolls V: Skyrim", 5, false, true, true));
        games.getGames().add(new Game("PS3", "GTA V", 5, false, true, true));
        games.getGames().add(new Game("PS3", "Gran Turismo 5", 5, true, true, true));
        games.getGames().add(new Game("NDS", "The legend of Zelda: Phantom hourglass", 5, true, true, true));
        games.getGames().add(new Game("WII", "Xenoblade Chronicles", 4, true, false, true));
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainGui(games).setVisible(true);
            }
        });
    }
}
