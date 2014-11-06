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
public class Retangulo extends Forma{
    
    private double ladoA;
    private double ladoB;
    private String nome;

    public Retangulo(double ladoA, double ladoB, String nome) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public double getLadoA() {
        return ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    @Override
    public double area() {
        double calc=ladoA*ladoB;
        return calc;
    }
    
}
