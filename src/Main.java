import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("/ ################## /");
        System.out.println("/ ##### AGENDA ##### /");
        System.out.println("/ ################## /");

        exibeMenu();







    }



    public static void exibeMenu(){
        System.out.println();
        System.out.println(" >>>> Menu Contato <<<< ");
        System.out.println(" 1. Adicionar contato");
        System.out.println(" 2. Detalhar Contato");
        System.out.println(" 3. Editar Contato");
        System.out.println(" 4. Remover Contato");
        System.out.println(" 5. Exibir Contatos");
        System.out.println(" 0. Sair");
    }
}