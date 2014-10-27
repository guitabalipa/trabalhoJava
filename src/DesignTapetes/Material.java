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
public class Material {
    
    private double precoMetroQuadrado;
    private String modelo;  

    public Material(double precoMetroQuadrado, String modelo) {
        this.precoMetroQuadrado = precoMetroQuadrado;
        this.modelo = modelo;
    }

    public double getPrecoMetroQuadrado() {
        return precoMetroQuadrado;
    }

    public String getModelo() {
        return modelo;
    }
}
