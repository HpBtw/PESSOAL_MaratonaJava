package introducaoClasses.test;

import introducaoClasses.domain.Professor;

public class MainProfessor {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Patricia";
        professor.idade = 40;
        professor.sexo = 'F';

        System.out.println("Nome: " + professor.nome + "\t Idade: " + professor.idade + "\t Sexo: " + professor.sexo);
    }
}
