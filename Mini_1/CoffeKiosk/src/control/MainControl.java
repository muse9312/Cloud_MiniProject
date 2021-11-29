package control;

import java.awt.EventQueue;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import Banner.Banner_1;
import Banner.ImagePanel;
import entitiy.MainUI;

public class MainControl extends JFrame {

    public static void main(String[] args) {
        new Banner_1();

        // JFrame frame = new JFrame();
        // frame.setSize(800, 900);
        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setLocationRelativeTo(null);// 창이 가운데 나오게
        // // 2.Panel을 만들고 프레임에 패널 추가 해주기
        // ImagePanel imagePanel = new ImagePanel(
        // new
        // ImageIcon("/Users/majestyharia/Cloud_MiniProject/Mini_1/CoffeKiosk/images/poster_1.jpg")
        // .getImage());
        // File f = new
        // File("/Users/majestyharia/Cloud_MiniProject/Mini_1/CoffeKiosk/images/poster_1.jpg");
        // System.out.println(f.exists() ? "Exist" : "Doesn't Exist");
        // frame.add(imagePanel);

        // frame.setVisible(true);

        // EventQueue.invokeLater(new Runnable() {
        // public void run() {

        // try {
        // Banner_1 b = new Banner_1();
        // b.page1frame();
        // } catch (Exception e) {
        // e.printStackTrace();
        // }
        // }
        // });
    }

}
