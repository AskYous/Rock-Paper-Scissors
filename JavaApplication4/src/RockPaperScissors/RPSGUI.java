package RockPaperScissors;

import java.util.Comparator;
import javax.swing.DefaultListModel;

/**
 *
 * @author
 */
public class RPSGUI extends javax.swing.JFrame {

    private static Information info = new Information();
    private static CPUThrower cpu = new CPUThrower();
    private static int difficulty;
    private static PlayerThrower user = new PlayerThrower();
    private static Comparator<Weapon> comparator = new WeaponComparator();
    private static DefaultListModel roundResults = new DefaultListModel();
    private static DefaultListModel userWeapons = new DefaultListModel();
    private static DefaultListModel cpuWeapons = new DefaultListModel();
    private static int rounds;

    /**
     * Creates new form RPSGUI
     */
    public RPSGUI() {
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

        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        difficultyLabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        difficultyList = new javax.swing.JList();
        throwsPerLabel = new javax.swing.JLabel();
        throwsPerTextField = new javax.swing.JTextField();
        figthButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        userThrowsList = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        cpuThrowsList = new javax.swing.JList();
        jPanel2 = new javax.swing.JPanel();
        rockButton = new javax.swing.JButton();
        paperButton = new javax.swing.JButton();
        scissorsButton = new javax.swing.JButton();
        weaponLabel = new javax.swing.JLabel();
        infoButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        resultsList = new javax.swing.JList();
        jPanel5 = new javax.swing.JPanel();
        predictionLabel = new javax.swing.JLabel();
        predictionTextField = new javax.swing.JTextField();
        extraTextField = new javax.swing.JTextField();
        userThrowsLabel = new javax.swing.JLabel();
        resultsLabel = new javax.swing.JLabel();
        cpuThrowsLabel = new javax.swing.JLabel();

        jLabel8.setText("Your Wins:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));

        difficultyLabel.setText("Set  Difficulty:");

        difficultyList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "1 Random CPU", "2 Smart CPU" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(difficultyList);

        throwsPerLabel.setText("Throws Per Match:");

        throwsPerTextField.setText("10");
        throwsPerTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                throwsPerTextFieldActionPerformed(evt);
            }
        });

        figthButton.setText("FIGHT!");
        figthButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                figthButtonActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jScrollPane3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, difficultyLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, throwsPerLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, throwsPerTextField, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, figthButton, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(throwsPerLabel)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(throwsPerTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(difficultyLabel)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 47, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(figthButton, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.LINE_START);

        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.setEnabled(false);

        userThrowsList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Your throws displayed here" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        userThrowsList.setEnabled(false);
        jScrollPane1.setViewportView(userThrowsList);

        cpuThrowsList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "CPU throws listed here" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        cpuThrowsList.setEnabled(false);
        jScrollPane2.setViewportView(cpuThrowsList);

        rockButton.setText("ROCK");
        rockButton.setEnabled(false);
        rockButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rockButtonActionPerformed(evt);
            }
        });

        paperButton.setText("PAPER");
        paperButton.setEnabled(false);
        paperButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paperButtonActionPerformed(evt);
            }
        });

        scissorsButton.setText("SCISSORS");
        scissorsButton.setEnabled(false);
        scissorsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scissorsButtonActionPerformed(evt);
            }
        });

        weaponLabel.setText("Choose Your Weapon:");
        weaponLabel.setEnabled(false);

        infoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/info3.png"))); // NOI18N
        infoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoButtonActionPerformed(evt);
            }
        });

        resetButton.setText("RESET");
        resetButton.setEnabled(false);
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(resetButton, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(infoButton, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(rockButton, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(paperButton, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(scissorsButton, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(weaponLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .add(32, 32, 32)
                .add(weaponLabel)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(rockButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 78, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(paperButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 76, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(scissorsButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 78, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(infoButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 39, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(resetButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 39, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );

        resultsList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Results displayed here" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        resultsList.setEnabled(false);
        jScrollPane4.setViewportView(resultsList);

        predictionLabel.setText("CPU thinks you will throw");
        predictionLabel.setEnabled(false);

        predictionTextField.setEnabled(false);
        predictionTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                predictionTextFieldActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel5Layout = new org.jdesktop.layout.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel5Layout.createSequentialGroup()
                .add(predictionLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(predictionTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 119, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(72, 72, 72))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel5Layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(predictionLabel)
                    .add(predictionTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
        );

        extraTextField.setText("Enter number of throws per match and difficulty to start");
        extraTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extraTextFieldActionPerformed(evt);
            }
        });

        userThrowsLabel.setText("Your Throws:");
        userThrowsLabel.setEnabled(false);

        resultsLabel.setText("Results:");
        resultsLabel.setEnabled(false);

        cpuThrowsLabel.setText("CPU Throws:");
        cpuThrowsLabel.setEnabled(false);

        org.jdesktop.layout.GroupLayout jPanel3Layout = new org.jdesktop.layout.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .add(20, 20, 20)
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel3Layout.createSequentialGroup()
                        .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel3Layout.createSequentialGroup()
                                .add(jPanel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .add(jPanel3Layout.createSequentialGroup()
                                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(userThrowsLabel))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jPanel3Layout.createSequentialGroup()
                                        .add(jScrollPane4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED))
                                    .add(jPanel3Layout.createSequentialGroup()
                                        .add(resultsLabel)
                                        .add(106, 106, 106)))
                                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(cpuThrowsLabel)
                                    .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 133, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .add(8, 8, 8)))
                        .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(extraTextField))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel3Layout.createSequentialGroup()
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel3Layout.createSequentialGroup()
                        .add(jPanel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(userThrowsLabel)
                            .add(resultsLabel)
                            .add(cpuThrowsLabel))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jScrollPane2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, jScrollPane1)
                            .add(jScrollPane4)))
                    .add(jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(extraTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void throwsPerTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_throwsPerTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_throwsPerTextFieldActionPerformed

    private void extraTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_extraTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_extraTextFieldActionPerformed

    private void predictionTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_predictionTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_predictionTextFieldActionPerformed

    private void infoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoButtonActionPerformed
        if (difficulty == 0) {
            extraTextField.setText("Enter number of throws per match and "
                    + "difficulty to start");
        } else {
            extraTextField.setText("Choose a weapon from the rigth list of "
                    + "choices or choose reset to restart the game");
        }
    }//GEN-LAST:event_infoButtonActionPerformed

    /**
     * sets the user's weapon
     * calls fight
     * @param evt rock button pressed
     */
    private void rockButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rockButtonActionPerformed
        user.setWeapon(Weapon.ROCK);
        fight();
    }//GEN-LAST:event_rockButtonActionPerformed

    /**
     * Sets the number of Rounds to the info class
     * Sets the difficulty level
     * Disables left part and enable right part
     * @param evt fight button pressed
     */
    private void figthButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_figthButtonActionPerformed
        //Set Rounds from textflield
        rounds = 0;
        try {
            rounds = Integer.parseInt(throwsPerTextField.getText());
        } catch (NumberFormatException e) {
            extraTextField.setText("Throws per match must be an integer > 0");
            return;
        }

        if (rounds > 0) {
            info.setRounds(rounds);
        } else {
            extraTextField.setText("Throws per match must be an integer > 0");
            return;
        }

        //Set difficulty from list
        difficulty = difficultyList.getSelectedIndex() + 1;
        if (difficulty < 1) {
            extraTextField.setText("You must choose a difficulty before you can fight");
            return;
        }
        disableLeftComponents();
        enableNonLeftComponents();
    }//GEN-LAST:event_figthButtonActionPerformed

    /**
     * sets the user's weapon
     * calls fight
     * @param evt paper button pressed
     */
    private void paperButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paperButtonActionPerformed
        user.setWeapon(Weapon.PAPER);
        fight();
    }//GEN-LAST:event_paperButtonActionPerformed

    /**
     * sets the user's weapon
     * calls fight
     * @param evt scissors button pressed
     */
    private void scissorsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scissorsButtonActionPerformed
        user.setWeapon(Weapon.SCISSORS);
        fight();
    }//GEN-LAST:event_scissorsButtonActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        predictionTextField.setText("");
        userWeapons.clear();
        cpuWeapons.clear();
        roundResults.clear();
        info.reset();
        extraTextField.setText("Reset!");
        enableNonLeftComponents();
    }//GEN-LAST:event_resetButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RPSGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RPSGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RPSGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RPSGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new RPSGUI().setVisible(true);
            }
        });



    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cpuThrowsLabel;
    private javax.swing.JList cpuThrowsList;
    private javax.swing.JLabel difficultyLabel;
    private javax.swing.JList difficultyList;
    private javax.swing.JTextField extraTextField;
    private javax.swing.JButton figthButton;
    private javax.swing.JButton infoButton;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton paperButton;
    private javax.swing.JLabel predictionLabel;
    private javax.swing.JTextField predictionTextField;
    private javax.swing.JButton resetButton;
    private javax.swing.JLabel resultsLabel;
    private javax.swing.JList resultsList;
    private javax.swing.JButton rockButton;
    private javax.swing.JButton scissorsButton;
    private javax.swing.JLabel throwsPerLabel;
    private javax.swing.JTextField throwsPerTextField;
    private javax.swing.JLabel userThrowsLabel;
    private javax.swing.JList userThrowsList;
    private javax.swing.JLabel weaponLabel;
    // End of variables declaration//GEN-END:variables

    private void disableLeftComponents() {
        jPanel1.setBorder(null);
        throwsPerLabel.setEnabled(false);
        throwsPerTextField.setEnabled(false);
        difficultyLabel.setEnabled(false);
        difficultyList.setEnabled(false);
        figthButton.setEnabled(false);
    }

    private void enableNonLeftComponents() {
        predictionTextField.setEnabled(true);
        predictionLabel.setEnabled(true);
        userThrowsList.setEnabled(true);
        resultsList.setEnabled(true);
        cpuThrowsList.setEnabled(true);
        weaponLabel.setEnabled(true);
        weaponLabel.setEnabled(true);
        rockButton.setEnabled(true);
        paperButton.setEnabled(true);
        scissorsButton.setEnabled(true);
        resetButton.setEnabled(true);
        userThrowsLabel.setEnabled(true);
        resultsLabel.setEnabled(true);
        cpuThrowsLabel.setEnabled(true);
    }

    /**
     * Generates cpu weapon based on difficulty
     * generates the result of the comparison
     * updates the cpuWeapons, userWeapons, results list in GUI
     * updates scores
     * updates match info
     * Updates scores in GUI
     * 
     */
    private void fight() {
        if (info.getRound() < 3) {
            cpu.generateWeapon(1, info.getRound());
        } else {
            cpu.generateWeapon(difficulty, info.getRound());
        }

        int result = comparator.compare(user.getWeapon(), cpu.getWeapon());
        if (!info.matchOver()) {
            resultsList.setModel(roundResults);
            switch (result) {
                //user wins
                case (1):
                    roundResults.addElement("Round " + info.getRound() + ":\t User Wins");
                    break;
                //tie
                case (0):
                    roundResults.addElement("Round " + info.getRound() + ":\t It's a tie!");
                    break;
                //user loss
                case (-1):
                    roundResults.addElement("Round " + info.getRound() + ":\t CPU Wins");
                    break;
            }

            info.updateScores(result);
            info.updateMatchInfo(user.getWeapon(), cpu.getWeapon());

            extraTextField.setText("Your Wins: " + info.scores.getWins() + "\t CPU Wins: "
                    + info.scores.getLosses() + "\t Ties: " + info.scores.getTies());

            cpu.appendWeapon(user.getWeapon());

            cpuWeapons.addElement(cpu.getWeapon().toFullString());
            userWeapons.addElement(user.getWeapon().toFullString());

            userThrowsList.setModel(userWeapons);
            cpuThrowsList.setModel(cpuWeapons);
            resultsList.setModel(roundResults);

            if (cpu.getPredictedWeapon() == null) {
                predictionTextField.setText("");
            } else {
                predictionTextField.setText(cpu.getPredictedWeapon().toFullString());
            }
        }
        if (info.getRound() - 1 == rounds) {
            info.updateMatchInfo();
            extraTextField.setText(info.getMatchInfo() + "    Reset to start over!");
            rockButton.setEnabled(false);
            paperButton.setEnabled(false);
            scissorsButton.setEnabled(false);
        }
    }
}
