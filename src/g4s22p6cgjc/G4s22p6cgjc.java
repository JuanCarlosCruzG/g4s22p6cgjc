/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g4s22p6cgjc;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author maria
 */
public class G4s22p6cgjc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> lista = new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
        lista.forEach(contenido ->{
        System.out.println("Valor contenido es " + contenido );
                
        });
        lista.add("F");
        lista.add("G");
        lista.add("H");
        
        System.out.println("\nSegunda forma de trabajar recorridos en listas\n");
        
        for(String contenido1 : lista ){
         
        System.out.println("El valor contenido es " + contenido1);
    }
        lista.add("Victor");
        lista.add("Esta es una linea muy larga");
        lista.add("Hugo");
        lista.add("Segunda linea muy larga sin problemas de almacenamiento");
        
        System.out.println("\nTercer forma de trabajar recorridos en listas\n");
        
        lista.stream().forEach(contenido2 -> {
            
        System.out.println("El valor contenido es " + contenido2);
        
        });
}
