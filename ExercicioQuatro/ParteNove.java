package ExercicioQuatro;
import java.util.Scanner;

public class ParteNove {
    // 9) Crie dois arrays de 10 posições e depois gere um terceiro array com os valores intercalados desses dois arrays, ao final, imprima os 3. 
    public static void main(String[] args) {
        Scanner print = new Scanner(System.in);
        int qtd = 10;
        int[] array1 = new int[qtd];
        int[] array2 = new int[qtd];
        int[] array3 = new int[qtd];

        for(int i=0; i<qtd; i++) {
            System.out.println(" Digite o "+(1+i)+"o valor do primeiro array: ");
            array1[i] = print.nextInt();
            array3[i] = array1[i];
            System.out.println(" Digite o "+(1+i)+"o valor do segundo array: ");
            array2[i] = print.nextInt();
            array3[10+i] = array2[i];
        }
        for(int i = 0; i< qtd + qtd; i++) {
            System.out.println((i+1)+"a número: "+array3[i]); 
        }
        print.close();
    }
}
