import java.util.Scanner;

public class ProgramaPrincipal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Catalogo catalogo = new Catalogo();

        int opcao;

        do {
            System.out.println("\n===== POO-FLIX =====");
            System.out.println("1 - Cadastrar Filme");
            System.out.println("2 - Cadastrar Ator");
            System.out.println("3 - Cadastrar Diretor");
            System.out.println("4 - Buscar Filme");
            System.out.println("5 - Listar Filmes");
            System.out.println("6 - Associar Ator a Filme");
            System.out.println("7 - Associar Diretor a Filme");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = Integer.parseInt(sc.nextLine());

            switch (opcao) {

                case 1:
                    Filme novoFilme = GerenciadorFilme.cadastrarFilme(sc);
                    catalogo.cadastrarFilme(novoFilme);
                    break;
                case 2:
                    Ator novoAtor = GerenciadorFilme.cadastrarAtor(sc);
                    catalogo.cadastrarAtor(novoAtor);
                    break;
                case 3:
                    Diretor novoDiretor = GerenciadorFilme.cadastrarDiretor(sc);
                    catalogo.cadastrarDiretor(novoDiretor);
                    break;
                case 4:
                    System.out.print("Digite o nome do filme: ");
                    String nomeBusca = sc.nextLine();

                    Filme encontrado = catalogo.buscarFilme(nomeBusca);

                    if (encontrado != null) {
                        System.out.println("\nFilme encontrado:");
                        System.out.println(encontrado);
                    } else {
                        System.out.println("Filme não encontrado");
                    }
                    break;
                case 5:
                    catalogo.listarFilmes();
                    break;
                case 6:
                    GerenciadorFilme.associarAtorAoFilme(sc, catalogo);
                    break;
                case 7:
                    GerenciadorFilme.associarDiretorAoFilme(sc, catalogo);
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida");
            }

        } while (opcao != 0);

        sc.close();
    }
}
