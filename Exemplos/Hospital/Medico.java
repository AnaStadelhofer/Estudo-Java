package Exemplos.Hospital;
import java.util.Objects;
import java.util.ArrayList;
public class Medico extends Pessoa {
    private int crm;
    private String estado;
    public Medico(String nome, String cpf, String dataNascimento, int crm, String estado) {
		super(nome, cpf, dataNascimento);
        this.crm = crm;
        this.estado = estado;
	}
    
    private ArrayList<Consulta> consultas = new ArrayList<>();

    public int getCrm(){
        return crm;
    }

    public void setCrm(int crm){
        this.crm = crm;
    }

    public String getEstado(){
        return estado;
    }

    public void setEstado(String estado){
        this.estado = estado;
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
        if (!(o instanceof Medico)) {
            return false;
        }
        Medico medico = (Medico) o;
        return Objects.equals(this.getCpf(), medico.getCpf());
    }

    @Override
    public String carteira(){
            return " O nome da pessoa é: " + getNome() +
                "\n O cpf é: " + getCpf() +
                "\n A data de nascimento é: " + getDataNascimento() + 
                "\n O CRM do médico é: " + getCrm() +
                "\n O médico é do estado: " + getEstado() +
                "\n\n ";
	}
}