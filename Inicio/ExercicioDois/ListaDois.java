package Inicio.ExercicioDois;
import java.util.Scanner;

public class ListaDois {
    public static void main(String[] args) {
        Scanner print = new Scanner(System.in); //declara
        int escolha = 0;
        
        do{
            System.out.println("Escolha um número!");
            System.out.println(" [1] - Nota");
            System.out.println(" [2] - Mês");
            System.out.println(" [3] - Forca");
            System.out.println(" [4] - Tabuada");
            System.out.println(" [5] - Letra a letra");
            System.out.println(" [6] - Impares de 0 a 500");
            System.out.println(" [7] - Nota negativa");
            System.out.println(" [8] - Fatorial");
            System.out.println(" [9] - IMC");
            System.out.println(" [10] - Operação");
            System.out.println(" [11] - Desafio");
            System.out.println("\n Escolho o número: ");
            escolha = print.nextInt(); //cin
        switch(escolha) {
            case 1:
                //Crie um programa que receba três notas calcule a média e diga se foi aprovado ((nota1 + nota2 + nota3 / 3)) e (média maior que 7 para ser aprovado).
                int nota1 = 10;
                int nota2 = 10;
                int nota3 = 9;
                int media = (nota1 + nota2 + nota3) / 3;

                if(media > 7){
                    System.out.println("Aprovado!");
                } else {
                    System.out.println("Reprovado!");
                }
            break;
            case 2:
                //Crie um programa que receba um número e indique o mês que representa.
                int mes = 0;
                do{
                    System.out.println("Informe um mês em número: ");
                    mes = print.nextInt();
                } while ((mes < 1) || (mes > 12));

                if(mes == 1) {
                    System.out.println("Janeiro");
                } else if(mes == 2){
                    System.out.println("Fevereiro");
                } else if(mes == 3) {
                    System.out.println("Março");
                } else if(mes == 4) {
                    System.out.println("Abril");
                } else if(mes == 5) {
                    System.out.println("Maio");
                } else if(mes == 6) {
                    System.out.println("Junho");
                } else if(mes == 7) {
                    System.out.println("Julho");
                } else if(mes == 8) {
                    System.out.println("Agosto");
                } else if(mes == 9) {
                    System.out.println("Setembro");
                } else if(mes == 10) {
                    System.out.println("Outubro");
                } else if(mes == 11) {
                    System.out.println("Novembro");
                } else {
                    System.out.println("Dezembro");
                }
            break;
            case 3: 
                //Crie um programa que simule um jogo da forca, com a entrada da palavra oculta, a quantidade de tentativas para acerto e depois solicite a entrada da palavra.
                //A cada erro deve imprimir a quantidade de tentativas restantes e o 'membro' que foi marcado. Ao final deve imprimir se acertou ou não a palavra e se foi 'enforcado'.
                String palavra = print.next();
                if(palavra.equals("forca")) {
                    System.out.println("ESTÁ SALVO");
                } else {
                    System.out.println("FOI ENFORCADO");
                }
            break;
            case 4:
                // Crie um programa que imprima a tabuada de 0 a 10.
                int tabuada = 0;
                System.out.println("Informe qual tabuada você quer saber!");
                tabuada = print.nextInt(); //cin
                for(int i=0; i<=10; i++) {
                    int resultado = tabuada * i;
                    System.out.println(tabuada + " x " + i + " = " + resultado);
                }
            break;
            case 5: 
                // Crie um programa que receba uma String e imprima linha a linha suas letras
                String value = print.next();
                for(int cont = 0; cont < value.length(); cont++) {
                    System.out.println(value.charAt(cont));
                }
            break;
            case 6:
                //  Crie um programa que de a soma de todos os números ímpares e múltiplos de 7 entre 1 e 500
                int soma_impar = 0;
                for(int i = 0; i<=500; i++){
                    if((i % 2 == 1 ) && (i % 7 == 0)) {
                        soma_impar += i;
                    }
                }
                System.out.print("\n A soma é " + soma_impar);
            break;
            case 7:
                //Crie um programa que tenha como entrada as notas de um aluno. Somente se encerrará quando for inserida uma nota negativa. Ao final deverá informar a média das notas.
                int nota = 0;
                int cont = 0;
                int media_nota = 0;
                int soma = 0;
                do{
                    System.out.println("\n Informe uma nota:");
                    nota = print.nextInt();
                    
                    cont++;
                    soma = soma + nota;
                } while(nota >= 0);
                media_nota = soma / cont;
                System.out.println("\n A média foi: " + media_nota);
            break;
            case 8:
                // Crie um programa que receba um valor e imprima o fatorial desse número. Ex.: 3! = 3 x 2 x 1 = 6.
                int fatorial = 0;
                int temp_fat = 1;
                System.out.println("\n Informe um fatorial:");
                fatorial = print.nextInt();
               
                for(int i = 1; i<=fatorial; i++) {
                    temp_fat *= i;;
                }
                System.out.println("\n O resultado fatorial " + fatorial + " é " + temp_fat);
            break;
            case 9:
                // Crie um programa que receba a altera e o peso e calcule o IMC:
                double peso = 0;
                double altura = 0;
                try{
                System.out.println("\n Informe a sua altura");
                altura = print.nextDouble();
                }catch(java.util.InputMismatchException e){
                    System.out.println("Valor invalido!");
                }
                print.next();
                try{
                System.out.println("\n Informe seu peso");
                peso = print.nextDouble();
                }catch(java.util.InputMismatchException e){
                    System.out.println("Valor invalido!");
                }
                print.next();
                Double imc = 0.0;
                imc = peso / (altura * altura);
                System.out.println(imc);
                if(imc < 18.5) {
                    System.out.println("Abaixo do peso");
                } else if(imc > 18.6 && imc < 24.9) {
                    System.out.println("Peso ideal");
                } else if(imc > 25 && imc < 29.9) {
                    System.out.println("Levemente acima do peso");
                } else if(imc > 30 && imc > 34.9) {
                    System.out.println("Obesidade grau I");
                } else if(imc > 35 && imc > 39.9) {
                    System.out.println("Obesidade grau II");
                } else if(imc > 40) {
                    System.out.println("Obesidade grau III");
                }
                
            break;
            case 10:
                // 10) Crie um programa que receba dois valores e solicite a operação a ser realizada (+ - * /). Ao final imprima o resultado.
                int num2 = 0;
                int num1 = 0;
                try{
                System.out.println("\n Escolha o número 1");
                num1 = print.nextInt();
                }  catch(java.util.InputMismatchException e){
                    System.out.println("Escolha um número!");
                }
                try {
                System.out.println("\n Escolha o número 2");
                num2 = print.nextInt();
                } catch(java.util.InputMismatchException e){
                    System.out.println("Escolha um número! ");
                }
                int resultado = 0;
                String operador = "+";
                try {
                System.out.println("\n Escolha uma operação! + - * /");
                operador = print.next();
                }catch(java.util.InputMismatchException e){
                    System.out.println("Ocorreu um erro: ");
                }
                if(operador.equals("+")) {
                    resultado = num1 + num2;
                    System.out.println("\n O resultado é "+ resultado);
                }
                if(operador.equals("*")) {
                    resultado = num1 * num2;
                    System.out.println("\n O resultado é "+ resultado);
                }
                if(operador.equals("/")) {
                    resultado = num1 / num2;
                    System.out.println("\n O resultado é "+ resultado);
                }
                if(operador.equals("-")) {
                    resultado = num1 - num2;
                    System.out.println("\n O resultado é "+ resultado);
                }
            break;
            case 11:
                // Crie um programa que receba um valor em reais e determine qual o mínimo de notas necessárias para entregá-lo. <br> Notas: R$ 100, R$ 50, R$ 10, R$ 5, R$ 1 <br> 
                //Exemplo: R$ 15 -> 1 nota de R$ 10 e 1 nota de R$ 5

            break;
        }
    } while(escolha > 11 || escolha < 1);
    print.close();
    }   
}
