/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2psp;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alex0
 */
public class Exercicio2PSP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)/* throws InterruptedException */{
        
     /*   try{
            Thread.sleep(5);
            new Exer2Thread ("Pepe").start();
        }  catch (InterruptedException ex) {
            Logger.getLogger(Exer2Thread.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try{
            Thread.sleep(5);
            new Exer2Thread ("Juan").start();
        }  catch (InterruptedException ex) {
            Logger.getLogger(Exer2Thread.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try{
            Thread.sleep(5);
            new Exer2Thread ("Anxo").start();
        }  catch (InterruptedException ex) {
            Logger.getLogger(Exer2Thread.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try{
            Thread.sleep(5);
            new Exer2Thread ("Brais").start();
        }  catch (InterruptedException ex) {
            Logger.getLogger(Exer2Thread.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("Termina thread main"); */
     
     //Modificacion con Join
   
     /*
     Thread pepe = new Thread(new Exer2Thread ("Pepe"));
     Thread juan = new Thread(new Exer2Thread ("Juan"));
     Thread luis = new Thread(new Exer2Thread ("Luis"));
     Thread anxo = new Thread(new Exer2Thread ("Anxo"));
     
     pepe.start();
     pepe.join();
     
     juan.start();
     juan.join();
     
     luis.start();
     luis.join();
     
     anxo.start();
     anxo.join();
     
     System.out.println("Termina thread main");
        */
     
    /* Usamos prioridades en vez del .join
     
     Thread pepe = new Thread(new Exer2Thread ("Pepe"));
     pepe.setPriority(10);
     Thread juan = new Thread(new Exer2Thread ("Juan"));
     juan.setPriority(9);
     Thread luis = new Thread(new Exer2Thread ("Luis"));
     luis.setPriority(8);
     Thread anxo = new Thread(new Exer2Thread ("Anxo"));
     anxo.setPriority(7);
     
     pepe.start();
     
     juan.start();
     
     luis.start();
     
     anxo.start();
     
     System.out.println("Termina thread main");

*/
    }
    
}
