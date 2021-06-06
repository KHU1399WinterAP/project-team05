package gui.hangman;

import gui.dashboard.SinglePlayer;
import gui.dashboard.Lose;
import java.awt.Color;
import static java.awt.Color.orange;
import static java.awt.Color.white;
import javax.swing.JFrame;

public class Hang_man_1 extends javax.swing.JFrame {

    public Hang_man_1() {
        initComponents();
        btna.setVisible(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new javax.swing.JPanel();
        labal1 = new javax.swing.JLabel();
        labal2 = new javax.swing.JLabel();
        text1 = new javax.swing.JTextField();
        text2 = new javax.swing.JTextField();
        text3 = new javax.swing.JTextField();
        text4 = new javax.swing.JTextField();
        text5 = new javax.swing.JTextField();
        text6 = new javax.swing.JTextField();
        Start1 = new javax.swing.JButton();
        Start2 = new javax.swing.JButton();
        Start3 = new javax.swing.JButton();
        a = new javax.swing.JButton();
        a1 = new javax.swing.JButton();
        a2 = new javax.swing.JButton();
        a3 = new javax.swing.JButton();
        a4 = new javax.swing.JButton();
        a5 = new javax.swing.JButton();
        a6 = new javax.swing.JButton();
        a7 = new javax.swing.JButton();
        a8 = new javax.swing.JButton();
        a9 = new javax.swing.JButton();
        a10 = new javax.swing.JButton();
        a11 = new javax.swing.JButton();
        a12 = new javax.swing.JButton();
        a13 = new javax.swing.JButton();
        a14 = new javax.swing.JButton();
        a15 = new javax.swing.JButton();
        a16 = new javax.swing.JButton();
        a17 = new javax.swing.JButton();
        a18 = new javax.swing.JButton();
        a19 = new javax.swing.JButton();
        btnb = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btna = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel1.setBackground(new java.awt.Color(0, 0, 0));

        labal1.setIcon(new javax.swing.ImageIcon("D:\\project\\project asli\\project-team05\\aftabe\\src\\main\\java\\resources\\icons\\asemon.jpg")); // NOI18N

        labal2.setBackground(new java.awt.Color(255, 255, 255));
        labal2.setFont(new java.awt.Font("Tahoma", 3, 72)); // NOI18N
        labal2.setForeground(new java.awt.Color(51, 255, 0));
        labal2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labal2.setText("5");

        text1.setBackground(new java.awt.Color(0, 255, 255));
        text1.setFont(new java.awt.Font("Trebuchet MS", 3, 24)); // NOI18N

        text2.setBackground(new java.awt.Color(0, 255, 255));
        text2.setFont(new java.awt.Font("Trebuchet MS", 3, 24)); // NOI18N

        text3.setBackground(new java.awt.Color(0, 255, 255));
        text3.setFont(new java.awt.Font("Trebuchet MS", 3, 24)); // NOI18N

        text4.setBackground(new java.awt.Color(0, 255, 255));
        text4.setFont(new java.awt.Font("Trebuchet MS", 3, 24)); // NOI18N

        text5.setBackground(new java.awt.Color(0, 255, 255));
        text5.setFont(new java.awt.Font("Trebuchet MS", 3, 24)); // NOI18N

        text6.setBackground(new java.awt.Color(0, 255, 255));
        text6.setFont(new java.awt.Font("Trebuchet MS", 3, 24)); // NOI18N

        Start1.setBackground(new java.awt.Color(0, 255, 255));
        Start1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        Start1.setText("ReStart");
        Start1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Start1ActionPerformed(evt);
            }
        });

        Start2.setBackground(new java.awt.Color(255, 204, 0));
        Start2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        Start2.setText("Help");
        Start2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Start2ActionPerformed(evt);
            }
        });

        Start3.setBackground(new java.awt.Color(255, 0, 0));
        Start3.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        Start3.setText("back");
        Start3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Start3ActionPerformed(evt);
            }
        });

        a.setBackground(new java.awt.Color(0, 255, 255));
        a.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        a.setText("a");
        a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aActionPerformed(evt);
            }
        });

        a1.setBackground(new java.awt.Color(0, 255, 255));
        a1.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        a1.setText("z");
        a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a1ActionPerformed(evt);
            }
        });

        a2.setBackground(new java.awt.Color(0, 255, 255));
        a2.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        a2.setText("h");
        a2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a2ActionPerformed(evt);
            }
        });

        a3.setBackground(new java.awt.Color(0, 255, 255));
        a3.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        a3.setText("e");
        a3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a3ActionPerformed(evt);
            }
        });

        a4.setBackground(new java.awt.Color(0, 255, 255));
        a4.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        a4.setText("r");
        a4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a4ActionPerformed(evt);
            }
        });

        a5.setBackground(new java.awt.Color(0, 255, 255));
        a5.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        a5.setText("t");
        a5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a5ActionPerformed(evt);
            }
        });

        a6.setBackground(new java.awt.Color(0, 255, 255));
        a6.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        a6.setText("t");
        a6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a6ActionPerformed(evt);
            }
        });

        a7.setBackground(new java.awt.Color(0, 255, 255));
        a7.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        a7.setText("b");
        a7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a7ActionPerformed(evt);
            }
        });

        a8.setBackground(new java.awt.Color(0, 255, 255));
        a8.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        a8.setText("o");
        a8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a8ActionPerformed(evt);
            }
        });

        a9.setBackground(new java.awt.Color(0, 255, 255));
        a9.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        a9.setText("y");
        a9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a9ActionPerformed(evt);
            }
        });

        a10.setBackground(new java.awt.Color(0, 255, 255));
        a10.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        a10.setText("f");
        a10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a10ActionPerformed(evt);
            }
        });

        a11.setBackground(new java.awt.Color(0, 255, 255));
        a11.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        a11.setText("n");
        a11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a11ActionPerformed(evt);
            }
        });

        a12.setBackground(new java.awt.Color(0, 255, 255));
        a12.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        a12.setText("h");
        a12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a12ActionPerformed(evt);
            }
        });

        a13.setBackground(new java.awt.Color(0, 255, 255));
        a13.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        a13.setText("z");
        a13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a13ActionPerformed(evt);
            }
        });

        a14.setBackground(new java.awt.Color(0, 255, 255));
        a14.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        a14.setText("x");
        a14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a14ActionPerformed(evt);
            }
        });

        a15.setBackground(new java.awt.Color(0, 255, 255));
        a15.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        a15.setText("m");
        a15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a15ActionPerformed(evt);
            }
        });

        a16.setBackground(new java.awt.Color(0, 255, 255));
        a16.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        a16.setText("q");
        a16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a16ActionPerformed(evt);
            }
        });

        a17.setBackground(new java.awt.Color(0, 255, 255));
        a17.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        a17.setText("s");
        a17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a17ActionPerformed(evt);
            }
        });

        a18.setBackground(new java.awt.Color(0, 255, 255));
        a18.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        a18.setText("w");
        a18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a18ActionPerformed(evt);
            }
        });

        a19.setBackground(new java.awt.Color(0, 255, 255));
        a19.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        a19.setText("d");
        a19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a19ActionPerformed(evt);
            }
        });

        btnb.setBackground(new java.awt.Color(51, 255, 0));
        btnb.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        btnb.setText("Sumbit");
        btnb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 0));
        jLabel2.setText("The number of your chances :");

        btna.setBackground(new java.awt.Color(255, 153, 0));
        btna.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        btna.setForeground(new java.awt.Color(0, 0, 153));
        btna.setText("go next level");
        btna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(labal1)
                .addGap(106, 106, 106)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Start3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Start2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Start1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labal2, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(text1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(text2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(text3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(text4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(text5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(text6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(a10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a14, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a15, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a16, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a17, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a18, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a19, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(a, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnb, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(209, 209, 209)
                .addComponent(btna, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(Start1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Start2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Start3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labal1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labal2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(text1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(text2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(text3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(text4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(text5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(text6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(a, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(a10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a11, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a12, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a13, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a14, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a15, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a16, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a17, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a18, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a19, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btna, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Start3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Start3ActionPerformed

        SinglePlayer selectgame = new SinglePlayer();
        this.dispose();
        selectgame.setVisible(true);
        Color f = panel1.getBackground();
        if (f.equals(white)) {
            selectgame.panel1.setBackground(Color.white);
            selectgame.label1.setForeground(Color.red);

        }
    }//GEN-LAST:event_Start3ActionPerformed

    private void Start1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Start1ActionPerformed

        Hang_man_1 hangman = new Hang_man_1();
        this.dispose();
        hangman.setVisible(true);
        Color f = panel1.getBackground();
        if (f.equals(white)) {
            hangman.panel1.setBackground(Color.white);
        }
    }//GEN-LAST:event_Start1ActionPerformed

    private void aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aActionPerformed

        text1.setText("a");
        a.setVisible(false);
    }//GEN-LAST:event_aActionPerformed

    private void a17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a17ActionPerformed

        text2.setText("s");
        a17.setVisible(false);
    }//GEN-LAST:event_a17ActionPerformed

    private void a3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a3ActionPerformed

        text3.setText("e");
        a3.setVisible(false);
    }//GEN-LAST:event_a3ActionPerformed

    private void a15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a15ActionPerformed

        text4.setText("m");
        a15.setVisible(false);
    }//GEN-LAST:event_a15ActionPerformed

    private void a8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a8ActionPerformed

        text5.setText("o");
        a8.setVisible(false);
    }//GEN-LAST:event_a8ActionPerformed

    private void a11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a11ActionPerformed

        text6.setText("n");
        a11.setVisible(false);
    }//GEN-LAST:event_a11ActionPerformed

    private void a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a1ActionPerformed

        String f = labal2.getText();
        if (f.equals("5")) {
            labal2.setText("4");
            a1.setVisible(false);
        } else if (f.equals("4")) {
            labal2.setText("3");
            labal2.setForeground(Color.orange);
            a1.setVisible(false);
        } else if (f.equals("3")) {
            labal2.setText("2");
            labal2.setForeground(Color.orange);
            a1.setVisible(false);
        } else if (f.equals("2")) {
            labal2.setText("1");
            labal2.setForeground(Color.red);
            a1.setVisible(false);
        } else if (f.equals("1")) {
            labal2.setText("0");
            Lose lose = new Lose();
            lose.setVisible(true);
            this.dispose();
            a1.setVisible(false);
            Color h = panel1.getBackground();
            if (h.equals(white)) {
                lose.panel1.setBackground(Color.white);

            }
        }


    }//GEN-LAST:event_a1ActionPerformed

    private void a2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a2ActionPerformed

        String f = labal2.getText();
        if (f.equals("5")) {
            labal2.setText("4");
            a2.setVisible(false);
        } else if (f.equals("4")) {
            labal2.setText("3");
            labal2.setForeground(Color.orange);
            a2.setVisible(false);
        } else if (f.equals("3")) {
            labal2.setText("2");
            labal2.setForeground(Color.orange);
            a2.setVisible(false);
        } else if (f.equals("2")) {
            labal2.setText("1");
            labal2.setForeground(Color.red);
            a2.setVisible(false);
        } else if (f.equals("1")) {
            labal2.setText("0");
            Lose lose = new Lose();
            lose.setVisible(true);
            this.dispose();
            a2.setVisible(false);
            Color h = panel1.getBackground();
            if (h.equals(white)) {
                lose.panel1.setBackground(Color.white);

            }
        }
    }//GEN-LAST:event_a2ActionPerformed

    private void a4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a4ActionPerformed

        String f = labal2.getText();
        if (f.equals("5")) {
            labal2.setText("4");
            a4.setVisible(false);
        } else if (f.equals("4")) {
            labal2.setText("3");
            labal2.setForeground(Color.orange);
            a4.setVisible(false);
        } else if (f.equals("3")) {
            labal2.setText("2");
            labal2.setForeground(Color.orange);
            a4.setVisible(false);
        } else if (f.equals("2")) {
            labal2.setText("1");
            labal2.setForeground(Color.red);
            a4.setVisible(false);
        } else if (f.equals("1")) {
            labal2.setText("0");
            Lose lose = new Lose();
            lose.setVisible(true);
            this.dispose();
            a4.setVisible(false);
            Color h = panel1.getBackground();
            if (h.equals(white)) {
                lose.panel1.setBackground(Color.white);

            }
        }
    }//GEN-LAST:event_a4ActionPerformed

    private void a5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a5ActionPerformed

        String f = labal2.getText();
        if (f.equals("5")) {
            labal2.setText("4");
            a5.setVisible(false);
        } else if (f.equals("4")) {
            labal2.setText("3");
            labal2.setForeground(Color.orange);
            a5.setVisible(false);
        } else if (f.equals("3")) {
            labal2.setText("2");
            labal2.setForeground(Color.orange);
            a5.setVisible(false);
        } else if (f.equals("2")) {
            labal2.setText("1");
            labal2.setForeground(Color.red);
            a5.setVisible(false);
        } else if (f.equals("1")) {
            labal2.setText("0");
            Lose lose = new Lose();
            lose.setVisible(true);
            this.dispose();
            a5.setVisible(false);
            Color h = panel1.getBackground();
            if (h.equals(white)) {
                lose.panel1.setBackground(Color.white);

            }
        }
    }//GEN-LAST:event_a5ActionPerformed

    private void a6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a6ActionPerformed

        String f = labal2.getText();
        if (f.equals("5")) {
            labal2.setText("4");
            a6.setVisible(false);
        } else if (f.equals("4")) {
            labal2.setText("3");
            labal2.setForeground(Color.orange);
            a6.setVisible(false);
        } else if (f.equals("3")) {
            labal2.setText("2");
            labal2.setForeground(Color.orange);
            a6.setVisible(false);
        } else if (f.equals("2")) {
            labal2.setText("1");
            labal2.setForeground(Color.red);
            a6.setVisible(false);
        } else if (f.equals("1")) {
            labal2.setText("0");
            Lose lose = new Lose();
            lose.setVisible(true);
            this.dispose();
            a6.setVisible(false);
            Color h = panel1.getBackground();
            if (h.equals(white)) {
                lose.panel1.setBackground(Color.white);

            }
        }
    }//GEN-LAST:event_a6ActionPerformed

    private void a7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a7ActionPerformed

        String f = labal2.getText();
        if (f.equals("5")) {
            labal2.setText("4");
            a7.setVisible(false);
        } else if (f.equals("4")) {
            labal2.setText("3");
            labal2.setForeground(Color.orange);
            a7.setVisible(false);
        } else if (f.equals("3")) {
            labal2.setText("2");
            labal2.setForeground(Color.orange);
            a7.setVisible(false);
        } else if (f.equals("2")) {
            labal2.setText("1");
            labal2.setForeground(Color.red);
            a7.setVisible(false);
        } else if (f.equals("1")) {
            labal2.setText("0");
            Lose lose = new Lose();
            lose.setVisible(true);
            this.dispose();
            a7.setVisible(false);
            Color h = panel1.getBackground();
            if (h.equals(white)) {
                lose.panel1.setBackground(Color.white);

            }
        }
    }//GEN-LAST:event_a7ActionPerformed

    private void a9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a9ActionPerformed

        String f = labal2.getText();
        if (f.equals("5")) {
            labal2.setText("4");
            a9.setVisible(false);
        } else if (f.equals("4")) {
            labal2.setText("3");
            labal2.setForeground(Color.orange);
            a9.setVisible(false);
        } else if (f.equals("3")) {
            labal2.setText("2");
            labal2.setForeground(Color.orange);
            a9.setVisible(false);
        } else if (f.equals("2")) {
            labal2.setText("1");
            labal2.setForeground(Color.red);
            a9.setVisible(false);
        } else if (f.equals("1")) {
            labal2.setText("0");
            Lose lose = new Lose();
            lose.setVisible(true);
            this.dispose();
            a9.setVisible(false);
            Color h = panel1.getBackground();
            if (h.equals(white)) {
                lose.panel1.setBackground(Color.white);

            }
        }
    }//GEN-LAST:event_a9ActionPerformed

    private void a10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a10ActionPerformed

        String f = labal2.getText();
        if (f.equals("5")) {
            labal2.setText("4");
            a10.setVisible(false);
        } else if (f.equals("4")) {
            labal2.setText("3");
            labal2.setForeground(Color.orange);
            a10.setVisible(false);
        } else if (f.equals("3")) {
            labal2.setText("2");
            labal2.setForeground(Color.orange);
            a10.setVisible(false);
        } else if (f.equals("2")) {
            labal2.setText("1");
            labal2.setForeground(Color.red);
            a10.setVisible(false);
        } else if (f.equals("1")) {
            labal2.setText("0");
            Lose lose = new Lose();
            lose.setVisible(true);
            this.dispose();
            a10.setVisible(false);
            Color h = panel1.getBackground();
            if (h.equals(white)) {
                lose.panel1.setBackground(Color.white);

            }
        }
    }//GEN-LAST:event_a10ActionPerformed

    private void a12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a12ActionPerformed

        String f = labal2.getText();
        if (f.equals("5")) {
            labal2.setText("4");
            a12.setVisible(false);
        } else if (f.equals("4")) {
            labal2.setText("3");
            labal2.setForeground(Color.orange);
            a12.setVisible(false);
        } else if (f.equals("3")) {
            labal2.setText("2");
            labal2.setForeground(Color.orange);
            a12.setVisible(false);
        } else if (f.equals("2")) {
            labal2.setText("1");
            labal2.setForeground(Color.red);
            a12.setVisible(false);
        } else if (f.equals("1")) {
            labal2.setText("0");
            Lose lose = new Lose();
            lose.setVisible(true);
            this.dispose();
            a12.setVisible(false);
            Color h = panel1.getBackground();
            if (h.equals(white)) {
                lose.panel1.setBackground(Color.white);

            }
        }
    }//GEN-LAST:event_a12ActionPerformed

    private void a13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a13ActionPerformed

        String f = labal2.getText();
        if (f.equals("5")) {
            labal2.setText("4");
            a13.setVisible(false);
        } else if (f.equals("4")) {
            labal2.setText("3");
            labal2.setForeground(Color.orange);
            a13.setVisible(false);
        } else if (f.equals("3")) {
            labal2.setText("2");
            labal2.setForeground(Color.orange);
            a13.setVisible(false);
        } else if (f.equals("2")) {
            labal2.setText("1");
            labal2.setForeground(Color.red);
            a13.setVisible(false);
        } else if (f.equals("1")) {
            labal2.setText("0");
            Lose lose = new Lose();
            lose.setVisible(true);
            this.dispose();
            a13.setVisible(false);
            Color h = panel1.getBackground();
            if (h.equals(white)) {
                lose.panel1.setBackground(Color.white);

            }
        }
    }//GEN-LAST:event_a13ActionPerformed

    private void a14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a14ActionPerformed

        String f = labal2.getText();
        if (f.equals("5")) {
            labal2.setText("4");
            a14.setVisible(false);
        } else if (f.equals("4")) {
            labal2.setText("3");
            labal2.setForeground(Color.orange);
            a14.setVisible(false);
        } else if (f.equals("3")) {
            labal2.setText("2");
            labal2.setForeground(Color.orange);
            a14.setVisible(false);
        } else if (f.equals("2")) {
            labal2.setText("1");
            labal2.setForeground(Color.red);
            a14.setVisible(false);
        } else if (f.equals("1")) {
            labal2.setText("0");
            Lose lose = new Lose();
            lose.setVisible(true);
            this.dispose();
            a14.setVisible(false);
            Color h = panel1.getBackground();
            if (h.equals(white)) {
                lose.panel1.setBackground(Color.white);

            }
        }
    }//GEN-LAST:event_a14ActionPerformed

    private void a16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a16ActionPerformed

        String f = labal2.getText();
        if (f.equals("5")) {
            labal2.setText("4");
            a16.setVisible(false);
        } else if (f.equals("4")) {
            labal2.setText("3");
            labal2.setForeground(Color.orange);
            a16.setVisible(false);
        } else if (f.equals("3")) {
            labal2.setText("2");
            labal2.setForeground(Color.orange);
            a16.setVisible(false);
        } else if (f.equals("2")) {
            labal2.setText("1");
            labal2.setForeground(Color.red);
            a16.setVisible(false);
        } else if (f.equals("1")) {
            labal2.setText("0");
            Lose lose = new Lose();
            lose.setVisible(true);
            this.dispose();
            a16.setVisible(false);
            Color h = panel1.getBackground();
            if (h.equals(white)) {
                lose.panel1.setBackground(Color.white);

            }
        }
    }//GEN-LAST:event_a16ActionPerformed

    private void a18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a18ActionPerformed

        String f = labal2.getText();
        if (f.equals("5")) {
            labal2.setText("4");
            a18.setVisible(false);
        } else if (f.equals("4")) {
            labal2.setText("3");
            labal2.setForeground(Color.orange);
            a18.setVisible(false);
        } else if (f.equals("3")) {
            labal2.setText("2");
            labal2.setForeground(Color.orange);
            a18.setVisible(false);
        } else if (f.equals("2")) {
            labal2.setText("1");
            labal2.setForeground(Color.red);
            a18.setVisible(false);
        } else if (f.equals("1")) {
            labal2.setText("0");
            Lose lose = new Lose();
            lose.setVisible(true);
            this.dispose();
            a18.setVisible(false);
            Color h = panel1.getBackground();
            if (h.equals(white)) {
                lose.panel1.setBackground(Color.white);

            }
        }
    }//GEN-LAST:event_a18ActionPerformed

    private void a19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a19ActionPerformed

        String f = labal2.getText();
        if (f.equals("5")) {
            labal2.setText("4");
            a19.setVisible(false);
        } else if (f.equals("4")) {
            labal2.setText("3");
            labal2.setForeground(Color.orange);
            a19.setVisible(false);
        } else if (f.equals("3")) {
            labal2.setText("2");
            labal2.setForeground(Color.orange);
            a19.setVisible(false);
        } else if (f.equals("2")) {
            labal2.setText("1");
            labal2.setForeground(Color.red);
            a19.setVisible(false);
        } else if (f.equals("1")) {
            labal2.setText("0");
            Lose lose = new Lose();
            lose.setVisible(true);
            this.dispose();
            a19.setVisible(false);
            Color h = panel1.getBackground();
            if (h.equals(white)) {
                lose.panel1.setBackground(Color.white);

            }
        }
    }//GEN-LAST:event_a19ActionPerformed

    private void Start2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Start2ActionPerformed

        String f = labal2.getText();
        if (f.equals("5")) {
            labal2.setText("3");
            a19.setVisible(false);
            a1.setVisible(false);
            a9.setVisible(false);
        } else if (f.equals("4")) {
            labal2.setText("2");
            a19.setVisible(false);
            a1.setVisible(false);
            a10.setVisible(false);
            a12.setVisible(false);
        } else if (f.equals("3")) {
            labal2.setText("1");
            a19.setVisible(false);
            a1.setVisible(false);
            a10.setVisible(false);
            a13.setVisible(false);
        } else {
            Lose lose = new Lose();
            this.dispose();
            lose.setVisible(true);
            Color h = panel1.getBackground();
            if (h.equals(white)) {
                lose.panel1.setBackground(Color.white);

            }
        }
    }//GEN-LAST:event_Start2ActionPerformed

    private void btnbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbActionPerformed

        String f = text1.getText();
        String f1 = text2.getText();
        String f2 = text3.getText();
        String f3 = text4.getText();
        String f4 = text5.getText();
        String f5 = text6.getText();
        if (f.equals("a") && f1.equals("s") && f2.equals("e") && f3.equals("m") && f4.equals("o") && f5.equals("n")) {
            btna.setVisible(true);
            btnb.setVisible(false);
            labal2.setText("win");
            labal2.setForeground(Color.green);
            text1.setBackground(Color.green);
            text2.setBackground(Color.green);
            text3.setBackground(Color.green);
            text4.setBackground(Color.green);
            text5.setBackground(Color.green);
            text6.setBackground(Color.green);
        } else {
            Error error = new Error();
            error.setVisible(true);

        }
    }//GEN-LAST:event_btnbActionPerformed

    private void btnaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaActionPerformed

        Hang_man_2 hangman2 = new Hang_man_2();
        this.dispose();
        hangman2.setVisible(true);
        Color f = panel1.getBackground();
        if (f.equals(white)) {
            hangman2.panel1.setBackground(Color.white);
        }
    }//GEN-LAST:event_btnaActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hang_man_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Start1;
    private javax.swing.JButton Start2;
    private javax.swing.JButton Start3;
    private javax.swing.JButton a;
    private javax.swing.JButton a1;
    private javax.swing.JButton a10;
    private javax.swing.JButton a11;
    private javax.swing.JButton a12;
    private javax.swing.JButton a13;
    private javax.swing.JButton a14;
    private javax.swing.JButton a15;
    private javax.swing.JButton a16;
    private javax.swing.JButton a17;
    private javax.swing.JButton a18;
    private javax.swing.JButton a19;
    private javax.swing.JButton a2;
    private javax.swing.JButton a3;
    private javax.swing.JButton a4;
    private javax.swing.JButton a5;
    private javax.swing.JButton a6;
    private javax.swing.JButton a7;
    private javax.swing.JButton a8;
    private javax.swing.JButton a9;
    private javax.swing.JButton btna;
    private javax.swing.JButton btnb;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel labal1;
    private javax.swing.JLabel labal2;
    public javax.swing.JPanel panel1;
    private javax.swing.JTextField text1;
    private javax.swing.JTextField text2;
    private javax.swing.JTextField text3;
    private javax.swing.JTextField text4;
    private javax.swing.JTextField text5;
    private javax.swing.JTextField text6;
    // End of variables declaration//GEN-END:variables
}
