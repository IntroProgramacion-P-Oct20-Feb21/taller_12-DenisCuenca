/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

/**
 *
 * @author reroes
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] datos = {100, 90, 80, 70, 60};
        double[] datos2 = {200, 190, 180, 170, 160};
        double[] suma = new double[5];
        for (int i = 0; i < 5; i++) {
            suma[i] = denis(datos[i], datos2[i]);
        }
        
    }
    public static double denis(double datos, double datos2){
    if(datos == 0) {
    return datos2;
    }else{
    if (datos2 == 0){
    return datos;   
    
    
    }else{
    return 1 + denis(datos2, datos-1);
    }
    }
    }

}