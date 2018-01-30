
package ec.edu.ister.vista;

import ec.edu.ister.ListaEnteros.Lista;
import java.util.Random;

/**
 *
 * @author FERNANDO
 */

public class ListaAleatoria {
    
    public static void main(String[] args) {
        Random r;
        int d;
        Lista lista;
        int k;
        
        r=new Random();
        lista = new Lista();
        k=Math.abs(r.nextInt()%55);
        
        
        for (; k >0; k--) {
            
            d=r.nextInt() %99;
            lista.insertarCabezaLista(d);
        }
        System.out.println("ELEMENTOS DE LA LISTA GENERADOS AL AZAR");
        lista.visualizar();
    }
    
}
