package es.iesmz.ed.algoritmes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DividirFactorialTest {

    DividirFactorial fraccion = new DividirFactorial();

    @Test
    void testDivisioPrueba1() {
        double resultadoActual = fraccion.division(5, 2);
        double resultadoEsperado = 60;
        assertEquals(resultadoEsperado, resultadoActual);
    }

    @Test
    void testDivisioPrueba2() {
        DividirFactorial d = new DividirFactorial();
        double resultadoActual = fraccion.division(6, 4);
        double resultadoEsperado = 30;
        assertEquals(resultadoEsperado, resultadoActual);
    }

    @Test
    void testDivisioPrueba3() {
        DividirFactorial division = new DividirFactorial();
        double resultadoActual = fraccion.division(0, 7);
        double resultadoEsperado = 0;
        assertEquals(resultadoEsperado, resultadoActual);
    }

    @Test
    void testDivisioPrueba4() {
        DividirFactorial division = new DividirFactorial();
        double resultadoActual = fraccion.division(4, 0);
        double resultadoEsperado = 0;
        assertEquals(resultadoEsperado, resultadoActual);
    }

    @Test
    void testDivisioPrueba5() {
        DividirFactorial division = new DividirFactorial();
        double resultadoActual = fraccion.division(0, 0);
        double resultadoEsperado = 0;
        assertEquals(resultadoEsperado, resultadoActual);
    }

    @Test
    void testDivisioPrueba6() {
        DividirFactorial division = new DividirFactorial();
        double resultadoActual = fraccion.division(10, 10);
        double resultadoEsperado = 1;
        assertEquals(resultadoEsperado, resultadoActual);
    }
}