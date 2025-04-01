package introducaoMetodos.domain;

public class Calculadora {
    public void soma() {
        System.out.println("10 + 10 = " + (10+10));
    }

    public void subtrair() {
        System.out.println("21 - 2 = " + (21-2));
    }

    public void multiplicar(double x, double y) {
        System.out.println(x + " * " + y + " = " + (x*y));
    }

    public double dividir(double x, double y) {
        double diferenca = x / y;

        if (y == 0) {
            System.out.println("Equação impossível - Divisão por 0");
        }

        return diferenca;
        // ou exclui a variavel diferenca, e return x / y;
    }
}
