import javax.swing.*;
import java.awt.*;
import javax.swing.*;

public class Test extends JWindow {
    private Image image;
    public Test() {
        super();
        Dimension dimension = getToolkit().getScreenSize();
        setBounds(dimension.height/2-350, dimension.width/2-350, 700, 700);
        try {
            Robot robot = new Robot();
            image = robot.createScreenCapture(new Rectangle(0, 0, 700, 700));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        getContentPane().add(new Painting(image));
        setVisible(true);
        try {
            Thread.currentThread();
            Thread.sleep(10000);
        } catch (Exception ex) {
            System.exit(0);
        }
    }
}
