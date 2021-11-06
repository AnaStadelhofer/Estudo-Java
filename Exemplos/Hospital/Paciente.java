package Exemplos.Hospital;
import java.util.ArrayList;
import java.util.Objects;


public class Paciente extends Pessoa{
    private int registro;
    public Paciente(String nome, String cpf, String dataNascimento, int registro) {
		super(nome, cpf, dataNascimento);
        this.registro = registro;
	}

    ArrayList<Consulta> consultas = new ArrayList<>();
    public int getRegistro(){
        return registro;
    }

    public void setRegistro(int registro){
        this.registro = registro;
    }

    public void setConsulta(Consulta consulta) {
        this.consultas.add(consulta);
    }

    public ArrayList<Consulta> getConsultas() {
        return this.consultas;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Paciente)) {
            return false;
        }
        Paciente paciente = (Paciente) o;
        return Objects.equals(this.getCpf(), paciente.getCpf());
    }

    @Override
    public String carteira(){
            return " O nome da pessoa é: " + getNome() +
                "\n O cpf é: " + getCpf() +
                "\n A data de nascimento é: " + getDataNascimento() + 
                "\n O registro do paciente é: " + getRegistro() + "\n\n";
	}
}
