import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Agenda {

    private Map<Integer, String[]> contatos = new HashMap<>();

    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        agenda.executar();
    }

    private void executar() {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine();  // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    adicionarContato(scanner);
                    break;
                case 2:
                    listarContatos();
                    break;
                case 3:
                    atualizarContato(scanner);
                    break;
                case 4:
                    removerContato(scanner);
                    break;
                case 5:
                    buscarContatoPorId(scanner);
                    break;
                case 6:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 6);

        scanner.close();
    }

    private void adicionarContato(Scanner scanner) {
        // TODO
    }

    private void buscarContatoPorId(Scanner scanner) {
        // TODO
    }

    private void listarContatos() {
        // TODO
    }

    private void atualizarContato(Scanner scanner) {
        // TODO
    }

    private void removerContato(Scanner scanner) {
        // TODO
    }

    private void exibirMenu() {
        System.out.println("\n--- Menu da Agenda ---");
        System.out.println("1. Adicionar Contato");
        System.out.println("2. Listar Contatos");
        System.out.println("3. Atualizar Contato");
        System.out.println("4. Remover Contato");
        System.out.println("5. Buscar Contato por ID");
        System.out.println("6. Sair");
        System.out.print("Escolha uma opção: ");
    }
}