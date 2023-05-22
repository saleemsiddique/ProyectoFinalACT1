package es.iesmz.ed.algoritmes;

public class HyperPar {
    private long num;

    public HyperPar(long num) {
        this.num = num;
    }

    public long getNum() {
        return num;
    }

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
