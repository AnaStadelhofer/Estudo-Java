package Exemplos.Banco;
import java.util.Objects;
public class Correntista extends Pessoa {
    private String dataInicio;
    public Correntista(String nome, String cpf, String dataNascimento){
        super(nome, cpf, dataNascimento);
        this.dataInicio = dataInicio;
    }

    public String getDataInicio(){
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Correntista)) {
            return false;
        }
        Correntista correntista = (Correntista) o;
        return Objects.equals(this.getCpf(), correntista.getCpf());
    }

    @Override
    public String toString(){
		return "O nome da pessoa é: " + getNome() +
                "\n O cpf é: " + getCpf() +
                "\n A data de nascimento é: " + getDataNascimento() + 
                "\n A data de inicio é: "+ getDataInicio();
	}

}
