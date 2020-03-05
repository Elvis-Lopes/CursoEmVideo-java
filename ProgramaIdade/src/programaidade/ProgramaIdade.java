/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaidade;

import java.util.Scanner;

/**
 *
 * @author elvis
 */
public class ProgramaIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner t = new Scanner (System.in);
        System.out.println("Insira o ano de nascimento ");
        int nasc = t.nextInt();
        System.out.println("Insira o ano atual");
        int DataAtual = t.nextInt();
        
        int idade =  DataAtual - nasc;
        System.out.println("Sua idade é: "+ idade);
        
        if(idade>=18){
            System.out.println("maior de idade");
        }else{
            System.out.println("menor de idade");
        }
        
        // TODO code application logic here
    }
    
}
