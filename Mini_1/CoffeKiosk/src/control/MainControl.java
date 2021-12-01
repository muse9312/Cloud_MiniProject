package control;

import java.awt.EventQueue;

import javax.swing.JFrame;

import Banner.BannerPage;
import entitiy.MainUI;

public class MainControl extends JFrame {

    public static void main(String[] args) {

        // try {
        // Banner_1 b = new Banner_1();
        // b.page1frame();
        // } catch (Exception e) {
        // e.printStackTrace();
        // }

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new BannerPage();
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }

        });

    }
}
