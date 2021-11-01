package Exemplos;
public class MarinaJet {
    public static void main(String[] args) {
        JetSki jetNovo = new JetSki(20, 2000000.00, "RXP X 300", 2019, "Sea-Doo", 2, true, false, true, false);
        /*
        jetNovo.potencia = 20;
        jetNovo.valor = 2000000.00;
        jetNovo.modelo = "RXP X 300";
        jetNovo.ano = 2019;
        jetNovo.marca = "Sea-Doo";
        jetNovo.qtdPessoa = 2;
        jetNovo.aguaDoce = true;
        jetNovo.aguaSalgado = false;
        jetNovo.vemCapa = true;
        jetNovo.ligado = false;
        */

        System.out.println(" Potencia: "+ jetNovo.potencia );
        System.out.println(" Valoe: "+ jetNovo.valor );
        System.out.println(" Modelo do JetSki: "+jetNovo.modelo);
        System.out.println(" Ano de fabriação: "+jetNovo.ano);
        System.out.println(" Marca: "+jetNovo.marca);
        System.out.println(" Quantidade de pessoa: "+jetNovo.qtdPessoa);
        System.out.println(" Suporta agua doce?: "+jetNovo.aguaDoce);
        System.out.println(" Suporta agua salgada: "+jetNovo.aguaSalgado);
        System.out.println(" Vem capa: "+jetNovo.vemCapa);
        System.out.println(" Motor ligado ou desligado: "+jetNovo.ligado);

        jetNovo.darPartida();
        System.out.println(" Ligar motor: "+jetNovo.ligado);
    }
}
