/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gc.dao;

import br.com.gc.jdbc.ConnectionFactory;
import br.com.gc.model.Morador;
import br.com.gc.model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author maico
 */
public class UsuarioDAO {

    private Connection conexao;

    public UsuarioDAO() {
        this.conexao = new ConnectionFactory().getConnection();
    }

    public void cadastrarUsuario(Usuario usuario) {
        try {
            String sql = "insert into cadastro_usuario (Nome_Usuario,Nome,Senha)"
                    + " values (?,?,?)";

            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, usuario.getNomeDeUsuario());
            stmt.setString(2, usuario.getNomeCompleto());
            stmt.setString(3, usuario.getSenha());

            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Usuario cadastrado com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e);
        }
    }

    public void alterarUsuario(Usuario usuario) {
        try {
            String sql = "update cadastro_usuario set Nome=? ,Senha=? ,Valor_Pagamento= ? where Nome_Usuario=?";

            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, usuario.getNomeCompleto());
            stmt.setString(2, usuario.getSenha());

            stmt.setString(3, usuario.getNomeDeUsuario());

            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Usuario alterado com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e);
        }
    }

    public void excluirUsuario(Usuario usuario) {
        try {
            String sql = "delete from cadastro_usuario where Nome_Usuario=?";

            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, usuario.getNomeDeUsuario());
            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Usuario Excluído com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e);
        }
    }

    public List<Usuario> listarUsuarios() {
        try {
            List<Usuario> lista = new ArrayList<>();
            String sql = "select * from cadastro_usuario";
            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setNomeDeUsuario(rs.getString("Nome_Usuario"));
                usuario.setNomeCompleto(rs.getString("Nome"));
                usuario.setSenha(rs.getString("Senha"));

                lista.add(usuario);
            }

            return lista;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e);
            return null;
        }
    }
}
