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
    public void calculoDaSomaRetornaResultadoValidoQuandoEntradasPositivas() {
        assertEquals(6, calculadora.sum(2, 4));
    }

    @Test
    public void calculoDaSomaRetornaResultadoValidoQuandoEntradasNegativas() {
        assertEquals(-6, calculadora.sum(-2, -4));
    }

    @Test
    public void calculoDaSomaRetornaResultadoValidoQuandoEntradasPositivaENegativa() {
        assertEquals(0, calculadora.sum(2, -2));
    }

    @Test
    public void calculoDaSubtracaoRetornaResultadoValidoQuandoEntradasPositivas() {
        assertEquals(-2, calculadora.diff(2, 4));
    }

    @Test
    public void calculoDaSubtracaoRetornaResultadoValidoQuandoEntradasNegativas() {
        assertEquals(2, calculadora.diff(-2, -4));
    }

    @Test
    public void calculoDaSubtracaoRetornaResultadoValidoQuandoEntradasPositivaENegativa() {
        assertEquals(4, calculadora.diff(2, -2));
    }

    @Test
    public void calculoDaMultiplicacaoRetornaResultadoValidoQuandoEntradasPositivas() {
        assertEquals(8, calculadora.times(2, 4));
    }

    @Test
    public void calculoDaMultiplicacaoRetornaResultadoValidoQuandoEntradasNegativas() {
        assertEquals(8, calculadora.times(-2, -4));
    }

    @Test
    public void calculoDaMultiplicacaoRetornaResultadoValidoQuandoEntradasPositivaENegativa() {
        assertEquals(-4, calculadora.times(2, -2));
    }

    @Test
    public void calculoDaDivisaoRetornaResultadoValidoQuandoEntradasPositivas() {
        assertEquals(0, calculadora.div(2, 4));
    }

    @Test
    public void calculoDaDivisaoRetornaResultadoValidoQuandoEntradasNegativas() {
        assertEquals(0, calculadora.div(-2, -4));
    }

    @Test
    public void calculoDaDivisaoRetornaResultadoValidoQuandoEntradasPositivaENegativa() {
        assertEquals(-1, calculadora.div(2, -2));
    }

    @Test
    public void calculoDaDivisaoRetornaZeroQuandoDivisaoPorZero() {
        assertEquals(0, calculadora.div(2, 0));
    }

    @Test
    public void calculoDaRaizRetornaResultadoValidoQuandoQuadradoPerfeito() {
        assertEquals(5, calculadora.sqr(25));
    }

    @Test
    public void calculoDaRaizRetornaZeroQuandoNaoQuadradoPerfeito() {
        assertEquals(0, calculadora.sqr(45));
    }

    @Test
    public void calculoDaRaizRetornaZeroQuandoEntradaNegativa() {
        assertEquals(0, calculadora.sqr(-25));
    }

}
