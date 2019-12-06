/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gc.view;

import br.com.gc.control.Utilitarios;
import br.com.gc.dao.MoradorDAO;
import br.com.gc.dao.UsuarioDAO;
import br.com.gc.model.Morador;
import br.com.gc.model.Usuario;
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
public class FormCadastroUsuario extends javax.swing.JFrame {

    Utilitarios utilitarios = new Utilitarios();

    public void listar() {
        UsuarioDAO usuario = new UsuarioDAO();
        List<Usuario> lista = usuario.listarUsuarios();
        DefaultTableModel dados = (DefaultTableModel)tblTodosUsuarios.getModel();
        dados.setNumRows(0);
        for(Usuario u: lista){
             dados.addRow(new Object[]{
            u.getNomeCompleto(),
            u.getNomeDeUsuario()
        });
        }
    }

    /**
     * Creates new form FormCadastroMorador
     */
    public FormCadastroUsuario() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnSimENao = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        painelAbas = new javax.swing.JTabbedPane();
        panelCadastro = new javax.swing.JPanel();
        txtNomeCompletoUsuario = new javax.swing.JTextField();
        txtNomeDeUsuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        panelPagamento = new javax.swing.JPanel();
        labelPagamento = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        panelPesquisa = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTodosUsuarios = new javax.swing.JTable();
        btnExcluirUsuario = new javax.swing.JButton();
        btnNovoUsuario = new javax.swing.JButton();
        btnAlterarUsuario = new javax.swing.JButton();
        btnSalvarUsuario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Morador");
        setMinimumSize(new java.awt.Dimension(619, 359));
        setResizable(false);
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

        txtNomeCompletoUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtNomeDeUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Nome Completo:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Nome de Usuário:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Senha:");

        panelPagamento.setForeground(new java.awt.Color(255, 255, 255));
        panelPagamento.setLayout(null);

        labelPagamento.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelPagamento.setForeground(new java.awt.Color(255, 255, 255));
        panelPagamento.add(labelPagamento);
        labelPagamento.setBounds(120, 10, 350, 20);

        txtSenha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout panelCadastroLayout = new javax.swing.GroupLayout(panelCadastro);
        panelCadastro.setLayout(panelCadastroLayout);
        panelCadastroLayout.setHorizontalGroup(
            panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCadastroLayout.createSequentialGroup()
                .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCadastroLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNomeCompletoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCadastroLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNomeDeUsuario)
                            .addComponent(txtSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(panelPagamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelCadastroLayout.setVerticalGroup(
            panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCadastroLayout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeCompletoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNomeDeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(panelPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        painelAbas.addTab("Cadastro", panelCadastro);

        tblTodosUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome Completo", "Nome de Usuário"
            }
        ));
        tblTodosUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTodosUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblTodosUsuarios);

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

        btnExcluirUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnExcluirUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/gc/images/excluir.png"))); // NOI18N
        btnExcluirUsuario.setText("Excluir");
        btnExcluirUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirUsuarioActionPerformed(evt);
            }
        });

        btnNovoUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnNovoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/gc/images/novo.png"))); // NOI18N
        btnNovoUsuario.setText("Novo...");
        btnNovoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoUsuarioActionPerformed(evt);
            }
        });

        btnAlterarUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAlterarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/gc/images/alterar.png"))); // NOI18N
        btnAlterarUsuario.setText("Alterar");
        btnAlterarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarUsuarioActionPerformed(evt);
            }
        });

        btnSalvarUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSalvarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/gc/images/salvar.png"))); // NOI18N
        btnSalvarUsuario.setText("Salvar");
        btnSalvarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarUsuarioActionPerformed(evt);
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
                    .addComponent(painelAbas, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNovoUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterarUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalvarUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluirUsuario)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(painelAbas, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluirUsuario)
                    .addComponent(btnNovoUsuario)
                    .addComponent(btnAlterarUsuario)
                    .addComponent(btnSalvarUsuario))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarUsuarioActionPerformed
        Usuario usuario = new Usuario();
        usuario.setNomeCompleto(txtNomeCompletoUsuario.getText());
        usuario.setNomeDeUsuario(txtNomeDeUsuario.getText());
        usuario.setSenha(txtSenha.getText());
       
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        usuarioDAO.cadastrarUsuario(usuario);
    }//GEN-LAST:event_btnSalvarUsuarioActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        listar();
    }//GEN-LAST:event_formWindowActivated

    private void tblTodosUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTodosUsuariosMouseClicked
        painelAbas.setSelectedIndex(0);
        txtNomeCompletoUsuario.setText(tblTodosUsuarios.getValueAt(tblTodosUsuarios.getSelectedRow(), 0).toString());
       txtNomeDeUsuario.setText(tblTodosUsuarios.getValueAt(tblTodosUsuarios.getSelectedRow(), 1).toString());
    }//GEN-LAST:event_tblTodosUsuariosMouseClicked

    private void btnAlterarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarUsuarioActionPerformed
        Usuario usuario = new Usuario();
        usuario.setNomeCompleto(txtNomeCompletoUsuario.getText());
        usuario.setNomeDeUsuario(txtNomeDeUsuario.getText());
        usuario.setSenha(txtSenha.getText());
        
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        usuarioDAO.alterarUsuario(usuario);

        utilitarios.LimpaTela(panelCadastro);
    }//GEN-LAST:event_btnAlterarUsuarioActionPerformed

    private void btnExcluirUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirUsuarioActionPerformed
        int escolha = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja excluir este morador?");
        if (escolha == 0) {
            Usuario usuario = new Usuario();
            usuario.setNomeDeUsuario(txtNomeDeUsuario.getText());;

            UsuarioDAO usuarioDAO = new UsuarioDAO();
            usuarioDAO.excluirUsuario(usuario);

            utilitarios.LimpaTela(panelCadastro);
        } else {
            JOptionPane.showMessageDialog(this, "Exclusão Cancelada!");
        }
    }//GEN-LAST:event_btnExcluirUsuarioActionPerformed

    private void btnNovoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoUsuarioActionPerformed
        utilitarios.LimpaTela(panelCadastro);
    }//GEN-LAST:event_btnNovoUsuarioActionPerformed


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
            java.util.logging.Logger.getLogger(FormCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCadastroUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup BtnSimENao;
    private javax.swing.JButton btnAlterarUsuario;
    private javax.swing.JButton btnExcluirUsuario;
    private javax.swing.JButton btnNovoUsuario;
    private javax.swing.JButton btnSalvarUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelPagamento;
    private javax.swing.JTabbedPane painelAbas;
    private javax.swing.JPanel panelCadastro;
    private javax.swing.JPanel panelPagamento;
    private javax.swing.JPanel panelPesquisa;
    private javax.swing.JTable tblTodosUsuarios;
    private javax.swing.JTextField txtNomeCompletoUsuario;
    private javax.swing.JTextField txtNomeDeUsuario;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
