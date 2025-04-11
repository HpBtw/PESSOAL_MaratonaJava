package introducaoMetodos.test;

import introducaoMetodos.domain.EstudanteMetodoOtimizado;

import java.util.Scanner;

public class MainEstudanteMetodoOtimizado {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        EstudanteMetodoOtimizado estudante1 = new EstudanteMetodoOtimizado();
        EstudanteMetodoOtimizado estudante2 = new EstudanteMetodoOtimizado();

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

        System.out.println("Matriculas concluidas!");
        System.out.println("Deseja imprimir os dados de qual estudante? ");
        int opcao = kb.nextInt();

        switch(opcao) {
            case 1:
                estudante1.printer();
                break;
            case 2:
                estudante2.printer();
                break;
            default:
                System.out.println("Não há alunos cadastrados com esse número");
                break;
        }

    }

}
