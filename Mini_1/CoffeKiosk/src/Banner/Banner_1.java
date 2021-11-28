package Banner;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.*;

public class Banner_1 {
    public JFrame frame;

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
        frame = new JFrame();
        MyPanel page1 = new MyPanel();
        frame.add(page1);
        frame.setTitle("1");
        frame.setSize(800, 900);// 프레임의 크기
        frame.setResizable(false);// 창의 크기를 변경하지 못하게
        frame.setLocationRelativeTo(null);// 창이 가운데 나오게
        frame.setLayout(null);
        frame.setVisible(true);// 창이 보이게

        // frame.add(page1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// JFrame이 정상적으로 종료되게
    }

    class MyPanel extends JPanel {
        ImageIcon icon = new ImageIcon("/Users/majestyharia/Cloud_MiniProject/Mini_1/CoffeKiosk/images/poster_1.jpg");
        Image img = icon.getImage();

        public void PaintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(img, 0, 0, this);

        }

    }
}
