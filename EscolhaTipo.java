//Nome: Gabriel Henrique de Almeida Souza -  RA:2504162

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Restaurante;

public class EscolhaTipo extends javax.swing.JFrame {

    private static EscolhaTipo etUnic;
    
    public EscolhaTipo() {
        initComponents();
        setLocationRelativeTo( null );
        setDefaultCloseOperation(EscolhaTipo.DISPOSE_ON_CLOSE);
    }
    
    //Singleton
    public static EscolhaTipo geraEscolhaTipo(){
        if(etUnic == null){
            etUnic = new EscolhaTipo();
        }
        return etUnic;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbMenuGerente = new javax.swing.JLabel();
        cxAlcoolico = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cxNaoAlcoolico = new javax.swing.JButton();
        cxPrato = new javax.swing.JButton();
        cxSobremesa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbMenuGerente.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbMenuGerente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMenuGerente.setText("MENU GERENTE");

        cxAlcoolico.setText("BEBIDA ALCOÓLICA");
        cxAlcoolico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxAlcoolicoActionPerformed(evt);
            }
        });

        jLabel1.setText("ESCOLHA O TIPO DE ITEM QUE DESEJA CADASTRAR");

        cxNaoAlcoolico.setText("BEBIDA NÃO ALCOÓLICA");
        cxNaoAlcoolico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxNaoAlcoolicoActionPerformed(evt);
            }
        });

        cxPrato.setText("PRATO");
        cxPrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxPratoActionPerformed(evt);
            }
        });

        cxSobremesa.setText("SOBREMESA");
        cxSobremesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxSobremesaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(cxAlcoolico, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(cxNaoAlcoolico)
                    .addComponent(cxPrato)
                    .addComponent(cxSobremesa)
                    .addComponent(lbMenuGerente, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbMenuGerente)
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(15, 15, 15)
                .addComponent(cxAlcoolico)
                .addGap(18, 18, 18)
                .addComponent(cxNaoAlcoolico)
                .addGap(18, 18, 18)
                .addComponent(cxPrato)
                .addGap(18, 18, 18)
                .addComponent(cxSobremesa)
                .addGap(0, 70, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cxAlcoolicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxAlcoolicoActionPerformed
        CadAlcoolico.geraCadAlcoolico().setVisible(true);
    }//GEN-LAST:event_cxAlcoolicoActionPerformed

    private void cxNaoAlcoolicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxNaoAlcoolicoActionPerformed
        CadNaoAlcoolico.geraCadNaoAlcoolico().setVisible(true);
    }//GEN-LAST:event_cxNaoAlcoolicoActionPerformed

    private void cxSobremesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxSobremesaActionPerformed
        CadSobremesa.geraCadSobremesa().setVisible(true);
    }//GEN-LAST:event_cxSobremesaActionPerformed

    private void cxPratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxPratoActionPerformed
        CadPrato.geraCadPrato().setVisible(true);
    }//GEN-LAST:event_cxPratoActionPerformed

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
            java.util.logging.Logger.getLogger(EscolhaTipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EscolhaTipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EscolhaTipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EscolhaTipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EscolhaTipo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cxAlcoolico;
    private javax.swing.JButton cxNaoAlcoolico;
    private javax.swing.JButton cxPrato;
    private javax.swing.JButton cxSobremesa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbMenuGerente;
    // End of variables declaration//GEN-END:variables
}
