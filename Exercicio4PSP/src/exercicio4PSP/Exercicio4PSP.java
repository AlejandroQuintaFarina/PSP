/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio4PSP;

/**
 *
 * @author alex0
 */
public class Exercicio4PSP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Creamos los 3 hilos.
        Exer4Threads fio1 = new Exer4Threads ("Fio 1");
        Exer4Threads fio2 = new Exer4Threads ("Fio 2");
        Exer4Threads fio3 = new Exer4Threads ("Fio 3");
        
        // Lanzamos nuestros hilos.
        fio1.start();
        fio2.start();
        fio3.start();
        
    }
    
}
