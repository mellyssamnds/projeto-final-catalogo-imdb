import java.util.Scanner;

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
}
