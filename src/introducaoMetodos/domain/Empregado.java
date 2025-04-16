package introducaoMetodos.domain;

public class Empregado {
    public String nome;
    public int idade;
    public double[] salario = new double[3];

    public void print() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
    }

    public void media() {
        double soma = 0;
        for (double valor : salario) {
            soma += valor;
        }
        System.out.println("Média dos salários: " + soma / this.salario.length);
    }
}
