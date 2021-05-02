import javax.imageio.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class pole extends JPanel {

    private Image shapka;
    private Image fon;
    public int x = 400;

    public pole() {
        try {
            shapka = ImageIO.read(new File("c://Game//shapka.png"));
        } catch (IOException exception) {
        }

        try {
            fon = ImageIO.read(new File("c://Game//fon.png"));
        } catch (IOException exception) {
        }

        Timer timerDraw = new Timer(50, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                repaint();
            }
        });
        timerDraw.start();
    }

    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        graphics.drawImage(fon, 0, 0, null);
        graphics.drawImage(shapka, x, 465, null);

    }
}
