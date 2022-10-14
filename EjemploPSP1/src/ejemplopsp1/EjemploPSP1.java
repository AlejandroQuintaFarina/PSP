/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplopsp1;

/**
 *
 * @author alex0
 */
public class EjemploPSP1 extends Thread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        new ThreadEjemplo("Pepe").start();
        new ThreadEjemplo("Juan").start();
        System.out.println("Termina thread main");
        
    }
    
}
