package Inicio.ExercicioTres;
public class ParteTres {
    // 3) Crie um programa que receba como entrada da classe Main dois valores numéricos e calcule as operações básicas com eles.
    public static void main(String[] args) {
        try{
            int value1 = Integer.parseInt(args[0]);
            int value2 = Integer.parseInt(args[1]);

            System.out.println(value1 + " + " + value2 + " = " + (value1 + value2));
            System.out.println(value1 + " - " + value2 + " = " + (value1 - value2));
            System.out.println(value1 + " * " + value2 + " = " + (value1 * value2));
            System.out.println(value1 + " / " + value2 + " = " + (value1 / value2));
        }catch(Exception e){
            System.out.println("Número invalido!");
        }
    }
}
