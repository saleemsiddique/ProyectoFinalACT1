package es.iesmz.ed.algoritmes;

/**
 * Esta clase define numeros como hyperPar o NoHyperPar, segun los numeros individuales por los que este compuesto un numero mayor.
 * @author: Saleem Siddique
 * @version: 22/05/2023
 */

public class HyperPar {
    private long num;

    public HyperPar(long num) {
        this.num = num;
    }

    public long getNum() {
        return num;
    }

    /**
     * Comprobador de si es HyperPar un numero
     * @param numero El parámetro define el número que tenemos que comprobar.
     */
    public static boolean esHyperPar(long numero){
        boolean isHyperPar = true;
        HyperPar num = new HyperPar(numero);
        String numS = String.valueOf(num.getNum());
        for (int i = 0; i < numS.length(); i++) {
            Character numInd = numS.charAt(i);
            if (Character.getNumericValue(numInd) % 2 != 0){
                isHyperPar = false;
            }
        }
        return isHyperPar;
    }
}
