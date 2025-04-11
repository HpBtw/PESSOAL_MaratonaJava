package introducaoMetodos.domain;

import javax.swing.*;
import java.text.DecimalFormat;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salario = new double[3];

    public void print() {
        DecimalFormat df = new DecimalFormat("00.00");

        String aux = "Nome: " + this.nome + "\nIdade: " + this.idade + "\nMédia dos salários informados: " + (df.format(mediaSalarios()));
        JOptionPane.showMessageDialog(null, aux);
    }

    public double mediaSalarios() {
        double soma = 0;

        for (int i = 0; i < salario.length; i++) {
            soma += salario[i];
        }

        return soma / salario.length;
    }
}
