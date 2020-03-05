/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oplogicos;

/**
 *
 * @author elvis
 */
public class OpLogicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        int n1, n2, r;
        
        n1=14;
        n2=18;
        
        r =(n1<n2)?n1-n2:n2;
        System.out.println(r);
        
        
        String nome1 = "Elvis";
        String nome2 = "Elvis";
        String nome3 = new String ("Elvis");
        String res;
        
        res=(nome1==nome3)?"igual":"diferente";
        
        System.out.println(res);
                
        */
        
        int x, y, z;
        x=4;
        y=7;
        z=12;
        boolean r;
        
        r=(x<y ^ y==z)?true:false;
        
        System.out.println(r);
                
    }
    
}
