import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Produto> produtos = new HashMap<>();
        int opcao;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Buscar produto por código");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir quebra de linha

            switch (opcao) {
                case 1:
                    System.out.println("Opção de cadastro selecionada.");
                    cadastrarProduto(scanner, produtos);
                    break;

                case 2:
                    System.out.println("Opção de busca selecionada.");
                    buscarProduto(scanner, produtos);
                    break;

                case 3:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 3);

        scanner.close();
    }

    private static void cadastrarProduto(Scanner scanner, Map<Integer, Produto> produtos) {
        System.out.print("Digite o código do produto: ");
        int codigo = scanner.nextInt();
        scanner.nextLine();

        if (produtos.containsKey(codigo)) {
            System.out.println("Erro: Código já cadastrado!");
            return;
        }

        System.out.print("Digite o nome do produto: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o preço do produto: ");
        double preco = scanner.nextDouble();

        produtos.put(codigo, new Produto(codigo, nome, preco));
        System.out.println("Produto cadastrado com sucesso!");
    }

    private static void buscarProduto(Scanner scanner, Map<Integer, Produto> produtos) {
        System.out.print("Digite o código do produto: ");
        int codigo = scanner.nextInt();

        Produto produto = produtos.get(codigo);
        if (produto != null) {
            System.out.println(produto);
        } else {
            System.out.println("Produto não encontrado.");
        }
    }
}
