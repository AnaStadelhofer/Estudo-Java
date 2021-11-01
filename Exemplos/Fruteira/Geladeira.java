package Exemplos.Fruteira;
import java.util.ArrayList;

public class Geladeira {
    String cor;
    ArrayList<Fruta> frutas = new ArrayList<>();
    public Geladeira(
        String cor
    ) {
        this.cor = cor;
    }

    public void adicionarFruta(Fruta fruta){
        this.frutas.add(fruta);
    }

    public void adicionarFruta(String nome){

    }

}
