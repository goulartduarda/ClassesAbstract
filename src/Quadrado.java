/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dudag
 */
public class Quadrado extends Retangulo{
    public Quadrado(){
        super();
    }

    public Quadrado(double lado1, double lado2) {
        super(lado1, lado2);
    }
    public Quadrado(String cor, double lado){
        lado = super.getLado1();
    }
    
    @Override
    public double area() {
        return this.getLado1()* this.getLado1(); 
    }
    
    @Override
	public String toString() {
		return "Quadrado [area()=" + area() + ", cor= " + super.getCor() + "]";
	}       
}
    
