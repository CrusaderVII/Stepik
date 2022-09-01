import javax.swing.*;
import java.awt.*;

public class Figure extends JComponent {
    //Fields
    private Color color;
    private String type;
    //Constructors
    Figure (Color color, String type) {
        this.color = color;
        this.type = type;
        setOpaque(false);
    }
    //Methods
    public void paint(Graphics g) {
        g.setColor(color);
        switch (type) {
            case ("oval"): g.fillOval(0, 0, 100, 100); break;
            case ("rectangle"): g.fillRect(0, 0, 100, 50); break;
        }
    }
}
