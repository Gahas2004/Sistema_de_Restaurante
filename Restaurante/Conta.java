//Nome: Gabriel Henrique de Almeida Souza -  RA:2504162

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Restaurante;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class Conta extends javax.swing.JFrame {
    
    private static Conta contUnic;
    
    /**
     * Creates new form Conta
     */
    public Conta() {
        initComponents();
        setLocationRelativeTo( null );
        setDefaultCloseOperation(Conta.DISPOSE_ON_CLOSE);
        listTab();
        soma();
    }
    
     //Singleton
    public static Conta geraConta(){
        if(contUnic == null){
            contUnic = new Conta();
        }
        return contUnic;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        lbCOnta = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbConta = new javax.swing.JTable();
        lbTotal = new javax.swing.JLabel();
        cxTotal = new javax.swing.JTextField();
        btInicio = new javax.swing.JButton();

        jTextField3.setText("jTextField3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbCOnta.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbCOnta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCOnta.setText("CONTA");

        tbConta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ITEM", "PREÇO"
            }
        ));
        jScrollPane1.setViewportView(tbConta);

        lbTotal.setText("Valor Total:");

        cxTotal.setEditable(false);
        cxTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxTotalActionPerformed(evt);
            }
        });

        btInicio.setText("VOLTAR AO INÍCIO");
        btInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbCOnta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 257, Short.MAX_VALUE)
                        .addComponent(btInicio)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(lbTotal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cxTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbCOnta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cxTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(btInicio)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cxTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxTotalActionPerformed

    }//GEN-LAST:event_cxTotalActionPerformed

    private void btInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInicioActionPerformed
        GerItemPedido.geraItemPedido().limparListaItemPedido();
        MenuPrincipal.geraMenuPrincipal().setVisible(true);
        cxTotal.setText("");
        dispose();
    }//GEN-LAST:event_btInicioActionPerformed

    /*private void calcularValorTotal() {
    float total = GerItemPedido.geraItemPedido().calcularValorTotal();
    cxTotal.setText(String.valueOf(total));
    }*/
    
    
    public void soma(){
        float total = somarValores();
        cxTotal.setText(String.valueOf(total));
    }
    
    public float somarValores() {
    DefaultTableModel modelo = (DefaultTableModel) tbConta.getModel();
    float total = 0;
    for (int i = 0; i < modelo.getRowCount(); i++) {
                float valorDaColuna2 = Float.parseFloat(modelo.getValueAt(i, 1).toString());
        total += valorDaColuna2;
    }
    return total;
}
    
    public void listTab(){
        DefaultTableModel modelo = (DefaultTableModel)tbConta.getModel();
        int posLin = 0;
        int count=0;
        modelo.setRowCount(posLin);
        GerItemPedido gerItemPedido = GerItemPedido.geraItemPedido();
        for(ItemPedido ip1 : gerItemPedido.getBdItemPedido()){
            modelo.insertRow(posLin, new Object[]{ip1.getNome(), ip1.getValor()});
            posLin++;
            count++;
        }
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
            java.util.logging.Logger.getLogger(Conta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Conta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Conta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Conta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Conta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btInicio;
    private javax.swing.JTextField cxTotal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel lbCOnta;
    private javax.swing.JLabel lbTotal;
    private javax.swing.JTable tbConta;
    // End of variables declaration//GEN-END:variables
}
