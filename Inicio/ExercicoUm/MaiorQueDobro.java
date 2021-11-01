package Inicio.ExercicoUm;
// 4) Crie um programa que avalie se um valor é maior do que o dobro de outro valor
public class MaiorQueDobro {
    public static void main(String[] args) {
        

        int num1 = 10;
        int num2 = 2;
        String resultado = num1 > (num2 * 2) ? "Número 1 é maior" : "Número 1 é menor";    
        System.out.println(resultado);
    }
}
