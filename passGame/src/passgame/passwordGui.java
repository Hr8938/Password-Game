/*
*  Alvaro Ursua
* 'O Brien
* CS 236  
* 2/3/2019
* 
* This is the GUI. 
* Use this to run the program. Everything works. Score keeping, genrating passwords
* saving passwords to files and launching a new window. USE GUI TO RUN
* Console displays important updates.
*
* Complied using NetBeans v9
*/

package passgame;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class passwordGui extends javax.swing.JFrame {
    //sets up the passgaema dn hasher objects 
    PassGame ui = new PassGame();
    hasher scrable = new hasher();
    String userText;
    
    public passwordGui() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        gameLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        userInput = new javax.swing.JTextField();
        enterUI = new javax.swing.JButton();
        userScore = new javax.swing.JLabel();
        hackerScore = new javax.swing.JLabel();
        executeHash = new javax.swing.JButton();
        passwordStrength = new javax.swing.JLabel();
        displayHashed = new javax.swing.JTextField();
        copyPaste = new javax.swing.JButton();
        writeDown = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        passwordManager = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Password Game 1000");
        setPreferredSize(new java.awt.Dimension(600, 458));

        jPanel2.setBackground(new java.awt.Color(89, 89, 89));
        jPanel2.setForeground(new java.awt.Color(78, 78, 78));

        gameLabel.setFont(new java.awt.Font("Shree Devanagari 714", 0, 24)); // NOI18N
        gameLabel.setForeground(new java.awt.Color(204, 204, 204));
        gameLabel.setText("Beat The Hacker!");

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        userInput.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        userInput.setText("Enter a Strong Password...");
        userInput.setToolTipText("");
        userInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userInputActionPerformed(evt);
            }
        });

        enterUI.setBackground(new java.awt.Color(145, 85, 85));
        enterUI.setText("Test Your Security!");
        enterUI.setName("testSecurity"); // NOI18N
        enterUI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterUIActionPerformed(evt);
            }
        });

        userScore.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 18)); // NOI18N
        userScore.setForeground(new java.awt.Color(113, 159, 108));
        userScore.setText("Your Score:   ");

        hackerScore.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 18)); // NOI18N
        hackerScore.setForeground(new java.awt.Color(166, 74, 74));
        hackerScore.setText("Hacker Score:   ");
        hackerScore.setToolTipText("");

        executeHash.setText("Generate a Stronger Password");
        executeHash.setName("hashThis"); // NOI18N
        executeHash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                executeHashActionPerformed(evt);
            }
        });

        passwordStrength.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        passwordStrength.setForeground(new java.awt.Color(0, 204, 204));
        passwordStrength.setText("Your Password is");

        displayHashed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayHashedActionPerformed(evt);
            }
        });

        copyPaste.setText("Copy/Paste");
        copyPaste.setToolTipText("");
        copyPaste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyPasteActionPerformed(evt);
            }
        });

        writeDown.setText("Write It Down");
        writeDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                writeDownActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("What should you do with your new Password?");

        passwordManager.setText("Password Manager");
        passwordManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordManagerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(userScore)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(passwordStrength, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(hackerScore, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(executeHash)
                            .addComponent(userInput, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(enterUI))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(displayHashed, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(copyPaste)
                                .addGap(40, 40, 40)
                                .addComponent(writeDown))
                            .addComponent(jLabel1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(passwordManager)))
                .addContainerGap(193, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userScore)
                    .addComponent(hackerScore)
                    .addComponent(passwordStrength))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userInput, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(enterUI)
                .addGap(18, 18, 18)
                .addComponent(executeHash)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(displayHashed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(copyPaste)
                    .addComponent(writeDown))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordManager)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(199, 199, 199)
                .addComponent(gameLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(gameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userInputActionPerformed
        System.out.println("userInput ran");
    }//GEN-LAST:event_userInputActionPerformed

    private void enterUIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterUIActionPerformed
        
        //passes the user input into the method get text and updates UI points
        if(ui.counter < 14){
        userText= userInput.getText();
        
        ui.validate(userText);
        System.out.println(ui.toString());
        
        userScore.setText("Your Score: " + ui.user.getScore());
        hackerScore.setText("Hacker Score: " + ui.comp.getScore());
        
        passwordStrength.setText("Your Password is "+ ui.getStrength());
        
        }else{
            try {
                System.out.println("MAXIMUM REACHED!");
                ui.printPhrases();
            } catch (IOException ex) {
                Logger.getLogger(passwordGui.class.getName()).log(Level.SEVERE, null, ex);
            }
           }
    }//GEN-LAST:event_enterUIActionPerformed

    private void executeHashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_executeHashActionPerformed
        //Runs the hash method whenever the generate stronger password button is clicked
        
        userText = userInput.getText();
        scrable.setSeed(userText);
        scrable.runHash();
        
        displayHashed.setText(scrable.getHash());
        
    }//GEN-LAST:event_executeHashActionPerformed

    private void displayHashedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayHashedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_displayHashedActionPerformed

    private void copyPasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyPasteActionPerformed
       //if they copy paste, user gets point
        ui.user.setPoint(true);
        userScore.setText("Your Score: " + ui.user.getScore());
        hackerScore.setText("Hacker Score: " + ui.comp.getScore());
    }//GEN-LAST:event_copyPasteActionPerformed

    private void passwordManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordManagerActionPerformed
        //launches the new window when passwords are managed
        
        //prints all the passphrases to a file when the button is cliked
        try {
            ui.printPhrases();
        } catch (IOException ex) {
            Logger.getLogger(passwordGui.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        passwordLoader second = null;
        //starts a new pasword loader object
        try {
            second = new passwordLoader();
        } catch (IOException ex) {
            Logger.getLogger(passwordGui.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         second.show();
            
    }//GEN-LAST:event_passwordManagerActionPerformed

    private void writeDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_writeDownActionPerformed
        //if they write down, then the hacker gets a point
        ui.comp.setPoint(true);
         userScore.setText("Your Score: " + ui.user.getScore());
        hackerScore.setText("Hacker Score: " + ui.comp.getScore());
    }//GEN-LAST:event_writeDownActionPerformed

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
            java.util.logging.Logger.getLogger(passwordGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(passwordGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(passwordGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(passwordGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new passwordGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton copyPaste;
    private javax.swing.JTextField displayHashed;
    private javax.swing.JButton enterUI;
    private javax.swing.JButton executeHash;
    private javax.swing.JLabel gameLabel;
    private javax.swing.JLabel hackerScore;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton passwordManager;
    private javax.swing.JLabel passwordStrength;
    private javax.swing.JTextField userInput;
    private javax.swing.JLabel userScore;
    private javax.swing.JButton writeDown;
    // End of variables declaration//GEN-END:variables
}
