
package ejercicios;


public class Problema01 {
    

    public static void main(String[] args) {
        double[][] datos = {{10, 2}, {1, 5}, {6, 2}, {7, 8}};
        double[][] resultado = new double[4][2];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                resultado[i][j] = res(datos[i][j]);
            }
        }
        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 2; j++) {

                System.out.println(resultado[i][j]);
            }
        }
    }

    public static double res(double d) {
        if (d <= 1) {
            return 1;
        } else {
            return d * res(d - 1);
        }
    }
}
