package introducaoMetodos.test;

import introducaoMetodos.domain.Funcionario;

import javax.swing.*;
import java.util.Scanner;

public class MainFuncionario {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        Funcionario func1 = new Funcionario();
        Funcionario func2 = new Funcionario();
        Funcionario func3 = new Funcionario();

        func1.nome = "Fabricio";
        func1.idade = 30;

        func2.nome = "Marcos";
        func2.idade = 23;

        func3.nome = "Batzao";
        func3.idade = 18;

        int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Deseja checar os dados de qual funcionário? (1, 2 ou 3)"));

        String aux = "Deseja inserir o valor de 3 salários?";
        String confirm;

        switch (opcao) {
            case 1:
                confirm = JOptionPane.showInputDialog(null, aux);
                if (confirm.equals("sim")) {
                    int cont = 1;

                    func1.salario[0] = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o salário 1: "));
                    func1.salario[1] = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o salário 2: "));
                    func1.salario[2] = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o salário 3: "));
                } else {
                    JOptionPane.showMessageDialog(null, "Sem salários informados.");
                }
                func1.print();
                break;
            case 2:
                confirm = JOptionPane.showInputDialog(null, aux);
                if (confirm.equals("sim")) {
                    int cont = 1;

                    func2.salario[0] = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o salário 1: "));
                    func2.salario[1] = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o salário 2: "));
                    func2.salario[2] = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o salário 3: "));
                } else {
                    JOptionPane.showMessageDialog(null, "Operação finalizada");
                }
                func2.print();
                break;
            case 3:
                confirm = JOptionPane.showInputDialog(null, aux);
                if (confirm.equals("sim")) {
                    int cont = 1;

                    func3.salario[0] = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o salário 1: "));
                    func3.salario[1] = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o salário 2: "));
                    func3.salario[2] = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o salário 3: "));
                } else {
                    JOptionPane.showMessageDialog(null, "Operação finalizada");
                }
                func3.print();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Número de funcionário inválido!");
        }
    }
}
