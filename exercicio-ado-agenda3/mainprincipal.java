public class MainPrincipal {
    public static void main(String[] args) {
        
        Pessoa pessoa = new Pessoa("Alice", 30, "123456789", "01/01/1990", "Nenhuma");
        Funcionario funcionario = new Funcionario("Bob", 25, "987654321", "02/02/1995", "Engenheiro", 5000.0, "Engenheiro de Software", "TI");
        Estudante estudante = new Estudante("Charlie", 20, "555555555", "03/03/2000", "Estudante", "Engenharia", "123456", 2023);

        
        Agenda agenda = new Agenda();

        
        agenda.adicionarContato(pessoa);
        agenda.adicionarContato(funcionario);
        agenda.adicionarContato(estudante);

        
        for (Pessoas contato : agenda.ListadeContatos) {
            System.out.println(contato.toString());
        }
    }
}
