/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gc.dao;

import br.com.gc.jdbc.ConnectionFactory;
import br.com.gc.model.Morador;
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
public class PesquisasDAO {

    private Connection conexao;

    public PesquisasDAO() {
        this.conexao = new ConnectionFactory().getConnection();
    }

    public List<Morador> listarMoradoresPorApartamento(int numeroApartamento) {
        try {
            /*String sql = "select * from tb_clientes where nome = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, nome);*/
            
            List<Morador> lista = new ArrayList<>();
            String sql = "select * from Cadastro_Morador where Numero_Condominio = ?";
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, numeroApartamento);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Morador morador = new Morador();
                morador.setId(rs.getInt("ID"));
                morador.setNumeroApartamento(rs.getInt("Numero_Condominio"));
                morador.setNomeMorador(rs.getString("Nome"));
                morador.setSituacaoPagamento(rs.getBoolean("Situacao_Pagamento"));
                morador.setValorCondominio(rs.getDouble("Valor_Pagamento"));

                lista.add(morador);
            }
            
            return lista;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e);
            return null;
        }
    }
    
    public List<Morador> listarMoradoresPorPagamento(boolean situacaoPagamento) {
        try {
            /*String sql = "select * from tb_clientes where nome = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, nome);*/
            
            List<Morador> lista = new ArrayList<>();
            String sql = "select * from Cadastro_Morador where Situacao_Pagamento = ?";
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setBoolean(1, situacaoPagamento);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Morador morador = new Morador();
                morador.setId(rs.getInt("ID"));
                morador.setNumeroApartamento(rs.getInt("Numero_Condominio"));
                morador.setNomeMorador(rs.getString("Nome"));
                morador.setSituacaoPagamento(rs.getBoolean("Situacao_Pagamento"));
                morador.setValorCondominio(rs.getDouble("Valor_Pagamento"));

                lista.add(morador);
            }
            
            return lista;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e);
            return null;
        }
    }
}
