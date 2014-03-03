/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package annuaire.view;

import javax.swing.JOptionPane;

/**
 *
 * @author tony
 */
public class FrameMenu extends javax.swing.JFrame {

    /**
     * Creates new form FrameMenu
     */
    public FrameMenu() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        panMenu = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        btnGestionPersonnes = new javax.swing.JButton();
        btnGestionColloques = new javax.swing.JButton();
        btnConsulter = new javax.swing.JButton();
        btnImporter = new javax.swing.JButton();
        btnQuitter = new javax.swing.JButton();
        lblMenu = new javax.swing.JLabel();

        jButton5.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panMenu.setBackground(new java.awt.Color(0, 102, 204));

        lblLogo.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        lblLogo.setForeground(new java.awt.Color(255, 255, 255));

        btnGestionPersonnes.setText("Gestion personnes");
        btnGestionPersonnes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionPersonnesActionPerformed(evt);
            }
        });

        btnGestionColloques.setText("Gestion colloques");
        btnGestionColloques.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionColloquesActionPerformed(evt);
            }
        });

        btnConsulter.setText("Consulter");
        btnConsulter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsulterActionPerformed(evt);
            }
        });

        btnImporter.setText("Importer");
        btnImporter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImporterActionPerformed(evt);
            }
        });

        btnQuitter.setText("Quitter");
        btnQuitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitterActionPerformed(evt);
            }
        });

        lblMenu.setIcon(new javax.swing.ImageIcon("C:\\Users\\tony\\Documents\\NetBeansProjects\\CVVENppe5\\src\\annuaire\\logo.jpg")); // NOI18N

        javax.swing.GroupLayout panMenuLayout = new javax.swing.GroupLayout(panMenu);
        panMenu.setLayout(panMenuLayout);
        panMenuLayout.setHorizontalGroup(
            panMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panMenuLayout.createSequentialGroup()
                .addGroup(panMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panMenuLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(btnGestionPersonnes, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panMenuLayout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(btnImporter, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(panMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panMenuLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGestionColloques, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75))
                    .addGroup(panMenuLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(btnConsulter, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(106, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panMenuLayout.createSequentialGroup()
                .addContainerGap(201, Short.MAX_VALUE)
                .addGroup(panMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panMenuLayout.createSequentialGroup()
                        .addComponent(lblLogo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMenu)
                        .addGap(205, 205, 205))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panMenuLayout.createSequentialGroup()
                        .addComponent(btnQuitter, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(220, 220, 220))))
        );
        panMenuLayout.setVerticalGroup(
            panMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panMenuLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(panMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLogo)
                    .addComponent(lblMenu))
                .addGap(27, 27, 27)
                .addGroup(panMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGestionPersonnes, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGestionColloques, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(panMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnImporter, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsulter, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(btnQuitter, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnQuitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitterActionPerformed
        JOptionPane.showMessageDialog(null,"A bientot!","Message",JOptionPane.INFORMATION_MESSAGE);
        this.dispose();
    }//GEN-LAST:event_btnQuitterActionPerformed

    private void btnGestionPersonnesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionPersonnesActionPerformed
        FrameGestionPersonnes fen = new FrameGestionPersonnes();    //Création de l'objet 
        fen.setResizable(false);    //Pas de redimensionnement de la fenétre possible.
        fen.setLocationRelativeTo(null);    //Fenêtre centrée au centre 
        fen.setVisible(true);   //Afficher la fenêtre
    }//GEN-LAST:event_btnGestionPersonnesActionPerformed

    private void btnGestionColloquesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionColloquesActionPerformed
        FrameGestionColloques fen = new FrameGestionColloques();    //Création de l'objet
        fen.setResizable(false);    //Pas de redimensionnement de la fenétre possible.
        fen.setLocationRelativeTo(null);    //Fenêtre centrée au centre 
        fen.setVisible(true);   //Afficher la fenêtre
    }//GEN-LAST:event_btnGestionColloquesActionPerformed

    private void btnImporterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImporterActionPerformed
        FrameImporter fen = new FrameImporter();    //Création de l'objet
        fen.setResizable(false);    //Pas de redimensionnement de la fenétre possible.
        fen.setLocationRelativeTo(null);    //Fenêtre centrée au centre 
        fen.setVisible(true);   //Afficher la fenêtre
    }//GEN-LAST:event_btnImporterActionPerformed

    private void btnConsulterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsulterActionPerformed
        FrameConsulter fen = new FrameConsulter();    //Création de l'objet
        fen.setResizable(false);    //Pas de redimensionnement de la fenétre possible.
        fen.setLocationRelativeTo(null);    //Fenêtre centrée au centre 
        fen.setVisible(true);   //Afficher la fenêtre
    }//GEN-LAST:event_btnConsulterActionPerformed

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
            java.util.logging.Logger.getLogger(FrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsulter;
    private javax.swing.JButton btnGestionColloques;
    private javax.swing.JButton btnGestionPersonnes;
    private javax.swing.JButton btnImporter;
    private javax.swing.JButton btnQuitter;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JPanel panMenu;
    // End of variables declaration//GEN-END:variables
}
