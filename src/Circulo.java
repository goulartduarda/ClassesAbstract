/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dudag
 */
public class Circulo extends Figura{
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }
    public Circulo(){
        
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public String toString() {
        return "Circulo{" + "raio=" + raio + '}';
    }
        

    @Override
    public double area() {         
        return raio * 3.14 * 2;
    }
    
}
