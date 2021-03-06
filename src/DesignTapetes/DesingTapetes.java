/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesignTapetes;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Cassiano
 */
public class DesingTapetes extends javax.swing.JFrame {

    /**
     * Creates new form DesingTapetes
     */
    
    private Cliente cliente;
    private ModeloTabelaCliente modeloTabelaCliente;
    private ModeloTabelaPedido modeloTabelaPedido;
    
    public DesingTapetes() {
        modeloTabelaCliente = new ModeloTabelaCliente();
        modeloTabelaPedido = new ModeloTabelaPedido();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        campoSobrenome = new javax.swing.JTextField();
        campoNome = new javax.swing.JTextField();
        campoCpf = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        botaoExcluir = new javax.swing.JButton();
        botaoListar = new javax.swing.JButton();
        botaoAtualizar = new javax.swing.JButton();
        botaoIncluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        campoPcpf = new javax.swing.JTextField();
        campoPnome = new javax.swing.JTextField();
        campoPsobrenome = new javax.swing.JTextField();
        botaoPesquisar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        comboBoxForma = new javax.swing.JComboBox();
        comboBoxMaterial = new javax.swing.JComboBox();
        campoAltura = new javax.swing.JTextField();
        campoLargura = new javax.swing.JTextField();
        campoTamanho = new javax.swing.JTextField();
        botaoIncluirItem = new javax.swing.JButton();
        botaoAlterarItem = new javax.swing.JButton();
        botaoExcluirItem = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        campoRaio = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        comboboxmaterial = new javax.swing.JComboBox();
        jLabel17 = new javax.swing.JLabel();
        campoPrecom2 = new javax.swing.JTextField();
        botaoAtualizarMaterial = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nome:");

        jLabel2.setText("Sobrenome:");

        jLabel3.setText("CPF:");

        botaoExcluir.setText("Excluir");
        botaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirActionPerformed(evt);
            }
        });

        botaoListar.setText("Listar");
        botaoListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoListarActionPerformed(evt);
            }
        });

        botaoAtualizar.setText("Atualizar");
        botaoAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAtualizarActionPerformed(evt);
            }
        });

        botaoIncluir.setText("Incluir");
        botaoIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoIncluirActionPerformed(evt);
            }
        });

        jTable1.setModel(modeloTabelaCliente);
        jTable1.setColumnSelectionAllowed(true);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 801, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botaoIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoAtualizar)
                        .addGap(18, 18, 18)
                        .addComponent(botaoListar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoSobrenome)
                            .addComponent(campoNome)
                            .addComponent(campoCpf, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campoSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campoCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoExcluir)
                    .addComponent(botaoListar)
                    .addComponent(botaoIncluir)
                    .addComponent(botaoAtualizar))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(297, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cliente", jPanel1);

        jLabel5.setText("CPF:");

        jLabel6.setText("Nome:");

        jLabel7.setText("Sobrenome:");

        botaoPesquisar.setText("Pesquisar");
        botaoPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPesquisarActionPerformed(evt);
            }
        });

        jLabel8.setText("Forma do Tapete:");

        jLabel9.setText("Material:");

        jLabel10.setText("Altura(m):");

        jLabel11.setText("Largura(m):");

        jLabel12.setText("Tamanho(m²):");

        comboBoxForma.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Circulo", "Retangulo", "Triangulo" }));

        comboBoxMaterial.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Comum", "Luxo", "Premium" }));

        botaoIncluirItem.setText("Incluir Item de Pedido");
        botaoIncluirItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoIncluirItemActionPerformed(evt);
            }
        });

        botaoAlterarItem.setText("Alterar Item de Pedido");
        botaoAlterarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAlterarItemActionPerformed(evt);
            }
        });

        botaoExcluirItem.setText("Excluir Item de Pedido");
        botaoExcluirItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirItemActionPerformed(evt);
            }
        });

        jTable2.setModel(modeloTabelaPedido);
        jTable2.setColumnSelectionAllowed(true);
        jScrollPane2.setViewportView(jTable2);
        jTable2.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        jLabel13.setText("Total do Pedido:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("Cliente");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Item do Pedido");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setText("Resumo Pedido");

        jLabel18.setText("Raio:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator2)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel18))
                                        .addGap(47, 47, 47)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(campoTamanho, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                                            .addComponent(campoRaio)
                                            .addComponent(campoLargura, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                                            .addComponent(comboBoxMaterial, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(campoAltura, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                                            .addComponent(comboBoxForma, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addGap(18, 18, 18)
                                                .addComponent(campoPsobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel5)
                                                    .addComponent(jLabel6))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(campoPnome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(campoPcpf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(32, 32, 32)
                                        .addComponent(botaoPesquisar)))
                                .addGap(0, 243, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(359, 359, 359)
                                .addComponent(jLabel14))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(365, 365, 365)
                                .addComponent(jLabel4))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(347, 347, 347)
                                .addComponent(jLabel15))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(316, 316, 316)
                                .addComponent(botaoAlterarItem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoExcluirItem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoIncluirItem)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(campoPcpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoPesquisar))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(campoPnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(campoPsobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(comboBoxForma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(comboBoxMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(campoAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(campoLargura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoRaio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoAlterarItem)
                    .addComponent(botaoExcluirItem)
                    .addComponent(botaoIncluirItem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addContainerGap(138, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Pedido", jPanel2);

        jLabel16.setText("Material:");

        comboboxmaterial.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Comum", "Luxo", "Premium" }));

        jLabel17.setText("Preço do m2:");

        botaoAtualizarMaterial.setText("Atualizar");
        botaoAtualizarMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAtualizarMaterialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botaoAtualizarMaterial)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comboboxmaterial, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(campoPrecom2, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE))))
                .addContainerGap(409, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(comboboxmaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(campoPrecom2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(botaoAtualizarMaterial)
                .addContainerGap(668, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Preço Material", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 899, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisarActionPerformed
        // TODO add your handling code here:
        try{
        ClienteDAO dao = new ClienteDAO();
        cliente = dao.getCliente(campoPcpf.getText());
        campoPnome.setText(cliente.getNome());
        campoPsobrenome.setText(cliente.getSobrenome());
        
        Pedido pedido = dao.getPedidoDoCliente(cliente);
        List<Tapete> tapetes = pedido.getTapetes();
        
        modeloTabelaPedido.setListaTapete(tapetes);
        } catch(RuntimeException ex){
            JOptionPane.showMessageDialog(null,"Cliente não cadastrado");
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Nenhum pedido cadastrado");
        } 
    }//GEN-LAST:event_botaoPesquisarActionPerformed

    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirActionPerformed
        // TODO add your handling code here:
        try {
            cliente = new Cliente(campoNome.getText(), campoSobrenome.getText(), campoCpf.getText());
            ClienteDAO cliDAO = new ClienteDAO();
            cliDAO.excluirCliente(cliente);
            
            JOptionPane.showMessageDialog(null,"Cliente excluido com sucesso!");
            
            campoNome.setText("");
            campoSobrenome.setText("");
            campoCpf.setText("");
            campoCpf.setEnabled(true);
        } catch (SQLException ex) {
            Logger.getLogger(DesingTapetes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botaoExcluirActionPerformed

    private void botaoIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoIncluirActionPerformed
        // TODO add your handling code here:
        cliente = new Cliente(campoNome.getText(), campoSobrenome.getText(), campoCpf.getText());
        ClienteDAO cliDAO = new ClienteDAO();
        cliDAO.cadastraCliente(cliente);
        
        JOptionPane.showMessageDialog(null,"Cliente cadastrado com sucesso!");
        
        campoNome.setText("");
        campoSobrenome.setText("");
        campoCpf.setText("");
    }//GEN-LAST:event_botaoIncluirActionPerformed

    private void botaoAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAtualizarActionPerformed
        // TODO add your handling code here:
        try {
            cliente = new Cliente(campoNome.getText(), campoSobrenome.getText(), campoCpf.getText());
            ClienteDAO cliDAO = new ClienteDAO();
            cliDAO.atualizaCliente(cliente);
            
            JOptionPane.showMessageDialog(null,"Cliente atualizado com sucesso!");
            
            campoNome.setText("");
            campoSobrenome.setText("");
            campoCpf.setText("");
            campoCpf.setEnabled(true);
        } catch (SQLException ex) {
            Logger.getLogger(DesingTapetes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botaoAtualizarActionPerformed

    private void botaoListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoListarActionPerformed
        // TODO add your handling code here:
        ClienteDAO dao = new ClienteDAO();
        List<Cliente> clientes = dao.listaClientes();
        
        modeloTabelaCliente.setListaCliente(clientes);
        
    }//GEN-LAST:event_botaoListarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int linhaSelecionada = jTable1.getSelectedRow();
        Cliente clientetb = modeloTabelaCliente.getCliente(linhaSelecionada);
        campoNome.setText(clientetb.getNome());
        campoSobrenome.setText(clientetb.getSobrenome());
        campoCpf.setText(clientetb.getCpf());
        campoCpf.setEnabled(false);
    }//GEN-LAST:event_jTable1MouseClicked

    private void botaoAtualizarMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAtualizarMaterialActionPerformed
        
        double preco;
        preco=Double.parseDouble(campoPrecom2.getText());
        
        String combomaterial;
        combomaterial=(String)comboboxmaterial.getSelectedItem();
        
        Material m=new Material(preco, combomaterial);
        MaterialDAO md=new MaterialDAO();
        md.atualizaMaterial(m);
        
        JOptionPane.showMessageDialog(null,"Material atualizado.");
    }//GEN-LAST:event_botaoAtualizarMaterialActionPerformed

    private void botaoAlterarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAlterarItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoAlterarItemActionPerformed

    private void botaoExcluirItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoExcluirItemActionPerformed

    private void botaoIncluirItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoIncluirItemActionPerformed
        // TODO add your handling code here:
        Tapete tapete = new Tapete();
        double area;
        if(comboBoxForma.getSelectedItem().equals("Triangulo")){
            double base = Double.parseDouble(campoLargura.getText());
            double altura = Double.parseDouble(campoAltura.getText());
            Triangulo triangulo = new Triangulo(base, altura, "Triangulo");
            tapete.setForma(triangulo);
            area = triangulo.area();
        } else if(comboBoxForma.getSelectedItem().equals("Retangulo")){
            double ladoA = Double.parseDouble(campoLargura.getText());
            double ladoB = Double.parseDouble(campoAltura.getText());
            Retangulo retangulo = new Retangulo(ladoA, ladoB, "Retangulo");
            tapete.setForma(retangulo);
            area = retangulo.area();
        } else if(comboBoxForma.getSelectedItem().equals("Circulo")){
            double raio = Double.parseDouble(campoRaio.getText());
            Circulo circulo = new Circulo(raio, "Circulo");
            tapete.setForma(circulo);
            area = circulo.area();
        }    
        String nomeMaterial = (String)comboBoxMaterial.getSelectedItem();
        MaterialDAO dao = new MaterialDAO();
        Material material = dao.getMaterial(nomeMaterial);
        tapete.setMaterial(material);
        double preco = (material.getPrecoMetroQuadrado()*tapete.getForma().area());
        tapete.setPreco(preco);
        List<Tapete> tapetes = new ArrayList();
        Pedido pedido = new Pedido(tapetes);
        tapetes.add(tapete);
        ClienteDAO clidao = new ClienteDAO();
        clidao.adicionaPedidoAoCliente(pedido, cliente.getCpf());
        pedido.adicionaTapeteNoPedido(tapete);    
    }//GEN-LAST:event_botaoIncluirItemActionPerformed

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
            java.util.logging.Logger.getLogger(DesingTapetes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DesingTapetes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DesingTapetes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DesingTapetes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DesingTapetes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAlterarItem;
    private javax.swing.JButton botaoAtualizar;
    private javax.swing.JButton botaoAtualizarMaterial;
    private javax.swing.JButton botaoExcluir;
    private javax.swing.JButton botaoExcluirItem;
    private javax.swing.JButton botaoIncluir;
    private javax.swing.JButton botaoIncluirItem;
    private javax.swing.JButton botaoListar;
    private javax.swing.JButton botaoPesquisar;
    private javax.swing.JTextField campoAltura;
    private javax.swing.JTextField campoCpf;
    private javax.swing.JTextField campoLargura;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoPcpf;
    private javax.swing.JTextField campoPnome;
    private javax.swing.JTextField campoPrecom2;
    private javax.swing.JTextField campoPsobrenome;
    private javax.swing.JTextField campoRaio;
    private javax.swing.JTextField campoSobrenome;
    private javax.swing.JTextField campoTamanho;
    private javax.swing.JComboBox comboBoxForma;
    private javax.swing.JComboBox comboBoxMaterial;
    private javax.swing.JComboBox comboboxmaterial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField10;
    // End of variables declaration//GEN-END:variables
}
