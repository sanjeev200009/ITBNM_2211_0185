/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Controller.UpdateStudentController;
import Model.ADDNewStudent; 
import Model.ADDmarks;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.DBConnection;
import model.DBSearch;


/**
 *
 * @author user
 */
public class DisplayaddedStudent extends javax.swing.JFrame {

    /**
     * Creates new form DisplayaddedStudent
     */
    public DisplayaddedStudent() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sidepane = new javax.swing.JPanel();
        btn_2 = new javax.swing.JPanel();
        ind_2 = new javax.swing.JPanel();
        HOMEBUTTON1 = new javax.swing.JLabel();
        btn_3 = new javax.swing.JPanel();
        ind_3 = new javax.swing.JPanel();
        HOMEBUTTON2 = new javax.swing.JLabel();
        ind_5 = new javax.swing.JPanel();
        btn_4 = new javax.swing.JPanel();
        ind_4 = new javax.swing.JPanel();
        HOMEBUTTON3 = new javax.swing.JLabel();
        ind_6 = new javax.swing.JPanel();
        btn_5 = new javax.swing.JPanel();
        ind_7 = new javax.swing.JPanel();
        HOMEBUTTON6 = new javax.swing.JLabel();
        btn_1 = new javax.swing.JPanel();
        ind_1 = new javax.swing.JPanel();
        HOMEBUTTON = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        Cancelwindow1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidepane.setBackground(new java.awt.Color(21, 34, 89));
        sidepane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_2.setBackground(new java.awt.Color(21, 34, 89));
        btn_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_2MousePressed(evt);
            }
        });

        ind_2.setOpaque(false);

        javax.swing.GroupLayout ind_2Layout = new javax.swing.GroupLayout(ind_2);
        ind_2.setLayout(ind_2Layout);
        ind_2Layout.setHorizontalGroup(
            ind_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        ind_2Layout.setVerticalGroup(
            ind_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 85, Short.MAX_VALUE)
        );

        HOMEBUTTON1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        HOMEBUTTON1.setForeground(new java.awt.Color(255, 255, 255));
        HOMEBUTTON1.setText("profile of publication");

        javax.swing.GroupLayout btn_2Layout = new javax.swing.GroupLayout(btn_2);
        btn_2.setLayout(btn_2Layout);
        btn_2Layout.setHorizontalGroup(
            btn_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_2Layout.createSequentialGroup()
                .addComponent(ind_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(HOMEBUTTON1, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                .addContainerGap())
        );
        btn_2Layout.setVerticalGroup(
            btn_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_2Layout.createSequentialGroup()
                .addGroup(btn_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ind_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(btn_2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(HOMEBUTTON1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        sidepane.add(btn_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 230, 64));

        btn_3.setBackground(new java.awt.Color(21, 34, 89));
        btn_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_3MousePressed(evt);
            }
        });

        ind_3.setOpaque(false);

        javax.swing.GroupLayout ind_3Layout = new javax.swing.GroupLayout(ind_3);
        ind_3.setLayout(ind_3Layout);
        ind_3Layout.setHorizontalGroup(
            ind_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        ind_3Layout.setVerticalGroup(
            ind_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 85, Short.MAX_VALUE)
        );

        HOMEBUTTON2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        HOMEBUTTON2.setForeground(new java.awt.Color(255, 255, 255));
        HOMEBUTTON2.setText("Emergency contacts");

        javax.swing.GroupLayout btn_3Layout = new javax.swing.GroupLayout(btn_3);
        btn_3.setLayout(btn_3Layout);
        btn_3Layout.setHorizontalGroup(
            btn_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_3Layout.createSequentialGroup()
                .addComponent(ind_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(HOMEBUTTON2)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        btn_3Layout.setVerticalGroup(
            btn_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_3Layout.createSequentialGroup()
                .addGroup(btn_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ind_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(btn_3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(HOMEBUTTON2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        sidepane.add(btn_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 230, 64));

        ind_5.setOpaque(false);

        javax.swing.GroupLayout ind_5Layout = new javax.swing.GroupLayout(ind_5);
        ind_5.setLayout(ind_5Layout);
        ind_5Layout.setHorizontalGroup(
            ind_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        ind_5Layout.setVerticalGroup(
            ind_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 85, Short.MAX_VALUE)
        );

        sidepane.add(ind_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, -1, -1));

        btn_4.setBackground(new java.awt.Color(21, 34, 89));
        btn_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_4MousePressed(evt);
            }
        });

        ind_4.setOpaque(false);

        javax.swing.GroupLayout ind_4Layout = new javax.swing.GroupLayout(ind_4);
        ind_4.setLayout(ind_4Layout);
        ind_4Layout.setHorizontalGroup(
            ind_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        ind_4Layout.setVerticalGroup(
            ind_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 85, Short.MAX_VALUE)
        );

        HOMEBUTTON3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        HOMEBUTTON3.setForeground(new java.awt.Color(255, 255, 255));
        HOMEBUTTON3.setText("Setting");

        javax.swing.GroupLayout btn_4Layout = new javax.swing.GroupLayout(btn_4);
        btn_4.setLayout(btn_4Layout);
        btn_4Layout.setHorizontalGroup(
            btn_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_4Layout.createSequentialGroup()
                .addComponent(ind_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(HOMEBUTTON3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        btn_4Layout.setVerticalGroup(
            btn_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_4Layout.createSequentialGroup()
                .addGroup(btn_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ind_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(btn_4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(HOMEBUTTON3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        sidepane.add(btn_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 230, 70));

        ind_6.setOpaque(false);

        javax.swing.GroupLayout ind_6Layout = new javax.swing.GroupLayout(ind_6);
        ind_6.setLayout(ind_6Layout);
        ind_6Layout.setHorizontalGroup(
            ind_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        ind_6Layout.setVerticalGroup(
            ind_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 85, Short.MAX_VALUE)
        );

        sidepane.add(ind_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, -1, -1));

        btn_5.setBackground(new java.awt.Color(21, 34, 89));
        btn_5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_5MousePressed(evt);
            }
        });

        ind_7.setOpaque(false);

        javax.swing.GroupLayout ind_7Layout = new javax.swing.GroupLayout(ind_7);
        ind_7.setLayout(ind_7Layout);
        ind_7Layout.setHorizontalGroup(
            ind_7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        ind_7Layout.setVerticalGroup(
            ind_7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 85, Short.MAX_VALUE)
        );

        HOMEBUTTON6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        HOMEBUTTON6.setForeground(new java.awt.Color(255, 255, 255));
        HOMEBUTTON6.setText("logout");

        javax.swing.GroupLayout btn_5Layout = new javax.swing.GroupLayout(btn_5);
        btn_5.setLayout(btn_5Layout);
        btn_5Layout.setHorizontalGroup(
            btn_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_5Layout.createSequentialGroup()
                .addComponent(ind_7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(HOMEBUTTON6, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        btn_5Layout.setVerticalGroup(
            btn_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_5Layout.createSequentialGroup()
                .addGroup(btn_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ind_7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(btn_5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(HOMEBUTTON6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        sidepane.add(btn_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 230, 70));

        btn_1.setBackground(new java.awt.Color(41, 57, 80));
        btn_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout ind_1Layout = new javax.swing.GroupLayout(ind_1);
        ind_1.setLayout(ind_1Layout);
        ind_1Layout.setHorizontalGroup(
            ind_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        ind_1Layout.setVerticalGroup(
            ind_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 85, Short.MAX_VALUE)
        );

        HOMEBUTTON.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        HOMEBUTTON.setForeground(new java.awt.Color(255, 255, 255));
        HOMEBUTTON.setText("DashBord");

        javax.swing.GroupLayout btn_1Layout = new javax.swing.GroupLayout(btn_1);
        btn_1.setLayout(btn_1Layout);
        btn_1Layout.setHorizontalGroup(
            btn_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_1Layout.createSequentialGroup()
                .addComponent(ind_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(HOMEBUTTON, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        btn_1Layout.setVerticalGroup(
            btn_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_1Layout.createSequentialGroup()
                .addGroup(btn_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ind_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(btn_1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(HOMEBUTTON)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        sidepane.add(btn_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 230, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8-home (1).gif"))); // NOI18N
        sidepane.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 50, 60));
        sidepane.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 220, 10));

        getContentPane().add(sidepane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 1102));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));

        Cancelwindow1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        Cancelwindow1.setForeground(new java.awt.Color(204, 0, 51));
        Cancelwindow1.setText("   X");
        Cancelwindow1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cancelwindow1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Cancelwindow1MouseClicked(evt);
            }
        });

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8-search.gif"))); // NOI18N

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8-internet.gif"))); // NOI18N

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(96, 83, 150));
        jLabel16.setText("Access your grades, assignments, and schedules easily. Stay connected with your teachers and classmates through our integrated communication tools");

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(96, 83, 150));
        jLabel17.setText(" Stay connected with your teachers and classmates through our integrated communication tools");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 1182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 1182, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(95, 95, 95)
                .addComponent(jLabel13)
                .addGap(26, 26, 26)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(0, 0, 0)
                .addComponent(Cancelwindow1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Cancelwindow1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(152, 152, 152))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel17))
                            .addComponent(jLabel13))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 1740, 70));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel15.setText("WELCOME BACK TO EDUVERSE VIEW STUDENT INFORMATION PAGE");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, -1, -1));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel18.setText("EDUVERSE/EDUVERSESTUDY@GMAIL.COM");
        jLabel18.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 160, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "STUDENT_NAME", "STUDENT_ADRESS", "STUDENT_GENDER", "STUDENT_RELIGION", "STUDENT_CONTACT_NUMBER", "ADDMISSION_DATE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 1150, 100));

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton3.setText("UPDATE STUDENT  DETAILS");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 460, -1, 69));

        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton5.setText("DELETE THE STUDENT DETAILS");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 450, -1, 69));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("VIEW THE  STUDENT DETAILS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 370, -1, 69));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_2MousePressed
        setColor(btn_2);
        ind_2.setOpaque(true);
        resetColor(new JPanel[]{btn_1, btn_3, btn_4, btn_5},
            new JPanel[]{ind_1, ind_3, ind_4, ind_5, ind_6});
    }//GEN-LAST:event_btn_2MousePressed

    private void btn_3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_3MousePressed
        setColor(btn_3);
        ind_3.setOpaque(true);
        resetColor(new JPanel[]{btn_1, btn_2, btn_4, btn_5},
            new JPanel[]{ind_1, ind_2, ind_4, ind_5, ind_6});
    }//GEN-LAST:event_btn_3MousePressed

    private void btn_4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_4MousePressed
        setColor(btn_4);
        ind_4.setOpaque(true);
        resetColor(new JPanel[]{btn_1, btn_2, btn_3, btn_5},
            new JPanel[]{ind_1, ind_2, ind_3, ind_5, ind_6});
    }//GEN-LAST:event_btn_4MousePressed

    private void btn_5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_5MousePressed
        setColor(btn_5);
        ind_5.setOpaque(true);
        resetColor(new JPanel[]{btn_1, btn_2, btn_3, btn_4},
            new JPanel[]{ind_1, ind_2, ind_3, ind_4, ind_6});
    }//GEN-LAST:event_btn_5MousePressed

    private void btn_1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_1MousePressed
        setColor(btn_1);
        ind_1.setOpaque(true);
        resetColor(new JPanel[]{btn_2, btn_3, btn_4, btn_5},
            new JPanel[]{ind_2, ind_3, ind_4, ind_5, ind_6});
    }//GEN-LAST:event_btn_1MousePressed

    private void Cancelwindow1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Cancelwindow1MouseClicked

    }//GEN-LAST:event_Cancelwindow1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    // Get the selected row index
 
int selectedRow = jTable1.getSelectedRow();
    
    // Check if a row is selected
    if (selectedRow != -1) {
        // Get the current student details from the selected row
        String studentName = (String) jTable1.getValueAt(selectedRow, 0);
        String studentAddress = (String) jTable1.getValueAt(selectedRow, 1);
        String studentGender = (String) jTable1.getValueAt(selectedRow, 2);
        String studentReligion = (String) jTable1.getValueAt(selectedRow, 3);
        String studentContactNumber = (String) jTable1.getValueAt(selectedRow, 4);

        // Retrieve the date and convert it to a String
        java.sql.Date admissionDateSql = (java.sql.Date) jTable1.getValueAt(selectedRow, 5);
        String admissionDate = admissionDateSql.toString();

        // Show dialog to get new values (replace with your actual UI logic)
        JTextField addressField = new JTextField(studentAddress);
        JTextField genderField = new JTextField(studentGender);
        JTextField religionField = new JTextField(studentReligion);
        JTextField contactNumberField = new JTextField(studentContactNumber);
        JTextField admissionDateField = new JTextField(admissionDate);

        Object[] message = {
            "Address:", addressField,
            "Gender:", genderField,
            "Religion:", religionField,
            "Contact Number:", contactNumberField,
            "Admission Date:", admissionDateField,
        };

        int option = JOptionPane.showConfirmDialog(null, message, "Update Student", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            // Update the student record
            String newAddress = addressField.getText();
            String newGender = genderField.getText();
            String newReligion = religionField.getText();
            String newContactNumber = contactNumberField.getText();
            String newAdmissionDate = admissionDateField.getText();

            new ADDmarks().UPDATESTUDENT(studentName, newAddress, newGender, newReligion, newContactNumber, newAdmissionDate);

            // Update the table model to reflect the new data
            jTable1.setValueAt(newAddress, selectedRow, 1);
            jTable1.setValueAt(newGender, selectedRow, 2);
            jTable1.setValueAt(newReligion, selectedRow, 3);
            jTable1.setValueAt(newContactNumber, selectedRow, 4);
            jTable1.setValueAt(newAdmissionDate, selectedRow, 5);

            // Show confirmation message
            JOptionPane.showMessageDialog(null, "Student record has been updated", "Successful", JOptionPane.INFORMATION_MESSAGE);
        }
    } else {
        // Show error message if no row is selected
        JOptionPane.showMessageDialog(null, "Please select a row to update", "Error", JOptionPane.ERROR_MESSAGE);
    }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
     int selectedRow = jTable1.getSelectedRow();
    
    // Check if a row is selected
    if (selectedRow != -1) {
        // Get the student name (or ID) from the selected row, assuming the first column contains the student name
        String studentName = (String) jTable1.getValueAt(selectedRow, 0);
        
        // Delete the student record
        new ADDmarks().DELETESTUDENT(studentName);
        
        // Update the table model to remove the deleted row
        ((DefaultTableModel) jTable1.getModel()).removeRow(selectedRow);
        
        // Show confirmation message
        JOptionPane.showMessageDialog(null, "Student record has been deleted", "Successful", JOptionPane.INFORMATION_MESSAGE);
    } else {
        // Show error message if no row is selected
        JOptionPane.showMessageDialog(null, "Please select a row to delete", "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

  
        ResultSet r = new DBSearch().searchstudent();
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);

        try {
            Vector<Object> v;
            while (r.next()) {
                v = new Vector<>();
                v.add(r.getString("STUDENT_NAME"));
                v.add(r.getString("STUDENT_ADRESS"));
                v.add(r.getString("STUDENT_GENDER"));
                v.add(r.getString("STUDENT_RELIGION"));
                v.add(r.getString("STUDENT_CONTACT_NUMBER"));
                v.add(r.getDate("ADDMISSION_DATE"));

                dtm.addRow(v);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    


    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DisplayaddedStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DisplayaddedStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DisplayaddedStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DisplayaddedStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DisplayaddedStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cancelwindow1;
    private javax.swing.JLabel HOMEBUTTON;
    private javax.swing.JLabel HOMEBUTTON1;
    private javax.swing.JLabel HOMEBUTTON2;
    private javax.swing.JLabel HOMEBUTTON3;
    private javax.swing.JLabel HOMEBUTTON6;
    private javax.swing.JPanel btn_1;
    private javax.swing.JPanel btn_2;
    private javax.swing.JPanel btn_3;
    private javax.swing.JPanel btn_4;
    private javax.swing.JPanel btn_5;
    private javax.swing.JPanel ind_1;
    private javax.swing.JPanel ind_2;
    private javax.swing.JPanel ind_3;
    private javax.swing.JPanel ind_4;
    private javax.swing.JPanel ind_5;
    private javax.swing.JPanel ind_6;
    private javax.swing.JPanel ind_7;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel sidepane;
    // End of variables declaration//GEN-END:variables

      private void setColor(JPanel pane) {
        pane.setBackground(new Color(41,57,80));
    }
   private void resetColor(JPanel [] pane,JPanel [] indicators) {
        for(int i=0;i<pane.length;i++){
           pane[i].setBackground(new Color(23,35,51));
          }for(int i=0;i<indicators.length;i++){
           indicators[i].setOpaque(false);           
        }
    }

    
    }

