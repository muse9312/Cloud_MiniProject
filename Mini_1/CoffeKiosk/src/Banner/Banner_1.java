package Banner;

import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.*;
import java.io.File;

public class Banner_1 extends JPanel {
    private Image img;

    // static JPanel page1 = new JPanel() {
    // Image background = new ImageIcon(Banner_1.class
    // .getResource("/Users/majestyharia/Cloud_MiniProject/Mini_1/CoffeKiosk/images/poster_1.jpg")).getImage();

    // public void paint(Graphics g) {// 그리는 함수
    // g.drawImage(background, 0, 0, this);// background를 그려줌
    // }
    // };

    public Banner_1() {
        page1frame();
    }

    public void page1frame() {
        JFrame frame = new JFrame();
        frame.setSize(800, 900);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);// 창이 가운데 나오게
        // 2.Panel을 만들고 프레임에 패널 추가 해주기
        ImagePanel imagePanel = new ImagePanel(
                new ImageIcon("/Users/majestyharia/Cloud_MiniProject/Mini_1/CoffeKiosk/images/poster_1.jpg")
                        .getImage());
        File f = new File("/Users/majestyharia/Cloud_MiniProject/Mini_1/CoffeKiosk/images/poster_1.jpg");
        System.out.println(f.exists() ? "Exist" : "Doesn't Exist");
        frame.add(imagePanel);

        frame.setVisible(true);
    }

    public void ImagePanel(Image img) {
        this.img = img;
        setSize(new Dimension(img.getWidth(null), img.getHeight(null)));
        setLayout(null);
    }

    public void paintComponent(Graphics g) {
        g.drawImage(img, 0, 0, null);
    }
}
