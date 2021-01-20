
package ejercicios;


public class Problema02 {

    
    public static void main(String[] args) {
        double[][] datos = {{10, 2, 3}, {1, 5, 8}, {6, 2, 3}, {7, 8, 1}};
        //double[] d = new double[4];
        for (int i = 0; i < 4; i++) {
            System.out.println( denis(datos[i], 3));
        }
        
    }
    public static double denis(double[] arreglo, int tamanio) {
        if (tamanio == 1) {
            return arreglo[0];
        }else{
           return arreglo[tamanio - 1] + denis(arreglo, tamanio-1);
        }               
    }
}
