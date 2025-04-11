package introducaoMetodos.test;

import introducaoMetodos.domain.Estudante;

import java.util.Scanner;

public class MainEstudante {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante1.nome = "Luci";
        estudante1.idade = 20;
        estudante1.serie = 3;
        estudante1.id = 558975;
        estudante1.sexo = 'M';

        estudante2.nome = "Maru";
        estudante2.idade = 18;
        estudante2.serie = 2;
        estudante2.id = 559201;
        estudante2.sexo = 'F';

        System.out.println("Deseja imprimir os dados de qual aluno?");
        int opcao = kb.nextInt();

        switch(opcao) {
            case 1:
                impressora.imprimir(estudante1);
                break;
            case 2:
                impressora.imprimir(estudante2);
                break;
            default:
                System.err.println("Aluno não cadastrado!");
                break;
        }

    }
}
