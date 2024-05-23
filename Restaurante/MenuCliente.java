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
public class MenuCliente extends javax.swing.JFrame {

    private static MenuCliente mcUnic;
    private Cliente c = new Cliente();
    private final OpCliente oc;
    
    public MenuCliente() {
        this.oc = new OpCliente();
        initComponents();
        setLocationRelativeTo( null );
        setDefaultCloseOperation(MenuCliente.DISPOSE_ON_CLOSE);
    }
    
    //Singleton
    public static MenuCliente geraMenuCliente(){
        if(mcUnic == null){
            mcUnic = new MenuCliente();
        }
        return mcUnic;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbMenuCliente = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cxNomeCliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btVoltar = new javax.swing.JButton();
        btCardapio = new javax.swing.JButton();
        cxIdade = new javax.swing.JTextField();
        cxNumero = new javax.swing.JTextField();
        cxQtdPes = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbMenuCliente.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbMenuCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMenuCliente.setText("MENU CLIENTE");

        jLabel1.setText("Nome do responsável pela mesa: ");

        cxNomeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxNomeClienteActionPerformed(evt);
            }
        });

        jLabel2.setText("Idade da pessoa mais velha da mesa:");

        jLabel3.setText("Número da sua mesa:");

        jLabel4.setText("Quantidade de pessoas na mesa:");

        btVoltar.setText("VOLTAR");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        btCardapio.setText("ACESSAR CARDÁPIO");
        btCardapio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCardapioActionPerformed(evt);
            }
        });

        cxIdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxIdadeActionPerformed(evt);
            }
        });

        cxNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxNumeroActionPerformed(evt);
            }
        });

        cxQtdPes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxQtdPesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbMenuCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(cxNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(cxIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cxNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cxQtdPes, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 95, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btVoltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btCardapio)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbMenuCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cxNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cxIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(12, 12, 12)
                .addComponent(cxNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cxQtdPes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btVoltar)
                    .addComponent(btCardapio))
                .addGap(0, 13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cxNomeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxNomeClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxNomeClienteActionPerformed

    private void cxIdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxIdadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxIdadeActionPerformed

    private void cxNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxNumeroActionPerformed

    private void cxQtdPesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxQtdPesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxQtdPesActionPerformed

    private void btCardapioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCardapioActionPerformed
        boolean dadosInseridosCorretamente = true;

        try {
            c.setNome(cxNomeCliente.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao definir o nome do cliente", "Erro", JOptionPane.ERROR_MESSAGE);
            dadosInseridosCorretamente = false;
            cxNomeCliente.setText("");
        }

        try {
            int idade = Integer.parseInt(cxIdade.getText());
            if (idade <= 0) {
                JOptionPane.showMessageDialog(null, "A idade não pode ser negativa/zero.", "Erro", JOptionPane.ERROR_MESSAGE);
                dadosInseridosCorretamente = false;
                cxIdade.setText("");
            } else {
                c.setIdade(idade);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "A idade deve ser um numero inteiro ", "Erro", JOptionPane.ERROR_MESSAGE);
            dadosInseridosCorretamente = false;
            cxIdade.setText("");
        }

        try {
            int mesa = Integer.parseInt(cxNumero.getText());
            if (mesa <= 0) {
                JOptionPane.showMessageDialog(null, "O número da mesa não pode ser negativo/zero.", "Erro", JOptionPane.ERROR_MESSAGE);
                dadosInseridosCorretamente = false;
                cxNumero.setText("");
            } else {
                c.setMesa(mesa);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Número da mesa deve ser um numero inteiro ", "Erro", JOptionPane.ERROR_MESSAGE);
            dadosInseridosCorretamente = false;
            cxNumero.setText("");
        }

        try {
            int quantidade = Integer.parseInt(cxQtdPes.getText());
            if (quantidade <= 0) {
                JOptionPane.showMessageDialog(null, "A quantidade não pode ser negativa/zero.", "Erro", JOptionPane.ERROR_MESSAGE);
                dadosInseridosCorretamente = false;
                cxQtdPes.setText("");
            } else {
                c.setQuantidade(quantidade);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Quantidade deve ser um numero inteiro", "Erro", JOptionPane.ERROR_MESSAGE);
            dadosInseridosCorretamente = false;
            cxQtdPes.setText("");
        }

        if (dadosInseridosCorretamente) {
            c = oc.addCliente(c);

            if (c.getIdade() > 17) {
                CardapioAlcoolico.geraCardapioAlcoolico().setVisible(true);
                limpar();
                dispose();
            } else {
                CardapioNaoAlcoolico.geraCardapioNaoAlcoolico().setVisible(true);
                limpar();
                dispose();
            }
        }
        
    }//GEN-LAST:event_btCardapioActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        dispose();
        limpar();
    }//GEN-LAST:event_btVoltarActionPerformed

    private void limpar(){
        cxNomeCliente.setText("");
        cxIdade.setText("");
        cxNumero.setText("");
        cxQtdPes.setText("");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCardapio;
    private javax.swing.JButton btVoltar;
    private javax.swing.JTextField cxIdade;
    private javax.swing.JTextField cxNomeCliente;
    private javax.swing.JTextField cxNumero;
    private javax.swing.JTextField cxQtdPes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lbMenuCliente;
    // End of variables declaration//GEN-END:variables
}