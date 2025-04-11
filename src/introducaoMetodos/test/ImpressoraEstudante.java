package introducaoMetodos.test;

import introducaoMetodos.domain.Estudante;

public class ImpressoraEstudante {
    public void imprimir(Estudante estudante) {
        System.out.println("Nome: " + estudante.nome);
        System.out.println("Idade: " + estudante.idade);
        System.out.println("Série: " + estudante.serie);
        System.out.println("Matrícula: " + estudante.id);
        System.out.println("Gênero: " + estudante.sexo);
    }
}
