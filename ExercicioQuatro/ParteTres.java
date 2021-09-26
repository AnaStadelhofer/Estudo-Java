package ExercicioQuatro;
import java.util.Scanner;
public class ParteTres {
    public static void main(String[] args) {
        Scanner print = new Scanner(System.in);
        // 3) Crie um programa que leia 10 valores double e salve em um array, depois imprima esses valores. 
        Double[] numeros = new Double[10];
        for(int i = 0; i < 10; i++) {
            System.out.println(" Informe o "+ (1+i) + "o número");
            try{
                numeros[i] = print.nextDouble();
            }catch(Exception e){
                System.out.println(" Número invalido! ");
            }
        }
        for(int i = 0; i < numeros.length; i++) {
            System.out.println( i +"a Posição: " + numeros[i]);
        }
        print.close();   
    }
}
