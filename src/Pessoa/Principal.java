/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pessoa;

/**
 *
 * @author dudag
 */
public class Principal {
    
    public static void main(String[] args){
        Pessoa pessoa1 = new Trabalhador("Maria", "Feminino", 1);
        Pessoa pessoa2 = new Trabalhador("Mario", "Masculino", 0);
        
        System.out.println(pessoa1.toString());
        pessoa1.alteraNome("Jessica");
        System.out.println(pessoa2.toString());
        pessoa2.trabalha();
        pessoa2.alteraNome("Mario da Silva");
        
        System.out.println(pessoa2.toString());
                
    }   
}
