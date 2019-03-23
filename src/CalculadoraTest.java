import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculadoraTest {
    Calculadora calculadora;

    @Before
    public void inicializador() {
        calculadora = new Calculadora();
    }

    @Test
    public void calculoDaSomaRetornaResultadoValido() {
        assertEquals(-4, calculadora.sum(-2, -2));
    }

    @Test
    public void calculoDaSubtracaoRetornaResultadoValido() {
        assertEquals(2, calculadora.diff(-2, -4));
    }

    @Test
    public void calculoDaMultiplicacaoRetornaResultadoValido() {
        assertEquals(8, calculadora.times(-2, -4));
    }

    @Test
    public void calculoDaDivisaoRetornaResultadoValido() {
        assertEquals(0, calculadora.div(2, 0));
    }

    @Test
    public void calculoDaRaizRetornaResultadoValido() {
        assertEquals(0, calculadora.sqr(-25));
    }

}
