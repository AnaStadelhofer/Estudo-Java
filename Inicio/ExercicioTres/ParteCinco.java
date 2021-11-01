package Inicio.ExercicioTres;
import java.util.Scanner;
import java.util.Random;
public class ParteCinco {
    public static void main(String[] args) {
        // 5) Crie um programa que receba o nome de 5 pessoas e aleatorize eles
        Random random = new Random();
        Scanner print = new Scanner(System.in);
        int qtd = 5;
        String[] nome = new String[qtd];
        try{
            for(int i=0; i<qtd; i++){
                System.out.println("\n Digite o "+(i+1)+" nome: "); 
                nome[i] = print.next();
            }
        }catch(Exception e){
            System.out.println("\n Digite um nome! ");
        }
        for(int i=0; i<qtd; i++){
            System.out.println("O " + (i+1) + "a nome foi: " + nome[i]);
        }
        print.close();
    }
}
