import javax.swing.*;
import java.awt.*;

public class GameScreen extends JPanel {

    public GameScreen () {

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.fillRect(50, 50, 50, 50);
    }
}