import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class GerarArquivoConsulta {
    public static void main(String[] args) {
        try {
            // Criando o BufferedWriter para escrever no arquivo
            BufferedWriter writer = new BufferedWriter(new FileWriter("resultado_consultas.txt"));

            // Instanciar o objeto p1 com o construtor completo
            ConsultaAgendada p1 = new ConsultaAgendada(15, 30, 0, 10, 8, 2024, "João Silva", "Dra. Maria");

            // Escrever as propriedades de p1 no arquivo
            writer.write("Propriedades de p1:\n");
            writer.write("Nome do Paciente: " + p1.getNomePaciente() + "\n");
            writer.write("Nome do Médico: " + p1.getNomeMedico() + "\n");
            writer.write("Data: " + p1.getData() + "\n");
            writer.write("Hora: " + p1.getHora() + "\n");

            // Instanciar o objeto p2 usando o construtor padrão
            ConsultaAgendada p2 = new ConsultaAgendada();

            // Escrever as propriedades de p2 no arquivo
            writer.write("\nPropriedades de p2:\n");
            writer.write("Nome do Paciente: " + p2.getNomePaciente() + "\n");
            writer.write("Nome do Médico: " + p2.getNomeMedico() + "\n");
            writer.write("Data: " + p2.getData() + "\n");
            writer.write("Hora: " + p2.getHora() + "\n");

            // Alterar as propriedades de p1 usando os métodos set
            p1.setData(12, 9, 2024);
            p1.setHora(10, 45, 30);
            p1.setNomePaciente("Ana Souza");
            p1.setNomeMedico("Dr. Paulo");

            // Escrever as propriedades de p1 novamente no arquivo após as alterações
            writer.write("\nPropriedades de p1 após alteração:\n");
            writer.write("Nome do Paciente: " + p1.getNomePaciente() + "\n");
            writer.write("Nome do Médico: " + p1.getNomeMedico() + "\n");
            writer.write("Data: " + p1.getData() + "\n");
            writer.write("Hora: " + p1.getHora() + "\n");

            // Escrever a quantidade final de consultas no arquivo
            writer.write("\nQuantidade final de consultas: " + p1.getAmostra() + "\n");

            // Fechar o BufferedWriter
            writer.close();

            // Mensagem de confirmação
            System.out.println("Resultados foram escritos no arquivo resultado_consultas.txt com sucesso!");

        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao escrever no arquivo.");
            e.printStackTrace();
        }
    }
}