//Nome: Gabriel Henrique de Almeida Souza -  RA:2504162

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Restaurante;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class CadPrato extends javax.swing.JFrame {
    
    private static CadPrato cpUnic;
    private GerPrato gp = GerPrato.geraGerPrato();
    private Prato p1 = new Prato();
    
    public CadPrato() {
        initComponents();
        setLocationRelativeTo( null );
        setDefaultCloseOperation(CadPrato.DISPOSE_ON_CLOSE);
    }
    
    //Singleton
    public static CadPrato geraCadPrato(){
        if(cpUnic == null){
            cpUnic = new CadPrato();
        }
        return cpUnic;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tbPrato = new javax.swing.JTable();
        lbMenuGerente = new javax.swing.JLabel();
        lbTamanho = new javax.swing.JLabel();
        lbNome = new javax.swing.JLabel();
        cxTamanho = new javax.swing.JTextField();
        lbValor = new javax.swing.JLabel();
        cxNome = new javax.swing.JTextField();
        cxValor = new javax.swing.JTextField();
        btInserir = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        btPesquisar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbPrato.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ITEM", "PREÇO", "VOLUME"
            }
        ));
        jScrollPane2.setViewportView(tbPrato);

        lbMenuGerente.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbMenuGerente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMenuGerente.setText("MENU GERENTE");

        lbTamanho.setText("TAMANHO(g/ml)");

        lbNome.setText("NOME");

        lbValor.setText("VALOR");

        cxValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxValorActionPerformed(evt);
            }
        });

        btInserir.setText("INSERIR");
        btInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInserirActionPerformed(evt);
            }
        });

        btAlterar.setText("ALTERAR");
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        btPesquisar.setText("PESQUISAR");
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });

        btExcluir.setText("EXCLUIR");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbTamanho)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cxTamanho))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btInserir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btPesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btExcluir))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbValor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cxValor))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cxNome))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbMenuGerente, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbMenuGerente)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNome)
                    .addComponent(cxNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbValor)
                    .addComponent(cxValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTamanho)
                    .addComponent(cxTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btInserir)
                    .addComponent(btAlterar)
                    .addComponent(btPesquisar)
                    .addComponent(btExcluir))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cxValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxValorActionPerformed

    private void btInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirActionPerformed
        ins();
        listTab();
        limpar();
    }//GEN-LAST:event_btInserirActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        alterar();
        listTab();
        limpar();
    }//GEN-LAST:event_btAlterarActionPerformed

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        consultar();
        listTab();
    }//GEN-LAST:event_btPesquisarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        excluir();
        listTab();
        limpar();
    }//GEN-LAST:event_btExcluirActionPerformed

    public void ins() {
    try {
        p1 = new Prato();
        p1.setPreco(Float.parseFloat(cxValor.getText()));
        p1.setNome(cxNome.getText());
        p1.setPeso(Float.parseFloat(cxTamanho.getText()));
        p1 = gp.insPrato(p1);

        if (p1 != null) {
            JOptionPane.showMessageDialog(
                null,
                "Prato cadastrado com sucesso!",
                "CADASTRO",
                JOptionPane.INFORMATION_MESSAGE
            );
        } else {
            JOptionPane.showMessageDialog(
                null,
                "Prato já cadastrado",
                "CADASTRO",
                JOptionPane.WARNING_MESSAGE
            );
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(
            null,
            "Erro ao converter valor ou tamanho para número",
            "Erro de Formato",
            JOptionPane.ERROR_MESSAGE
        );
    } catch (Exception e) {
        JOptionPane.showMessageDialog(
            null,
            "Ocorreu um erro durante o cadastro",
            "Erro",
            JOptionPane.ERROR_MESSAGE
        );
        e.printStackTrace(); // Isso ajuda a identificar a causa do erro durante o desenvolvimento, mas pode ser removido em produção.
    }
}

    public void alterar() {
        try {
            p1 = new Prato();
            p1.setNome(cxNome.getText());
            p1 = gp.atualizaPrato(p1);

            if (p1 != null) {
                JOptionPane.showMessageDialog(
                    null,
                    "Dados alterados com sucesso!",
                    "ALTERAÇÃO DE DADOS",
                    JOptionPane.INFORMATION_MESSAGE
                );
                limpar();
            } else {
                JOptionPane.showMessageDialog(
                    null,
                    "Prato inexistente",
                    "ALTERAÇÃO DE DADOS",
                    JOptionPane.ERROR_MESSAGE
                );
                limpar();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                null,
                "Ocorreu um erro durante a atualização dos dados",
                "Erro",
                JOptionPane.ERROR_MESSAGE
            );
            e.printStackTrace(); // Pode ser removido em produção.
        }
    }

    
public void consultar() {
    try {
        p1 = new Prato();
        p1.setNome(cxNome.getText());
        p1 = gp.consPrato(p1);

        if (p1 != null) {
            cxValor.setText(Float.toString(p1.getPreco()));
            cxNome.setText(p1.getNome());
            cxTamanho.setText(Float.toString(p1.getPeso()));

            JOptionPane.showMessageDialog(
                null,
                "Confira os dados",
                "CONSULTA",
                JOptionPane.INFORMATION_MESSAGE
            );
        } else {
            JOptionPane.showMessageDialog(
                null,
                "Prato inexistente!",
                "CONSULTA",
                JOptionPane.WARNING_MESSAGE
            );
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(
            null,
            "Ocorreu um erro durante a consulta",
            "Erro",
            JOptionPane.ERROR_MESSAGE
        );
        e.printStackTrace(); // Pode ser removido em produção.
    }
}

    
   public void excluir() {
    try {
        p1 = new Prato();
        p1.setNome(cxNome.getText());
        p1 = gp.delPrato(p1);

        if (p1 == null) {
            JOptionPane.showMessageDialog(
                null,
                "Dados excluídos com sucesso!",
                "EXCLUSÃO DE DADOS",
                JOptionPane.INFORMATION_MESSAGE
            );
            limpar();
        } else {
            JOptionPane.showMessageDialog(
                null,
                "Prato inexistente",
                "EXCLUSÃO DE DADOS",
                JOptionPane.ERROR_MESSAGE
            );
            limpar();
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(
            null,
            "Ocorreu um erro durante a exclusão dos dados",
            "Erro",
            JOptionPane.ERROR_MESSAGE
        );
        e.printStackTrace(); // Pode ser removido em produção.
    }
}

    
    public void listTab(){
        DefaultTableModel modelo = (DefaultTableModel)tbPrato.getModel();
        int posLin =0;
        modelo.setRowCount(posLin);
        for(Prato p1 : gp.getbdPrato()){
            modelo.insertRow(posLin, new Object[]{p1.getNome(),p1.getPreco(),p1.getPeso()});
            posLin++;
        }
    }
    
    public void limpar(){
        cxNome.setText("");
        cxValor.setText("");
        cxTamanho.setText("");
    }
    
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
            java.util.logging.Logger.getLogger(CadPrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadPrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadPrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadPrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadPrato().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btInserir;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JTextField cxNome;
    private javax.swing.JTextField cxTamanho;
    private javax.swing.JTextField cxValor;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbMenuGerente;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbTamanho;
    private javax.swing.JLabel lbValor;
    private javax.swing.JTable tbPrato;
    // End of variables declaration//GEN-END:variables
}
