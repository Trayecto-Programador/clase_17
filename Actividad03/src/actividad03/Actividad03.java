/**
 * Por cada alumno que viene a inscribirse en la escuela, se deberá anotar
 * los siguientes datos: Orientación en que se matricula, Apellidos y
 * nombres, Sexo y Dirección. No debe superar los 6 alumnos. Al finalizar
 * mostrar solamente los inscriptos en informática
 */
package actividad03;

import javax.swing.JOptionPane;

public class Actividad03 {

    public static void main(String[] args) {

        //Declaracion de variables e Inicializacion
        String[] apellido, nombre, sexo, direccion, orientacion;
        int longitud;
        int opcion;

        opcion = 2;
        longitud = 2;
        apellido = new String[longitud];
        nombre = new String[longitud];
        sexo = new String[longitud];
        direccion = new String[longitud];
        orientacion = new String[longitud];
        
        //Carga menu
        do {

            opcion = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opcion \n 1 👀- Cargar Alumnos \n 2 🛎- Salir del programa"));
            //Carga el listado de alumnos si la opcion seleccionada es 1
            if (opcion == 1) {
                for (int i = 0; i < apellido.length; i++) {
                    apellido[i] = JOptionPane.showInputDialog("Ingrese Apellido del alumno: " + (i + 1));
                    nombre[i] = JOptionPane.showInputDialog("Ingrese Nombre del alumno: " + (i + 1));
                    sexo[i] = JOptionPane.showInputDialog("Ingrese sexo del alumno: " + (i + 1));
                    direccion[i] = JOptionPane.showInputDialog("Ingrese Direccion del alumno: " + (i + 1));
                    orientacion[i] = JOptionPane.showInputDialog("Ingrese Orientación del alumno: " + (i + 1));
                }
                
                opcion = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opcion \n 3 ⭐- Mostrar Alumnos Informatica \n 2 💊- Salir del programa"));
                
                //Busca alumnos con orientacion informatica si selecciona opcion 3
                while (opcion == 3) {
                    for (int i = 0; i < apellido.length; i++) {
                        if(orientacion[i].equalsIgnoreCase("informatica")){
                        System.out.println("Alumno: " + apellido[i] + " " + nombre[i]);
                        System.out.println("Sexo: " + sexo[i]);
                        System.out.println("Dirección: " + direccion[i]);
                        System.out.println("Orientacion: " + orientacion[i]);
                        System.out.println("");
                        }
                        
                    }
                    break;
                }
                
            }
            
            
        } while (opcion != 2);

    }

}
