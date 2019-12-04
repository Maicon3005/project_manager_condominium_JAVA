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
public class MoradorDAO {

    private Connection conexao;

    public MoradorDAO() {
        this.conexao = new ConnectionFactory().getConnection();
    }

    public void cadastrarMorador(Morador morador) {
        try {
            String sql = "insert into Cadastro_Morador (Numero_Condominio,Nome,Data_Validade,Situacao_Pagamento,Valor_Pagamento)"
                    + " values (?,?,?,?,?)";

            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, morador.getNumeroApartamento());
            stmt.setString(2, morador.getNomeMorador());
            stmt.setString(3, morador.getDataVencimento());
            stmt.setBoolean(4, morador.isSituacaoPagamento());
            stmt.setDouble(5, morador.getValorCondominio());

            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Morador cadastrado com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e);
        }
    }

    public Morador pesquisarPorApartamento(int numeroApartamento) {
        try {
            //1 passo - criar o sql , organizar e executar.
            String sql = "select * from Cadastro_Morador where Numero_Condominio =?";
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, numeroApartamento);

            ResultSet rs = stmt.executeQuery();
            Morador morador = new Morador();

            if (rs.next()) {
                morador.setId(Integer.parseInt("ID"));
                morador.setNumeroApartamento(Integer.parseInt("Numero_Condominio"));
                morador.setNomeMorador("Nome");
                morador.setDataVencimento("Data_Validade");
                morador.setSituacaoPagamento(Boolean.parseBoolean("Situacao_Pagamento"));
                morador.setValorCondominio(Double.parseDouble("Valor_Pagamento"));
            }

            return morador;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Apartamento não encontrado!");
            return null;
        }
    }

    public void alterarMorador(Morador morador) {
        try {
            String sql = "update Cadastro_Morador set Numero_Condominio=? ,Nome=? ,Data_Validade=? ,Situacao_Pagamento=? ,Valor_Pagamento= ? where ID=?";

            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, morador.getNumeroApartamento());
            stmt.setString(2, morador.getNomeMorador());
            stmt.setString(3, morador.getDataVencimento());
            stmt.setBoolean(4, morador.isSituacaoPagamento());
            stmt.setDouble(5, morador.getValorCondominio());

            stmt.setInt(6, morador.getId());

            stmt.execute();
            stmt.close();

            /*
             Cadastro_Morador (
             ID integer (4) PRIMARY KEY auto_increment NOT NULL,
             Numero_Condominio INTEGER (4) NOT NULL,
             Nome VARCHAR (80) NOT NULL,
             Data_Validade VARCHAR (12) NOT NULL,
             Situacao_Pagamento BOOLEAN NOT NULL,
             Valor_Pagamento FLOAT (5,2) NOT NULL,
             */
            JOptionPane.showMessageDialog(null, "Morador alterado com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e);
        }
    }

    public void excluirMorador(Morador morador) {
        try {
            String sql = "delete from Cadastro_Morador where ID=?";

            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, morador.getId());
            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Morador Excluído com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e);
        }
    }

    public void excluirTodosMoradores() {
        try {
            String sql = "truncate table Cadastro_Morador";

            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Todos os Moradores Excluídos com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e);
        }
    }

    public List<Morador> listarClientes() {
        try {
            List<Morador> lista = new ArrayList<>();
            String sql = "select * from Cadastro_Morador";
            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Morador morador = new Morador();
                morador.setId(rs.getInt("ID"));
                morador.setNumeroApartamento(rs.getInt("Numero_Condominio"));
                morador.setNomeMorador(rs.getString("Nome"));
                morador.setDataVencimento(rs.getString("Data_Validade"));
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
    /* CREATE TABLE Cadastro_Morador (
     Numero_Condominio INTEGER (4) NOT NULL PRIMARY KEY,
     Nome VARCHAR (80) NOT NULL,
     Data_Validade DATE NOT NULL,
     Situacao_Pagamento BOOLEAN,
     Valor_Pagamento FLOAT (5,2),
     fk_Cadastro_Usuario_Nome_Usuario VARCHAR(20)
     );
     */
}
