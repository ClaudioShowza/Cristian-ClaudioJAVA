import java.util.ArrayList;
import java.util.List;

public class Agenda {

    private List<Pessoas> ListadeContatos;

    public Agenda() {
        this.ListadeContatos = new ArrayList<>();
    }

    public void adicionarContato(Pessoas contato) {
        ListadeContatos.add(contato);
    }

    public Pessoas buscarContatoPorNome(String nome) {
        for (Pessoas contato : this.ListadeContatos) {
            if (contato.getNome().equals(nome)) {
                return contato;
            }
        }
        return null;
    }

    public List<Pessoas> buscarContatosPorProfissao(String profissao) {
        List<Pessoas> contatosComProfissao = new ArrayList<>();

        ListadeContatos.forEach(contato -> {
            if (contato instanceof Funcionario) {
                Funcionario funcionario = (Funcionario) contato;
                if (funcionario.getProfissao().equals(profissao)) {
                    contatosComProfissao.add(funcionario);
                }
            }
        });

        return contatosComProfissao;
    }

    public List<Funcionario> buscarFuncionariosPorDepartamento(String departamento) {
        List<Funcionario> funcionariosNoDepartamento = new ArrayList<>();

        ListadeContatos.forEach(contato -> {
            if (contato instanceof Funcionario) {
                Funcionario funcionario = (Funcionario) contato;
                if (funcionario.getDepartamento().equals(departamento)) {
                    funcionariosNoDepartamento.add(funcionario);
                }
            }
        });

        return funcionariosNoDepartamento;
    }

    public double calcularSalarioMedioFuncionarios() {
        double totalSalario = 0;
        int numeroFuncionarios = 0;

        for (Pessoas contato : this.ListadeContatos) {
            if (contato instanceof Funcionario) {
                Funcionario funcionario = (Funcionario) contato;
                totalSalario += funcionario.getSalario();
                numeroFuncionarios++;
            }
        }

        if (numeroFuncionarios > 0) {
            return totalSalario / numeroFuncionarios;
        } else {
            return 0;
        }
    }
}
