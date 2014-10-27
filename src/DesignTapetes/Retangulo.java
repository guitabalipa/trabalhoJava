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

    public Retangulo(double ladoA, double ladoB) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }

    public double getLadoA() {
        return ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    @Override
    public double area() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
