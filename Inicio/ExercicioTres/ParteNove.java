package Inicio.ExercicioTres;

public class ParteNove {
    // 9) Crie um programa que receba como entrada da classe Main dois valores numéricos e calcule a área dos valores (area = lado1 * lado2). 
    public static void main(String[] args) {
        try{
            int lado1 = Integer.parseInt(args[0]);
            int lado2 = Integer.parseInt(args[1]);
            int area = lado1 * lado2;
            System.out.println(" Area =  " +  lado1 + " * " + lado2 + " = " + area);
        }catch(Exception e){
            System.out.println("Número invalido!");
        }

    }
}
