/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idiomapc;

import java.util.Locale;

/**
 *
 * @author elvis
 */
public class IdiomaPC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Locale loc = Locale.getDefault(Locale.Category.DISPLAY);
        System.out.println(loc.getDisplayLanguage(loc));
        System.out.println(loc.getLanguage());
        // TODO code application logic here
    }
    
}
