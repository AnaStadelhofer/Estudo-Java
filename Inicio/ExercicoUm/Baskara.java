package Inicio.ExercicoUm;
// 5) Crie um programa que calcule bhaskara
public class Baskara {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 10;
        int delta = (b * b) - (4 * a * c);
        double resultado1 = (-b - Math.sqrt(delta)) / (2 * a);
        double resultado2 = (-b + Math.sqrt(delta));

        System.out.println(resultado1);
        System.out.println(resultado2);
    }
}

/*

x = -b +- /delta
	-----
	2a

    */