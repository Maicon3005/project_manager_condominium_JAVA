/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gc.view;

import br.com.gc.control.TestaData;
import br.com.gc.control.Utilitarios;
import br.com.gc.dao.MoradorDAO;
import br.com.gc.model.Morador;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author maico
 */
public class FormCadastroMorador extends javax.swing.JFrame {

    private boolean situacaoPagamento;
    Utilitarios utilitarios = new Utilitarios();
    TestaData testaData = new TestaData();

    public void listar() {
        MoradorDAO morador = new MoradorDAO();
        List<Morador> lista = morador.listarClientes();
        DefaultTableModel dados = (DefaultTableModel) tblTodosMoradores.getModel();
        dados.setNumRows(0);
        for (Morador m : lista) {
            dados.addRow(new Object[]{
                m.getId(),
                m.getNumeroApartamento(),
                m.getNomeMorador(),
                m.getValorCondominio(),
                m.getDataVencimento()
            });
        }

    }

    /**
     * Creates new form FormCadastroMorador
     */
    public FormCadastroMorador() {
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

        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        painelAbas = new javax.swing.JTabbedPane();
        panelCadastro = new javax.swing.JPanel();
        txtNomeMorador = new javax.swing.JTextField();
        btnPesquisarApartamento = new javax.swing.JButton();
        btnPesquisarMorador = new javax.swing.JButton();
        txtNumeroApartamento = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtValorCondominio = new javax.swing.JTextField();
        txtDataVencimento = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        panelPagamento = new javax.swing.JPanel();
        labelPagamento = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        panelPesquisa = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTodosMoradores = new javax.swing.JTable();
        btnExcluirMorador = new javax.swing.JButton();
        btnExcluirTudo = new javax.swing.JButton();
        btnNovoMorador = new javax.swing.JButton();
        btnAlterarMorador = new javax.swing.JButton();
        btnSalvarMorador = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Morador");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 102, 0));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Cadastro de Morador");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel8)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        txtNomeMorador.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnPesquisarApartamento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnPesquisarApartamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/gc/images/pesquisar.png"))); // NOI18N
        btnPesquisarApartamento.setText("Pesquisar");

        btnPesquisarMorador.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnPesquisarMorador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/gc/images/pesquisar.png"))); // NOI18N
        btnPesquisarMorador.setText("Pesquisar");

        txtNumeroApartamento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Nome do Morador:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Data de Vencimento:");

        txtValorCondominio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        try {
            txtDataVencimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataVencimento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDataVencimento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDataVencimentoKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Nº do Apartamento:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Valor de Condomínio:");

        panelPagamento.setForeground(new java.awt.Color(255, 255, 255));
        panelPagamento.setLayout(null);

        labelPagamento.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelPagamento.setForeground(new java.awt.Color(255, 255, 255));
        panelPagamento.add(labelPagamento);
        labelPagamento.setBounds(120, 10, 350, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Código Morador:");

        txtId.setEditable(false);
        txtId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout panelCadastroLayout = new javax.swing.GroupLayout(panelCadastro);
        panelCadastro.setLayout(panelCadastroLayout);
        panelCadastroLayout.setHorizontalGroup(
            panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCadastroLayout.createSequentialGroup()
                .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCadastroLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel4)
                        .addGap(10, 10, 10)
                        .addComponent(txtValorCondominio, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCadastroLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2)
                        .addGap(11, 11, 11)
                        .addComponent(txtDataVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCadastroLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel3)
                        .addGap(10, 10, 10)
                        .addComponent(txtNumeroApartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btnPesquisarApartamento))
                    .addGroup(panelCadastroLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5))
                        .addGap(10, 10, 10)
                        .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelCadastroLayout.createSequentialGroup()
                                .addComponent(txtNomeMorador, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(btnPesquisarMorador)))))
                .addContainerGap(15, Short.MAX_VALUE))
            .addComponent(panelPagamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelCadastroLayout.setVerticalGroup(
            panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCadastroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCadastroLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel1))
                    .addGroup(panelCadastroLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtNomeMorador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnPesquisarMorador))
                .addGap(6, 6, 6)
                .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCadastroLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel3))
                    .addGroup(panelCadastroLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtNumeroApartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnPesquisarApartamento))
                .addGap(6, 6, 6)
                .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCadastroLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel4))
                    .addComponent(txtValorCondominio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDataVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        painelAbas.addTab("Cadastro", panelCadastro);

        tblTodosMoradores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nº Apartamento", "Nome do Morador", "Valor", "Validade", "Status Pagamento"
            }
        ));
        tblTodosMoradores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTodosMoradoresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblTodosMoradores);
        if (tblTodosMoradores.getColumnModel().getColumnCount() > 0) {
            tblTodosMoradores.getColumnModel().getColumn(3).setResizable(false);
            tblTodosMoradores.getColumnModel().getColumn(5).setResizable(false);
        }

        javax.swing.GroupLayout panelPesquisaLayout = new javax.swing.GroupLayout(panelPesquisa);
        panelPesquisa.setLayout(panelPesquisaLayout);
        panelPesquisaLayout.setHorizontalGroup(
            panelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPesquisaLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        panelPesquisaLayout.setVerticalGroup(
            panelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPesquisaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(171, 171, 171))
        );

        painelAbas.addTab("Pesquisa", panelPesquisa);

        btnExcluirMorador.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnExcluirMorador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/gc/images/excluir.png"))); // NOI18N
        btnExcluirMorador.setText("Excluir");
        btnExcluirMorador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirMoradorActionPerformed(evt);
            }
        });

        btnExcluirTudo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnExcluirTudo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/gc/images/excluir_tudo.png"))); // NOI18N
        btnExcluirTudo.setText("Excluir Tudo");
        btnExcluirTudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirTudoActionPerformed(evt);
            }
        });

        btnNovoMorador.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnNovoMorador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/gc/images/novo.png"))); // NOI18N
        btnNovoMorador.setText("Novo...");
        btnNovoMorador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoMoradorActionPerformed(evt);
            }
        });

        btnAlterarMorador.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAlterarMorador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/gc/images/alterar.png"))); // NOI18N
        btnAlterarMorador.setText("Alterar");
        btnAlterarMorador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarMoradorActionPerformed(evt);
            }
        });

        btnSalvarMorador.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSalvarMorador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/gc/images/salvar.png"))); // NOI18N
        btnSalvarMorador.setText("Salvar");
        btnSalvarMorador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarMoradorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(painelAbas, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNovoMorador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterarMorador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalvarMorador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExcluirMorador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluirTudo)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(painelAbas, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluirMorador)
                    .addComponent(btnExcluirTudo)
                    .addComponent(btnNovoMorador)
                    .addComponent(btnAlterarMorador)
                    .addComponent(btnSalvarMorador))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarMoradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarMoradorActionPerformed

        Morador morador = new Morador();
        morador.setNumeroApartamento(Integer.parseInt(txtNumeroApartamento.getText()));
        morador.setNomeMorador(txtNomeMorador.getText());
        morador.setDataVencimento(txtDataVencimento.getText());
        morador.setSituacaoPagamento(situacaoPagamento);
        morador.setValorCondominio(Double.parseDouble(txtValorCondominio.getText()));
        MoradorDAO moradorDAO = new MoradorDAO();
        moradorDAO.cadastrarMorador(morador);
    }//GEN-LAST:event_btnSalvarMoradorActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        listar();
    }//GEN-LAST:event_formWindowActivated

    private void tblTodosMoradoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTodosMoradoresMouseClicked
        painelAbas.setSelectedIndex(0);
        txtId.setText(tblTodosMoradores.getValueAt(tblTodosMoradores.getSelectedRow(), 0).toString());
        txtNumeroApartamento.setText(tblTodosMoradores.getValueAt(tblTodosMoradores.getSelectedRow(), 1).toString());
        txtNomeMorador.setText(tblTodosMoradores.getValueAt(tblTodosMoradores.getSelectedRow(), 2).toString());
        txtValorCondominio.setText(tblTodosMoradores.getValueAt(tblTodosMoradores.getSelectedRow(), 3).toString());
        txtDataVencimento.setText(tblTodosMoradores.getValueAt(tblTodosMoradores.getSelectedRow(), 4).toString());
    }//GEN-LAST:event_tblTodosMoradoresMouseClicked

    private void txtDataVencimentoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDataVencimentoKeyReleased

    }//GEN-LAST:event_txtDataVencimentoKeyReleased

    private void btnAlterarMoradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarMoradorActionPerformed
        Morador morador = new Morador();
        morador.setId(Integer.parseInt(txtId.getText()));
        morador.setNumeroApartamento(Integer.parseInt(txtNumeroApartamento.getText()));
        morador.setNomeMorador(txtNomeMorador.getText());
        morador.setDataVencimento(txtDataVencimento.getText());
        morador.setSituacaoPagamento(situacaoPagamento);
        morador.setValorCondominio(Double.parseDouble(txtValorCondominio.getText()));
        MoradorDAO moradorDAO = new MoradorDAO();
        moradorDAO.alterarMorador(morador);

        utilitarios.LimpaTela(panelCadastro);
    }//GEN-LAST:event_btnAlterarMoradorActionPerformed

    private void btnExcluirMoradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirMoradorActionPerformed
        int escolha = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja excluir todos os registros de moradores?");
        if (escolha == 0) {
            Morador morador = new Morador();
            morador.setId(Integer.parseInt(txtId.getText()));

            MoradorDAO moradorDao = new MoradorDAO();
            moradorDao.excluirMorador(morador);

            utilitarios.LimpaTela(panelCadastro);
        } else {
            JOptionPane.showMessageDialog(this, "Exclusão Cancelada!");
        }
    }//GEN-LAST:event_btnExcluirMoradorActionPerformed

    private void btnNovoMoradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoMoradorActionPerformed
        utilitarios.LimpaTela(panelCadastro);
    }//GEN-LAST:event_btnNovoMoradorActionPerformed

    private void btnExcluirTudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirTudoActionPerformed
        int escolha = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja excluir todos os registros de moradores?");
        if (escolha == 0) {
            MoradorDAO moradorDao = new MoradorDAO();
            moradorDao.excluirTodosMoradores();
        } else {
            JOptionPane.showMessageDialog(this, "Exclusão Cancelada!");
        }
    }//GEN-LAST:event_btnExcluirTudoActionPerformed

    public void trocaCor(boolean testaData) {
        if (testaData) {
            panelPagamento.setBackground(Color.green);
            labelPagamento.setText("                  Pagamento OK!");
            situacaoPagamento = true;
        } else {
            panelPagamento.setBackground(Color.red);
            labelPagamento.setText("                Pagamento Atrasado!");
            situacaoPagamento = false;
        };
    }

    @SuppressWarnings("empty-statement")

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormCadastroMorador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCadastroMorador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCadastroMorador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCadastroMorador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCadastroMorador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarMorador;
    private javax.swing.JButton btnExcluirMorador;
    private javax.swing.JButton btnExcluirTudo;
    private javax.swing.JButton btnNovoMorador;
    private javax.swing.JButton btnPesquisarApartamento;
    private javax.swing.JButton btnPesquisarMorador;
    private javax.swing.JButton btnSalvarMorador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelPagamento;
    private javax.swing.JTabbedPane painelAbas;
    private javax.swing.JPanel panelCadastro;
    private javax.swing.JPanel panelPagamento;
    private javax.swing.JPanel panelPesquisa;
    private javax.swing.JTable tblTodosMoradores;
    private javax.swing.JFormattedTextField txtDataVencimento;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNomeMorador;
    private javax.swing.JTextField txtNumeroApartamento;
    private javax.swing.JTextField txtValorCondominio;
    // End of variables declaration//GEN-END:variables
}
