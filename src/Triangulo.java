/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dudag
 */
public class Triangulo extends Figura {
    private double base;
    private double altura;
    
    public Triangulo(){
        
    }

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    @Override
	public double area() {
		return base * altura;
	}

    @Override
	public String toString() {
		return "Retangulo [base= " + base + ", Altura= " + altura + ", cor= " + super.getCor() + "]";
	}            
}
