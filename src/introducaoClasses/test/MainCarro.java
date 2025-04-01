package introducaoClasses.test;

import introducaoClasses.domain.Carro;

public class MainCarro {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Prisma";
        carro1.ano = 2006;
        carro1.modelo = "Sedan";

        carro2.nome = "Creta";
        carro2.ano = 2023;
        carro2.modelo = "SUV";

        System.out.println("Carro 1: ");
        System.out.println("Nome: " + carro1.nome + "\t Ano: " + carro1.ano + "\t Modelo: " + carro1.modelo);
        System.out.println();
        System.out.println("Carro 2: ");
        System.out.println("Nome: " + carro2.nome + "\t Ano: " + carro2.ano + "\t Modelo: " + carro2.modelo);

    }
}
