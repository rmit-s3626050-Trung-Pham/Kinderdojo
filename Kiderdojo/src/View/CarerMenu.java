/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.DatabaseConnection;

/**
 *
 * @author Thuy
 */
public class CarerMenu extends javax.swing.JFrame {

    /**
     * Creates new form ParentMenu
     */
    
    DatabaseConnection dbConn;
    public String username;
    Model.Carer carer;
    
    public CarerMenu() {
        initComponents();
        setLocation(300, 200);
        carer = new Model.Carer();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PnMainMenu = new javax.swing.JPanel();
        LbLogo = new javax.swing.JLabel();
        BtMyClass = new javax.swing.JToggleButton();
        BtMyAccount = new javax.swing.JToggleButton();
        BtSchoolInFor = new javax.swing.JToggleButton();
        LbBackground = new javax.swing.JLabel();
        PnMyChild = new javax.swing.JPanel();
        LbChildID = new javax.swing.JLabel();
        LbChildID1 = new javax.swing.JLabel();
        LbChildName = new javax.swing.JLabel();
        LbChildName1 = new javax.swing.JLabel();
        LbChildStatus = new javax.swing.JLabel();
        LbBirthday1 = new javax.swing.JLabel();
        LbChildAvatar = new javax.swing.JLabel();
        LbBirthday = new javax.swing.JLabel();
        LbChildStatus1 = new javax.swing.JLabel();
        LbContactCarer = new javax.swing.JLabel();
        LbUpdateChildDetail = new javax.swing.JLabel();
        LbAlbum = new javax.swing.JLabel();
        LbViewAlbum = new javax.swing.JLabel();
        LbCloud = new javax.swing.JLabel();
        LbContactCarerPhone = new javax.swing.JLabel();
        LbMyChildBackground = new javax.swing.JLabel();
        PnMyAccount = new javax.swing.JPanel();
        LbParentAvatar = new javax.swing.JLabel();
        LbParentChangeAvatar = new javax.swing.JLabel();
        LbParentID = new javax.swing.JLabel();
        LbCarerIDExample = new javax.swing.JLabel();
        LbParentPassword = new javax.swing.JLabel();
        LbPasswordExample = new javax.swing.JLabel();
        LbParentName = new javax.swing.JLabel();
        LbCarerNameExample = new javax.swing.JLabel();
        LbParentDOB = new javax.swing.JLabel();
        LbCarerDOBExample = new javax.swing.JLabel();
        LbParentAddress = new javax.swing.JLabel();
        LbCarerAddressExample = new javax.swing.JLabel();
        LbParentEmailAddress = new javax.swing.JLabel();
        LbCarerEmailExample1 = new javax.swing.JLabel();
        LbParentPhoneNumber = new javax.swing.JLabel();
        LbCarerPhoneNumberExample = new javax.swing.JLabel();
        LbParentUpdatepersonalinformation = new javax.swing.JLabel();
        btMyAccountBack = new javax.swing.JButton();
        Lbbackground = new javax.swing.JLabel();
        PnSchoolInformation = new javax.swing.JPanel();
        LbSchoolInforBackground = new javax.swing.JLabel();
        MyClass = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PnMainMenu.setLayout(null);

        LbLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kinderdojodemo/image/Logo.PNG"))); // NOI18N
        PnMainMenu.add(LbLogo);
        LbLogo.setBounds(560, 10, 110, 100);

        BtMyClass.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        BtMyClass.setForeground(new java.awt.Color(153, 0, 153));
        BtMyClass.setText("My Class");
        BtMyClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtMyClassActionPerformed(evt);
            }
        });
        PnMainMenu.add(BtMyClass);
        BtMyClass.setBounds(20, 70, 300, 70);

        BtMyAccount.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        BtMyAccount.setForeground(new java.awt.Color(153, 0, 153));
        BtMyAccount.setText("My Account");
        BtMyAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtMyAccountActionPerformed(evt);
            }
        });
        PnMainMenu.add(BtMyAccount);
        BtMyAccount.setBounds(130, 180, 350, 70);

        BtSchoolInFor.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        BtSchoolInFor.setForeground(new java.awt.Color(153, 0, 153));
        BtSchoolInFor.setText("School Information");
        BtSchoolInFor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtSchoolInForActionPerformed(evt);
            }
        });
        PnMainMenu.add(BtSchoolInFor);
        BtSchoolInFor.setBounds(230, 290, 400, 70);

        LbBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kinderdojodemo/image/background.jpg"))); // NOI18N
        PnMainMenu.add(LbBackground);
        LbBackground.setBounds(1, 0, 680, 510);

        PnMyChild.setLayout(null);

        LbChildID.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LbChildID.setForeground(new java.awt.Color(153, 0, 153));
        LbChildID.setText("ChildID: ");
        PnMyChild.add(LbChildID);
        LbChildID.setBounds(180, 10, 120, 70);

        LbChildID1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LbChildID1.setText("C0001");
        PnMyChild.add(LbChildID1);
        LbChildID1.setBounds(310, 10, 120, 70);

        LbChildName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LbChildName.setForeground(new java.awt.Color(153, 0, 153));
        LbChildName.setText("Child Name:");
        PnMyChild.add(LbChildName);
        LbChildName.setBounds(180, 80, 120, 50);

        LbChildName1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LbChildName1.setText("Cersie Lannister");
        PnMyChild.add(LbChildName1);
        LbChildName1.setBounds(310, 70, 190, 70);

        LbChildStatus.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LbChildStatus.setForeground(new java.awt.Color(153, 0, 153));
        LbChildStatus.setText("ChildStatus");
        PnMyChild.add(LbChildStatus);
        LbChildStatus.setBounds(120, 260, 120, 70);

        LbBirthday1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LbBirthday1.setText("12 December 2014");
        PnMyChild.add(LbBirthday1);
        LbBirthday1.setBounds(310, 130, 190, 70);

        LbChildAvatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kinderdojodemo/image/ChildAvatar.jpg"))); // NOI18N
        PnMyChild.add(LbChildAvatar);
        LbChildAvatar.setBounds(10, 40, 160, 180);

        LbBirthday.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LbBirthday.setForeground(new java.awt.Color(153, 0, 153));
        LbBirthday.setText("Birthday");
        PnMyChild.add(LbBirthday);
        LbBirthday.setBounds(180, 130, 120, 70);

        LbChildStatus1.setText("Cersie is in a very good mood today! ");
        PnMyChild.add(LbChildStatus1);
        LbChildStatus1.setBounds(50, 290, 330, 90);

        LbContactCarer.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LbContactCarer.setForeground(new java.awt.Color(255, 255, 255));
        LbContactCarer.setText("Contact Carer");
        PnMyChild.add(LbContactCarer);
        LbContactCarer.setBounds(550, 280, 140, 70);

        LbUpdateChildDetail.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        LbUpdateChildDetail.setForeground(new java.awt.Color(51, 102, 255));
        LbUpdateChildDetail.setText("Update my child details");
        PnMyChild.add(LbUpdateChildDetail);
        LbUpdateChildDetail.setBounds(180, 200, 220, 20);

        LbAlbum.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kinderdojodemo/image/photo_album_icon.jpg"))); // NOI18N
        PnMyChild.add(LbAlbum);
        LbAlbum.setBounds(500, 60, 260, 210);

        LbViewAlbum.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LbViewAlbum.setForeground(new java.awt.Color(153, 0, 153));
        LbViewAlbum.setText("Your Child Album");
        PnMyChild.add(LbViewAlbum);
        LbViewAlbum.setBounds(520, 0, 200, 70);

        LbCloud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kinderdojodemo/image/Cloud.png"))); // NOI18N
        PnMyChild.add(LbCloud);
        LbCloud.setBounds(30, 210, 370, 280);

        LbContactCarerPhone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kinderdojodemo/image/PhoneIcon.png"))); // NOI18N
        PnMyChild.add(LbContactCarerPhone);
        LbContactCarerPhone.setBounds(500, 300, 180, 210);

        LbMyChildBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kinderdojodemo/image/myChildbackground.jpg"))); // NOI18N
        PnMyChild.add(LbMyChildBackground);
        LbMyChildBackground.setBounds(1, 0, 680, 510);

        PnMainMenu.add(PnMyChild);
        PnMyChild.setBounds(0, 0, 680, 510);

        PnMyAccount.setLayout(null);

        LbParentAvatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kinderdojodemo/image/Parent Avatar.png"))); // NOI18N
        PnMyAccount.add(LbParentAvatar);
        LbParentAvatar.setBounds(20, 20, 210, 230);

        LbParentChangeAvatar.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        LbParentChangeAvatar.setForeground(new java.awt.Color(51, 102, 255));
        LbParentChangeAvatar.setText("Change Avatar");
        PnMyAccount.add(LbParentChangeAvatar);
        LbParentChangeAvatar.setBounds(30, 250, 110, 20);

        LbParentID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LbParentID.setText("CarerID:");
        PnMyAccount.add(LbParentID);
        LbParentID.setBounds(200, 40, 80, 20);

        LbCarerIDExample.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LbCarerIDExample.setForeground(new java.awt.Color(102, 102, 102));
        LbCarerIDExample.setText("P0001");
        PnMyAccount.add(LbCarerIDExample);
        LbCarerIDExample.setBounds(320, 40, 51, 20);

        LbParentPassword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LbParentPassword.setText("Password:");
        PnMyAccount.add(LbParentPassword);
        LbParentPassword.setBounds(200, 90, 90, 20);

        LbPasswordExample.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LbPasswordExample.setForeground(new java.awt.Color(102, 102, 102));
        LbPasswordExample.setText("********");
        PnMyAccount.add(LbPasswordExample);
        LbPasswordExample.setBounds(320, 90, 120, 20);

        LbParentName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LbParentName.setText("Name:");
        PnMyAccount.add(LbParentName);
        LbParentName.setBounds(200, 140, 60, 20);

        LbCarerNameExample.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LbCarerNameExample.setForeground(new java.awt.Color(102, 102, 102));
        LbCarerNameExample.setText("Jaime Lannister");
        PnMyAccount.add(LbCarerNameExample);
        LbCarerNameExample.setBounds(320, 140, 180, 20);

        LbParentDOB.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LbParentDOB.setText("Date Of Birth:");
        PnMyAccount.add(LbParentDOB);
        LbParentDOB.setBounds(200, 190, 150, 20);

        LbCarerDOBExample.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LbCarerDOBExample.setForeground(new java.awt.Color(102, 102, 102));
        LbCarerDOBExample.setText("7 July 1987");
        PnMyAccount.add(LbCarerDOBExample);
        LbCarerDOBExample.setBounds(320, 190, 180, 20);

        LbParentAddress.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LbParentAddress.setText("Address:");
        PnMyAccount.add(LbParentAddress);
        LbParentAddress.setBounds(200, 230, 150, 20);

        LbCarerAddressExample.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LbCarerAddressExample.setForeground(new java.awt.Color(102, 102, 102));
        LbCarerAddressExample.setText("01 Castle Road, Kingslanding");
        PnMyAccount.add(LbCarerAddressExample);
        LbCarerAddressExample.setBounds(320, 230, 310, 20);

        LbParentEmailAddress.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LbParentEmailAddress.setText("Email Address:");
        PnMyAccount.add(LbParentEmailAddress);
        LbParentEmailAddress.setBounds(200, 280, 150, 20);

        LbCarerEmailExample1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LbCarerEmailExample1.setForeground(new java.awt.Color(102, 102, 102));
        LbCarerEmailExample1.setText("JaimeLannister@gmail.com");
        PnMyAccount.add(LbCarerEmailExample1);
        LbCarerEmailExample1.setBounds(320, 270, 310, 40);

        LbParentPhoneNumber.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LbParentPhoneNumber.setText("Phone Number:");
        PnMyAccount.add(LbParentPhoneNumber);
        LbParentPhoneNumber.setBounds(200, 330, 150, 20);

        LbCarerPhoneNumberExample.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LbCarerPhoneNumberExample.setForeground(new java.awt.Color(102, 102, 102));
        LbCarerPhoneNumberExample.setText("+6123456789");
        PnMyAccount.add(LbCarerPhoneNumberExample);
        LbCarerPhoneNumberExample.setBounds(320, 320, 310, 40);

        LbParentUpdatepersonalinformation.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        LbParentUpdatepersonalinformation.setForeground(new java.awt.Color(51, 102, 255));
        LbParentUpdatepersonalinformation.setText("Update my personal information");
        PnMyAccount.add(LbParentUpdatepersonalinformation);
        LbParentUpdatepersonalinformation.setBounds(200, 390, 300, 20);

        btMyAccountBack.setText("Back");
        btMyAccountBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMyAccountBackActionPerformed(evt);
            }
        });
        PnMyAccount.add(btMyAccountBack);
        btMyAccountBack.setBounds(30, 440, 65, 27);

        Lbbackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kinderdojodemo/image/MyAccountBackground.jpg"))); // NOI18N
        PnMyAccount.add(Lbbackground);
        Lbbackground.setBounds(1, 0, 680, 510);

        PnMainMenu.add(PnMyAccount);
        PnMyAccount.setBounds(0, 0, 680, 510);

        PnSchoolInformation.setLayout(null);

        LbSchoolInforBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kinderdojodemo/image/schoolchildren.jpg"))); // NOI18N
        PnSchoolInformation.add(LbSchoolInforBackground);
        LbSchoolInforBackground.setBounds(0, 20, 680, 450);

        PnMainMenu.add(PnSchoolInformation);
        PnSchoolInformation.setBounds(-2, -5, 680, 520);

        javax.swing.GroupLayout MyClassLayout = new javax.swing.GroupLayout(MyClass);
        MyClass.setLayout(MyClassLayout);
        MyClassLayout.setHorizontalGroup(
            MyClassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        MyClassLayout.setVerticalGroup(
            MyClassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        PnMainMenu.add(MyClass);
        MyClass.setBounds(0, 0, 100, 100);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(PnMainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(PnMainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtMyClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtMyClassActionPerformed
        // Add My Child Panel
        PnMainMenu.removeAll();
        PnMainMenu.add(PnMyChild);
        PnMainMenu.revalidate();
        PnMainMenu.repaint();
       
       
   
        
    }//GEN-LAST:event_BtMyClassActionPerformed

    private void BtMyAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtMyAccountActionPerformed
        // Add My Account Panel
        System.out.println(username);
        carer.loadCarerDB(dbConn ,username);
        
        LbCarerIDExample.setText(username);
        LbCarerNameExample.setText(carer.name);
        LbCarerDOBExample.setText(carer.DOB);
        LbCarerAddressExample.setText(carer.address);
        LbCarerEmailExample1.setText(carer.email);
        LbCarerPhoneNumberExample.setText(carer.phoneNum);
        
        PnMainMenu.removeAll();
        PnMainMenu.add(PnMyAccount);
        PnMainMenu.revalidate();
        PnMainMenu.repaint();
     
        
       
        
    }//GEN-LAST:event_BtMyAccountActionPerformed

    private void BtSchoolInForActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtSchoolInForActionPerformed
        // Add School Information Panel
        PnMainMenu.removeAll();
        PnMainMenu.add(PnSchoolInformation);
        PnMainMenu.revalidate();
        PnMainMenu.repaint();
      
        
        
    }//GEN-LAST:event_BtSchoolInForActionPerformed

    private void btMyAccountBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMyAccountBackActionPerformed
        // TODO add your handling code here:
        PnMainMenu.removeAll();
        PnMainMenu.add(BtMyClass);
        PnMainMenu.add(BtMyAccount);
        PnMainMenu.add(BtSchoolInFor);
        PnMainMenu.add(LbLogo);
        PnMainMenu.add(LbBackground);
        
        PnMainMenu.revalidate();
        PnMainMenu.repaint();
    }//GEN-LAST:event_btMyAccountBackActionPerformed

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
            java.util.logging.Logger.getLogger(CarerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CarerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CarerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CarerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CarerMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton BtMyAccount;
    private javax.swing.JToggleButton BtMyClass;
    private javax.swing.JToggleButton BtSchoolInFor;
    private javax.swing.JLabel LbAlbum;
    private javax.swing.JLabel LbBackground;
    private javax.swing.JLabel LbBirthday;
    private javax.swing.JLabel LbBirthday1;
    private javax.swing.JLabel LbCarerAddressExample;
    private javax.swing.JLabel LbCarerDOBExample;
    private javax.swing.JLabel LbCarerEmailExample1;
    private javax.swing.JLabel LbCarerIDExample;
    private javax.swing.JLabel LbCarerNameExample;
    private javax.swing.JLabel LbCarerPhoneNumberExample;
    private javax.swing.JLabel LbChildAvatar;
    private javax.swing.JLabel LbChildID;
    private javax.swing.JLabel LbChildID1;
    private javax.swing.JLabel LbChildName;
    private javax.swing.JLabel LbChildName1;
    private javax.swing.JLabel LbChildStatus;
    private javax.swing.JLabel LbChildStatus1;
    private javax.swing.JLabel LbCloud;
    private javax.swing.JLabel LbContactCarer;
    private javax.swing.JLabel LbContactCarerPhone;
    private javax.swing.JLabel LbLogo;
    private javax.swing.JLabel LbMyChildBackground;
    private javax.swing.JLabel LbParentAddress;
    private javax.swing.JLabel LbParentAvatar;
    private javax.swing.JLabel LbParentChangeAvatar;
    private javax.swing.JLabel LbParentDOB;
    private javax.swing.JLabel LbParentEmailAddress;
    private javax.swing.JLabel LbParentID;
    private javax.swing.JLabel LbParentName;
    private javax.swing.JLabel LbParentPassword;
    private javax.swing.JLabel LbParentPhoneNumber;
    private javax.swing.JLabel LbParentUpdatepersonalinformation;
    private javax.swing.JLabel LbPasswordExample;
    private javax.swing.JLabel LbSchoolInforBackground;
    private javax.swing.JLabel LbUpdateChildDetail;
    private javax.swing.JLabel LbViewAlbum;
    private javax.swing.JLabel Lbbackground;
    private javax.swing.JPanel MyClass;
    private javax.swing.JPanel PnMainMenu;
    private javax.swing.JPanel PnMyAccount;
    private javax.swing.JPanel PnMyChild;
    private javax.swing.JPanel PnSchoolInformation;
    private javax.swing.JButton btMyAccountBack;
    // End of variables declaration//GEN-END:variables
}
