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
public class CardapioAlcoolico extends javax.swing.JFrame {

    private static CardapioAlcoolico cpaUnic;
    
    public CardapioAlcoolico() {
        initComponents();
        setLocationRelativeTo( null );
        setDefaultCloseOperation(CardapioAlcoolico.DISPOSE_ON_CLOSE);
        listTab();
    }
    
     //Singleton
    public static CardapioAlcoolico geraCardapioAlcoolico(){
        if(cpaUnic == null){
            cpaUnic = new CardapioAlcoolico();
        }
        return cpaUnic;
    }
    
     public void listTab(){
        DefaultTableModel modelo = (DefaultTableModel)tbCardapioAlcoolico.getModel();
        int posLin = 0;
        int count=0;
        modelo.setRowCount(posLin);
        GerAlcoolico gerAlcoolico = GerAlcoolico.geraGerAlc();
        for(Alcoolico a1 : gerAlcoolico.getBdAlcoolico()){
            modelo.insertRow(posLin, new Object[]{count+1,a1.getNome(), a1.getVolume(), a1.getPreco()});
            posLin++;
            count++;
        }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tbCardapioAlcoolico = new javax.swing.JTable();
        btProx = new javax.swing.JButton();
        btPedido = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CARDÁPIO");

        tbCardapioAlcoolico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nº", "Bebida Alcoólica", "ml", "Preco"
            }
        ));
        tbCardapioAlcoolico.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tbCardapioAlcoolicoAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(tbCardapioAlcoolico);

        btProx.setText("PRÓXIMO");
        btProx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btProxActionPerformed(evt);
            }
        });

        btPedido.setText("FAZER PEDIDO");
        btPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPedidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btPedido)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(147, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btProx)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btPedido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(btProx)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPedidoActionPerformed
    try {
        // Pergunta ao usuário qual item ele deseja cadastrar
        String numeroItemStr = JOptionPane.showInputDialog(
            null,
            "Digite o número do item que deseja cadastrar:",
            "Cadastro de Item",
            JOptionPane.QUESTION_MESSAGE
        );

        if (numeroItemStr != null) {
            int numeroItem = Integer.parseInt(numeroItemStr);

            // Recupera o nome e preço do item com base no número
            DefaultTableModel modelo = (DefaultTableModel)tbCardapioAlcoolico.getModel();
            if (numeroItem >= 1 && numeroItem <= modelo.getRowCount()) {
                String nomeItem = (String)modelo.getValueAt(numeroItem - 1, 1);
                float precoItem = (float)modelo.getValueAt(numeroItem - 1, 3);
                GerItemPedido gerItemPedido = GerItemPedido.geraItemPedido();
                gerItemPedido.insItemPedido(nomeItem, precoItem);

                JOptionPane.showMessageDialog(
                    null,
                    "Item " + nomeItem + " adicionado ao pedido com sucesso!",
                    "Pedido",
                    JOptionPane.INFORMATION_MESSAGE
                );
            } else {
                JOptionPane.showMessageDialog(
                    null,
                    "Número de item inválido. Tente novamente.",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE
                );
            }
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(
            null,
            "Por favor, insira um número válido.",
            "Erro",
            JOptionPane.ERROR_MESSAGE
        );
    } catch (Exception e) {
        JOptionPane.showMessageDialog(
            null,
            "Ocorreu um erro ao processar o pedido.",
            "Erro",
            JOptionPane.ERROR_MESSAGE
        );
        e.printStackTrace(); // Pode ser removido em produção.
    }
    }//GEN-LAST:event_btPedidoActionPerformed

    private void tbCardapioAlcoolicoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tbCardapioAlcoolicoAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_tbCardapioAlcoolicoAncestorAdded

    private void btProxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProxActionPerformed
        CardapioNaoAlcoolico.geraCardapioNaoAlcoolico().setVisible(true);
        dispose();
    }//GEN-LAST:event_btProxActionPerformed
    
    private void formWindowActivated(java.awt.event.WindowEvent evt) {
        listTab();
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
            java.util.logging.Logger.getLogger(CardapioAlcoolico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CardapioAlcoolico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CardapioAlcoolico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CardapioAlcoolico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CardapioAlcoolico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btPedido;
    private javax.swing.JButton btProx;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbCardapioAlcoolico;
    // End of variables declaration//GEN-END:variables
}
