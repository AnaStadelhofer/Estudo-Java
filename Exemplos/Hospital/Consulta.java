package Exemplos.Hospital;

public class Consulta {
    private String data;
    private String atendimento;
    private Medico medico;
    private Paciente paciente;
    public Consulta(
        String data,
        String atendimento,
        Medico medico,
        Paciente paciente
    ){
        this.data = data;
        this.atendimento = atendimento;
        this.medico = medico;
        this.paciente = paciente;

        medico.setConsulta(this);
        paciente.setConsulta(this);
    }

    public String getData(){
        return data;
    }

    public void setData(String data){
        this.data = data;
    }

    public String getAtendimento(){
        return atendimento;
    }

    public void setAtendimento(String atendimento){
        this.atendimento = atendimento;
    }

    public Medico getMedico(){
        return medico;
    }

    public Paciente getPaciente(){
        return paciente;
    }

    public void setPaciente(Paciente paciente){
        this.paciente = paciente;
    }

    public void setMedico(Medico medico){
        this.medico = medico;
    }

    public String registro(){
		return " A data da consulta é: " + getData() +
                "\n O tipo do atendimento é: " + getAtendimento() + 
                "\n Nome Medico: " + medico.getNome() +
                "\n Nome Paciente: " + paciente.getNome() + "\n\n";
	}

    public boolean equals(Object o){
        if(o == this){
            return true;
        }
        if(!(o instanceof Consulta)) {
            return false;
        }
        Consulta consulta = (Consulta) o;
        return this.getMedico().getCpf() == consulta.getMedico().getCpf()
        && this.getPaciente().getCpf() == consulta.getPaciente().getCpf()
        && this.getData() == getData();
    }

}
