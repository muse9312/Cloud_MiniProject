package Banner;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.*;

public class Banner_2 extends JFrame {
    static JPanel page2 = new JPanel() {
        Image background = new ImageIcon(Banner_1.class
                .getResource("/Users/majestyharia/Cloud_MiniProject/Mini_1/CoffeKiosk/images/poster_1.jpg")).getImage();

        public void paint(Graphics g) {// 그리는 함수
            g.drawImage(background, 0, 0, null);// background를 그려줌
        }
    };

    public Banner_2() {
        page2frame();
    }

    public void page2frame() {

        setTitle("2");
        setSize(800, 1000);// 프레임의 크기
        setResizable(false);// 창의 크기를 변경하지 못하게
        setLocationRelativeTo(null);// 창이 가운데 나오게
        setLayout(null);
        setVisible(true);// 창이 보이게
        page2.setLayout(null);
        page2.setBounds(0, 0, 400, 600);
        add(page2);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// JFrame이 정상적으로 종료되게
    }

}
