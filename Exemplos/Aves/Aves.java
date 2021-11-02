package Exemplos.Aves;
public class Aves {
    private String bico;
    private String pena;

    protected Aves(String bico, String pena) {
        this.bico = bico;
        this.pena = pena;
    }

    public String getBico(){
        return bico;
    }

    public void setBico(String bico){
        this.bico = bico;
    }

    public void setPena(String pena){
        this.pena = pena;
    }

    public String getPena(){
        return pena;
    }

    public String toString(){ 
        return "O bico do passáro é: " + getBico() + " e a pena é: " + getPena() + " ";
    }

}
