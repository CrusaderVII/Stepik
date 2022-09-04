import java.awt.*;
import javax.swing.*;

class Graphic extends JPanel {

}
class CoordinatesNet extends Canvas {
    public void setCoordinateNet (Graphics g) {
        g.setColor(Color.gray);
        for (int i = 1; i<50; i++) {
            g.drawLine(0, i*10, 500, i*10);
        }
        for (int i = 1; i<50; i++) {
            g.drawLine(i*10, 0, i*10, 500);
        }
    }
}