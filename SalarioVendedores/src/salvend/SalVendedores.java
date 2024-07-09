package salvend;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class SalVendedores extends javax.swing.JFrame {

    Vendedor vend[] = new Vendedor[7];
    DefaultTableModel modelo = new DefaultTableModel();
    DefaultTableCellRenderer direitaRenderer = new DefaultTableCellRenderer();

    public SalVendedores() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        exibirDados = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tVend = new javax.swing.JTable();
        btSalários = new javax.swing.JButton();
        btMediaSal = new javax.swing.JButton();
        txtMediaSal = new javax.swing.JTextField();
        lbCategoria = new javax.swing.JLabel();
        txtCategoria = new javax.swing.JTextField();
        txtPerc = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btmenorVenda = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtVendedor = new javax.swing.JTextField();
        txtCatMenor = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        exibirDados.setText("Exibir dados");
        exibirDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exibirDadosActionPerformed(evt);
            }
        });

        tVend.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Salário base", "Vendas", "Categorias"
            }
        ));
        tVend.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tVendAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane2.setViewportView(tVend);
        tVend.getAccessibleContext().setAccessibleName("");

        btSalários.setText("Calcular Salários");
        btSalários.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaláriosActionPerformed(evt);
            }
        });

        btMediaSal.setText("Salário Base médio");
        btMediaSal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMediaSalActionPerformed(evt);
            }
        });

        txtMediaSal.setEditable(false);

        lbCategoria.setText("Digite a categoria");

        txtCategoria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCategoriaKeyPressed(evt);
            }
        });

        txtPerc.setEditable(false);
        txtPerc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPercKeyPressed(evt);
            }
        });

        jLabel1.setText("Porcentagem de vendedores");

        btmenorVenda.setText("Menor Venda");
        btmenorVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmenorVendaActionPerformed(evt);
            }
        });

        jLabel2.setText("Vendedor");

        jLabel3.setText("Categoria");

        txtVendedor.setEditable(false);

        txtCatMenor.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 632, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(exibirDados)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btSalários))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btmenorVenda, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btMediaSal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lbCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPerc, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                                    .addComponent(txtMediaSal)
                                    .addComponent(txtCategoria)
                                    .addComponent(txtVendedor)
                                    .addComponent(txtCatMenor))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exibirDados)
                    .addComponent(btSalários))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btMediaSal)
                    .addComponent(txtMediaSal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lbCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPerc)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btmenorVenda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCatMenor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exibirDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exibirDadosActionPerformed

        File arq = new File("dados.txt");

        try {
            Scanner scan = new Scanner(arq);
            for (int i = 0; i < vend.length; i++) {
                vend[i] = new Vendedor(scan.next(), scan.nextDouble(),
                        scan.nextDouble(), scan.next().charAt(0));
            }
            
            modelo.addColumn("Nome");
            modelo.addColumn("Salário Base");
            modelo.addColumn("Vendas");
            modelo.addColumn("Categoria");
            for (int i = 0; i < vend.length; i++) {
                Object linha[] = {vend[i].getNome(),
                    String.format("%.2f", vend[i].getSalarioBase()),
                    String.format("%.2f", vend[i].getVendas()), vend[i].getCategoria()};
                // O DefaultTableModel do Java Swing é projetado para ser genérico e flexível o 
                // suficiente para acomodar os diversos tipos de dados na tabela.
                // Para isto, ele recebe dados do tipo Object, que é a superclasse direta 
                // de todas as classes em Java.
                modelo.addRow(linha);
            }
            tVend.setModel(modelo);

            
            direitaRenderer.setHorizontalAlignment(SwingConstants.RIGHT);
            tVend.getColumnModel().getColumn(1).setCellRenderer(direitaRenderer);
            tVend.getColumnModel().getColumn(2).setCellRenderer(direitaRenderer);

        } catch (FileNotFoundException ex) {
            Logger.getLogger(SalVendedores.class.getName()).log(Level.SEVERE, null, ex);
        }

        
        direitaRenderer.setHorizontalAlignment(SwingConstants.RIGHT);
        tVend.getColumnModel().getColumn(1).setCellRenderer(direitaRenderer);
        tVend.getColumnModel().getColumn(2).setCellRenderer(direitaRenderer);
    }//GEN-LAST:event_exibirDadosActionPerformed

    private void btSaláriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaláriosActionPerformed

        modelo = (DefaultTableModel) tVend.getModel();

        // DefaultTableModel modelo = new DefaultTableModel();
        //modelo.addColumn("Nome");
        modelo.addColumn("Salário Final");
        int j=modelo.findColumn("Salário Final"); //índice da nova coluna
        for (int i = 0; i < vend.length; i++) {
            modelo.setValueAt(String.format("%.2f", vend[i].calcSalario()),i,j);
//            Object linha[] = {vend[i].nome,
//                String.format("%.2f", vend[i].calcSalario())};
//            modelo.addRow(linha);
//
//            System.out.println(vend[i].nome + " " + vend[i].calcSalario());
        }
       // tSalFnal.setModel(modelo);
       
       tVend.getColumnModel().getColumn(j).setCellRenderer(direitaRenderer);
    }//GEN-LAST:event_btSaláriosActionPerformed

    private void btMediaSalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMediaSalActionPerformed
        double soma=0, media;
        for (int i = 0; i < vend.length; i++) {
            soma+=vend[i].getSalarioBase();                        
        }
        media=soma/vend.length;
        txtMediaSal.setText(String.format("%.2f", media));
        
    }//GEN-LAST:event_btMediaSalActionPerformed

    private void txtPercKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPercKeyPressed
  
    }//GEN-LAST:event_txtPercKeyPressed

    private void txtCategoriaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCategoriaKeyPressed
      int cont=0;
        for (int i = 0; i < vend.length; i++) {
            if(vend[i].getCategoria() == evt.getKeyChar()){
                cont++;                
            }            
        }    
        double perc=(double)cont/vend.length*100;
        txtPerc.setText(String.format("%.2f", perc));
    }//GEN-LAST:event_txtCategoriaKeyPressed

    private void btmenorVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmenorVendaActionPerformed
      double menor=vend[0].getVendas();
      String nomeMenor=vend[0].getNome();
      char catMenor=vend[0].getCategoria();
      
        for (int i = 0; i < vend.length; i++) {
            if(vend[i].getVendas()< menor){
               menor=vend[i].getVendas();
               nomeMenor=vend[i].getNome();
               catMenor=vend[i].getCategoria();
            }
            
        }
        txtVendedor.setText(nomeMenor);
        txtCatMenor.setText(String.format("%s", catMenor));
    }//GEN-LAST:event_btmenorVendaActionPerformed

    private void tVendAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tVendAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_tVendAncestorAdded

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
            java.util.logging.Logger.getLogger(SalVendedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SalVendedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SalVendedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SalVendedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SalVendedores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btMediaSal;
    private javax.swing.JButton btSalários;
    private javax.swing.JButton btmenorVenda;
    private javax.swing.JButton exibirDados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbCategoria;
    private javax.swing.JTable tVend;
    private javax.swing.JTextField txtCatMenor;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtMediaSal;
    private javax.swing.JTextField txtPerc;
    private javax.swing.JTextField txtVendedor;
    // End of variables declaration//GEN-END:variables
}
