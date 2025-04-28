package modificadorEstatico.test;

import modificadorEstatico.domain.Carro;

public class Main {
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Mercedes", 275);
        Carro c3 = new Carro("Audi", 290);

        Carro.setVelLimite(180); // como o velLimite virou estático, esse valor vai se aplicar pra todas as inicializações, por isso é comum
        // não se utilizar this em estáticos, já que o this está atrelado à aquela instância (c1, c2, c3) e não no objeto
        c1.print();
        c2.print();
        c3.print();
    }
}
