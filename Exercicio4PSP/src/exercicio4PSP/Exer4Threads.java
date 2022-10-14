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
public class Exer4Threads extends Thread{
    
    int contador;
    String texto;
    public Exer4Threads (String nombre)
    {
        super(nombre);
    }
    
    public void run()
    {
        // Creamos un switch que dependiendo del nombre del hilo entrara en un caso u en otro, mostrando el resultado al final.
        switch(getName())
        {
            case "Fio 1":
                for(int i = 0; i <= 1000; i ++)
                {
                    if(i%2 == 0)
                    {
                        contador = contador + i;
                        
                    }
                }
                texto = "pares";
            break;
            case "Fio 2":
                for(int i = 0; i <= 1000; i ++)
                {
                    if(i%2 != 0)
                    {
                        contador = contador + i;
                    }
                }
                texto = "impares";
            break;
            case "Fio 3":
                for(int i = 0; i <= 1000; i ++)
                {
                    if(String.valueOf(i).endsWith("2") || String.valueOf(i).endsWith("3"))
                    {
                        contador = contador + i;
                    }
                }
                texto = "terminados en 2 y en 3 ";
            break;
        }
        System.out.println("El total de numeros " + texto + " es de: " + contador);
        
    }
    
}
