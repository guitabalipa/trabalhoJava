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
public class Triangulo extends Forma{
    
    private double base;
    private double altura;
    private String nome;

    public Triangulo(double base, double altura, String nome) {
        this.base = base;
        this.altura = altura;
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public double area() {
        double calc=(base*altura)/2;
        return calc;
    }
    
}
