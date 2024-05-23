//Nome: Gabriel Henrique de Almeida Souza -  RA:2504162

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Restaurante;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class CadAlcoolico extends javax.swing.JFrame {

    private static CadAlcoolico caUnic;
    private GerAlcoolico ga = GerAlcoolico.geraGerAlc();
    private Alcoolico a1 = new Alcoolico();
    
    
    public CadAlcoolico() {
        initComponents();
        setLocationRelativeTo( null );
        setDefaultCloseOperation(CadAlcoolico.DISPOSE_ON_CLOSE);
    }

    //Singleton
    public static CadAlcoolico geraCadAlcoolico(){
        if(caUnic == null){
            caUnic = new CadAlcoolico();
        }
        return caUnic;
    }
    
    public List<Alcoolico> getBebidasAlcoolicas() {
        return ga.getBdAlcoolico();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPasswordField1 = new javax.swing.JPasswordField();
        lbMenuGerente = new javax.swing.JLabel();
        lbNome = new javax.swing.JLabel();
        lbValor = new javax.swing.JLabel();
        cxNome = new javax.swing.JTextField();
        cxValor = new javax.swing.JTextField();
        btInserir = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        btPesquisar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbAlcoolico = new javax.swing.JTable();
        lbTamanho = new javax.swing.JLabel();
        cxTamanho = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbMenuGerente.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbMenuGerente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMenuGerente.setText("CADASTRAR BEBIDA ALCOÓLICA");

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

        tbAlcoolico.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tbAlcoolico);

        lbTamanho.setText("TAMANHO(g/ml)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbMenuGerente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
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
        a1 = new Alcoolico();
        a1.setPreco(Float.parseFloat(cxValor.getText()));
        a1.setNome(cxNome.getText());
        a1.setVolume(Float.parseFloat(cxTamanho.getText()));
        a1 = ga.insAlcoolico(a1);

        if (a1 != null) {
            JOptionPane.showMessageDialog(
                null,
                "Bebida Alcoólica cadastrada com sucesso!",
                "CADASTRO",
                JOptionPane.INFORMATION_MESSAGE
            );
        } else {
            JOptionPane.showMessageDialog(
                null,
                "Bebida Alcoólica já cadastrada",
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
        e.printStackTrace(); // Pode ser removido em produção.
    }
}

public void alterar() {
    try {
        a1 = new Alcoolico();
        a1.setNome(cxNome.getText());
        a1 = ga.atualizaAlcoolico(a1);

        if (a1 != null) {
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
                "Bebida Alcoólica inexistente",
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
        a1 = new Alcoolico();
        a1.setNome(cxNome.getText());
        a1 = ga.consAlcoolico(a1);

        if (a1 != null) {
            cxValor.setText(Float.toString(a1.getPreco()));
            cxNome.setText(a1.getNome());
            cxTamanho.setText(Float.toString(a1.getVolume()));

            JOptionPane.showMessageDialog(
                null,
                "Confira os dados",
                "CONSULTA",
                JOptionPane.INFORMATION_MESSAGE
            );
        } else {
            JOptionPane.showMessageDialog(
                null,
                "Bebida Alcoólica inexistente!",
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
        a1 = new Alcoolico();
        a1.setNome(cxNome.getText());
        a1 = ga.delAlcoolico(a1);

        if (a1 == null) {
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
                "Bebida Alcoólica inexistente",
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
        DefaultTableModel modelo = (DefaultTableModel)tbAlcoolico.getModel();
        int posLin =0;
        modelo.setRowCount(posLin);
        for(Alcoolico a1 : ga.getBdAlcoolico()){
            modelo.insertRow(posLin, new Object[]{a1.getNome(),a1.getPreco(),a1.getVolume()});
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
            java.util.logging.Logger.getLogger(CadAlcoolico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadAlcoolico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadAlcoolico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadAlcoolico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadAlcoolico().setVisible(true);
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
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbMenuGerente;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbTamanho;
    private javax.swing.JLabel lbValor;
    private javax.swing.JTable tbAlcoolico;
    // End of variables declaration//GEN-END:variables

    private Alcoolico delAlcoolico(Alcoolico a1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
