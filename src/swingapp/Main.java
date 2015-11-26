/*
 * Main
 * ruicouto in 25/nov/2014
 */
package swingapp;

import swingapp.business.Games;
import swingapp.data.GamesDAO;
import swingapp.presentation.MainGui;

/**
 *
 * @author ruicouto
 */
public class Main {
    
    /**
     * Main class to load the application
     * @param args 
     */
    public static void main(String[] args) {
        Games games = GamesDAO.getGames();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainGui(games).setVisible(true);
            }
        });
    }
}
