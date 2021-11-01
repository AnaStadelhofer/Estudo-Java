package Exemplos.Escola;
public class Aluno {
    String nome;
    String telefone;
    String curso;
    int periodo;
    int matricula;
    String tipoSanguineo;
    String endereco;
    String cep;
    String nascimento;
    Cracha cracha;

    public Aluno(
        String nome,
        String telefone,
        String curso,
        int periodo,
        int matricula,
        String tipoSanguineo,
        String endereco,
        String cep,
        String nascimento,
        String dataInicial,
        String numero,
        String foto,
        String instituicao
    ) {
        this.nome = nome;
        this.telefone = telefone;
        this.curso = curso;
        this.periodo = periodo;
        this.matricula = matricula;
        this.tipoSanguineo = tipoSanguineo;
        this.endereco = endereco;
        this.cep = cep;
        this.nascimento = nascimento;
        this.cracha = new Cracha(
            dataInicial,
            numero,
            foto,
            instituicao,
            this
        );

    }

}
