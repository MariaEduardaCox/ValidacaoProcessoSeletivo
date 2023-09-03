import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Candidato> candidatos = new ArrayList<>();

        // Exemplos de candidatos
        candidatos.add(new Candidato("João", "01/01/1990", "joao@email.com", "123456789", 3000, "São Paulo", 2, 1));
        candidatos.add(new Candidato("Maria", "15/05/1995", "maria@email.com", "987654321", 5000, "Rio de Janeiro", 5, 3));
        candidatos.add(new Candidato("Pedro", "20/07/1992", "pedro@email.com", "555555555", 2500, "Pará", 1, 4));

        List<Candidato> candidatosCompativeis = new ArrayList<>();

        for (Candidato candidato : candidatos) {
            if (candidato.isCompativel()) {
                candidatosCompativeis.add(candidato);
            }
        }

        System.out.println("Candidatos compatíveis:");
        for (Candidato candidato : candidatosCompativeis) {
            System.out.println(candidato);
        }
    }
}