/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contadorcambalhota;

/**
 *
 * @author elvis
 */
public class ContadorCambalhota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int cc =0;
        
        while(cc<=20){
            
            if(cc ==5  || cc==7){
                continue;
            }
            System.out.println("cambalhotas: "+ cc);
            cc++;
        }
    }
    
}
