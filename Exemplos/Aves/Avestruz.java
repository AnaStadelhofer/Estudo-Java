package Exemplos.Aves;
public class Avestruz extends Aves{
    private Double altura;
    private Double velocidade;
    protected Avestruz(String bico, String pena, Double altura, Double velocidade) {
        super(bico, pena);
        this.altura = altura;
        this.velocidade = velocidade;
    }
    public static void main(String[] args) {
        Avestruz avestruz1 = new Avestruz("Bico1", "Pena1", 1.00, 3.00);
        Avestruz avestruz2 = new Avestruz("Bico2", "Pena2", 1.00, 2.00);
        System.out.println(avestruz1);
        System.out.println(avestruz2);
    }

    public void setVelocidade(Double velocidade){
        this.velocidade = velocidade;
    }

    public Double getVelocidade(){
        return velocidade;
    }

    public void setAltura(Double altura){
        this.altura = altura;
    }

    public Double getAltura(){
        return altura;
    }
    @Override
    public String toString(){ 
        return " O bico do passáro é: " + getBico() + " e a pena é: " + getPena() + " velocidade: " + getVelocidade() + " altura: " + getAltura() + " ";
    }
}
