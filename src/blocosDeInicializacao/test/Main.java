package blocosDeInicializacao.test;

import blocosDeInicializacao.domain.Desenho;

public class Main {
    public static void main(String[] args) {
        Desenho des = new Desenho();

        for (int ep : des.getEps())
            System.out.print(ep + " ");
    }
}
