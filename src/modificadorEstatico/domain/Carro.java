package modificadorEstatico.domain;

public class Carro {
    private String nome;
    private double velMax;
    public static double velLimite = 250; // modificador relacionado à instanciação da classe, ou seja, sempre que o método for inicializado
    // ele receberá esse valor, independente da referência

    public Carro(String nome, double velMax) {
        this.nome = nome;
        this.velMax = velMax;
    }

    public void print() {
        System.out.print("\n--------------------------");
        System.out.print("\nNome: " + this.nome);
        System.out.print("\nVelocidade máxima: " + this.velMax);
        System.out.print("\nVelocidade limite: " + Carro.velLimite); // explicação no main
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelMax() {
        return velMax;
    }

    public void setVelMax(double velMax) {
        this.velMax = velMax;
    }

    public static double getVelLimite() {
        return velLimite;
    }

    public static void setVelLimite(double velLimite) {
        Carro.velLimite = velLimite;
    }
}
