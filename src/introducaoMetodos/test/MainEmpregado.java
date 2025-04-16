package introducaoMetodos.test;

import introducaoMetodos.domain.Empregado;

public class MainEmpregado {
    public static void main(String[] args) {
        Empregado empregado = new Empregado();

        empregado.nome = "Mateus";
        empregado.idade = 20;
        empregado.salario[0] = 2000;
        empregado.salario[1] = 3000;
        empregado.salario[2] = 4000;

        empregado.print();
        empregado.media();
    }
}
