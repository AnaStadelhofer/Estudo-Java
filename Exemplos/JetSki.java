package Exemplos;
public class JetSki {
    int potencia;
    Double valor;
    String modelo;
    int ano;
    String marca;
    int qtdPessoa;
    boolean aguaDoce;
    boolean vemCapa;
    boolean aguaSalgado;
    boolean ligado;

public static int maxPes = 2;
public static int minPes = 1;

    public JetSki(
        int potencia,
        Double valor,
        String modelo,
        int ano,
        String marca,
        int qtdPessoa,
        boolean aguaDoce,
        boolean vemCapa,
        boolean aguaSalgado,
        boolean ligado
    ) {
        this.potencia = potencia;
        this.valor = valor;
        this.modelo = modelo;
        this.ano = ano;
        this.marca = marca;
        this.qtdPessoa = qtdPessoa;
        this.aguaDoce = aguaDoce;
        this.vemCapa = vemCapa;
        this.aguaSalgado = aguaSalgado;
        this.ligado = ligado;
    }

    void darPartida(){
        ligado = true;
    }

    void entrarPessoa(){
        qtdPessoa++;
    }
    
    void sairPessoa(){
        qtdPessoa--;
    }
}
