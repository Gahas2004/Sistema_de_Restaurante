//Nome: Gabriel Henrique de Almeida Souza -  RA:2504162
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Restaurante;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class LoginGerente extends javax.swing.JFrame {
    
     private static LoginGerente lgUnic;
     private Gerente g1 = new Gerente();
     private OpGerente og = OpGerente.geraGerGerente();
    
    public LoginGerente() {
        initComponents();
        setLocationRelativeTo( null );
        setDefaultCloseOperation(LoginGerente.DISPOSE_ON_CLOSE);
    }
    
    //Singleton
    public static LoginGerente geraLoginGerente(){
        if(lgUnic == null){
            lgUnic = new LoginGerente();
        }
        return lgUnic;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbMenu = new javax.swing.JLabel();
        cxId = new javax.swing.JTextField();
        cxSenha = new javax.swing.JTextField();
        btEntrar = new javax.swing.JButton();
        btCadastro = new javax.swing.JButton();
        lbCadastro = new javax.swing.JLabel();
        btLimpar = new javax.swing.JButton();
        lbID = new javax.swing.JLabel();
        lbTexto = new javax.swing.JLabel();
        btVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbMenu.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMenu.setText("LOGIN GERENTE");

        cxId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxIdActionPerformed(evt);
            }
        });

        btEntrar.setText("ENTRAR");
        btEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEntrarActionPerformed(evt);
            }
        });

        btCadastro.setText("Realizar Cadastro");
        btCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastroActionPerformed(evt);
            }
        });

        lbCadastro.setText("Novo Cadastro(Caso Seja a Prineira Vez)");

        btLimpar.setText("LIMPAR");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        lbID.setText("ID:");

        lbTexto.setText("Senha:");

        btVoltar.setText("VOLTAR");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTexto)
                            .addComponent(lbID))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cxId, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cxSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btLimpar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btEntrar))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lbCadastro)
                                .addGap(8, 8, 8)))))
                .addGap(86, 86, 86))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btVoltar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbMenu)
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cxId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cxSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTexto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btEntrar)
                    .addComponent(btLimpar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbCadastro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btCadastro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(btVoltar))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cxIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxIdActionPerformed

    private void btEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEntrarActionPerformed
        login();        
    }//GEN-LAST:event_btEntrarActionPerformed
    
    private void btCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastroActionPerformed
        cadastro();
    }//GEN-LAST:event_btCadastroActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_btVoltarActionPerformed
    public void limpar(){
         cxId.setText("");
         cxSenha.setText("");
         cxId.requestFocus();
     }
   
     private void login() {
        try {
            g1 = new Gerente();
            g1.setId(Integer.parseInt(cxId.getText()));
            g1.setSenha(Integer.parseInt(cxSenha.getText()));
            g1 = og.oldCadastro(g1);

            limpar();

            if (g1 != null) {
                JOptionPane.showMessageDialog(this, "Login bem-sucedido!");
                EscolhaTipo.geraEscolhaTipo().setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Login falhou. Verifique suas credenciais.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Erro ao converter ID ou senha para número.", "Erro de Formato", JOptionPane.ERROR_MESSAGE);        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocorreu um erro durante o login.", "Erro", JOptionPane.ERROR_MESSAGE);           
        }
    }

    
   private void cadastro() {
        try {
            g1 = new Gerente();
            g1.setId(Integer.parseInt(cxId.getText()));
            g1.setSenha(Integer.parseInt(cxSenha.getText()));

            Gerente resultadoCadastro = og.newCadastro(g1);

            if (resultadoCadastro != null) {
                JOptionPane.showMessageDialog(this, "Cadastro bem-sucedido!");
                EscolhaTipo.geraEscolhaTipo().setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Falha no cadastro. O gerente já existe ou ocorreu um erro.");
            }
            limpar();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Erro ao converter ID ou senha para número.", "Erro de Formato", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocorreu um erro durante o cadastro.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

     
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
            java.util.logging.Logger.getLogger(LoginGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginGerente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastro;
    private javax.swing.JButton btEntrar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JTextField cxId;
    private javax.swing.JTextField cxSenha;
    private javax.swing.JLabel lbCadastro;
    private javax.swing.JLabel lbID;
    private javax.swing.JLabel lbMenu;
    private javax.swing.JLabel lbTexto;
    // End of variables declaration//GEN-END:variables
}
