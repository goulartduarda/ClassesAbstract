/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dudag
 */
public class Teste {
    public static void main(String[] args){
        Quadrado quadrado = new Quadrado();
        Triangulo triangulo = new Triangulo( 5, 12);
        Circulo circulo = new Circulo(10.2);
        Retangulo retangulo = new Retangulo(32, 12);
        
        quadrado.setCor("Roxo");
        quadrado.setLado1(4);
        
        System.out.println("Quadrado: " + quadrado);
        System.out.println("trinagulo: " + triangulo);
        System.out.println("circulo: " + circulo);
        System.out.println("retangulo: " + retangulo);                
    }    
}
