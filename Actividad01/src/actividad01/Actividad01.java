/**
 * Realizar un programa que defina un vector de 5 componentes de tipo float
 * que representen las alturas de 5 personas. Obtener el promedio de las
 * mismas. Contar cuántas personas son más altas que el promedio y
 * cuántas más bajas.
 */
package actividad01;

public class Actividad01 {

    public static void main(String[] args) {
        
        //Declaracion de Variables y asignacioneds
        float[] altura = {1.68f, 1.82f, 1.75f, 1.52f, 1.69f};
        double promedio, estaturaAlta, estaturaBaja, totalAltura;
        
        totalAltura = 0;
        estaturaAlta = 0;
        estaturaBaja = 0;
        //calcular el Total de Altura
        for (int i = 0; i < altura.length; i++) {
            totalAltura = totalAltura + altura[i];
        }
        
        //calcular Promedio
        promedio = totalAltura / altura.length;
        
        
        //Contar Personas bajas y altas con referencia al promedio
        for (int i = 0; i < altura.length; i++) {
            if(altura[i] > promedio){
                estaturaAlta++;
            }else{
                if(altura[i] < promedio){
                    estaturaBaja++;
                }
            }
        }
        System.out.println("Estatura promedio: " + promedio);
        System.out.println("La cantidad de personas mayor altura al promedio es: " + (int)estaturaAlta);
        System.out.println("La cantidad de personas menor altura al promedio es: " + (int)estaturaBaja);
    }

}
