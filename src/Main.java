import java.awt.*;
import java.awt.geom.Line2D;
import java.awt.geom.Path2D;
import java.awt.geom.Rectangle2D;
import java.nio.file.Paths;
import javax.swing.*;

public class Main{
    static class MyComponent extends JComponent {
        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D graphics2D = (Graphics2D) g;
            graphics2D.setColor(Color.gray);
            /*for (int i = 1; i<70; i++) {
                Line2D line = new Line2D.Double(0,i*10, 700, i*10);
                graphics2D.draw(line);
            }
            for (int i = 1; i<70; i++) {
                Line2D line = new Line2D.Double(i*10, 0, i*10, 700);
                graphics2D.draw(line);
            }*/
            graphics2D.setColor(Color.black);
            graphics2D.setStroke(new BasicStroke(4, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
            Path2D.Double curve = new Path2D.Double();
            //body
            curve.moveTo(70,200);
            curve.lineTo(100, 100);
            curve.lineTo(240, 100);
            curve.curveTo(240, 100, 270, 100, 270, 120);
            curve.lineTo(360, 120);//
            curve.curveTo(360, 120, 370, 120, 370, 130);
            curve.lineTo(390, 200);
            curve.curveTo(390, 200, 545, 200, 560, 220);
            curve.lineTo(560, 230);
            curve.lineTo(570, 270);

            curve.moveTo(70, 200);

            curve.lineTo(70, 250);
            curve.curveTo(70, 250, 70, 260, 60, 260);
            curve.curveTo(60, 260, 50, 260, 50, 270);
            curve.lineTo(50, 280);
            curve.curveTo(50, 280, 50, 290, 55, 290);
            curve.curveTo(55 ,290, 60, 290, 60, 300);
            curve.lineTo(120, 300);
            curve.curveTo(120, 300, 120, 260, 160, 260);//
            curve.curveTo(160, 260, 200, 260, 200, 300);
            curve.lineTo(400, 300);
            curve.curveTo(400, 300, 400, 260, 440, 260);
            curve.curveTo(440, 260, 480, 260, 480, 300);
            curve.lineTo(540, 300);
            curve.curveTo(540, 300, 570, 300, 570, 270);

            //light
            Path2D light = new Path2D.Double();
            light.moveTo(550, 230);
            light.lineTo(555, 250);
            light.curveTo(555, 250, 520, 250, 520, 230);
            light.lineTo(550, 230);

            //reserve
            Path2D reserve = new Path2D.Double();
            reserve.moveTo(70, 160);
            reserve.lineTo(70, 240);
            reserve.curveTo(70, 240, 70, 250, 60, 250);
            reserve.lineTo(40, 250);
            reserve.curveTo(40, 250, 30, 250, 30, 240);
            reserve.lineTo(30, 160);
            reserve.curveTo(30, 160, 30, 150, 40, 150);
            reserve.lineTo(60, 150);
            reserve.curveTo(60, 150, 70, 150, 70, 160);

            //wheels
            graphics2D.drawOval(130, 270, 60, 60);
            graphics2D.setColor(Color.gray.darker());
            graphics2D.fillOval(130, 270, 60, 60);
            graphics2D.setColor(Color.black);
            graphics2D.drawOval(410, 270, 60, 60);
            graphics2D.setColor(Color.gray.darker());
            graphics2D.fillOval(410, 270, 60, 60);
            graphics2D.setColor(Color.black);
            graphics2D.fillOval(145, 285, 30, 30);
            graphics2D.fillOval(425, 285, 30, 30);

            //glass
            Path2D glass1 = new Path2D.Double();
            glass1.moveTo(375, 200);
            glass1.lineTo(280, 200);
            glass1.lineTo(280, 135);
            glass1.lineTo(355, 135);
            glass1.lineTo(375, 200);

            Path2D glass2 = new Path2D.Double();
            glass2.moveTo(260, 200);
            glass2.lineTo(260, 135);
            glass2.lineTo(150, 135);
            glass2.curveTo(150, 135, 90, 135, 90, 200);
            glass2.lineTo(260, 200);

            graphics2D.setColor(Color.black);
            graphics2D.draw(glass2);
            graphics2D.draw(glass1);
            graphics2D.draw(reserve);
            graphics2D.draw(curve);
            graphics2D.setColor(Color.gray);

            graphics2D.setColor(Color.gray.brighter());
            graphics2D.fill(curve);
            graphics2D.draw(curve);
            graphics2D.setColor(Color.black);
            graphics2D.draw(light);
            graphics2D.setColor(Color.yellow.brighter());
            graphics2D.fill(light);
            graphics2D.setColor(Color.gray.darker());
            graphics2D.fill(reserve);
            graphics2D.setColor(Color.CYAN.brighter());
            graphics2D.fill(glass1);
            graphics2D.fill(glass2);
            graphics2D.setColor(Color.black);
            graphics2D.draw(glass1);
            graphics2D.draw(glass2);

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