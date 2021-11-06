package Exemplos.Banco;

public class Banco {
    public static void main(String[] args) {
        Correntista correntistaUm = new Correntista("Analu Sophia de Paula", "308.657.377-54", "14/10/1946", "10/10/2020");
        Correntista correntistaDois = new Correntista("Juan Diego da Cunha", "725.158.516-22", "16/03/1990", "10/10/2020");
        Correntista correntistaTres = new Correntista("Heitor Sebastião da Cunha", "971.401.468-96", "06/06/1987", "10/10/2020");
    
        Gerente gerenteUm = new Gerente("Marcelo Diogo Pires", "229.468.949-67", "Mecanico", "23/09/1945");
        Gerente gerenteDois = new Gerente("Thomas Henry Caio Novaes", "735.435.598-42", "Confeiteiro", "15/05/1952");
        Gerente gerenteTres = new Gerente("Marli Alessandra Fernandes", "432.801.786-14", "Padre", "14/05/1967");
        
        Corrente correnteUm = new Corrente("Itau", 12916345, 129.98, "Caloteiro", gerenteUm, correntistaUm);
        Corrente correnteDois = new Corrente("Bradesco", 386553, 101.11, "Caloteiro", gerenteDois, correntistaDois);
        Corrente correnteTres = new Corrente("Brasil", 11297646, 121.11, "Caloteiro", gerenteTres, correntistaTres);
        
        Investimento investimentoUm = new Investimento("Santander", 605863262, 1234.99, "Carteira Top", gerenteUm, correntistaUm);
        Investimento investimentoDois = new Investimento("Santander", 928567227, 12.34, "Carteira Top", gerenteDois, correntistaDois);
        Investimento investimentoTres = new Investimento("Bradesco", 10308595, 0.01, "Carteira Top", gerenteTres, correntistaTres);

        System.out.println("\n --------------- Corrrentistas ---------------");
        System.out.println(correntistaUm);
        System.out.println(correntistaDois);
        System.out.println(correntistaTres);

        System.out.println("\n --------------- Gerente ---------------");
        System.out.println(gerenteUm);
        System.out.println(gerenteDois);
        System.out.println(gerenteTres);

        System.out.println("\n --------------- Corrente ---------------");
        System.out.println(correnteUm);
        System.out.println(correnteDois);
        System.out.println(correnteTres);
        
        System.out.println("\n --------------- Investimentos ---------------");
        System.out.println(investimentoUm);
        System.out.println(investimentoDois);
        System.out.println(investimentoTres);
    }
}
