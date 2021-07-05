
package ejercicios;


public class Problema04 {

    
    public static void main(String[] args) {
        double[] bases = {100, 90, 80, 70, 60};
        double[] potencias = {2, 3, 2, 2, 1};
        double[] resultado = new double[5];

        for (int i = 0; i < 5; i++) {
            resultado[i] = denis(bases[i], potencias[i]);
        }
        System.out.println(resultado[3]);
    }

    public static double denis(double base, double exponente) {
        if (exponente == 1) {
            return base;
        } else {
            return base * denis(base, exponente - 1);
        }
    }
}
