/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gc.control;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author maico
 */
public class TestaData {
    private String dataVencimento;
    
    public TestaData(String dataVencimento){
        this.dataVencimento = dataVencimento;
    }
    
    public TestaData(){
    }
    
    
    public boolean testarData(String dataVencimento) {
        Date dataAtual = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String dataHojeFormatada = sdf.format(dataAtual);
        if (dataHojeFormatada.compareTo(dataVencimento) > 0) {
            return false;
        } else {
            return true;
        }
    }
    
   /* panelPagamento.setBackground(Color.red);
            labelPagamento.setText("                Pagamento Atrasado!");*/
    /*panelPagamento.setBackground(Color.green);
            labelPagamento.setText("                  Pagamento OK!");*/
}
