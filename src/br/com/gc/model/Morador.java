/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gc.model;

import java.sql.Date;

/**
 *
 * @author maico
 */
public class Morador {
    private int id;
    private String nomeMorador;
    private int numeroApartamento;
    private double valorCondominio;
    private boolean situacaoPagamento;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isSituacaoPagamento() {
        return situacaoPagamento;
    }

    public void setSituacaoPagamento(boolean situacaoPagamento) {
        this.situacaoPagamento = situacaoPagamento;
    }

    public String getNomeMorador() {
        return nomeMorador;
    }

    public void setNomeMorador(String nomeMorador) {
        this.nomeMorador = nomeMorador;
    }

    public int getNumeroApartamento() {
        return numeroApartamento;
    }

    public void setNumeroApartamento(int numeroApartamento) {
        this.numeroApartamento = numeroApartamento;
    }

    public double getValorCondominio() {
        return valorCondominio;
    }

    public void setValorCondominio(double valorCondominio) {
        this.valorCondominio = valorCondominio;
    }

}
