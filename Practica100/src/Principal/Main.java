
package Principal;

import java.util.Arrays;
import javax.swing.JOptionPane;


public class Main {
    public static void main(String[] args) {
        //Lamar a la ventana del formulario
        //la ventana tiene que estar centrada en la pantalla
        //la ventana tendra x ccordenadas
        
        int [] numeros = { 11, 2, 43, 5, 13, 14};
        int [] numeros2 = new int[0];
        int for1 = 0, for2 = 0;
        
        for (int i = 0; i < numeros.length ; i++) {
            for (int j = 0; j < numeros.length -1; j++) {
                if(numeros[i] < numeros[j]){
                   int aux = numeros[j];
                    numeros[j]  = numeros[i];
                    numeros[i] = aux;
                    for2++;
                }
                for1++;
            }
        }
        JOptionPane.showMessageDialog(null, Arrays.toString(numeros));
        System.out.println(for1);
        System.out.println(for2);
        
        for (int numeroauxiliares : numeros) {
            System.out.println(numeroauxiliares);
        }
        
        int menor = numeros[0];
        for (int numeroauxiliares : numeros) {
            if(menor > numeroauxiliares){
                menor = numeroauxiliares;
            }
            
        }
        
        for (int numeroauxiliares : numeros) {
            System.out.println(numeroauxiliares);
        }
        
        int mayor = numeros[0];
        for (int numeroauxiliares : numeros) {
            if(mayor < numeroauxiliares){
                mayor = numeroauxiliares;
            }
            
        }
        
        System.out.println("Menor Valor: " + menor);
        System.out.println("Mayor Valor: " + mayor);
        System.out.println(Arrays.toString(numeros2));
        System.out.println(numeros2 == null);
        
        
        int [] dias = new int[2];
        
        dias[0] = 1;
        dias[1] = 2;
        
        System.out.println(dias[1]);
        
       Arrays.sort(numeros, Collections.reverseOrder());
        String numerosCadena = Arrays.toString(numeros);
       
        /*System.out.println("\nOrdenados");
         for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }*/
        //
    }
}
