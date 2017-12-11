/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_estoque.telas;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import poo_estoque.objetos.Carro;
import poo_estoque.servicos.ImplServicoVeiculos;

/**
 *
 * @author Josué
 */
public class CadastrarCarros extends javax.swing.JFrame {

    /**
     * Creates new form JInternalCadastroProduto
     */
    public CadastrarCarros() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelInfoProduto = new javax.swing.JPanel();
        labelPreco = new javax.swing.JLabel();
        labelQnt = new javax.swing.JLabel();
        labelTamanho = new javax.swing.JLabel();
        labelCategoria = new javax.swing.JLabel();
        labelCor = new javax.swing.JLabel();
        jFormattedTextFieldQnt = new javax.swing.JFormattedTextField();
        jFormattedTextFieldAno = new javax.swing.JFormattedTextField();
        jFormattedTextFieldPreco = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldMarca = new javax.swing.JTextField();
        jTextFieldModelo = new javax.swing.JTextField();
        jTextFieldCor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jFormattedTextFieldPortas = new javax.swing.JFormattedTextField();
        buttonSair = new javax.swing.JButton();
        buttonCadastrar = new javax.swing.JButton();

        setTitle("Cadastro de Produto");
        setMinimumSize(new java.awt.Dimension(120, 34));

        panelInfoProduto.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createTitledBorder("Informações do Produto")));

        labelPreco.setText("Preço");

        labelQnt.setText("Estoque");

        labelTamanho.setText("Ano");

        labelCategoria.setText("Marca");

        labelCor.setText("Cor");

        jFormattedTextFieldQnt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));

        jFormattedTextFieldAno.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("####"))));

        jFormattedTextFieldPreco.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));

        jLabel1.setText("Modelo");

        jLabel2.setText("nPortas");

        jFormattedTextFieldPortas.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##"))));

        javax.swing.GroupLayout panelInfoProdutoLayout = new javax.swing.GroupLayout(panelInfoProduto);
        panelInfoProduto.setLayout(panelInfoProdutoLayout);
        panelInfoProdutoLayout.setHorizontalGroup(
            panelInfoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfoProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInfoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelInfoProdutoLayout.createSequentialGroup()
                        .addComponent(labelCor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(29, 29, 29))
                    .addGroup(panelInfoProdutoLayout.createSequentialGroup()
                        .addGroup(panelInfoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextFieldCor)
                            .addComponent(jTextFieldMarca, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                            .addComponent(labelCategoria, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addComponent(jFormattedTextFieldPortas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)))
                .addGroup(panelInfoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldModelo)
                    .addGroup(panelInfoProdutoLayout.createSequentialGroup()
                        .addGroup(panelInfoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jFormattedTextFieldQnt, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelQnt, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(panelInfoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInfoProdutoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addGroup(panelInfoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelPreco)
                            .addComponent(jFormattedTextFieldPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelInfoProdutoLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(panelInfoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelTamanho)
                            .addComponent(jFormattedTextFieldAno, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelInfoProdutoLayout.setVerticalGroup(
            panelInfoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfoProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInfoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelInfoProdutoLayout.createSequentialGroup()
                        .addGroup(panelInfoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelCategoria)
                            .addComponent(jLabel1)
                            .addComponent(labelTamanho))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelInfoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jFormattedTextFieldAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelInfoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCor)
                    .addComponent(labelQnt)
                    .addComponent(labelPreco)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelInfoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldQnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldPortas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        buttonSair.setText("Sair");
        buttonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSairActionPerformed(evt);
            }
        });

        buttonCadastrar.setText("Cadastrar");
        buttonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(buttonCadastrar)
                .addGap(18, 18, 18)
                .addComponent(buttonSair)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelInfoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelInfoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonSair)
                    .addComponent(buttonCadastrar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelInfoProduto.getAccessibleContext().setAccessibleName("Informações do Carro");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_buttonSairActionPerformed

    private void buttonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCadastrarActionPerformed

        Carro produto = new Carro();
        ImplServicoVeiculos servico = new ImplServicoVeiculos();

        produto.setMarca((String) jTextFieldMarca.getText());
        produto.setModelo((String) jTextFieldModelo.getText());
        produto.setCor((String) jTextFieldCor.getText());

        //
        
        int portas = 0;
        
                try {
            Number num = (Number) jFormattedTextFieldPortas.getValue();
            portas = num.intValue();
        } catch (Exception e) {

        }
        produto.setN_portas(portas);
        
        int ano = 0;

        try {
            Number num = (Number) jFormattedTextFieldAno.getValue();
            ano = num.intValue();
        } catch (Exception e) {

        }
        produto.setAno(ano);

        int quantidade = 0;
        try {
            Number num = (Number) jFormattedTextFieldQnt.getValue();
            quantidade = num.intValue();
        } catch (Exception e) {

        }
        produto.setQtd(quantidade);

        //
        Double preco = null;
        try {
            Number num = (Number) jFormattedTextFieldPreco.getValue();
            preco = num.doubleValue();
        } catch (Exception e) {

        }
        produto.setPreco(preco);

        //
        try {
            //ServicoCarros.cadastrarProduto(produto);
            servico.Inserir(produto, 2);
        } catch (Exception e) {

            JOptionPane.showMessageDialog(rootPane, e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        JOptionPane.showMessageDialog(rootPane, "Carro inserido com sucesso",
                "Cadastro efetuado", JOptionPane.INFORMATION_MESSAGE);

        jTextFieldMarca.setText("");
        jTextFieldModelo.setText("");
        jTextFieldCor.setText("");
        jFormattedTextFieldQnt.setText("");
        jFormattedTextFieldQnt.setValue(null);
        jFormattedTextFieldAno.setText("");
        jFormattedTextFieldAno.setValue(null);
        jFormattedTextFieldPreco.setText("");
        jFormattedTextFieldPreco.setValue(null);
        jFormattedTextFieldPortas.setValue(null);

    }//GEN-LAST:event_buttonCadastrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCadastrar;
    private javax.swing.JButton buttonSair;
    private javax.swing.JFormattedTextField jFormattedTextFieldAno;
    private javax.swing.JFormattedTextField jFormattedTextFieldPortas;
    private javax.swing.JFormattedTextField jFormattedTextFieldPreco;
    private javax.swing.JFormattedTextField jFormattedTextFieldQnt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextFieldCor;
    private javax.swing.JTextField jTextFieldMarca;
    private javax.swing.JTextField jTextFieldModelo;
    private javax.swing.JLabel labelCategoria;
    private javax.swing.JLabel labelCor;
    private javax.swing.JLabel labelPreco;
    private javax.swing.JLabel labelQnt;
    private javax.swing.JLabel labelTamanho;
    private javax.swing.JPanel panelInfoProduto;
    // End of variables declaration//GEN-END:variables
}