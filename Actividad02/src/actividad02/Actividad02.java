/**
 * Desarrollar un programa que permita ingresar un vector de 8 elementos,
 * e informe: A) El valor acumulado de todos los elementos del vector. B) El
 * valor acumulado de los elementos del vector que sean mayores a 36. C)
 * Cantidad de valores mayores a 50
 */
package actividad02;

import javax.swing.JOptionPane;

public class Actividad02 {

    public static void main(String[] args) {
        //int[] numeros = {20, 54, 12, 65, 37, 78, 13, 40};
        
        //Declaracion de variables e Inicializacion
        int[] numeros = new int[8];
        int mayores36, mayores50;
        mayores36 = 0;
        mayores50 = 0;

        
        //Carga del Vector con numeros
        for (int i = 0; i < numeros.length; i++) {
           numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor numerico"));
        }
        
        // Contar valores mayores a 36 y mayores a 50
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 36) {
                mayores36++;
            } 
            if (numeros[i] > 50) {
                mayores50++;

            }
            
            
        }
        //Impresion de Datos
        System.out.println("Cantidad de numeros mayores a 36: " + mayores36);
        System.out.println("Cantidad de numeros mayores a 50: " + mayores50);

    }

}
