package introducaoClasses.test;

import introducaoClasses.domain.Estudante;

public class MainEstudante {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Luciano";
        estudante.idade = 20;
        estudante.sexo = 'M';
    }
}
