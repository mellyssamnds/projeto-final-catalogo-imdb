import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = "";

        while (!input.equals("0")) {
            System.out.println("\n1- Buscar | 2- Gerenciamento | 0- Sair");
            input = sc.nextLine();

            switch (input) {
                case "1":
                    System.out.println("1- Filme | 2- Ator | 3- Diretor | 4- Voltar");
                    String busca = sc.nextLine();
                    switch (busca) {
                        case "1": break;
                        case "2": break;
                        case "3": break;
                    }
                    break;

                case "2":
                    System.out.println("1- Add Filme | 2- Add Ator | 3- Add Diretor | 4- Associar Ator | 5- Associar Diretor | 6- Voltar");
                    String gerencia = sc.nextLine();
                    switch (gerencia) {
                        case "1": break;
                        case "2": break;
                        case "3": break;
                        case "4": break;
                        case "5": break;
                    }
                    break;

                case "0":
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
        sc.close();
    }
}