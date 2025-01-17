import Project.ConnectionProvider;
import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
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
public class addNewDonors extends javax.swing.JFrame {

    /**
     * Creates new form addNewDonors
     */
    public addNewDonors() {
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
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        newid = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        fullname = new javax.swing.JTextField();
        fname = new javax.swing.JTextField();
        mname = new javax.swing.JTextField();
        mobileno = new javax.swing.JTextField();
        dob = new com.toedter.calendar.JDateChooser();
        Gender = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();
        BG = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        Address = new javax.swing.JTextArea();
        City = new javax.swing.JTextField();
        save = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        close = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(340, 130));
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel1.setText("ADD NEW DONOR");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 11, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 59, 700, 10));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 416, 700, 10));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel2.setText("New Donor ID:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 87, -1, -1));

        newid.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        newid.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(newid, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 40, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel4.setText("Full Name :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 125, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel5.setText("Father Name:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 175, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel6.setText("Mother Name:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 223, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel7.setText("Date of Birth :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 274, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel8.setText("Mobile No :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 311, -1, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel9.setText("Gender :");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 369, -1, -1));

        fullname.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        getContentPane().add(fullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 122, 162, -1));

        fname.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        getContentPane().add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 172, 162, -1));

        mname.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        getContentPane().add(mname, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 162, -1));

        mobileno.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        getContentPane().add(mobileno, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 308, 162, -1));
        getContentPane().add(dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 274, 162, -1));

        Gender.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        Gender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female", "Others" }));
        getContentPane().add(Gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 366, 162, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel10.setText("Email :");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(361, 125, -1, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel11.setText("Blood Group :");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(361, 175, -1, -1));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel12.setText("City :");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(361, 223, -1, -1));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel13.setText("Complete Address :");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(361, 274, -1, -1));

        Email.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        getContentPane().add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, 190, -1));

        BG.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        BG.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-", " " }));
        getContentPane().add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 172, 190, -1));

        Address.setColumns(20);
        Address.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        Address.setRows(5);
        jScrollPane1.setViewportView(Address);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 274, 200, -1));

        City.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        getContentPane().add(City, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, 190, -1));

        save.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/save.png"))); // NOI18N
        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        getContentPane().add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 437, -1, -1));

        reset.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Update details.png"))); // NOI18N
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        getContentPane().add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(354, 437, -1, -1));

        close.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Exit application.png"))); // NOI18N
        close.setText("Close");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        getContentPane().add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(566, 437, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/all page background image.png"))); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_closeActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new addNewDonors().setVisible(true);
        
    }//GEN-LAST:event_resetActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
        String donorId=newid.getText();
        String name=fullname.getText();
        String fatherName=fname.getText(); 
        String motherName=mname.getText();
        SimpleDateFormat dFormat=new SimpleDateFormat("dd-MM-yyyy");
        String DOB=dFormat.format(dob.getDate());
        String MobileNo=mobileno.getText();
        String gender=(String)Gender.getSelectedItem();
        String email=Email.getText();
        String bloodgroup=(String)BG.getSelectedItem();
        String city=City.getText();
        String address=Address.getText();
        
         try
        {
            Connection con=ConnectionProvider.getCon();
            Statement st=con.createStatement();
            st.executeUpdate("insert into donor values('"+donorId+"','"+name+"','"+fatherName+"','"+motherName+"','"+DOB+"','"+MobileNo+"','"+gender+"','"+email+"','"+bloodgroup+"','"+city+"','"+address+"')");
            JOptionPane.showMessageDialog(null,"SUCCESSFULLY ADDED");
            setVisible(false);
            new addNewDonors().setVisible(true);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_saveActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        try {
             Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/bbms","root","");
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery("SELECT MAX(donorId) FROM donor");
            rs.next();
            rs.getString("MAX(donorId)");
            if (rs.getString("MAX(donorId)") == null) {
                newid.setText("1");     
            } else {
                int id=rs.getInt("MAX(donorId)");
                id=id+1;
                String str=String.valueOf(id);
                newid.setText(String.format(str));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }      

    }//GEN-LAST:event_formComponentShown

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
            java.util.logging.Logger.getLogger(addNewDonors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addNewDonors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addNewDonors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addNewDonors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addNewDonors().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Address;
    private javax.swing.JComboBox BG;
    private javax.swing.JTextField City;
    private javax.swing.JTextField Email;
    private javax.swing.JComboBox Gender;
    private javax.swing.JButton close;
    private com.toedter.calendar.JDateChooser dob;
    private javax.swing.JTextField fname;
    private javax.swing.JTextField fullname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField mname;
    private javax.swing.JTextField mobileno;
    private javax.swing.JLabel newid;
    private javax.swing.JButton reset;
    private javax.swing.JButton save;
    // End of variables declaration//GEN-END:variables
}
