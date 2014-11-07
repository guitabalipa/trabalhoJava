/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesignTapetes;

/**
 *
 * @author Guilherme
 */
public class PedidoNaoEncontradoException extends Exception{

    public PedidoNaoEncontradoException() {
        super("Nenhum pedido encontrado.");
    }
}
