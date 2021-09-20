package ExercicoUm;
// 7) Crie um programa que calcule o percentual de imposto pago (faturamento \ qtd imposto)
public class ImpostoPago {
    public static void main(String[] args) {
        double faturamento = 100;
        double imposto = 10;
        double total = faturamento * imposto / 100;

        System.out.println(total);
        
    }
}
