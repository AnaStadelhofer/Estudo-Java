package Exemplos.Banco;
import java.util.Objects;
public class Corrente extends Conta {
    private String historico;
    private Gerente gerente;
    public Corrente(String agencia, int conta, Double saldo, Gerente gerente){
        super(agencia, conta, saldo);
        this.historico = historico;
        this.gerente = gerente;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    public String getHistorio(){
        return historico;
    }

    public Gerente getGerente(){
        return gerente;
    }

    public void setGerente(Gerente gerente){
        this.gerente = gerente;
    }

    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Corrente)) {
            return false;
        }
        Corrente corrente = (Corrente) o;
        return Objects.equals(this.getConta(), corrente.getConta());
    }

    @Override
    public String toString(){
		return " O nome da agencia é: " + getAgencia() +
                "\n O número da sua conta é: " + getConta() +
                "\n Seu saldo é: " + getSaldo() + 
                "\n O historico da sua conta e: " + getHistorio();
	}

}
