/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercico.ado.pkg2;

/**
 *
 * @author Crist
 */

    /**
     * @param args the command line arguments
     */
    import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        String produto = "Teclado Mecânico";
        int quantidade = 50;
        int opcao = 0;

        try (Scanner scanner = new Scanner(System.in)) {
            while (opcao != 4) {
                System.out.println("----- Sistema de Gerenciamento de Estoque -----");
                System.out.println("Produto: " + produto);
                System.out.println("Quantidade em estoque: " + quantidade);
                System.out.println("Menu:");
                System.out.println("1. Consultar quantidade em estoque");
                System.out.println("2. Adicionar produtos ao estoque");
                System.out.println("3. Retirar produtos do estoque");
                System.out.println("4. Sair");
                System.out.print("Escolha uma opção: ");
                opcao = scanner.nextInt();
                
                switch (opcao) {
                    case 1 -> System.out.println("Quantidade em estoque: " + quantidade);
                    case 2 -> {
                        System.out.print("Quantos produtos você deseja adicionar: ");
                        int quantidadeAdicionar = scanner.nextInt();
                        quantidade += quantidadeAdicionar;
                        System.out.println(quantidadeAdicionar + " produtos adicionados ao estoque.");
                    }
                    case 3 -> {
                        System.out.print("Quantos produtos você deseja retirar: ");
                        int quantidadeRetirar = scanner.nextInt();
                        if (quantidadeRetirar <= quantidade) {
                            quantidade -= quantidadeRetirar;
                            System.out.println(quantidadeRetirar + " produtos retirados do estoque.");
                        } else {
                            System.out.println("Quantidade insuficiente em estoque.");
                        }
                    }
                    case 4 -> System.out.println("Saindo do programa.");
                    default -> System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                }
            }
        }
    }
}


