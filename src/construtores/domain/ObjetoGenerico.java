package construtores.domain;

public class ObjetoGenerico {
    private String nome;
    private String cor;
    private int numero;

    public ObjetoGenerico(String nome, String cor, int numero) {
        this.nome = nome;
        this.cor = cor;
        this.numero = numero;
    }

    public ObjetoGenerico() {} // Sobrecarga de construtor, esse construtor é o "padrão" do java, inicializando tudo null ou 0
}
