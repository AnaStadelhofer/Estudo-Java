package Exemplos.Banco;
import java.util.Objects;
public class Gerente extends Pessoa{
    private String cargo;
    public Gerente(String nome, String cpf, String dataNascimento) {
        super(nome, cpf, dataNascimento);
        this.cargo = cargo;
    }

    public String getCargo(){
        return cargo;
    }

    public void setCargo(String cargi){
        this.cargo = cargo;
    }
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Gerente)) {
            return false;
        }
        Gerente gerente = (Gerente) o;
        return Objects.equals(this.getCpf(), gerente.getCpf());
    }

    @Override
    public String toString(){
		return "O nome da pessoa é: " + getNome() +
                "\n O cpf é: " + getCpf() +
                "\n A data de nascimento é: " + getDataNascimento() + 
                "\n O cargo é: "+ getCargo();
	}
}
