package ExercicioQuatro;
import java.util.Scanner;
public class ParteOito {
    // 8) Crie um programa que receba a temperatura média de cada mês do ano e após exiba a temperatura média do ano.
    public static void main(String[] args) {
        Scanner print = new Scanner(System.in);
        int qtd = 12;
        Double[] temp = new Double[qtd];
        Double soma = 0.0;
        Double media = soma / qtd;
        for(int i=0; i<qtd; i++){
            System.out.println(" Informe a "+(i+1)+"a temperatura");
            try{
            temp[i] = print.nextDouble();
            soma += temp[i];
            } catch(Exception e){
                System.out.println(" Número invalido!");
            }
        }
        for(int i=0; i<qtd; i++){
            if(temp[i] == null){
                System.out.println(" A "+(i+1)+" está vazio!");
            } else {
                System.out.println(" A "+(i+1)+"a foi: "+temp[i]);
            }
        }
        System.out.println(" A temperatura média foi: "+ media);
        print.close();
    }
}
