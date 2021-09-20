package ExercicioTres;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class ParteDois {
    // 2) Crie um programa que leia e imprima no console todas as linhas de um arquivo de texto.
    public static void main(String[] args) {
        try{
            BufferedWriter escrita = new BufferedWriter(new FileWriter("./ExercicioTres/Texto.txt"));
            
            String digitado = "";
            Scanner in = new Scanner(System.in);
            digitado = in.nextLine();

            in.close();
            escrita.append(digitado + "\n");
            escrita.close();
        } catch (IOException exception){
            System.out.println("Erro de exceção I/O: " + exception.getMessage());
        }  
        try{
            BufferedReader leitura = new BufferedReader(new FileReader("./ExercicioTres/Texto.txt"));
            String value = "";
            while (true){
                if(value != null)
                    System.out.println(value);
                else
                    break;    
                value = leitura.readLine();
            }
            leitura.close();
        } catch (IOException exception){
            System.out.println("Erro de exceção I/O: " + exception.getMessage());
        }
    }
}   
