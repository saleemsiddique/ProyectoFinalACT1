package es.iesmz.ed.algoritmes;

import es.iesmz.ed.algoritmes.AnyosRepetidos;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AnyTest {
    AnyosRepetidos anyoPrueba = new AnyosRepetidos();
    @Test
    void testDigitos1() {
        int resultadoActual = anyoPrueba.digitosDiferentes(1111);
        int resultadoEsperado = 0;
        assertEquals(resultadoEsperado, resultadoActual);
    }
    @Test
    void testDigitos2() {
        int resultadoActual = anyoPrueba.digitosDiferentes(2014);
        int resultadoEsperado = 4;
        assertEquals(resultadoEsperado, resultadoActual);
    }
    @Test
    void testDigitos3() {
        int resultadoActual = anyoPrueba.digitosDiferentes(1999);
        int resultadoEsperado = 2;
        assertEquals(resultadoEsperado, resultadoActual);
    }
    @Test
    void testDigitos4() {
        int resultadoActual = anyoPrueba.digitosDiferentes(2005);
        int resultadoEsperado = 3;
        assertEquals(resultadoEsperado, resultadoActual);
    }


}