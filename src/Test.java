import javax.swing.*;
import java.awt.*;

public class Test extends JFrame {
    private static final long serialVersionUID = 1L;

    public Test() {
        // создание окна
        super("Example LayeredTest");
        // выход при закрытии окна
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // определение многослойной панели
        JLayeredPane lp = getLayeredPane();
        // создание трех фигур
        Figure figure1 = new Figure(Color.red, "oval");
        Figure figure2 = new Figure(Color.green, "oval");
        Figure figure3 = new Figure(Color.black, "rectangle");
        // определение местоположения фигур в окне
        figure1.setBounds(90, 70, 120, 120);
        figure2.setBounds(90, 140, 160, 180);
        figure3.setBounds(70, 55, 180, 250);
        // добавление фигур в различные слои
        lp.add(figure1, JLayeredPane.POPUP_LAYER);
        lp.add(figure2, JLayeredPane.PALETTE_LAYER);
        lp.add(figure3, JLayeredPane.PALETTE_LAYER);
        // смена позиции одной из фигур

        // определение размера и открытие окна
        setSize(280, 250);
        setVisible(true);
    }
}

