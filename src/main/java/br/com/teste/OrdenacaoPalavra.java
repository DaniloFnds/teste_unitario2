package br.com.teste;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoPalavra {
        private final List<Integer> nomes;


    public OrdenacaoPalavra(List<Integer> nomes) {
        this.nomes = nomes;
    }

    public void orderDescrecente() {
        getNomes().sort(Integer::compareTo);
    }

    public void embaralhar() {
        Collections.shuffle(this.nomes);
    }

    public void orderAscendente() {
        this.nomes.sort(Comparator.reverseOrder());
    }

    public List<Integer> getNomes() {
        return nomes;
    }
}
