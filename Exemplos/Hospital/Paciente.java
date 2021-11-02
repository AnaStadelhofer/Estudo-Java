package Exemplos.Hospital;
public class Paciente extends Pessoa{
    private int registro;
    protected Paciente(String nome, String cpf, String dataNascimento, int registro) {
		super(nome, cpf, dataNascimento);
        this.registro = registro;
	}
	public static void main(String[] args) {
        Paciente paciente1 = new Paciente("José Almeida", "853.322.460-56", "10/10/2002", 24634534);
        Paciente paciente2 = new Paciente("Julia Madeira", "225.659.090-98", "11/02/1995", 12345123);
        Paciente paciente3 = new Paciente("Roberth Gaucho", "247.666.780-36", "31/10/1980", 64565452);
        System.out.println(paciente1.carteira());
        System.out.println(paciente2.carteira());
        System.out.println(paciente3.carteira());
	}

    public int getRegistro(){
        return registro;
    }

    public void setRegistro(int registro){
        this.registro = registro;
    }

    @Override
    public String carteira(){
            return " O nome da pessoa é: " + getNome() +
                "\n O cpf é: " + getCpf() +
                "\n A data de nascimento é: " + getDataNascimento() + 
                "\n O registro do paciente é: " + getRegistro() + "\n";
	}
}
