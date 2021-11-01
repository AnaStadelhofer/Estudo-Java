package Exemplos.ExercicioUm;
import java.util.ArrayList;

public class Cidade {
    String regiao;
    String m;
    String vegetacaoPredominante;
    Bandeira bandeira;
    ArrayList<Populacao> pessoa = new ArrayList<>();

    public Cidade(
        String regiao,
        String m,
        String vegetacaoPredominante,
        String cor,
        String descricao
    ){
        this.regiao = regiao;
        this.m = m;
        this.vegetacaoPredominante = vegetacaoPredominante;
        this.bandeira = new Bandeira(
            cor,
            descricao,
            this
            );
    }
    public static void main(String[] args) {
        Cidade cidade = new Cidade("Norte", "1.000m", "Floresta", "Rosa", "Tem um gavião");
        System.out.println("\n Região: "+cidade.regiao+
                           "\n Metros quadrado: "+cidade.m+
                           "\n Vegetação: "+cidade.vegetacaoPredominante+
                           "\n Cor: "+cidade.bandeira.cor+
                           "\n Descricao: "+cidade.bandeira.descricao); 

        Populacao populacao = new Populacao("nome", 123, "dataNascimento");       
        cidade.adicionarPessoa(populacao);
    }

    public void adicionarPessoa(Populacao populacao) {
        this.pessoa.add(populacao);
    }

    public void adicionarPessoa(
        String nome,
        int CPF,
        String dataNascimento
    ) {
        this.adicionarPessoa(new Populacao("nome", 123, "dataNascimento"));
        /* System.out.println("\n Nome: "+nome+
                           "\n Cpf: "+CPF+
                           "\n Data de Nascimento: "+dataNascimento); */
       
        for (Populacao populacao : pessoa) {
            System.out.println(populacao.nome + populacao.CPF + populacao.dataNascimento);
        }
    }   
}
