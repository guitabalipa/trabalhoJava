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
public abstract class Forma {
    
    private String nome;

    public String getNome() {
        return nome;
    }
    
    public abstract double area();
    
}
