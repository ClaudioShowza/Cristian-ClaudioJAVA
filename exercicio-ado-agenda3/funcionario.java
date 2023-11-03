public class Funcionario extends Pessoas {
    private double salario;
    private String cargo;
    private String departamento;

    public Funcionario() {
        super(); 
    }

    public Funcionario(String nome, int idade, String cpf, String dataNascimento, String profissao, double salario, String cargo, String departamento) {
        super(nome, idade, cpf, dataNascimento, profissao);
        this.salario = salario;
        this.cargo = cargo;
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Funcionario: " + "nome=" + getNome() + ", idade=" + getIdade() + ", cpf=" + getCpf() + ", dataNascimento=" + getDataNascimento() + ", profissao=" + getProfissao() + ", salario=" + salario + ", cargo=" + cargo + ", departamento=" + departamento;
    }
}
