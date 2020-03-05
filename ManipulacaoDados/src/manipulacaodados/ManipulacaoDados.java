/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manipulacaodados;

import java.util.Scanner;

/**
 *
 * @author elvis
 */
public class ManipulacaoDados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite um nome");
        String nome= teclado.nextLine();
        System.out.println("digite uma nota");
        float nota=teclado.nextFloat();
        
        
        System.out.println("a sua nota é " + nota);
        System.out.printf("a sua nota é %.1f\n",nota);
        System.out.format("a sua nota é %.1f\n",nota);
        System.out.printf("a note do %s é %.1f\n",nome,nota);
        
        // TODO code application logic here
    }

    private static void print(String digite_um_nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
