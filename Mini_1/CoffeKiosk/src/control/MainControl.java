package control;

import java.awt.EventQueue;

import javax.swing.JFrame;

import Banner.BannerPage;
import Banner.BannerSlide;

public class MainControl extends JFrame {

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new BannerPage();
                    new BannerSlide();
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }

        });

    }
}
