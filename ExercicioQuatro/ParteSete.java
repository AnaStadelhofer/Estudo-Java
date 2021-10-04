package ExercicioQuatro;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ParteSete {
    // 7) Crie um programa que simule a fila de atendimento de um banco. 
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int senhaAtual = 0;

        System.out.println("Banco Java");
        int opt = 0;
        do {
            System.out.println("Digite a operação:");
            System.out.println("[1] - Entrada");
            System.out.println("[2] - Chamar Senha");
            System.out.println("[0] - Sair");
            opt = scanner.nextInt();

            if (opt == 1) {
                queue.add(++senhaAtual);
                System.out.println("Sua senha é " + senhaAtual);
            } else if (opt == 2) {
                Integer senhaChamada = queue.poll();
                if (senhaChamada == null) {
                    System.out.println("A fila está vazia");
                } else {
                    System.out.println("A senha chamada é " + senhaChamada);
                }
            } else {
                System.out.println("Operação Inválida");
            }
        } while (opt != 0);
        scanner.close();
    } 
}
