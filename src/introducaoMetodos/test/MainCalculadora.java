package introducaoMetodos.test;

import introducaoMetodos.domain.Calculadora;

import java.util.Scanner;

public class MainCalculadora {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        Calculadora calc = new Calculadora();
        calc.soma();
        calc.subtrair();

        System.out.println("Digite o valor x: ");
        double x = kb.nextDouble();

        System.out.println("Digite o valor y: ");
        double y = kb.nextDouble();

        calc.multiplicar(x, y);

        System.out.print(x + " / " + y + " = " + calc.dividir(x, y));
    }
}
