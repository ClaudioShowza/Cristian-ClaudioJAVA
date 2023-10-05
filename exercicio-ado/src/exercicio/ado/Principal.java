/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio.ado;

/**

 * @author Cristian e Claudio
 */
public class Principal {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João", 25, "Solteiro", "123.456.789-00", "1234567-8", "01/01/1990");

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Estado Civil: " + pessoa.getEstadoCivil());
        System.out.println("CPF: " + pessoa.getCpf());
        System.out.println("RG: " + pessoa.getRg());
        System.out.println("Data de Nascimento: " + pessoa.getDataNascimento());

        pessoa.setNome("Maria");
        pessoa.setIdade(30);
        pessoa.setEstadoCivil("Casada");
        pessoa.setCpf("987.654.321-00");
        pessoa.setRg("8765432-1");
        pessoa.setDataNascimento("15/05/1985");

        System.out.println("\nNovo Nome: " + pessoa.getNome());
        System.out.println("Nova Idade: " + pessoa.getIdade());
        System.out.println("Novo Estado Civil: " + pessoa.getEstadoCivil());
        System.out.println("Novo CPF: " + pessoa.getCpf());
        System.out.println("Novo RG: " + pessoa.getRg());
        System.out.println("Nova Data de Nascimento: " + pessoa.getDataNascimento());
    }
}
