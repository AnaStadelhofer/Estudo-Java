package Exemplos.Hospital;
import java.util.ArrayList;
public class Consulta {
    private String data;
    private String atendimento;
    public Consulta(
        String data,
        String atendimento
    ){
        this.data = data;
        this.atendimento = atendimento;
    }
    public static void main(String[] args) {
        Consulta consulta1 = new Consulta("01/10/2021", "Presencial");
        Consulta consulta2 = new Consulta("02/07/2021", "Online");
        Consulta consulta3 = new Consulta("03/04/2021", "Presencial");
        Consulta consulta4 = new Consulta("04/1/2021", "Presencial");
        Consulta consulta5 = new Consulta("15/10/2021", "Online");
        Consulta consulta6 = new Consulta("16/11/2021", "Online");
        Consulta consulta7 = new Consulta("17/03/2021", "Presencial");
        Consulta consulta8 = new Consulta("18/11/2021", "Online");
        Consulta consulta9 = new Consulta("19/02/2021", "Presencial");
        Consulta consulta10 = new Consulta("20/4/2021", "Online");
        System.out.println(consulta1.registro());
        System.out.println(consulta2.registro());
        System.out.println(consulta3.registro());
        System.out.println(consulta4.registro());
        System.out.println(consulta5.registro());
        System.out.println(consulta6.registro());
        System.out.println(consulta7.registro());
        System.out.println(consulta8.registro());
        System.out.println(consulta9.registro());
        System.out.println(consulta10.registro());
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

    public String registro(){
		return " A data da consulta é: " + getData() +
                "\n O tipo do atendimento é: " + getAtendimento() + "\n";
	}

}
