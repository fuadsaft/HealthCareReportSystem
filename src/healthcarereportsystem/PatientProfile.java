/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthcarereportsystem;

import static healthcarereportsystem.HealthCareReportSystem.goKlickedPage;
import static healthcarereportsystem.HealthCareReportSystem.username;
import javax.swing.JLabel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author pc
 */
public class PatientProfile extends javax.swing.JFrame {

    /**
     * Creates new form PatientProfile
     */
    public PatientProfile() {
        initComponents();
        
        getUsername_lable().setText(username);
       
    }

    public JLabel getUsername_lable() {
        return username_lable;
    }

    public void setUsername_lable(JLabel username_lable) {
        this.username_lable = username_lable;
    }

 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        username_lable = new javax.swing.JLabel();
        patientName = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        home = new javax.swing.JButton();
        pid = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();
        sx = new javax.swing.JLabel();
        db = new javax.swing.JLabel();
        pn = new javax.swing.JLabel();
        em = new javax.swing.JLabel();
        cn = new javax.swing.JLabel();
        dv = new javax.swing.JLabel();
        ds = new javax.swing.JLabel();
        ct = new javax.swing.JLabel();
        th = new javax.swing.JLabel();
        rd = new javax.swing.JLabel();
        hs = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jButton1.setText("Report List");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Prescription List");

        jButton3.setText("Test List");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Details");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        //username_lable.setText("Patient Name");
        patientName.setText("Patient Name");

        jButton5.setText("Back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        home.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        home.setText("HOME");
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });

        pid.setText("pid");

        bg.setText("bg");

        sx.setText("sx");

        db.setText("db");

        pn.setText("pn");

        em.setText("em");

        cn.setText("cn");

        dv.setText("dv");

        ds.setText("ds");

        ct.setText("ct");

        th.setText("th");

        rd.setText("rd");

        hs.setText("hs");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
<<<<<<< HEAD
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(username_lable, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addContainerGap(450, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
            .addGroup(layout.createSequentialGroup()
=======
>>>>>>> 8f5fa9ea0600bd67ee7e016b8b33552acca4aad8
                .addContainerGap()
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 365, Short.MAX_VALUE)
                .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(em)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(35, 35, 35))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(patientName, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pid)
                                    .addComponent(bg)
                                    .addComponent(sx)
                                    .addComponent(db)
                                    .addComponent(pn))
                                .addGap(192, 192, 192)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(th)
                                    .addComponent(ct)
                                    .addComponent(ds)
                                    .addComponent(dv)
                                    .addComponent(cn)
                                    .addComponent(rd)
                                    .addComponent(hs))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(61, 61, 61)
<<<<<<< HEAD
                .addComponent(username_lable, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addComponent(jButton3)
=======
                .addComponent(patientName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
>>>>>>> 8f5fa9ea0600bd67ee7e016b8b33552acca4aad8
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pid)
                    .addComponent(cn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bg)
                    .addComponent(dv))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sx)
                    .addComponent(ds))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(db)
                    .addComponent(ct))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pn)
                    .addComponent(th))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(em)
                    .addComponent(rd))
                .addGap(3, 3, 3)
                .addComponent(hs)
                .addGap(1, 1, 1)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(124, 124, 124)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(home))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        // TODO add your handling code here:
        StartPage st = new StartPage();
        goKlickedPage(this,st);
    }//GEN-LAST:event_homeActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        p_details pd = new p_details();
        goKlickedPage(this, pd);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        ShowTestList st = new ShowTestList();
        goKlickedPage(this, st);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ShowReportList sr = new ShowReportList();
        goKlickedPage(this, sr);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        PatientSignIn pt = new PatientSignIn();
        goKlickedPage(this, pt);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        
        
                
            try {
                    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                    Connection connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=HealthCareReportSystem;selectMethod=cursor", "sa", "7896");

                
             String sql = "SELECT Patient_.patientId, Patient_.bloodGroup, Patient_.sex, Patient_.dateOFBirth, Patient_.contact, Patient_.country, Patient_.division, "
                     + "Patient_.district, Patient_.village, Patient_.thana, Patient_.road, Patient_.houseNo, PatientLogIn_.email FROM Patient_ INNER JOIN PatientLogIn_ "
                     + "ON Patient_.userName = PatientLogIn_.userName WHERE Patient_.userName =  ?";
                        
                        PreparedStatement pst = connection.prepareStatement(sql);
                        pst.setString(1, PatientSignIn.Pusername);
                        
                        ResultSet rs = pst.executeQuery();
                        
                        while(rs.next())
                        {
                            
                            
                            hs.setText(rs.getString("houseNo"));
                            em.setText(rs.getString("email"));
                            rd.setText(rs.getString("road"));
                            th.setText(rs.getString("thana"));
                            ct.setText(rs.getString("village"));
                            ds.setText(rs.getString("district"));
                            pn.setText(rs.getString("contact"));
                            bg.setText(rs.getString("bloodGroup"));
                            db.setText(rs.getString("dateOFBirth"));
                            sx.setText(rs.getString("sex"));
                            cn.setText(rs.getString("country"));
                            pid.setText(rs.getString("patientId"));
                            dv.setText(rs.getString("division"));
                            
                            
                            
                            
                        }

            } catch (Exception e) {
                e.printStackTrace();
            }

        
    }//GEN-LAST:event_formWindowOpened


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
            java.util.logging.Logger.getLogger(PatientProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientProfile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JLabel cn;
    private javax.swing.JLabel ct;
    private javax.swing.JLabel db;
    private javax.swing.JLabel ds;
    private javax.swing.JLabel dv;
    private javax.swing.JLabel em;
    private javax.swing.JButton home;
    private javax.swing.JLabel hs;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
<<<<<<< HEAD
    private javax.swing.JLabel username_lable;
=======
    private javax.swing.JLabel patientName;
    private javax.swing.JLabel pid;
    private javax.swing.JLabel pn;
    private javax.swing.JLabel rd;
    private javax.swing.JLabel sx;
    private javax.swing.JLabel th;
>>>>>>> 8f5fa9ea0600bd67ee7e016b8b33552acca4aad8
    // End of variables declaration//GEN-END:variables
}
