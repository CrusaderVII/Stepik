import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.geom.Arc2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.nio.file.Paths;
import javax.swing.*;

public class Main{
    static class MyComponent extends JComponent {
        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D graphics2D = (Graphics2D) g;
            Color black = Color.BLACK;
            graphics2D.setColor(black);
            int xPoints[] = {270, 270, 470, 470};
            int yPoints[] = {90, 510, 510, 90};
            graphics2D.setColor(black);
            graphics2D.fillPolygon(xPoints, yPoints, 4);
            graphics2D.fillRoundRect(270, 400, 200, 130, 40, 40);
            graphics2D.fillOval(270, 30, 200, 120);

            graphics2D.setColor(Color.white);
            graphics2D.fillOval(295, 60, 150, 150);
            graphics2D.setColor(black);
            graphics2D.fillOval(285, 80, 170,  140);
            graphics2D.setColor(Color.red);
            graphics2D.fillOval(320, 90, 100, 100);

            graphics2D.setColor(Color.white);
            graphics2D.fillOval(295, 215, 150, 150);
            graphics2D.setColor(black);
            graphics2D.fillOval(285, 235, 170,  140);
            graphics2D.setColor(Color.yellow);
            graphics2D.fillOval(320, 245, 100, 100);

            graphics2D.setColor(Color.white);
            graphics2D.fillOval(295, 365, 150, 150);
            graphics2D.setColor(black);
            graphics2D.fillOval(285, 385, 170,  140);
            graphics2D.setColor(Color.GREEN);
            graphics2D.fillOval(320, 395, 100, 100);

            graphics2D.setColor(black);
            int xPoints1 [] = {240, 190, 260, 260};
            int yPoints1 [] = {90, 90, 160, 110};
            graphics2D.fillPolygon(xPoints1, yPoints1, 4);
            graphics2D.fillOval(220, 90, 40, 40);

            int xPoints2 [] = {240, 190, 260, 260};
            int yPoints2 [] = {250, 250, 320, 270};
            graphics2D.fillPolygon(xPoints2, yPoints2, 4);
            graphics2D.fillOval(220, 250, 40, 40);

            int xPoints3 [] = {240, 190, 260, 260};
            int yPoints3 [] = {400, 400, 470, 420};
            graphics2D.fillPolygon(xPoints3, yPoints3, 4);
            graphics2D.fillOval(220, 400, 40, 40);

            int xPoints4 [] = {500, 550, 480, 480};
            int yPoints4 [] = {90, 90, 160, 110};
            graphics2D.fillPolygon(xPoints4, yPoints4, 4);
            graphics2D.fillOval(480, 90, 40, 40);

            int xPoints5 [] = {500, 550, 480, 480};
            int yPoints5 [] = {250, 250, 320, 270};
            graphics2D.fillPolygon(xPoints5, yPoints5, 4);
            graphics2D.fillOval(480, 250, 40, 40);

            int xPoints6 [] = {500, 550, 480, 480};
            int yPoints6 [] = {400, 400, 470, 420};
            graphics2D.fillPolygon(xPoints6, yPoints6, 4);
            graphics2D.fillOval(480, 400, 40, 40);

            graphics2D.fillRoundRect(300, 540, 140, 40, 30, 30);
            graphics2D.fillRoundRect(300, 590, 140, 40, 30, 30);
            graphics2D.fillRoundRect(330, 640, 80, 110, 30, 30);

            graphics2D.setColor(Color.white);
            graphics2D.fillRoundRect(390, 660, 10, 70, 10, 10);
        }
    }

    public static void main(String[] args) {
        JFrame mainFrame = new JFrame("Main");
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        mainFrame.setBounds(d.width/2-350, 0, 700, 1000);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainFrame.setBackground(Color.BLACK);
        mainFrame.add(new MyComponent());



        mainFrame.setVisible(true);
    }
}