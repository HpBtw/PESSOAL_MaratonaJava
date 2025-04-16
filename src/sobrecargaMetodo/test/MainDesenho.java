package sobrecargaMetodo.test;

import sobrecargaMetodo.domain.Desenho;

public class MainDesenho {
    public static void main(String[] args) {
        Desenho desenho = new Desenho();

        desenho.init("Rick and Morty", "Ficção científica", 10, "TV");

        desenho.print();

    }
}
