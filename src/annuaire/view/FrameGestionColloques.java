/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package annuaire.view;

import annuaire.controleur.controleurColloque;

/**
 *
 * @author anthony
 */
public class FrameGestionColloques extends javax.swing.JFrame {

    /**
     * Creates new form FrameGestionColloques
     */
    public FrameGestionColloques() {
        initComponents();
        
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panGestionColloques = new javax.swing.JPanel();
        lblGestionColloques = new javax.swing.JLabel();
        btnFermer = new javax.swing.JButton();
        btnCreerEvenement = new javax.swing.JButton();
        btnSupprimerEvnt = new javax.swing.JButton();
        btnModifier = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panGestionColloques.setBackground(new java.awt.Color(0, 102, 102));

        lblGestionColloques.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        lblGestionColloques.setForeground(new java.awt.Color(255, 255, 255));
        lblGestionColloques.setText("Gestion Colloques");

        btnFermer.setText("Fermer cette fenêtre");
        btnFermer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFermerActionPerformed(evt);
            }
        });

        btnCreerEvenement.setText("Créer un évenement");
        btnCreerEvenement.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCreerEvenementMouseClicked(evt);
            }
        });
        btnCreerEvenement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreerEvenementActionPerformed(evt);
            }
        });

        btnSupprimerEvnt.setText("Supprimer un évenement");
        btnSupprimerEvnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupprimerEvntActionPerformed(evt);
            }
        });

        btnModifier.setText("Modifier un évènement");
        btnModifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifierActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panGestionColloquesLayout = new javax.swing.GroupLayout(panGestionColloques);
        panGestionColloques.setLayout(panGestionColloquesLayout);
        panGestionColloquesLayout.setHorizontalGroup(
            panGestionColloquesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panGestionColloquesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnFermer)
                .addGap(49, 49, 49))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panGestionColloquesLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(btnCreerEvenement)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSupprimerEvnt)
                .addGap(59, 59, 59))
            .addGroup(panGestionColloquesLayout.createSequentialGroup()
                .addGap(252, 252, 252)
                .addGroup(panGestionColloquesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnModifier)
                    .addComponent(lblGestionColloques, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(219, Short.MAX_VALUE))
        );
        panGestionColloquesLayout.setVerticalGroup(
            panGestionColloquesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panGestionColloquesLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lblGestionColloques)
                .addGap(78, 78, 78)
                .addGroup(panGestionColloquesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreerEvenement)
                    .addComponent(btnSupprimerEvnt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(btnModifier)
                .addGap(105, 105, 105)
                .addComponent(btnFermer)
                .addGap(44, 44, 44))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panGestionColloques, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panGestionColloques, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFermerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFermerActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFermerActionPerformed

    private void btnCreerEvenementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreerEvenementActionPerformed

       FrameCreerColloque frameCreer = new FrameCreerColloque();
       frameCreer.setVisible(true);

    }//GEN-LAST:event_btnCreerEvenementActionPerformed

    private void btnCreerEvenementMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCreerEvenementMouseClicked
          
    }//GEN-LAST:event_btnCreerEvenementMouseClicked

    private void btnSupprimerEvntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupprimerEvntActionPerformed
        FrameSupprimerColloque frameDelete = new FrameSupprimerColloque();
        frameDelete.setVisible(true);
    }//GEN-LAST:event_btnSupprimerEvntActionPerformed

    private void btnModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifierActionPerformed
        FrameModifierEvenement frmModifier = new FrameModifierEvenement();
        frmModifier.setVisible(true);
    }//GEN-LAST:event_btnModifierActionPerformed

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
            java.util.logging.Logger.getLogger(FrameGestionColloques.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameGestionColloques.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameGestionColloques.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameGestionColloques.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameGestionColloques().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreerEvenement;
    private javax.swing.JButton btnFermer;
    private javax.swing.JButton btnModifier;
    private javax.swing.JButton btnSupprimerEvnt;
    private javax.swing.JLabel lblGestionColloques;
    private javax.swing.JPanel panGestionColloques;
    // End of variables declaration//GEN-END:variables
}
