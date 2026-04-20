import java.util.Scanner;

public class ProgramaPrincipal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Catalogo catalogo = new Catalogo();

        int opcao;

        System.out.println("-------------------------------------------");
        System.out.println("   BEM-VINDO AO ACERVO DIGITAL POO-FLIX    ");
        System.out.println("   Gerencie seu catálogo de cinema aqui!   ");
        System.out.println("-------------------------------------------");

        do {
            System.out.println("\n✦ MENU PRINCIPAL ✦");
            System.out.println("1 - Consultar e Buscar");
            System.out.println("2 - Cadastrar");
            System.out.println("3 - Gestão de Elenco e Direção");
            System.out.println("4 - Remover do Catálogo");
            System.out.println("0 - Sair");
            System.out.print("\n➤ Selecione uma categoria: ");

            try {
                opcao = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                opcao = -1;
            }

            switch (opcao) {

                case 1:
                    System.out.println("\n--- BUSCAR ---");
                    System.out.println("1 - Buscar Filme por Nome");
                    System.out.println("2 - Listar Todo o Acervo");
                    System.out.println("0 - Voltar");
                    System.out.print("Escolha uma opção: ");
                    int sub1 = Integer.parseInt(sc.nextLine());

                    if (sub1 == 1) {
                        System.out.print("Digite o nome do filme: ");
                        String nomeBusca = sc.nextLine();
                        Filme encontrado = catalogo.buscarFilme(nomeBusca);
                        if (encontrado != null) {
                            System.out.println("\n✔ Filme encontrado:");
                            System.out.println(encontrado);
                        } else {
                            System.out.println("✖ Filme não encontrado");
                        }
                    } else if (sub1 == 2) {
                        catalogo.listarFilmes();
                    }else if(sub1==0){
                        System.out.println("\nVoltando ao menu anterior...");
                        break;
                    }
                    break;

                case 2:
                    System.out.println("\n--- GERENCIAMENTO DE CATÁLOGO ---");
                    System.out.println("1 - Cadastrar Novo Filme");
                    System.out.println("2 - Cadastrar Novo Ator");
                    System.out.println("3 - Cadastrar Novo Diretor");
                    System.out.println("0 - Voltar");
                    System.out.print("Escolha uma opção: ");
                    int sub2 = Integer.parseInt(sc.nextLine());

                    if (sub2 == 1) {
                        Filme novoFilme = GerenciadorFilme.cadastrarFilme(sc);
                        catalogo.cadastrarFilme(novoFilme);
                    } else if (sub2 == 2) {
                        Ator novoAtor = GerenciadorFilme.cadastrarAtor(sc);
                        catalogo.cadastrarAtor(novoAtor);
                    } else if (sub2 == 3) {
                        Diretor novoDiretor = GerenciadorFilme.cadastrarDiretor(sc);
                        catalogo.cadastrarDiretor(novoDiretor);

                    }else if(sub2==0){
                        System.out.println("\nVoltando ao menu anterior...");
                        break;
                    }
                    break;

                case 3:
                    System.out.println("\n--- GESTÃO DE VÍNCULOS ---");
                    System.out.println("1 - Associar Ator a um Filme");
                    System.out.println("2 - Associar Diretor a um Filme");
                    System.out.println("0 - Voltar");
                    System.out.print("Escolha uma opção: ");
                    int sub3 = Integer.parseInt(sc.nextLine());

                    if (sub3 == 1) {
                        GerenciadorFilme.associarAtorAoFilme(sc, catalogo);
                    } else if (sub3 == 2) {
                        GerenciadorFilme.associarDiretorAoFilme(sc, catalogo);
                    }else if(sub3==0) {
                        System.out.println("\nVoltando ao menu anterior...");
                        break;
                    }
                    break;

                case 4:
                    System.out.println("\n--- ÁREA DE REMOÇÃO ---");
                    System.out.println("1 - Remover Filme");
                    System.out.println("2 - Remover Ator");
                    System.out.println("3 - Remover Diretor");
                    System.out.print("Escolha uma opção: ");
                    System.out.println("0 - Voltar");
                    int sub4 = Integer.parseInt(sc.nextLine());

                    if (sub4 == 1) {
                        GerenciadorFilme.removerFilme(sc, catalogo);
                    } else if (sub4 == 2) {
                        GerenciadorFilme.removerAtor(sc, catalogo);
                    } else if (sub4 == 3) {
                        GerenciadorFilme.removerDiretor(sc, catalogo);
                    }else if(sub4==0) {
                        System.out.println("\nVoltando ao menu anterior...");
                        break;
                    }
                    break;

                case 0:
                    System.out.println("\nFinalizando sessões... Obrigado por utilizar o POO-FLIX!");
                    break;

                default:
                    System.out.println("\n⚠ Opção inválida. Por favor, tente novamente.");
            }

        } while (opcao != 0);

        sc.close();
    }
}