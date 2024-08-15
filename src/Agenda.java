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
                    detalharContato(scanner);
                    break;
                case 3:
                    editarContato(scanner);
                    break;
                case 4:
                    removerContato(scanner);
                    break;
                case 5:
                    listarContatos();
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

    private void detalharContato(Scanner scanner) {
        // TODO
    }

    private void listarContatos() {
        // TODO
    }

    private void editarContato(Scanner scanner) {
        // TODO
    }

    private void removerContato(Scanner scanner) {
        // TODO
    }

    private void exibirMenu() {
        System.out.println("\n--- Menu da Agenda ---");
        System.out.println("1. Adicionar Contato");
        System.out.println("2. Detalhar contato");
        System.out.println("3. Editar Contato");
        System.out.println("4. Remover Contato");
        System.out.println("5. Listar contatos");
        System.out.println("6. Sair");
        System.out.print("Escolha uma opção: ");
    }
}