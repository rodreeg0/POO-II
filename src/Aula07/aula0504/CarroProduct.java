/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula07.aula0504;

/**
 *
 * @author rodriguh
 */
public class CarroProduct {

    private double preco;

    
    private String dscMotor;
    private int anoDeFabricacao;
    private String modelo;
    private String montadora;

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDscMotor() {
        return dscMotor;
    }

    public void setDscMotor(String dscMotor) {
        this.dscMotor = dscMotor;
    }

    public int getAnoDeFabricacao() {
        return anoDeFabricacao;
    }

    public void setAnoDeFabricacao(int anoDeFabricacao) {
        this.anoDeFabricacao = anoDeFabricacao;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMontadora() {
        return montadora;
    }

    public void setMontadora(String montadora) {
        this.montadora = montadora;
    }
    
    @Override
    public String toString() {
        return "CarroProduto{" + "preco=" + preco + ", dscMotor=" + dscMotor + ", anoDeFabricacao=" + anoDeFabricacao + ", modelo=" + modelo + ", montadora=" + montadora + '}';
    }

}
