package introducaoMetodos.domain;

public class EstudanteMetodoOtimizado {
    public String nome;
    public int idade;
    public int serie;
    public int id;
    public char sexo;

    public void printer() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Série: " + this.serie);
        System.out.println("RM: " + this.id);
        System.out.println("Gênero: " + this.sexo);

    }
}
