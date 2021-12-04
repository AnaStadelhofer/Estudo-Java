package ParteTres.ProvaTres;
import java.util.ArrayList;
public abstract class Caixa<T> {
    private T elemento;
    private ArrayList<T> elementos = new ArrayList<>();

    public void setElemento(T elemento) {
        this.elementos.add(elemento);
    }

    public T removerElemento(){
        try {
            return elemento;
        }catch(Exception e) {
            return null;
        }
    }
    // Elemento

}
