package blocosDeInicializacao.domain;

public class Desenho {
    private String nome;
    private int[] eps = new int[100];

    { // bloco de inicialização -> utilizado para executar linhas de código antes de qualquer outra coisa (antes mesmo do builder)
        System.out.println("Bloco de inicialização");
        for (int i = 0; i < eps.length; i++) {
            eps[i] = (i+1);
        }
    } // bloco executado todas as vezes que o objeto é criado (nesse caso, ele preencheria esse vetor em todos os objetos instaciados)

    public Desenho() {
    }

    public int[] getEps() {
        return this.eps;
    }

    public void setEps(int[] eps) {
        this.eps = eps;
    }
}
