package ExercicioQuatro;
import java.util.Scanner;
public class ParteDez {
    // 10) Crie um programa que leia 20 valores, calcule a média aritmética desses valores e imprima os valores que são inferiores a esta média.
    public static void main(String[] args) {
        int qtd = 5;
        Double[] numeros = new Double[qtd];
        Double soma = 0.0;
        Double media = 0.0;
        int i = 0;
        Scanner print = new Scanner(System.in);
        for(i=0; i<qtd; i++){
            System.out.println(" Informe um número: ");
            numeros[i] = print.nextDouble();
            soma += numeros[i];
        }
        System.out.println(" A soma foi: " + soma);
        media = soma / qtd;
        System.out.println(" A média foi: " + media);
        for(i=0; i<qtd; i++){
            if(numeros[i] < media){
                System.out.println(" O número " + numeros[i] + " é menor que a média");
            }
        }
        print.close();
    }
}
