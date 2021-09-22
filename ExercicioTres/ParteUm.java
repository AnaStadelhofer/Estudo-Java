package ExercicioTres;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class ParteUm {
    // 1) Crie um programa que receba um valor e calcule a tabuada deste valor, salvando seu resultado em um arquivo de texto.
    public static void main(String[] args) {
        Scanner print = new Scanner(System.in);
        int tabuada = 0;
        try{
            BufferedWriter escrita = new BufferedWriter(new FileWriter("./ExercicioTres/Tabuada.txt"));
            System.out.println("\n Informe um número para a tabuada");
            tabuada = print.nextInt();
            for(int i = 0; i <= 10; i++){
                escrita.append(tabuada + " * " + i + " = " + (tabuada * i) + "\n");
            }
            
            escrita.close();
        }catch(java.util.InputMismatchException e){
            System.out.println("Valor invalido!");
        } catch (IOException exception){
            System.out.println("Erro de exceção I/O: " + exception.getMessage());
        }       
    }
}

