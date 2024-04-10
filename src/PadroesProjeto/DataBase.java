/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PadroesProjeto;

/**
 *
 * @author dudag
 */
public class DataBase {
    private static DataBase dataBase;

    public DataBase() {
    }
    public static synchronized DataBase getInstance(){
        if (dataBase == null){
            getConnection();
            dataBase = new DataBase();            
        }
        return dataBase;
    }
    private static void getConnection() {
        System.out.println("Conectado!!");                
    }          
}
