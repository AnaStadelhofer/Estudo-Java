package Exemplos.Banco;

public class Conta {
    private String agencia;
    private int conta;
    private Double saldo;

    protected Conta(String agencia, int conta, Double saldo){
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = saldo;
    }
    
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public void setConta(int conta){
        this.conta = conta;
    }

    public void setSaldo(Double saldo){
        this.saldo = saldo;
    }

    public String getAgencia() {
        return agencia;
    }

    public int getConta(){
        return conta;
    }

    public Double getSaldo(){
        return saldo;
    }

    public String toString(){
		return " O nome da agencia é: " + getAgencia() +
                "\n O número da sua conta é: " + getConta() +
                "\n Seu saldo é: " + getSaldo() + " ";
	}
}
