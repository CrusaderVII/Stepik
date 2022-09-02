import javax.swing.*;
import java.awt.*;

public class Painting extends JComponent {
    private Image image;
    Painting (Image image) {
        this.image = image;
    }
    public void draw (Graphics g) {
        g.drawImage(image, 0, 0, this);
    }
}
