/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


/**
 *
 * @author NOURHAN
 */
public class Admin1 extends javax.swing.JFrame {

    /**
     * Creates new form Admin1
     */
    public Admin1() {
        initComponents();
         this.setLocationRelativeTo(null);
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
        label_admin1 = new javax.swing.JLabel();
        btn_AddusersAdmin = new javax.swing.JButton();
        btn_UpdateAdmin = new javax.swing.JButton();
        btn_ViewUsers = new javax.swing.JButton();
        btn_projectsAdmine = new javax.swing.JButton();
        btn_exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));

        label_admin1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        label_admin1.setForeground(new java.awt.Color(255, 255, 255));
        label_admin1.setText("        Admin");

        btn_AddusersAdmin.setBackground(new java.awt.Color(204, 204, 204));
        btn_AddusersAdmin.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_AddusersAdmin.setText("Add User");
        btn_AddusersAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddusersAdminActionPerformed(evt);
            }
        });

        btn_UpdateAdmin.setBackground(new java.awt.Color(204, 204, 204));
        btn_UpdateAdmin.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_UpdateAdmin.setText("Update User");
        btn_UpdateAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UpdateAdminActionPerformed(evt);
            }
        });

        btn_ViewUsers.setBackground(new java.awt.Color(204, 204, 204));
        btn_ViewUsers.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_ViewUsers.setText("View Users");
        btn_ViewUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ViewUsersActionPerformed(evt);
            }
        });

        btn_projectsAdmine.setBackground(new java.awt.Color(204, 204, 204));
        btn_projectsAdmine.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_projectsAdmine.setText("Projects");
        btn_projectsAdmine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_projectsAdmineActionPerformed(evt);
            }
        });

        btn_exit.setBackground(new java.awt.Color(204, 204, 204));
        btn_exit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_exit.setText("Exit");
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(label_admin1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_UpdateAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_AddusersAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ViewUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_projectsAdmine, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 176, Short.MAX_VALUE)
                .addComponent(btn_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(label_admin1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(btn_projectsAdmine, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btn_AddusersAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btn_UpdateAdmin)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(btn_ViewUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                        .addComponent(btn_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))))
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

    private void btn_UpdateAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UpdateAdminActionPerformed
        // TODO add your handling code here:
         update_userAdmin adm =new  update_userAdmin();
        adm.show(); // display prg
        dispose();
    }//GEN-LAST:event_btn_UpdateAdminActionPerformed

    private void btn_ViewUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ViewUsersActionPerformed
        // TODO add your handling code here:
          view_users  adm =new view_users();
        adm.show(); // display prg
        dispose();
    }//GEN-LAST:event_btn_ViewUsersActionPerformed

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btn_exitActionPerformed

    private void btn_projectsAdmineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_projectsAdmineActionPerformed
        // TODO add your handling code here:
         Admin_projects  adm =new Admin_projects();
        adm.show(); // display prg
        dispose();
    }//GEN-LAST:event_btn_projectsAdmineActionPerformed

    private void btn_AddusersAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddusersAdminActionPerformed
        // TODO add your handling code here:
          Add_userAdmin adm =new  Add_userAdmin();
        adm.show(); // display prg
        dispose(); 
        
    }//GEN-LAST:event_btn_AddusersAdminActionPerformed

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
            java.util.logging.Logger.getLogger(Admin1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_AddusersAdmin;
    private javax.swing.JButton btn_UpdateAdmin;
    private javax.swing.JButton btn_ViewUsers;
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_projectsAdmine;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label_admin1;
    // End of variables declaration//GEN-END:variables
}
