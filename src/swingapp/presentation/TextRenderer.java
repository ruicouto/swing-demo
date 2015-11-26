/*
 * TextRenderer
 * ruicouto in 2/mar/2015
 */
package swingapp.presentation;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.font.TextAttribute;
import java.util.Map;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import swingapp.business.Game;

/**
 * 
 * @author ruicouto
 */
public class TextRenderer extends JLabel implements ListCellRenderer<Game> {
        
    /**
     * Create a new instance.
     */
    public TextRenderer() {
        setOpaque(true);
    }
 
    /**
     * Override required from cellRenderer.
     * Words not present in the dictionary willl be highlighted
     * @param list The list being rendered
     * @param game The current object
     * @param index The current index
     * @param isSelected Is the list element selected?
     * @param cellHasFocus Has the cell focus?
     * @return 
     */
    @Override
    public Component getListCellRendererComponent(JList<? extends Game> list, Game game, int index,
            boolean isSelected, boolean cellHasFocus) {
        setText(game.toString());
        Font font = getFont();
        Map attributes = getFont().getAttributes();
        
        Color fgColor = Color.gray;
        
        switch(game.getPlatform()) {
            case "PS4": fgColor = Color.BLUE;
                break;
            case "Xbox one": fgColor = Color.GREEN;
                break;
            case "WII": fgColor = Color.RED;
                break;
            case "PC": fgColor = Color.BLACK;
                break;
            case "3DS": fgColor = Color.ORANGE;
                break;
        }
        
        if(game.isFinished()) {
            attributes.put(TextAttribute.STRIKETHROUGH, true);
        } else {
            attributes.put(TextAttribute.STRIKETHROUGH, false);
        }
        //attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_LOW_GRAY);
        setForeground(fgColor);
        setFont(font.deriveFont(attributes));
        
        if (isSelected) {
            setBackground(Color.LIGHT_GRAY);
        } else {
            setBackground(Color.WHITE);
        }
        return this;
    }
    
}
