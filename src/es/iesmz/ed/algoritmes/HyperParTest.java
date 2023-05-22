package es.iesmz.ed.algoritmes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HyperparTest {

    @Test
    void esHyperPar() {
        boolean resultadoEsperado = true;
        boolean resultadoReal = HyperPar.esHyperPar(2);
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    void esHyperPar1() {
        boolean resultadoEsperado = false;
        boolean resultadoReal = HyperPar.esHyperPar(3);
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    void esHyperPar2() {
        boolean resultadoEsperado = true;
        boolean resultadoReal = HyperPar.esHyperPar(2480);
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    void esHyperPar3() {
        boolean resultadoEsperado = false;
        boolean resultadoReal = HyperPar.esHyperPar(3579);
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    void esHyperPar4() {
        boolean resultadoEsperado = false;
        boolean resultadoReal = HyperPar.esHyperPar(00421421);
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    void esHyperPar5() {
        boolean resultadoEsperado = false;
        boolean resultadoReal = HyperPar.esHyperPar(00424426);
        assertEquals(resultadoEsperado, resultadoReal);
    }
}