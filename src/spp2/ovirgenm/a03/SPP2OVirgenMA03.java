/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.ovirgenm.a03;
import java.util.Scanner;


/**
 *
 * @author Orianna
 */
public class SPP2OVirgenMA03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaración de variables
        Scanner keyboard = new Scanner (System.in);
       double catetopuesto;
       double catetoadyacente;
       double hipotenusa;
    
        
        //Ejecución del programa
          System.out.println("Introduce cateto opuesto: ");
          catetopuesto = keyboard.nextDouble();
          System.out.println("Introduce cateto cateto adyacente: ");
          catetoadyacente = keyboard.nextDouble();
          hipotenusa = Math.sqrt(Math.pow(catetopuesto,2)+ (Math.pow(catetoadyacente,2)));
       
          //Mostramos resultado
          System.out.println("Hipotenusa: " + hipotenusa);
                   }
    
}
   
        
    
