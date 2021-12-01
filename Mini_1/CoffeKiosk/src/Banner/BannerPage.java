package Banner;

import java.awt.Canvas;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

import entitiy.MainUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BannerPage extends JFrame {

    // JButton[] ImgButton;
    // ImageIcon[] Images;

    Canvas can;
    Image buffer;
    Image[] duke;
    Toolkit tk;
    boolean repeat = true;

    public BannerPage() {
        tk = Toolkit.getDefaultToolkit();
        // initDuke();
        JButton btn = new JButton();
        btn = new JButton(new ImageIcon("./images/poster_3.jpg"));

        // 윈도우 실행

        btn.addActionListener((ActionListener) new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new MainUI();
            }
        });

        setTitle("배너"); // 타이틀
        setSize(800, 900); // 프레임 크기

        setLocationRelativeTo(null);// 창이 가운데 나오게
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(btn);
        setVisible(true);

    }

}
