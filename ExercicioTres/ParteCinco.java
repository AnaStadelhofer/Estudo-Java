package ExercicioTres;
import java.util.Scanner;
public class ParteCinco {
    public static void main(String[] args) {
        // 5) Crie um programa que receba o nome de 5 pessoas e aleatorize eles
        Scanner print = new Scanner(System.in);
        String nome1 = "";
        String nome2 = "";
        String nome3 = "";
        String nome4 = "";
        String nome5 = "";
        try{
            System.out.println("\n Digite o primeiro nome: "); 
            nome1 = print.next();
        }catch(Exception e){
            System.out.println("\n Digite um nome! ");
        }
        try{
            System.out.println("\n Digite o primeiro nome: "); 
            nome2 = print.next();
        }catch(Exception e){
            System.out.println("\n Digite um nome! ");
        }
        try{
            System.out.println("\n Digite o primeiro nome: "); 
            nome3 = print.next();
        }catch(Exception e){
            System.out.println("\n Digite um nome! ");
        }
        try{
            System.out.println("\n Digite o primeiro nome: "); 
            nome4 = print.next();
        }catch(Exception e){
            System.out.println("\n Digite um nome! ");
        }
        try{
            System.out.println("\n Digite o primeiro nome: "); 
            nome5 = print.next();
        }catch(Exception e){
            System.out.println("\n Digite um nome! ");
        }
    }
}
