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
public class Circulo extends Forma{
    
    private double raio;
    private String nome;

    public Circulo(double raio, String nome) {
        this.raio = raio;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public double getRaio() {
        return raio;
    }

    @Override
    public double area() {
        double calc = 3.14 * Math.pow(this.raio,2);
        return calc;
    }
    
}
