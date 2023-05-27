package es.iesmz.ed.algoritmes;

/**
 * Esta clase implementa un método para dividir los factoriales de dos numeros.
 * @author Saleem Siddique.
 * @version 1.1 26/05/2023.
 */
public class DividirFactorial {
    /**
     * Este método divide el factorial del numerador entre el factorial del denominador.
     *
     * @param nominador   La parte de arriba de la division (numerador).
     * @param denominador La parte de abajo de una division (denominador).
     * @return El resultado de la división de los factoriales.
     */
    public double division(double nominador, double denominador) {
        double factorialNominador = 1;
        double factorialDenominador = 1;
        double resultado = 1;
        if (denominador == 0 || nominador == 0) {
            return 0;
        } else {
            for (int i = (int) nominador; i > denominador; i--) {
                resultado *= i;
            }

            return resultado;
        }
    }
}