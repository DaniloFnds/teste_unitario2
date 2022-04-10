package br.com.teste;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;


public class OrdenacaoPalavraTest {

    @Test
    public void givenNumerosAleatoriosWhenOrderDescrecenteThenOrdenadoDescrecente() {

        //given
        final OrdenacaoPalavra ordenacaoPalavra = new OrdenacaoPalavra(Arrays.asList(5, 6, 1, 3, 10, 8));
        ordenacaoPalavra.embaralhar();

        //when
        ordenacaoPalavra.orderDescrecente();

        //then
        Assertions.assertArrayEquals(Arrays.asList(1, 3, 5, 6, 8,10).toArray(),ordenacaoPalavra.getNomes().toArray());
    }

    @Test
    public void givenNumerosAleatoriosWhenOrderAcendenteThenOrdenadoAscendente() {

        //given
        final OrdenacaoPalavra ordenacaoPalavra = new OrdenacaoPalavra(Arrays.asList(5, 6, 1, 3, 10, 8));
        ordenacaoPalavra.embaralhar();

        //when
        ordenacaoPalavra.orderAscendente();

        //then
        Assertions.assertArrayEquals(Arrays.asList(1, 3, 5, 6, 8,10).toArray(),ordenacaoPalavra.getNomes().toArray());
    }


    @Test
    public void testarEmbaralhar() {
        //given
        final OrdenacaoPalavra ordenacaoPalavra =  Mockito.mock(OrdenacaoPalavra.class);

        //when
        Mockito.when(ordenacaoPalavra.getNomes()).thenReturn(Arrays.asList(5, 6, 8, 10, 1, 3));
        ordenacaoPalavra.orderDescrecente();

        //then
        Assertions.assertArrayEquals(Arrays.asList(1, 3, 5, 6, 8,10).toArray(),ordenacaoPalavra.getNomes().toArray());
    }


}
