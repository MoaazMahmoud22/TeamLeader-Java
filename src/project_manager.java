/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


/**
 *
 * @author NOURHAN
 */
public class project_manager extends javax.swing.JFrame {

    /**
     * Creates new form project_manager
     */
    public project_manager() {
        initComponents();
        this.setLocationRelativeTo( null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        label_proMng = new javax.swing.JLabel();
        btn_writeRep = new javax.swing.JButton();
        btn_AssignPro = new javax.swing.JButton();
        btn_AttendPro = new javax.swing.JButton();
        btn_proPrgs = new javax.swing.JButton();
        btn_Exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));

        label_proMng.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        label_proMng.setForeground(new java.awt.Color(255, 255, 255));
        label_proMng.setText("Project Manager");

        btn_writeRep.setBackground(new java.awt.Color(204, 204, 204));
        btn_writeRep.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_writeRep.setText("Write Report");
        btn_writeRep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_writeRepActionPerformed(evt);
            }
        });

        btn_AssignPro.setBackground(new java.awt.Color(204, 204, 204));
        btn_AssignPro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_AssignPro.setText("Assign Projects");
        btn_AssignPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AssignProActionPerformed(evt);
            }
        });

        btn_AttendPro.setBackground(new java.awt.Color(204, 204, 204));
        btn_AttendPro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_AttendPro.setText("Attendance");
        btn_AttendPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AttendProActionPerformed(evt);
            }
        });

        btn_proPrgs.setBackground(new java.awt.Color(204, 204, 204));
        btn_proPrgs.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_proPrgs.setText("Project Prograss");
        btn_proPrgs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_proPrgsActionPerformed(evt);
            }
        });

        btn_Exit.setBackground(new java.awt.Color(204, 204, 204));
        btn_Exit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_Exit.setText("Exit");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(label_proMng, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_AssignPro, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_writeRep, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_AttendPro, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_proPrgs, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(201, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(label_proMng, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btn_proPrgs, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btn_writeRep, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(btn_AssignPro, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(btn_AttendPro, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_AttendProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AttendProActionPerformed
        // TODO add your handling code here:
        Attendance_pro prg =new Attendance_pro();
        prg.show(); // display prg
        dispose();
         
    }//GEN-LAST:event_btn_AttendProActionPerformed

    private void btn_AssignProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AssignProActionPerformed
        // TODO add your handling code here:
        Assigen_project prg =new Assigen_project();
        prg.show(); // display prg
        dispose();
    }//GEN-LAST:event_btn_AssignProActionPerformed

    private void btn_proPrgsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_proPrgsActionPerformed
        // TODO add your handling code here:
         project_prograss prg =new project_prograss();
        prg.show(); // display prg
        dispose();
    }//GEN-LAST:event_btn_proPrgsActionPerformed

    private void btn_writeRepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_writeRepActionPerformed
        // TODO add your handling code here:
           write_report prg =new write_report();
        prg.show(); // display prg
        dispose();
    }//GEN-LAST:event_btn_writeRepActionPerformed

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
            java.util.logging.Logger.getLogger(project_manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(project_manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(project_manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(project_manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new project_manager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_AssignPro;
    private javax.swing.JButton btn_AttendPro;
    private javax.swing.JButton btn_Exit;
    private javax.swing.JButton btn_proPrgs;
    private javax.swing.JButton btn_writeRep;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label_proMng;
    // End of variables declaration//GEN-END:variables
}
