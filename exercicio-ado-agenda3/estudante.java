public class Estudante extends Pessoas {
    private String curso;
    private String matricula;
    private int ano;

    public Estudante() {
        super(); 
    }

    public Estudante(String nome, int idade, String cpf, String dataNascimento, String profissao, String curso, String matricula, int ano) {
        super(nome, idade, cpf, dataNascimento, profissao);
        this.curso = curso;
        this.matricula = matricula;
        this.ano = ano;
    }

  
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }


    @Override
    public String toString() {
        return "Estudante: " + "nome=" + getNome() + ", idade=" + getIdade() + ", cpf=" + getCpf() + ", dataNascimento=" + getDataNascimento() + ", profissao=" + getProfissao() + ", curso=" + curso + ", matricula=" + matricula + ", ano=" + ano;
    }
}
