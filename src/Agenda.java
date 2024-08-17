import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Agenda {

    public static void main(String[] args) {

        Map<String, String[]> contatos = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        Integer opcao;
        boolean status = false;

        do {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    adicionarContato(scanner, contatos);
                    break;
                case 2:
                    status = detalharContato(scanner, contatos);
                    if (status) {
                        System.out.println("Contato encontrado");
                    } else {
                        System.out.println("Contato não encontrado");
                    }
                    break;
                case 3:
                    status = editarContato(scanner, contatos);
                    if (status) {
                        System.out.println("Contato atualizado com sucesso.");
                    } else {
                        System.out.println("Contato não foi atualizado ");
                    }
                    break;
                case 4:
                    removerContato(scanner, contatos);
                    break;
                case 5:
                    listarContatos(scanner, contatos);
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

    private static void exibirMenu() {
        System.out.println("\n--- Menu da Agenda ---");
        System.out.println("1. Adicionar Contato");
        System.out.println("2. Detalhar contato");
        System.out.println("3. Editar Contato");
        System.out.println("4. Remover Contato");
        System.out.println("5. Listar contatos");
        System.out.println("6. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void adicionarContato(Scanner scanner, Map<String, String[]> contatos) {
        try {
            String nome;
            String numeroDeTelefone;
            String email;

            System.out.println("Digite o nome do contato: ");
            nome = scanner.nextLine();
            System.out.println("Digite o telefone  do contato: ");
            numeroDeTelefone = scanner.nextLine();
            System.out.println("Digite o email  do contato: ");
            email = scanner.nextLine();

            if (contatos.containsKey(numeroDeTelefone)) {
                throw new Exception("Numero digitado já está sendo usado.");
            }

            contatos.put(numeroDeTelefone, new String[]{nome, email});
            System.out.println("Contato Adicionado com sucesso");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static boolean detalharContato(Scanner scanner, Map<String, String[]> contatos) {
        System.out.print("Digite o número do contato que deseja ver os detalhes: ");
        String numeroDeTelefone = scanner.nextLine();

        String[] contatoValues = contatos.get(numeroDeTelefone);

        if (contatoValues != null) {
            System.out.println(
                    "Nome: " + contatoValues[0] + " | Telefone: " + numeroDeTelefone + " | Email: " + contatoValues[1]);
        }
        return contatoValues != null;
    }

    private static void listarContatos(Scanner scanner, Map<String, String[]> contatos) {
        for (Map.Entry<String, String[]> contato : contatos.entrySet()) {
            String[] contatoValues = contato.getValue();
            System.out.println(
                    "Nome: " + contatoValues[0] + " | Telefone: " + contato.getKey() + " | Email: " + contatoValues[1]);
        }
    }

    private static boolean editarContato(Scanner scanner, Map<String, String[]> contatos) {
        System.out.print("Digite o telefone do contato que deseja editar: ");
        String numeroDeTelefone = scanner.nextLine();


        String[] contatoValues = contatos.get(numeroDeTelefone);

        if (contatoValues == null) {
            return false;
        }

        System.out.print("Digite o novo nome (ou pressione Enter para manter o atual): ");
        String novoNome = scanner.nextLine();
        if (!novoNome.isEmpty()) {
            contatoValues[0] = novoNome;
        }

        System.out.print("Digite o novo e-mail (ou pressione Enter para manter o atual): ");
        String novoEmail = scanner.nextLine();
        if (!novoEmail.isEmpty()) {
            contatoValues[1] = novoEmail;
        }

        contatos.put(numeroDeTelefone, contatoValues);

        return true;
    }

    private static void removerContato(Scanner scanner, Map<String, String[]> contatos) {
        try{
            System.out.println("Digite o numero de contato para excluir: ");
            String numeroDeTelefone = scanner.nextLine();

            if (!contatos.containsKey(numeroDeTelefone)) {
               throw new Exception("Contato:" + numeroDeTelefone + " Não foi encontrado. ");
            }
            contatos.remove(numeroDeTelefone);
            System.out.println("Contato removido com sucesso!");

        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

}
