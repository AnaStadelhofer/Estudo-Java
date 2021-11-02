package Exemplos.Aves;
public class Sabia extends Aves{

    String canto;
    protected Sabia(String bico, String pena, String canto) {
        super(bico, pena);
        this.canto = canto;
    }
    public static void main(String[] args) {
        Sabia sabia1 = new Sabia("Bico1", "Pena1", "canto1");
        Sabia sabia2 = new Sabia("Bico2", "Pena2", "canto2");
        System.out.println(sabia1);
        System.out.println(sabia2);
    }

    public void setCanto(String canto){
        this.canto = canto;
    }

    public String getCanto(){
        return canto;
    }
    @Override
    public String toString(){ 
        return " O bico do passáro é: " + getBico() + " e a pena é: " + getPena() + " Canto: " + getCanto() + " ";
    }
}
