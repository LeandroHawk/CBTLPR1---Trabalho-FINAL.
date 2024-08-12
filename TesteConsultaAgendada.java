public class TesteConsultaAgendada{
    public static void main(String[] args) {
        // Instanciar o objeto p1 com o construtor completo
        ConsultaAgendada p1 = new ConsultaAgendada(15, 30, 0, 10, 8, 2024, "João Silva", "Dra. Maria");

        // Exibir todas as propriedades de p1
        System.out.println("Propriedades de p1:");
        System.out.println("Nome do Paciente: " + p1.getNomePaciente());
        System.out.println("Nome do Médico: " + p1.getNomeMedico());
        System.out.println("Data: " + p1.getData());
        System.out.println("Hora: " + p1.getHora());

        // Instanciar o objeto p2 usando o construtor padrão
        ConsultaAgendada p2 = new ConsultaAgendada();

        // Exibir todas as propriedades de p2
        System.out.println("\nPropriedades de p2:");
        System.out.println("Nome do Paciente: " + p2.getNomePaciente());
        System.out.println("Nome do Médico: " + p2.getNomeMedico());
        System.out.println("Data: " + p2.getData());
        System.out.println("Hora: " + p2.getHora());

        // Alterar as propriedades de p1 usando os métodos set
        p1.setData(12, 9, 2024);
        p1.setHora(10, 45, 30);
        p1.setNomePaciente("Ana Souza");
        p1.setNomeMedico("Dr. Paulo");

        // Exibir todas as propriedades de p1 novamente
        System.out.println("\nPropriedades de p1 após alteração:");
        System.out.println("Nome do Paciente: " + p1.getNomePaciente());
        System.out.println("Nome do Médico: " + p1.getNomeMedico());
        System.out.println("Data: " + p1.getData());
        System.out.println("Hora: " + p1.getHora());

        // Exibir a quantidade final de consultas
        System.out.println("\nQuantidade final de consultas: " + p1.getAmostra());
    }
}