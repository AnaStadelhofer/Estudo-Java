package ExercicioQuatro;
import java.util.Scanner;
public class ParteUm {
    public static void main(String[] args) {
        //1) Crie um programa que questione a quantidade de notas a ser informada, receba as notas e calcule a média. 
        Scanner print = new Scanner(System.in);
        int qtd = 0;
        Double soma = 0.00;
        Double media = 0.00;
        int i=0;
        Double[] nota = new Double[43];
        System.out.println(" Informe quantas notas você quer cadastras: ");
        try{
            qtd = print.nextInt();
        } catch(Exception e) {
            System.out.println(" Número invalido...");
        }
        for(i=0; i<qtd; i++){
            try{
                System.out.println(" Digite a "+ (i+1) +"a nota: ");
                nota[i] = print.nextDouble();
            }catch(Exception e) {
                System.out.println(" Número invalido...");
            }
            soma = soma + nota[i];
        }
            media = soma/i;
            System.out.println(" Foi digitado " + i + " notas, a soma foi " + soma + " e a media foi " + media);
            print.close();
        }
}
