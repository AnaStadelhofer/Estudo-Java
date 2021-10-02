package ExercicioTres;
import java.util.Scanner;
public class ParteQuatro {
    public static void main(String[] args) {
    //  4) Crie um programa que execute uma operação de Exponenciação com o valor inteiro com precisão arbitrária.
    Scanner print = new Scanner(System.in);
    System.out.println("\n Digite um número!");
    double num = 0;
    double expoente = 0;
    try{
        num = print.nextInt();
    } catch(Exception e) {
        System.out.println("\n Número invalido");
    }
    try{
        expoente = print.nextInt();
    } catch(Exception e) {
        System.out.println("\n Número invalido");
    }
    
    double resultado = Math.pow(num,expoente);
    System.out.println("\n A operação é " + num + " elevado a " + expoente + ", o resultado é: " + resultado);
    print.close(); 
    }
}
