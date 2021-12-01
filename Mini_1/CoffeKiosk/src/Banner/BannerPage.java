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

        // this.add(can = new Canvas() {

        // @Override
        // public void paint(Graphics g) {
        // g.drawImage(buffer, 0, 0, this);
        // }

        // @Override
        // public void update(Graphics g) {
        // paint(g);
        // }

        // });

        setTitle("배너"); // 타이틀
        setSize(800, 900); // 프레임 크기

        setLocationRelativeTo(null);// 창이 가운데 나오게
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(btn);
        setVisible(true);
        // makeThread();

    }

    // public void Button() {
    // JButton btn = new JButton("화면을 클릭해주세요");

    // // 윈도우 실행

    // btn.addActionListener((ActionListener) new ActionListener() {

    // @Override
    // public void actionPerformed(ActionEvent e) {
    // dispose();
    // new MainUI();
    // }
    // });

    // }

    // public void makeThread() {
    // new Thread(this).start();
    // }

    // // 듀크 초기화
    // public void initDuke() {

    // duke = new Image[3];

    // for (int i = 0; i < duke.length; i++) {
    // duke[i] = tk.getImage(String.format("./images/poster_%d.jpg", i + 1));

    // }
    // }

    // public void bufferPaint(int n) {
    // buffer = createImage(can.getWidth(), can.getHeight());
    // Graphics buffer_g = buffer.getGraphics();

    // buffer_g.drawImage(duke[n], 50, 0, this);

    // can.repaint();
    // }

    // @Override
    // public void run() {
    // while (true) {
    // for (int i = 0; i < duke.length; i++) {
    // if (!repeat)
    // return;
    // try {
    // Thread.sleep(2000);
    // } catch (InterruptedException ex) {
    // }
    // bufferPaint(i);
    // }
    // }
    // }
}
