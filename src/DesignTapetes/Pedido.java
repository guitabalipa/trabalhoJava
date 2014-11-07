/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesignTapetes;

import java.util.List;

/**
 *
 * @author Guilherme
 */
public class Pedido {
    
    private int idPedido;
    private double preco;
    private List<Tapete> tapetes;

    public Pedido(List<Tapete> tapetes) {
        this.tapetes = tapetes;
    }

    public int getIdentificadorPedido() {
        return idPedido;
    }

    public void setIdentificadorPedido(int identificadorPedido) {
        this.idPedido = idPedido;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public List<Tapete> getTapetes() {
        return tapetes;
    }
    
    public void adicionaTapeteNoPedido(Tapete tapete){
        tapetes.add(tapete);
    }
}
