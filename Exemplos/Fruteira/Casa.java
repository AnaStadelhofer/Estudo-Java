package Exemplos.Fruteira;
public class Casa {
    public static void main(String[] args) {
        Geladeira geladeira = new Geladeira("Rosa");

        geladeira.adicionarFruta("Banana");

        Fruta fruta = new Fruta("Maçã");

        geladeira.adicionarFruta(fruta);
        }
}
