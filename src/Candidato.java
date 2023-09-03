import java.util.ArrayList;
import java.util.List;

class Candidato {
    private String nome;
    private String dataNascimento;
    private String email;
    private String telefone;
    private double expectativaSalarial;
    private String estado;
    private int tempoExperiencia;
    private int vagaEscolhida;

    public Candidato(String nome, String dataNascimento, String email, String telefone, double expectativaSalarial, String estado, int tempoExperiencia, int vagaEscolhida) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.telefone = telefone;
        this.expectativaSalarial = expectativaSalarial;
        this.estado = estado;
        this.tempoExperiencia = tempoExperiencia;
        this.vagaEscolhida = vagaEscolhida;
    }

    public boolean isCompativel() {
        if ((vagaEscolhida == 1 && tempoExperiencia < 3) ||
                (vagaEscolhida == 2 && tempoExperiencia < 3) ||
                (vagaEscolhida == 3 && tempoExperiencia < 8) ||
                (vagaEscolhida == 4 && tempoExperiencia < 1) ||
                (vagaEscolhida == 5 && tempoExperiencia < 1)) {
            if (estado.equals("São Paulo") || estado.equals("Rio de Janeiro") || estado.equals("Pará") || estado.equals("Mato Grosso do Sul")) {
                if ((vagaEscolhida == 4 || vagaEscolhida == 5) && expectativaSalarial < 2000) {
                    return true;
                }
                if ((vagaEscolhida == 1 || vagaEscolhida == 2) && expectativaSalarial < 4000) {
                    return true;
                }
                if (vagaEscolhida == 3 && expectativaSalarial < 15000) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Vaga Escolhida: " + vagaEscolhida;
    }
}
