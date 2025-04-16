package sobrecargametodo.domain;

public class Desenho {
    private String nome;
    private String genero;
    private int eps;
    private String tipo;

    public void print() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Gênero: " + this.genero);
        System.out.println("Episódios: " + this.eps);
    }

    public void init(String nome, String genero, int eps) {
        this.nome = nome;
        this.genero = genero;
        this.eps = eps;
    }

    public void init(String nome, String genero, int eps, String tipo) {
        init(nome, genero, eps);
        this.tipo = tipo;
    }

    public String getNome() {
        return this.nome;
    }

    public String getGenero() {
        return this.genero;
    }

    public int getEps() {
        return this.eps;
    }
}
