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
public class Exer2Thread extends Thread{
    
    public Exer2Thread(String str){
        super(str);      
    }
    
    public void run(){ 
        for (int i = 0; i < 5; i++)
            
            System.out.println(i + "" + getName());
        System.out.println(" Termina thread " + getName());     
}
    
}
