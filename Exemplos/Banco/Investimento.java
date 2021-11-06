package Exemplos.Banco;
import java.util.Objects;
public class Investimento extends Conta{
    private String carteira;
    private Gerente gerente;
    private Correntista correntista;
    public Investimento(String agencia, int conta, Double saldo, String carteira, Gerente gerente, Correntista correntista){
        super(agencia, conta, saldo);
        this.carteira = carteira;
        this.gerente = gerente;
        this.correntista = correntista;
    }

    public void setCarteira(String carteira){
        this.carteira = carteira;
    }

    public String getCarteira(){
        return carteira;
    }

    public Gerente getGerente(){
        return gerente;
    }

    public void setPaciente(Gerente gerente){
        this.gerente = gerente;
    }

    public Correntista getCorrentista(){
        return correntista;
    }

    public void setCorrentista(Correntista correntista){
        this.correntista = correntista;
    }

    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Investimento)) {
            return false;
        }
        Investimento investimento = (Investimento) o;
        return Objects.equals(this.getConta(), investimento.getConta());
    }

    public String toString(){
		return " O nome da agencia é: " + getAgencia() +
                "\n O número da sua conta é: " + getConta() +
                "\n Seu saldo é: " + getSaldo() +
                "\n Sua carteira é: " + getCarteira() + "\n\n" ;
	}
}
