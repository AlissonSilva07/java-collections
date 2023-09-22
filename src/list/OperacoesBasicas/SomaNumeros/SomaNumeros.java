package list.OperacoesBasicas.SomaNumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> listaDeNumeros;

    public SomaNumeros () {
        this.listaDeNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        listaDeNumeros.add(numero);
    }

    public int calcularSoma() {
        int somaNumeros = 0;
        if (!listaDeNumeros.isEmpty()) {
            for (Integer n : listaDeNumeros) {
                somaNumeros += n;
            }
        }
        return somaNumeros;
    }

    public int encontrarMaiorNumero() {
        int maiorNumero = Integer.MIN_VALUE;
        if (!listaDeNumeros.isEmpty()) {
            for(Integer n : listaDeNumeros) {
                if (n >= maiorNumero) {
                    maiorNumero = n;
                }
            }
        }
        return maiorNumero;
    }

    public int encontrarMenorNumero() {
        int menorNumero = Integer.MAX_VALUE;
        if (!listaDeNumeros.isEmpty()) {
            for (Integer n : listaDeNumeros) {
                if (n <= menorNumero) {
                    menorNumero = n;
                }
            }
        }
        return menorNumero;
    }

    public void exibirNumeros() {
        if (!listaDeNumeros.isEmpty()) {
            System.out.println(this.listaDeNumeros);
        }
    }
}
