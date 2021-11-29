package Banner;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class ImagePanel extends JPanel {
    private Image img;

    public ImagePanel(Image img) {
        this.img = img;
        setSize(new Dimension(img.getWidth(null), img.getHeight(null)));
        setLayout(null);
    }

    public void paintComponent(Graphics g) {
        g.drawImage(img, 70, 0, null);
    }

}
