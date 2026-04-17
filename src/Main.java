import exception.AtorNaoEncontradoException;
import exception.DiretorNaoEncontradoException;
import exception.FilmeNaoEncontradoException;
import model.Ator;
import model.Diretor;
import model.Filme;
import service.Catalogo;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Scanner;

void main() {
    try (Scanner sc = new Scanner(System.in)) {
        Catalogo catalogo = new Catalogo();
        String input = "";

        while (!input.equals("0")) {
            System.out.println("\n===== POO-FLIX =====");
            System.out.println("1- Buscar | 2- Gerenciamento | 0- Sair");
            System.out.print("Escolha uma opção: ");
            input = sc.nextLine();

            switch (input) {
                case "1" -> menuBusca(sc, catalogo);
                case "2" -> menuGerenciamento(sc, catalogo);
                case "0" -> System.out.println("Saindo do sistema...");
                default -> System.out.println("Opção inválida.");
            }
        }
    }
}

void menuBusca(Scanner sc, Catalogo catalogo) {
    System.out.println("\n--- BUSCA ---");
    System.out.println("1- Filme | 2- Ator | 3- Diretor | 4- Voltar");
    System.out.print("Escolha uma opção: ");
    String busca = sc.nextLine();

    switch (busca) {
        case "1" -> {
            System.out.print("Digite o nome do filme: ");
            try {
                Filme filme = catalogo.procurarFilme(sc.nextLine());
                System.out.println("\n--- Filme Encontrado ---");
                System.out.println("Nome: " + filme.getNome());
                System.out.println("Lançamento: " + filme.getDataLancamento());
                System.out.println("Orçamento: U$ " + filme.getOrcamento());
                System.out.println("Descrição: " + filme.getDescricao());
                if (filme.getDiretor() != null) {
                    System.out.println("Diretor: " + filme.getDiretor().getNome());
                }
                if (!filme.getAtores().isEmpty()) {
                    System.out.print("Atores: ");
                    filme.getAtores().forEach(a -> System.out.print(a.getNome() + " | "));
                    System.out.println();
                }
            } catch (FilmeNaoEncontradoException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
        case "2" -> {
            System.out.print("Digite o nome do ator: ");
            try {
                Ator ator = catalogo.procurarAtor(sc.nextLine());
                System.out.println("\n" + ator.apresentarCurriculo(catalogo));
            } catch (AtorNaoEncontradoException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
        case "3" -> {
            System.out.print("Digite o nome do diretor: ");
            try {
                Diretor diretor = catalogo.procurarDiretor(sc.nextLine());
                System.out.println("\n" + diretor.apresentarCurriculo(catalogo));
            } catch (DiretorNaoEncontradoException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
        case "4" -> System.out.println("Voltando ao menu principal...");
        default -> System.out.println("Opção inválida.");
    }
}

void menuGerenciamento(Scanner sc, Catalogo catalogo) {
    System.out.println("\n--- GERENCIAMENTO ---");
    System.out.println("1- Add Filme | 2- Add Ator | 3- Add Diretor | 4- Associar Ator a Filme | 5- Associar Diretor a Filme | 6- Voltar");
    System.out.print("Escolha uma opção: ");
    String gerencia = sc.nextLine();

    try {
        switch (gerencia) {
            case "1" -> {
                System.out.print("Nome do filme: ");
                String nome = sc.nextLine();
                System.out.print("Data de lançamento (AAAA-MM-DD): ");
                LocalDate data = LocalDate.parse(sc.nextLine());
                System.out.print("Orçamento (Use '.' para decimais): ");
                BigDecimal orcamento = new BigDecimal(sc.nextLine());
                System.out.print("Descrição: ");
                String descricao = sc.nextLine();

                catalogo.cadastrarFilme(nome, data, orcamento, descricao, new ArrayList<>(), null);
                System.out.println("Filme cadastrado com sucesso!");
            }
            case "2" -> {
                System.out.print("Nome do ator: ");
                String nome = sc.nextLine();
                System.out.print("Data de nascimento (AAAA-MM-DD): ");
                LocalDate data = LocalDate.parse(sc.nextLine());
                System.out.print("Número de Oscars: ");
                int oscars = Integer.parseInt(sc.nextLine());

                catalogo.cadastrarAtores(nome, data, oscars);
                System.out.println("Ator cadastrado com sucesso!");
            }
            case "3" -> {
                System.out.print("Nome do diretor: ");
                String nome = sc.nextLine();
                System.out.print("Data de nascimento (AAAA-MM-DD): ");
                LocalDate data = LocalDate.parse(sc.nextLine());
                System.out.print("Estilo de direção: ");
                String estilo = sc.nextLine();
                System.out.print("Avaliação da crítica (0.0 a 10.0): ");
                Double avaliacao = Double.parseDouble(sc.nextLine());

                catalogo.cadastrarDiretores(nome, data, estilo, avaliacao);
                System.out.println("Diretor cadastrado com sucesso!");
            }
            case "4" -> {
                System.out.print("Nome do filme: ");
                String fNome = sc.nextLine();
                System.out.print("Nome do ator existente: ");
                String aNome = sc.nextLine();
                catalogo.adicionarAtoresDeFilme(fNome, aNome);
            }
            case "5" -> {
                System.out.print("Nome do filme: ");
                String fNome = sc.nextLine();
                System.out.print("Nome do diretor existente: ");
                String dNome = sc.nextLine();
                catalogo.adicionarDiretorDoFilme(fNome, dNome);
            }
            case "6" -> System.out.println("Voltando ao menu principal...");
            default -> System.out.println("Opção inválida.");
        }
    } catch (DateTimeParseException e) {
        System.out.println("Falha na formatação: A data deve obedecer o padrão AAAA-MM-DD. Operação cancelada.");
    } catch (NumberFormatException e) {
        System.out.println(" O valor inserido não é um número válido. Operação cancelada.");
    } catch (FilmeNaoEncontradoException | AtorNaoEncontradoException | DiretorNaoEncontradoException e) {
        System.out.println("Falha na associação: " + e.getMessage());
    }
}