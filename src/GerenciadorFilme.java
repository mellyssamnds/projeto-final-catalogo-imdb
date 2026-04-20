import java.util.Scanner;
import exceptions.EntidadeNaoEncontradaException;

public class GerenciadorFilme {

    public static Filme cadastrarFilme(Scanner sc) {

        System.out.println("\n=== Cadastro de Filme ===");

        System.out.print("Digite o nome do filme: ");
        String nome = sc.nextLine();

        System.out.print("Digite o ano de lançamento: ");
        int ano = Integer.parseInt(sc.nextLine());

        System.out.print("Digite o orçamento do filme: ");
        double orcamento = Double.parseDouble(sc.nextLine());

        System.out.print("Digite uma breve descrição: ");
        String descricao = sc.nextLine();

        Filme filme = new Filme(nome, ano, orcamento, descricao);

        System.out.println("\nFilme cadastrado com sucesso!");

        return filme;
    }
    public static Ator cadastrarAtor(Scanner sc) {
        System.out.println("\n=== Cadastro de Ator ===");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Idade: ");
        int idade = Integer.parseInt(sc.nextLine());
        System.out.print("Nacionalidade: ");
        String nacionalidade = sc.nextLine();
        System.out.print("Número de Oscars: ");
        int numOscars = Integer.parseInt(sc.nextLine());

        Ator ator = new Ator(nome, idade, nacionalidade, numOscars);
        System.out.println("Ator cadastrado com sucesso!");
        return ator;
    }

    public static Diretor cadastrarDiretor(Scanner sc) {
        System.out.println("\n=== Cadastro de Diretor ===");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Idade: ");
        int idade = Integer.parseInt(sc.nextLine());
        System.out.print("Nacionalidade: ");
        String nacionalidade = sc.nextLine();
        System.out.print("Estilo de Direção: ");
        String estilo = sc.nextLine();

        Diretor diretor = new Diretor(nome, idade, nacionalidade, estilo);
        System.out.println("Diretor cadastrado com sucesso!");
        return diretor;
    }

    public static void associarAtorAoFilme(Scanner sc, Catalogo catalogo){
        System.out.println("\n=== Associar Ator a Filme ===");

        System.out.print("Digite o nome do filme: ");
        Filme filme = catalogo.buscarFilme(sc.nextLine());

        if (filme == null) {
            throw new EntidadeNaoEncontradaException("Filme", "informado");
        }

        System.out.print("Digite o nome do ator: ");
        Ator ator = catalogo.buscarAtor(sc.nextLine());

        if (ator == null) {
            throw new EntidadeNaoEncontradaException("Ator", "informado");
        }

        filme.adicionarAtor(ator);
        System.out.println("Sucesso! " + ator.getNome() + " foi adicionado ao filme " + filme.getNome());

    }
    public static void associarDiretorAoFilme(Scanner sc, Catalogo catalogo) {
        System.out.println("\n=== Associar Diretor a Filme ===");

        System.out.print("Digite o nome do filme: ");
        Filme filme = catalogo.buscarFilme(sc.nextLine());

        if (filme == null) {
            throw new EntidadeNaoEncontradaException("Filme", "informado");
        }

        System.out.print("Digite o nome do diretor: ");
        Diretor diretor = catalogo.buscarDiretor(sc.nextLine());

        if (diretor == null) {
            throw new EntidadeNaoEncontradaException("Diretor", "informado");
        }


        filme.setDiretor(diretor);
        System.out.println("Sucesso! " + diretor.getNome() + " foi definido como diretor do filme " + filme.getNome());
    }

    public static void removerFilme(Scanner sc, Catalogo catalogo) {
        System.out.println("\n=== Remover Filme ===");
        System.out.print("Digite o nome do filme que deseja remover: ");

        Filme filme = catalogo.buscarFilme(sc.nextLine());

        if (filme == null) {
            throw new EntidadeNaoEncontradaException("Filme", "informado");
        }

        catalogo.removerFilme(filme);
        System.out.println("O filme '" + filme.getNome() + "' foi removido permanentemente do catálogo.");
    }
    public static void removerAtor(Scanner sc, Catalogo catalogo) {
        System.out.println("\n=== Remover Ator ===");
        System.out.print("Digite o nome do ator que deseja remover: ");
        Ator ator = catalogo.buscarAtor(sc.nextLine());

        if (ator == null) {
            throw new EntidadeNaoEncontradaException("Ator", "informado");
        }

        catalogo.removerAtor(ator);
        System.out.println("Sucesso! O ator '" + ator.getNome() + "' foi removido permanentemente do catálogo.");
    }

    public static void removerDiretor(Scanner sc, Catalogo catalogo) {
        System.out.println("\n=== Remover Diretor ===");
        System.out.print("Digite o nome do diretor que deseja remover: ");
        Diretor diretor = catalogo.buscarDiretor(sc.nextLine());

        if (diretor == null) {
            throw new EntidadeNaoEncontradaException("Diretor", "informado");
        }

        catalogo.removerDiretor(diretor);
        System.out.println("Sucesso! O diretor '" + diretor.getNome() + "' foi removido permanentemente do catálogo.");
    }


}
