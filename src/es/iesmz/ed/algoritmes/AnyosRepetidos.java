package es.iesmz.ed.algoritmes;

/**
 * Esta clase define la cantidad de numeros distintos por los que esta compuesto un numero entero.
 * @author: Saleem Siddique
 * @version: 26/05/2023
 */

public class AnyosRepetidos{

    /**
     * Separa los numeros por uno por uno y comprueba si es igual a alguno anterior
     * @param numero El parámetro define el número que tenemos que comprobar.
     */
    public int digitosDiferentes(long numero) {
        int contDigitos = 1;
        String numeroComprobar = String.valueOf(numero);

        for (int i = 1; i < numeroComprobar.length(); i++) {
            int digitoActual = Integer.parseInt(String.valueOf(numeroComprobar.charAt(i)));
            int digitoAnterior = Integer.parseInt(String.valueOf(numeroComprobar.charAt(i - 1)));

            if (digitoActual != digitoAnterior) {
                contDigitos++;
            }
        }

        if (contDigitos == 1) {
            contDigitos = 0;
        }
        return contDigitos;
    }
}
