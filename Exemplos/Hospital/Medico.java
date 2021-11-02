package Exemplos.Hospital;
public class Medico extends Pessoa {
    private int crm;
    private String estado;
    protected Medico(String nome, String cpf, String dataNascimento, int crm, String estado) {
		super(nome, cpf, dataNascimento);
        this.crm = crm;
        this.estado = estado;
	}
    
	public static void main(String[] args) {
        Medico medico1 = new Medico("Jackson Machado", "993.272.960-44", "09/05/1992", 24634534, "Santa Catarina");
        Medico medico2 = new Medico("Marcio Amaral", "643.071.970-70", "30/12/1996", 1235734, "Acre");
        Medico medico3 = new Medico("Robertinho Gaucho", "028.965.170-06", "10/03/2001", 19263847, "Bahia");
        System.out.println(medico1.carteira());
        System.out.println(medico2.carteira());
        System.out.println(medico3.carteira());
	}

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

    @Override
    public String carteira(){
            return " O nome da pessoa é: " + getNome() +
                "\n O cpf é: " + getCpf() +
                "\n A data de nascimento é: " + getDataNascimento() + 
                "\n O CRM do médico é: " + getCrm() +
                "\n O médico é do estado: " + getEstado() +
                "\n";
	}

}