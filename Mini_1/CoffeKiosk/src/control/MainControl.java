package control;

import java.awt.EventQueue;

import javax.swing.JFrame;

import Banner.BannerPage;

public class MainControl extends JFrame {

    public static void main(String[] args) {

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
