/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idadevoto;

import java.util.Scanner;

/**
 *
 * @author elvis
 */
public class IdadeVoto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int nasc, anoatual, idade;
  
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Insira o ano de nascimento");
        nasc=teclado.nextInt();
        System.out.println("Insira o ano atual");
        anoatual=teclado.nextInt();
        
        idade=anoatual - nasc;
        System.out.println("sua idade é "+idade);
        
        if(idade<16){
            System.out.println("idade "+ idade + "não vota");
        }else if ((idade>=16&&idade<18)||(idade>70)){
            System.out.println("idade "+ idade +"voto opcional");
        }else{
            System.out.println("idade "+ idade +"voto obrigatorio");
        }  
    }
    
}
