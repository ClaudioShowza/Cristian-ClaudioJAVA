/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio.ado;

/**

 * @author Crist
 */
public class Principal {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João", 30);

        // Exibe informações iniciais da pessoa
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());

        // Modifica as informações da pessoa
        pessoa.setNome("Maria");
        pessoa.setIdade(25);

        // Exibe as informações modificadas da pessoa
        System.out.println("Nome modificado: " + pessoa.getNome());
        System.out.println("Idade modificada: " + pessoa.getIdade());
    }
}
