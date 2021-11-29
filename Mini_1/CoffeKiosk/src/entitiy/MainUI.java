package entitiy;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

@SuppressWarnings("serial")
public class MainUI extends JFrame {

    // 변수 선언 (프레임), 그리드 당 가로 160 / 세로 80
    public static final int FRAME_WIDTH = 1280;
    public static final int FRAME_HEIGHT = 720;

    // 변수 선언 (텍스트 출력)
    String summary;
    String price;

    // 변수 선언 (버튼, 라벨 개수)
    public final int SIZE_IMAGE = 11;
    public final int SIZE_BUTTON = 11;
    public final int SIZE_LABEL = 19;
    public final int SIZE_CONSTRAINT = (SIZE_BUTTON + SIZE_LABEL);

    public static void main(String[] args) {

        @SuppressWarnings("unused")
        MainUI frm = new MainUI();

    }

    public MainUI() {

        initialize();

    }

    public void initialize() {

        this.setTitle("Coffee KioskSE");
        this.setSize(MainUI.FRAME_WIDTH, MainUI.FRAME_HEIGHT);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 변수 선언 (패널)
        JPanel panel = new JPanel();

        // 변수 선언 (레이아웃)
        GridBagLayout layout = new GridBagLayout();

        // 변수 선언(컨스트레인트)
        GridBagConstraints[] constraint = new GridBagConstraints[SIZE_CONSTRAINT];

        // 변수 선언 (버튼, 라벨, 이미지)
        JButton[] button = new JButton[SIZE_BUTTON];
        JLabel[] label = new JLabel[SIZE_LABEL];
        ImageIcon[] image = new ImageIcon[SIZE_IMAGE];

        // 패널 세팅
        panel.setBackground(Color.WHITE);
        panel.setLayout(layout);

        // 변수 초기화
        for (int i = 0; i < SIZE_CONSTRAINT; i++)
            constraint[i] = new GridBagConstraints();

        for (int i = 0; i < SIZE_BUTTON; i++)
            button[i] = new JButton("button" + i);

        for (int i = 0; i < SIZE_LABEL; i++)
            label[i] = new JLabel("label" + i);

        ///////////////////////////////////////////////////////////////////////////////////////
        // 상품 버튼

        image[0] = new ImageIcon("./images/MenuImg/americano.png");
        button[0] = new JButton(image[0]);
        constraint[0].gridx = 0;
        constraint[0].gridy = 0;
        constraint[0].weightx = 2;
        constraint[0].weighty = 2;
        constraint[0].fill = GridBagConstraints.BOTH;
        panel.add(button[0], constraint[0]);
        button[0].addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                label[11].setText(summary = "아메리카노");
                label[12].setText("2000");
            }
        });

        image[1] = new ImageIcon("./images/MenuImg/espresso.png");
        button[1] = new JButton(image[1]);
        constraint[1].gridx = 1;
        constraint[1].gridy = 0;
        constraint[1].weightx = 2;
        constraint[1].weighty = 2;
        constraint[1].fill = GridBagConstraints.BOTH;
        panel.add(button[1], constraint[1]);
        button[1].addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                label[11].setText("에스프레소");
                label[12].setText("2500 원");
            }
        });

        image[2] = new ImageIcon("./images/MenuImg/latte.png");
        button[2] = new JButton(image[2]);
        constraint[2].gridx = 2;
        constraint[2].gridy = 0;
        constraint[2].weightx = 2;
        constraint[2].weighty = 2;
        constraint[2].fill = GridBagConstraints.BOTH;
        panel.add(button[2], constraint[2]);
        button[2].addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                label[11].setText("카페라떼");
                label[12].setText("3000 원");
            }
        });

        image[3] = new ImageIcon("./images/MenuImg/mocha.png");
        button[3] = new JButton(image[3]);
        constraint[6].gridx = 0;
        constraint[6].gridy = 2;
        constraint[6].weightx = 2;
        constraint[6].weighty = 5;
        constraint[6].fill = GridBagConstraints.BOTH;
        panel.add(button[3], constraint[6]);
        button[3].addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                label[11].setText("카페모카");
                label[12].setText("3500 원");
            }
        });

        image[4] = new ImageIcon("./images/MenuImg/caramel.png");
        button[4] = new JButton(image[4]);
        constraint[7].gridx = 1;
        constraint[7].gridy = 2;
        constraint[7].weightx = 2;
        constraint[7].weighty = 5;
        constraint[7].fill = GridBagConstraints.BOTH;
        panel.add(button[4], constraint[7]);
        button[4].addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                label[11].setText("카라멜 마끼아또");
                label[12].setText("4000 원");
            }
        });

        image[5] = new ImageIcon("./images/MenuImg/mixed.png");
        button[5] = new JButton(image[5]);
        constraint[8].gridx = 2;
        constraint[8].gridy = 2;
        constraint[8].weightx = 2;
        constraint[8].weighty = 5;
        constraint[8].fill = GridBagConstraints.BOTH;
        panel.add(button[5], constraint[8]);
        button[5].addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                label[11].setText("옛날커피");
                label[12].setText("2000 원");
            }
        });

        image[6] = new ImageIcon(
                "./images/MenuImg/strawberrysmoothy.png");
        button[6] = new JButton(image[6]);
        constraint[12].gridx = 0;
        constraint[12].gridy = 4;
        constraint[12].weightx = 2;
        constraint[12].weighty = 5;
        constraint[12].fill = GridBagConstraints.BOTH;
        panel.add(button[6], constraint[12]);
        button[6].addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                label[11].setText("딸기 스무디");
                label[12].setText("4000 원");
            }
        });

        image[7] = new ImageIcon("./images/MenuImg/vanilla.png");
        button[7] = new JButton(image[7]);
        constraint[13].gridx = 1;
        constraint[13].gridy = 4;
        constraint[13].weightx = 2;
        constraint[13].weighty = 5;
        constraint[13].fill = GridBagConstraints.BOTH;
        panel.add(button[7], constraint[13]);
        button[7].addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                label[11].setText("바닐라 라떼");
                label[12].setText("4000 원");
            }
        });

        image[8] = new ImageIcon("./images/MenuImg/cold.png");
        button[8] = new JButton(image[8]);
        constraint[14].gridx = 2;
        constraint[14].gridy = 4;
        constraint[14].weightx = 2;
        constraint[14].weighty = 5;
        constraint[14].fill = GridBagConstraints.BOTH;
        panel.add(button[8], constraint[14]);
        button[8].addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                label[11].setText("콜드 브루");
                label[12].setText("2500 원");
            }
        });

        ///////////////////////////////////////////////////////////////////////////////////////
        // 상품 라벨
        constraint[3].gridx = 0;
        constraint[3].gridy = 1;
        constraint[3].weightx = 2;
        constraint[3].weighty = 1;
        constraint[3].fill = GridBagConstraints.HORIZONTAL;
        label[0] = new JLabel("아메리카노");
        label[0].setHorizontalAlignment(JLabel.CENTER);
        panel.add(label[0], constraint[3]);

        constraint[4].gridx = 1;
        constraint[4].gridy = 1;
        constraint[4].weightx = 2;
        constraint[4].weighty = 1;
        constraint[4].fill = GridBagConstraints.HORIZONTAL;
        label[1] = new JLabel("에스프레소");
        label[1].setHorizontalAlignment(JLabel.CENTER);
        panel.add(label[1], constraint[4]);

        constraint[5].gridx = 2;
        constraint[5].gridy = 1;
        constraint[5].weightx = 2;
        constraint[5].weighty = 1;
        constraint[5].fill = GridBagConstraints.HORIZONTAL;
        label[2] = new JLabel("카페라떼");
        label[2].setHorizontalAlignment(JLabel.CENTER);
        panel.add(label[2], constraint[5]);

        constraint[9].gridx = 0;
        constraint[9].gridy = 3;
        constraint[9].weightx = 2;
        constraint[9].weighty = 1;
        constraint[9].fill = GridBagConstraints.HORIZONTAL;
        label[3] = new JLabel("카페모까");
        label[3].setHorizontalAlignment(JLabel.CENTER);
        panel.add(label[3], constraint[9]);

        constraint[10].gridx = 1;
        constraint[10].gridy = 3;
        constraint[10].weightx = 2;
        constraint[10].weighty = 1;
        constraint[10].fill = GridBagConstraints.HORIZONTAL;
        label[4] = new JLabel("카라멜 마끼아또");
        label[4].setHorizontalAlignment(JLabel.CENTER);
        panel.add(label[4], constraint[10]);

        constraint[11].gridx = 2;
        constraint[11].gridy = 3;
        constraint[11].weightx = 2;
        constraint[11].weighty = 1;
        constraint[11].fill = GridBagConstraints.HORIZONTAL;
        label[5] = new JLabel("옛날커피");
        label[5].setHorizontalAlignment(JLabel.CENTER);
        panel.add(label[5], constraint[11]);

        constraint[15].gridx = 0;
        constraint[15].gridy = 5;
        constraint[15].weightx = 2;
        constraint[15].weighty = 1;
        constraint[15].fill = GridBagConstraints.HORIZONTAL;
        label[6] = new JLabel("딸기 스무디");
        label[6].setHorizontalAlignment(JLabel.CENTER);
        panel.add(label[6], constraint[15]);

        constraint[16].gridx = 1;
        constraint[16].gridy = 5;
        constraint[16].weightx = 2;
        constraint[16].weighty = 1;
        constraint[16].fill = GridBagConstraints.HORIZONTAL;
        label[7] = new JLabel("바닐라라떼");
        label[7].setHorizontalAlignment(JLabel.CENTER);
        panel.add(label[7], constraint[16]);

        constraint[17].gridx = 2;
        constraint[17].gridy = 5;
        constraint[17].weightx = 2;
        constraint[17].weighty = 1;
        constraint[17].fill = GridBagConstraints.HORIZONTAL;
        label[8] = new JLabel("콜드 브루");
        label[8].setHorizontalAlignment(JLabel.CENTER);
        panel.add(label[8], constraint[17]);

        ///////////////////////////////////////////////////////////////////////////////////////
        // 제작자 로고
        image[9] = new ImageIcon("./images/MenuImg/team.png");
        label[9] = new JLabel(image[9]);
        label[9].setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        constraint[18].gridx = 3;
        constraint[18].gridy = 0;
        constraint[18].weightx = 1;
        constraint[18].weighty = 2;
        constraint[18].fill = GridBagConstraints.BOTH;
        panel.add(label[9], constraint[18]);

        // 가게 로고
        image[10] = new ImageIcon("./images/MenuImg/gglogo.png");
        label[10] = new JLabel(image[10]);
        label[10].setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        constraint[18].gridx = 4;
        constraint[18].gridy = 0;
        constraint[18].weightx = 1;
        constraint[18].weighty = 2;
        constraint[18].fill = GridBagConstraints.BOTH;
        panel.add(label[10], constraint[29]);

        ///////////////////////////////////////////////////////////////////////////////////////
        // 샷 추가
        JRadioButton shot1 = new JRadioButton("샷 1회 추가");
        shot1.setBounds(1, 3, 160, 80);
        shot1.setBackground(Color.WHITE);
        shot1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                label[11].setText("샷 1회 추가");
                label[12].setText(price += "500");

            }
        });
        JRadioButton shot2 = new JRadioButton("샷 2회 추가");
        shot2.setBounds(7, 7, 160, 80);
        shot2.setBackground(Color.WHITE);
        JRadioButton shot0 = new JRadioButton("샷 추가 없음");
        shot0.setBounds(7, 10, 160, 80);
        shot0.setBackground(Color.WHITE);

        ButtonGroup shotButton = new ButtonGroup();
        shotButton.add(shot1);
        shotButton.add(shot2);
        shotButton.add(shot0);

        // 사이즈 선택
        JRadioButton size1 = new JRadioButton("레귤러");
        shot1.setBounds(7, 3, 160, 80);
        shot1.setBackground(Color.WHITE);
        JRadioButton size2 = new JRadioButton("라지");
        shot2.setBounds(7, 3, 160, 80);
        shot2.setBackground(Color.WHITE);
        JRadioButton size0 = new JRadioButton("스몰");
        shot0.setBounds(7, 3, 160, 80);
        shot0.setBackground(Color.WHITE);

        ButtonGroup sizeButton = new ButtonGroup();
        sizeButton.add(size1);
        sizeButton.add(size2);
        sizeButton.add(size0);

        // 온도 선택
        JRadioButton temp1 = new JRadioButton("따뜻하게");
        JRadioButton temp2 = new JRadioButton("시원하게");

        ButtonGroup tempButton = new ButtonGroup();
        tempButton.add(temp1);
        tempButton.add(temp2);

        ///////////////////////////////////////////////////////////////////////////////////////
        // 사이드 라벨
        label[13].setText("");
        constraint[19].gridx = 3;
        constraint[19].gridy = 1;
        constraint[19].weightx = 1;
        constraint[19].weighty = 1;
        constraint[19].fill = GridBagConstraints.BOTH;
        panel.add(label[13], constraint[19]);

        label[14].add(size1);
        label[14].add(size2);
        label[14].add(size0);
        constraint[20].gridx = 3;
        constraint[20].gridy = 2;
        constraint[20].weightx = 1;
        constraint[20].weighty = 1;
        constraint[20].fill = GridBagConstraints.BOTH;
        panel.add(label[14], constraint[20]);

        label[15].setText("");
        constraint[21].gridx = 3;
        constraint[21].gridy = 3;
        constraint[21].weightx = 1;
        constraint[21].weighty = 1;
        constraint[21].fill = GridBagConstraints.BOTH;
        panel.add(label[15], constraint[21]);

        label[16].setText("");
        constraint[22].gridx = 4;
        constraint[22].gridy = 1;
        constraint[22].weightx = 1;
        constraint[22].weighty = 1;
        constraint[22].fill = GridBagConstraints.BOTH;
        panel.add(label[16], constraint[22]);

        label[17].add(shot1);
        label[17].add(shot2);
        label[17].add(shot0);
        constraint[23].gridx = 4;
        constraint[23].gridy = 2;
        constraint[23].weightx = 1;
        constraint[23].weighty = 1;
        constraint[23].fill = GridBagConstraints.BOTH;
        panel.add(label[17], constraint[23]);

        label[18].setText("");
        constraint[24].gridx = 4;
        constraint[24].gridy = 3;
        constraint[24].weightx = 1;
        constraint[24].weighty = 1;
        constraint[24].fill = GridBagConstraints.BOTH;
        panel.add(label[18], constraint[24]);

        ///////////////////////////////////////////////////////////////////////////////////////
        // 커피 요약
        label[11] = new JLabel();
        label[11].setHorizontalAlignment(JLabel.CENTER);
        constraint[25].gridx = 3;
        constraint[25].gridy = 4;
        constraint[25].weightx = 2;
        constraint[25].weighty = 1;
        constraint[25].fill = GridBagConstraints.HORIZONTAL;
        panel.add(label[11], constraint[25]);

        // 가격 요약
        label[12] = new JLabel();
        label[12].setHorizontalAlignment(JLabel.CENTER);
        constraint[26].gridx = 4;
        constraint[26].gridy = 4;
        constraint[26].weightx = 2;
        constraint[26].weighty = 1;
        constraint[26].fill = GridBagConstraints.HORIZONTAL;
        panel.add(label[12], constraint[26]);

        ///////////////////////////////////////////////////////////////////////////////////////
        // 결제 버튼
        button[9].setText("결제하기");
        constraint[27].gridx = 3;
        constraint[27].gridy = 5;
        constraint[27].weightx = 1;
        constraint[27].weighty = 2;
        constraint[27].fill = GridBagConstraints.BOTH;
        panel.add(button[9], constraint[27]);
        button[9].addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "결제가 승인됐습니다." + "\\n" + "잠시만 기다려주세요.");
                label[11].setText("");
                label[12].setText("");
            }
        });

        // 취소 버튼
        button[10].setText("취소하기");
        constraint[28].gridx = 4;
        constraint[28].gridy = 5;
        constraint[28].weightx = 1;
        constraint[28].weighty = 2;
        constraint[28].fill = GridBagConstraints.BOTH;
        panel.add(button[10], constraint[28]);
        button[10].addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "장바구니를 비웠습니다.");
                label[11].setText("");
                label[12].setText("");
            }
        });

        ///////////////////////////////////////////////////////////////////////////////////////
        // 프레임 설정
        this.setContentPane(panel);
        this.setVisible(true);
    }

};