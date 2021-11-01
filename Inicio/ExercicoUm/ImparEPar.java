package Inicio.ExercicoUm;
// 8) Crie um programa que teste se um valor é par ou ímpar 
public class ImparEPar {
    public static void main(String[] args) {
        int num1 = 10;
        String resultado = num1 % 2 == 0 ? "O número é par" : "O número é impar";
        System.out.println(resultado);
    }
}
