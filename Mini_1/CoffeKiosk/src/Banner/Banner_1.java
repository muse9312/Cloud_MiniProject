package Banner;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.*;

public class Banner_1 extends JPanel {

    // ImageIcon ic1 = new ImageIcon("poster_1.jpg");
    // ImageIcon ic2 = new ImageIcon("poster_.jpg");
    // ImageIcon ic3 = new ImageIcon("poster_3.jpg");
    // ImageIcon ic4 = new ImageIcon("poster_4.jpg");
    // ImageIcon ic5 = new ImageIcon("poster_5.jpg");

    // static String[] images = {
    // "poster_1.jpg", "poster_2.jpg", "poster_3.jpg", "poster_4.jpg",
    // "poster_5.jpg",
    // };

    public Banner_1() {

        page1frame();
        // ImagePanel(img);
    }

    public void page1frame() {
        JFrame frame = new JFrame();
        frame.setTitle("1"); // 타이틀
        frame.setSize(800, 900); // 프레임 크기
        frame.setLayout(new BorderLayout());
        frame.setLocationRelativeTo(null);// 창이 가운데 나오게
        // 2.Panel을 만들고 프레임에 패널 추가 해주기
        ImagePanel imagePanel = new ImagePanel(
                new ImageIcon("./images/poster_2.jpg")
                        .getImage());
        frame.add(imagePanel, "Center");

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
