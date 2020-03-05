/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programamedia;

import java.util.Scanner;

/**
 *
 * @author elvis
 */
public class ProgramaMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira a primeira nota");
        float n1 = teclado.nextFloat();
        System.out.println("Insira a segunda nota");
        float n2 = teclado.nextFloat();
        float media=(n1+n2)/2;
        
        System.out.println("sua media foi: " + media);
        
        if(media>5){
            System.out.println("parabéns");
        }else{
            System.out.println(media);
        }
        
    }
    
}
