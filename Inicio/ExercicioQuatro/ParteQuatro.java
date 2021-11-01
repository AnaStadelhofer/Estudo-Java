package Inicio.ExercicioQuatro;

import java.util.Scanner;
public class ParteQuatro {
    public static void main(String[] args) {
        //4) Crie um programa que leia 10 valores int e salve em um array, depois imprima se esses valores são pares ou ímpares. 
        Scanner print = new Scanner(System.in);
        int qtd = 10;
        int[] numeros = new int[qtd];
        for(int i = 0; i < qtd; i++) {
            System.out.println(" Digite um número: ");
            try{
                numeros[i] = print.nextInt();
            }catch(Exception e) {
                System.out.println(" Número invalido! ");
            }
        }
        for(int i = 0; i < numeros.length; i++) {
            if(numeros[i] % 2 == 0) {
                System.out.println(" O número "+ numeros[i] + " é par");
            } else {
                System.out.println(" O número "+ numeros[i] + " é ímpar");
            }
        }
        print.close(); 
    }
}
