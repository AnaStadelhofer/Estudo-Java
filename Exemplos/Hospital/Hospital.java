package Exemplos.Hospital;

public class Hospital {
    public static void main(String[] args) {
        Paciente paciente1 = new Paciente("José Almeida", "853.322.460-56", "10/10/2002", 24634534);
        Paciente paciente2 = new Paciente("Julia Madeira", "225.659.090-98", "11/02/1995", 12345123);
        Paciente paciente3 = new Paciente("Roberth Gaucho", "247.666.780-36", "31/10/1980", 64565452);
        System.out.println(paciente1.carteira());
        System.out.println(paciente2.carteira());
        System.out.println(paciente3.carteira());
        Medico medico1 = new Medico("Jackson Machado", "993.272.960-44", "09/05/1992", 24634534, "Santa Catarina");
        Medico medico2 = new Medico("Marcio Amaral", "643.071.970-70", "30/12/1996", 1235734, "Acre");
        Medico medico3 = new Medico("Robertinho Gaucho", "028.965.170-06", "10/03/2001", 19263847, "Bahia");
        System.out.println(medico1.carteira());
        System.out.println(medico2.carteira());
        System.out.println(medico3.carteira());

        Consulta consulta1 = new Consulta("01/10/2021", "Presencial", medico1, paciente1);
        Consulta consulta2 = new Consulta("02/07/2021", "Online", medico1, paciente1);
        Consulta consulta3 = new Consulta("03/04/2021", "Presencial", medico1, paciente1);
        Consulta consulta4 = new Consulta("04/1/2021", "Presencial", medico2, paciente2);
        Consulta consulta5 = new Consulta("15/10/2021", "Online", medico2, paciente2);
        Consulta consulta6 = new Consulta("16/11/2021", "Online", medico2, paciente2);
        Consulta consulta7 = new Consulta("17/03/2021", "Presencial", medico3, paciente3);
        Consulta consulta8 = new Consulta("18/11/2021", "Online", medico3, paciente3);
        Consulta consulta9 = new Consulta("19/02/2021", "Presencial", medico3, paciente3);
        Consulta consulta10 = new Consulta("20/4/2021", "Online", medico3, paciente3);
        System.out.println(consulta1.registro());
        System.out.println(consulta2.registro());
        System.out.println(consulta3.registro());
        System.out.println(consulta4.registro());
        System.out.println(consulta5.registro());
        System.out.println(consulta6.registro());
        System.out.println(consulta7.registro());
        System.out.println(consulta8.registro());
        System.out.println(consulta9.registro());
        System.out.println(consulta10.registro());
    }
}
