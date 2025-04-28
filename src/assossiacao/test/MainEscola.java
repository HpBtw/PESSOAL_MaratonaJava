package assossiacao.test;

import assossiacao.domain.Escola;
import assossiacao.domain.Professor;

public class MainEscola {
    public static void main(String[] args) {
        Professor prof1 = new Professor("Selmini");
        Professor prof2 = new Professor("Nivaldex");
        Professor[] profs = {prof1, prof2};
        Escola esc = new Escola("Fiap", profs);

        esc.print();
    }
}
