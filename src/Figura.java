/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dudag
 */
public abstract class Figura {
    public String cor;
    
    public Figura(){
        
    }
    public Figura(String cor){
        super();
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Figura [cor=" + cor + "]"; 
    }
    
    public abstract double area();   
}
    

