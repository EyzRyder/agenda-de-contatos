import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Agenda {

    public static void main(String[] args) {

        Map<Integer, String[]> contatos = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        Integer idCounter=1;
        Integer opcao;
        Boolean status=false;


        do {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    status=adicionarContato(scanner,contatos,idCounter);
                    if(status){
                        System.out.println("Contato Adicionado com sucesso");
                        idCounter++;
                    }else{
                        System.out.println("Não foi possivel adicionar Contato");
                    }
                    break;
                case 2:
                    detalharContato(scanner, contatos);
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

 private static boolean adicionarContato(Scanner scanner,Map<Integer, String[]> contatos,Integer id) {
        String nome;
        String numeroDeTelefone;
        String email;

        System.out.println("Digite o nome do contato: ");
        nome = scanner.nextLine();
        System.out.println("Digite o telefone  do contato: ");
        numeroDeTelefone = scanner.nextLine();
        System.out.println("Digite o email  do contato: ");
        email = scanner.nextLine();

        String[] contatoEncontrado = searchTelefoneEmContatos(contatos,numeroDeTelefone);

        if (contatoEncontrado!=null) return false;

        contatos.put(id,new String[]{nome,numeroDeTelefone,email});
        return true;
    }

    private static void detalharContato(Scanner scanner, Map<Integer, String[]> contatos) {
        System.out.print("Digite o número do contato que deseja ver os detalhes: ");
        String numero = scanner.nextLine();

        String[] contatoEncontrado = searchTelefoneEmContatos(contatos,numero);

        if(contatoEncontrado == null) {
            System.out.println("Contato não encontrado");
        } else {
            System.out.println("Nome: " + contatoEncontrado[0] + " | Telefone: " + contatoEncontrado[1] + " | Email: " + contatoEncontrado[2]);
        }
    }

    private static void listarContatos() {
        // TODO
    }

    private static void editarContato(Scanner scanner) {
        // TODO
    }

    private static void removerContato(Scanner scanner) {
        // TODO
    }

    private static String[] searchTelefoneEmContatos(Map<Integer, String[]> contatos,String numeroDeTelefone){
        String[] contatoEncontrado = null;

        for (Map.Entry<Integer, String[]> contato: contatos.entrySet()) {
            String[] dados = contato.getValue();
            if(dados[1].equals(numeroDeTelefone)) {
                contatoEncontrado = dados;
                break;
            }
        }
        return contatoEncontrado;
    }
}
