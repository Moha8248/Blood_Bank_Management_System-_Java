import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class home extends javax.swing.JFrame {

    /**
     * Creates new form home
     */
    public home() {
        initComponents();
        Image icon;
        icon = new ImageIcon(this.getClass().getResource("/images.PNG")).getImage();
        this.setIconImage(icon);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        addnew = new javax.swing.JMenuItem();
        updatedetail = new javax.swing.JMenuItem();
        alldonordetail = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        searchlocation = new javax.swing.JMenuItem();
        searchbloodgroup = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        stockincrease = new javax.swing.JMenuItem();
        stockdecrease = new javax.swing.JMenuItem();
        stockdetail = new javax.swing.JMenuItem();
        deletedonor = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        logout = new javax.swing.JMenuItem();
        exitapplication = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, -50, 1370, -1));

        jMenu1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Donor.png"))); // NOI18N
        jMenu1.setText("Donor");

        addnew.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        addnew.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        addnew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Add new.png"))); // NOI18N
        addnew.setText("Add New");
        addnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addnewActionPerformed(evt);
            }
        });
        jMenu1.add(addnew);

        updatedetail.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        updatedetail.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        updatedetail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Update details.png"))); // NOI18N
        updatedetail.setText("Update Details");
        updatedetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatedetailActionPerformed(evt);
            }
        });
        jMenu1.add(updatedetail);

        alldonordetail.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        alldonordetail.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        alldonordetail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Details.png"))); // NOI18N
        alldonordetail.setText("All Donor Details");
        alldonordetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alldonordetailActionPerformed(evt);
            }
        });
        jMenu1.add(alldonordetail);

        jMenuBar1.add(jMenu1);

        jMenu2.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/search user.png"))); // NOI18N
        jMenu2.setText("Search Donor");

        searchlocation.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_MASK));
        searchlocation.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        searchlocation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Location.png"))); // NOI18N
        searchlocation.setText("Location");
        searchlocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchlocationActionPerformed(evt);
            }
        });
        jMenu2.add(searchlocation);

        searchbloodgroup.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.ALT_MASK));
        searchbloodgroup.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        searchbloodgroup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Blood group.png"))); // NOI18N
        searchbloodgroup.setText("Blood Group");
        searchbloodgroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbloodgroupActionPerformed(evt);
            }
        });
        jMenu2.add(searchbloodgroup);

        jMenuBar1.add(jMenu2);

        jMenu3.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stock.png"))); // NOI18N
        jMenu3.setText("Stock");

        stockincrease.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.SHIFT_MASK));
        stockincrease.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        stockincrease.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Inc.png"))); // NOI18N
        stockincrease.setText("Increase");
        stockincrease.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockincreaseActionPerformed(evt);
            }
        });
        jMenu3.add(stockincrease);

        stockdecrease.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.SHIFT_MASK));
        stockdecrease.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        stockdecrease.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dec.png"))); // NOI18N
        stockdecrease.setText("Decrease");
        stockdecrease.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockdecreaseActionPerformed(evt);
            }
        });
        jMenu3.add(stockdecrease);

        stockdetail.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.SHIFT_MASK));
        stockdetail.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        stockdetail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Details.png"))); // NOI18N
        stockdetail.setText("Details");
        stockdetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockdetailActionPerformed(evt);
            }
        });
        jMenu3.add(stockdetail);

        jMenuBar1.add(jMenu3);

        deletedonor.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        deletedonor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delete donor.png"))); // NOI18N
        deletedonor.setText("Delete Donor");

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem9.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delete.png"))); // NOI18N
        jMenuItem9.setText("Delete Donor");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        deletedonor.add(jMenuItem9);

        jMenuBar1.add(deletedonor);

        jMenu5.setBorder(null);
        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exit.png"))); // NOI18N
        jMenu5.setText("Exit");

        logout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        logout.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logout.png"))); // NOI18N
        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jMenu5.add(logout);

        exitapplication.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        exitapplication.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        exitapplication.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Exit application.png"))); // NOI18N
        exitapplication.setText("Exit Application");
        exitapplication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitapplicationActionPerformed(evt);
            }
        });
        jMenu5.add(exitapplication);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addnewActionPerformed
        // TODO add your handling code here:
        new home().setVisible(false);
        new addNewDonors().setVisible(true);
    }//GEN-LAST:event_addnewActionPerformed

    private void searchbloodgroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbloodgroupActionPerformed
        // TODO add your handling code here:
        new home().setVisible(false);
        new searchDonorBloodGroup().setVisible(true);
    }//GEN-LAST:event_searchbloodgroupActionPerformed

    private void stockincreaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockincreaseActionPerformed
        // TODO add your handling code here:
        new home().setVisible(false);
        new stockIncrease().setVisible(true);
    }//GEN-LAST:event_stockincreaseActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
        new home().setVisible(false);
        new deleteDonor().setVisible(true);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void exitapplicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitapplicationActionPerformed
        // TODO add your handling code here:
         int a=JOptionPane.showConfirmDialog(null,"DO YOU REALLY WANT TO CLOSE APPLICATION","SELECT",JOptionPane.YES_NO_OPTION);
        if(a==0)
        {
           System.exit(0);
        }
        
    }//GEN-LAST:event_exitapplicationActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        int a=JOptionPane.showConfirmDialog(null,"DO YOU REALLY WANT TO LOGOUT","SELECT",JOptionPane.YES_NO_OPTION);
        if(a==0)
        {
            setVisible(false);
            new login().setVisible(true);
        }
    }//GEN-LAST:event_logoutActionPerformed

    private void updatedetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatedetailActionPerformed
        // TODO add your handling code here:
        new home().setVisible(false);
        new updateDetailsDonor().setVisible(true);
    }//GEN-LAST:event_updatedetailActionPerformed

    private void alldonordetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alldonordetailActionPerformed
        // TODO add your handling code here:
        new home().setVisible(false);
        new allDonorDetails().setVisible(true);
    }//GEN-LAST:event_alldonordetailActionPerformed

    private void searchlocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchlocationActionPerformed
        // TODO add your handling code here:
        new home().setVisible(false);
        new searchDonorLocation().setVisible(true);
    }//GEN-LAST:event_searchlocationActionPerformed

    private void stockdecreaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockdecreaseActionPerformed
        // TODO add your handling code here:
        new home().setVisible(false);
        new stockDecrease().setVisible(true);
    }//GEN-LAST:event_stockdecreaseActionPerformed

    private void stockdetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockdetailActionPerformed
        // TODO add your handling code here:
        new home().setVisible(false);
        new stockDetails().setVisible(true);
    }//GEN-LAST:event_stockdetailActionPerformed

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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem addnew;
    private javax.swing.JMenuItem alldonordetail;
    private javax.swing.JMenu deletedonor;
    private javax.swing.JMenuItem exitapplication;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuItem logout;
    private javax.swing.JMenuItem searchbloodgroup;
    private javax.swing.JMenuItem searchlocation;
    private javax.swing.JMenuItem stockdecrease;
    private javax.swing.JMenuItem stockdetail;
    private javax.swing.JMenuItem stockincrease;
    private javax.swing.JMenuItem updatedetail;
    // End of variables declaration//GEN-END:variables
}
