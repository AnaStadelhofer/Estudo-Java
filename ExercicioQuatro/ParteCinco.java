package ExercicioQuatro;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ParteCinco {
        //5) Crie um programa que possua uma collection que represente as 52 cartas do baralho, imrpima elas. 
        public static void main(String[] args) {
            String[] numeros = { "A", "1", "2"};
            String[] nipes = { "Copas", "Paus", "Ouros", "Espadas"};
            Set<String> set = new HashSet<String>();
            SortedSet<String> SetOrdenado = new TreeSet<>();
        
            for(String nipe : nipes) {
                for(String numero : numeros) {
                    String carta = numero + " "+nipe;
                    set.add(carta);
                    SetOrdenado.add(carta);
                }
            }
            System.out.println("Baralho comum");
            for(String valores:set){
                System.out.println(valores);
            }
            /*
            for(String carta:sortedSet){
                System.out.println(carta);
            } 
            */
        }     
}

