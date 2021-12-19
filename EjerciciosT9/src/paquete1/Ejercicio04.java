/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadena_acumuladora = " ";
        double[] promedios = {10, 10, 9.1, 7, 6.1, 4, 8};
        String[] estudiantes = {"Kimberly Gonzalez", "Mark Hogan",
            "Teresa Martinez", "Julia Johnson", "Mark Cook", "Jennifer Manning",
            "Juan Vasquez"};
        String[] promediosCualitativos = new String[7];
        for (int indice = 0; indice < promedios.length; indice++) {
            if (promedios[indice] >= 0 && promedios[indice] <= 5.9) {
                promediosCualitativos[indice] = "Promedio Regular";
            } else {
                if (promedios[indice] >= 6 && promedios[indice] <= 8.9) {
                    promediosCualitativos[indice] = "Promedio Bueno";
                } else {
                    promediosCualitativos[indice] = "Promedio Sobresaliente";
                }
            }
            cadena_acumuladora = String.format("%s%s promedio: %.2f %s\n",
                     cadena_acumuladora,
                     estudiantes[indice],
                     promedios[indice],
                     promediosCualitativos[indice]);
        }
        System.out.println(cadena_acumuladora);
    }

}
