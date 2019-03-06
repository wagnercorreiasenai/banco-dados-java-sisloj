/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.sisloj;

import br.senai.sc.sisloj.views.CadastroCliente;
import br.senai.sc.sisloj.views.ListagemCliente;
import br.senai.sc.sisloj.views.PainelAmarelo;
import br.senai.sc.sisloj.views.PainelRosa;
import br.senai.sc.sisloj.views.TelaPadrao;
import java.awt.CardLayout;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class SisLojFrame extends javax.swing.JFrame {

    /**
     * Creates new form SisLojFrame
     */
    public SisLojFrame() {
        initComponents();

        //Cria os componentes
        PainelRosa pRosa = new PainelRosa();
        PainelAmarelo pAmarelo = new PainelAmarelo();
        CadastroCliente cadCli = new CadastroCliente();
        TelaPadrao tp = new TelaPadrao();
        

        painelPrincipal.add(pRosa, "painelRosa");
        painelPrincipal.add(pAmarelo, "painelAmarelo");
        painelPrincipal.add(cadCli, "cadastroCliente");
        painelPrincipal.add(tp, "telaPadrao");
        

        //Chamar a tela padrão aqui
        CardLayout cl = (CardLayout) painelPrincipal.getLayout();
        cl.show(painelPrincipal, "telaPadrao");
        
        this.setExtendedState(MAXIMIZED_BOTH);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelPrincipal = new javax.swing.JPanel();
        barraDeMenu = new javax.swing.JMenuBar();
        menCliente = new javax.swing.JMenu();
        menCadastrarCliente = new javax.swing.JMenuItem();
        menListarCliente = new javax.swing.JMenuItem();
        menProduto = new javax.swing.JMenu();
        menCadastrarProduto = new javax.swing.JMenuItem();
        menListarProduto = new javax.swing.JMenuItem();
        menProdutosFalta = new javax.swing.JMenuItem();
        menPainelColorido = new javax.swing.JMenu();
        menPainelRosa = new javax.swing.JMenuItem();
        menPainelAmarelo = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema para gestão de loja");
        setSize(new java.awt.Dimension(800, 500));

        painelPrincipal.setLayout(new java.awt.CardLayout());

        menCliente.setText("Cliente");

        menCadastrarCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, 0));
        menCadastrarCliente.setText("Cadastrar cliente");
        menCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menCadastrarClienteActionPerformed(evt);
            }
        });
        menCliente.add(menCadastrarCliente);

        menListarCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F7, 0));
        menListarCliente.setText("Listar clientes");
        menListarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menListarClienteActionPerformed(evt);
            }
        });
        menCliente.add(menListarCliente);

        barraDeMenu.add(menCliente);

        menProduto.setText("Produto");

        menCadastrarProduto.setText("Cadastrar produto");
        menProduto.add(menCadastrarProduto);

        menListarProduto.setText("Listar produtos");
        menProduto.add(menListarProduto);

        menProdutosFalta.setText("Produtos em falta");
        menProduto.add(menProdutosFalta);

        barraDeMenu.add(menProduto);

        menPainelColorido.setText("Paineis Coloridos");

        menPainelRosa.setText("Painel Rosa");
        menPainelRosa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menPainelRosaActionPerformed(evt);
            }
        });
        menPainelColorido.add(menPainelRosa);

        menPainelAmarelo.setText("Painel Amarelo");
        menPainelAmarelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menPainelAmareloActionPerformed(evt);
            }
        });
        menPainelColorido.add(menPainelAmarelo);

        barraDeMenu.add(menPainelColorido);

        setJMenuBar(barraDeMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menCadastrarClienteActionPerformed
        CardLayout cl = (CardLayout) painelPrincipal.getLayout();
        cl.show(painelPrincipal, "cadastroCliente");
    }//GEN-LAST:event_menCadastrarClienteActionPerformed

    private void menListarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menListarClienteActionPerformed
        ListagemCliente lc = new ListagemCliente(); 
        painelPrincipal.add(lc, "listaClientes");
        
        CardLayout cl = (CardLayout) painelPrincipal.getLayout();
        cl.show(painelPrincipal, "listaClientes");
    }//GEN-LAST:event_menListarClienteActionPerformed

    private void menPainelRosaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menPainelRosaActionPerformed
        CardLayout cl = (CardLayout) painelPrincipal.getLayout();
        cl.show(painelPrincipal, "painelRosa");
    }//GEN-LAST:event_menPainelRosaActionPerformed

    private void menPainelAmareloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menPainelAmareloActionPerformed
        CardLayout cl = (CardLayout) painelPrincipal.getLayout();
        cl.show(painelPrincipal, "painelAmarelo");// TODO add your handling code here:
    }//GEN-LAST:event_menPainelAmareloActionPerformed

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
            java.util.logging.Logger.getLogger(SisLojFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SisLojFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SisLojFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SisLojFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SisLojFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraDeMenu;
    private javax.swing.JMenuItem menCadastrarCliente;
    private javax.swing.JMenuItem menCadastrarProduto;
    private javax.swing.JMenu menCliente;
    private javax.swing.JMenuItem menListarCliente;
    private javax.swing.JMenuItem menListarProduto;
    private javax.swing.JMenuItem menPainelAmarelo;
    private javax.swing.JMenu menPainelColorido;
    private javax.swing.JMenuItem menPainelRosa;
    private javax.swing.JMenu menProduto;
    private javax.swing.JMenuItem menProdutosFalta;
    private javax.swing.JPanel painelPrincipal;
    // End of variables declaration//GEN-END:variables
}
