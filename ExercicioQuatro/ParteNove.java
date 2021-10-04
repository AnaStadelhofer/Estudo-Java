import java.util.Scanner;
import java.util.Arrays;

public class ParteNove {
    // 9) Crie dois arrays de 10 posições e depois gere um terceiro array com os valores intercalados desses dois arrays, ao final, imprima os 3. 
    public static void main(String[] args) {
        Scanner print = new Scanner(System.in);
        int qtd = 10;
        int[] array1 = new int[qtd];
        int[] array2 = new int[qtd];
        int lenArray1 = array1.length;
        int lenArray2 = array2.length;
        int[] array3 = new int[lenArray1 + lenArray2];

        for(int i=0; i<qtd; i++) {
            System.out.println(" Digite o "+(1+i)+"o valor do primeiro array: ");
            array1[i] = print.nextInt();
            System.out.println(" Digite o "+(1+i)+"o valor do segundo array: ");
            array2[i] = print.nextInt();
        }
        System.arraycopy(array1, 0, array3, 0, lenArray1);  
        System.arraycopy(array2, 0, array3, lenArray1, lenArray2);  
        System.out.println("Array1: " + Arrays.toString(array1));
        System.out.println("Array2: " + Arrays.toString(array2));
        System.out.println("Concatenated Array: " + Arrays.toString(array3)); 
        print.close();
    }
}