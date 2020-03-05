/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pernaanimal;

import java.util.Scanner;

/**
 *
 * @author elvis
 */
public class PernaAnimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int qtdperna;
        
        Scanner teclado = new Scanner (System.in);
        System.out.println("insira a quantidade de pernas");
        qtdperna = teclado.nextInt();
        
        switch(qtdperna){
            
            case 1:
                System.out.println("saci");
                break;
                
            case 2:
                System.out.println("Bipede");
                break;
            
            case 4:
                System.out.println("Quadrupede");
                break;
            
            case 6,8:
                System.out.println("aranha");
                break;
            
            default:
                System.out.println("é um et");
        }
        
    }
    
}
