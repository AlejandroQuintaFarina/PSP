/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1psp;

/**
 *
 * @author alex0
 */
public class Exercicio1PSP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        new Exer1Thread ("Pepe").start();
        new Exer1Thread ("Pepe").start();
        System.out.println("Termina thread main");
    }
    
}
