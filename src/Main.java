import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int codigoExit = 0;
        System.out.println("Introdução, digite a opção, apresenta opçoes 1,2,3,4, 0 pra sair");
        String input = sc.nextLine();

        while(Integer.parseInt(input)!=codigoExit){
            //enquanto nao for zero(Exit) faz tal:
            switch (input){
                //possivelmente melhor organizar em menus e submenus
                    //1 - buscar filme/ator/diretor
                    //2 - gerenciamento do catálogo(add filme/ator/diretor, associar a filme)
                    //0 - sair
                case "1"://cadastrar filme
                    String opcao = sc.nextLine();
                    switch (opcao){
                        case "1"://cadastrar ator
                        case "2"://cadastrar ator
                        case "3"://cadastrar diretor
                        case "4"://menu anterior
                    }
                case "2"://gerenciamento
                    String opcao1 = sc.nextLine();
                    switch (opcao1){
                        case "1"://cadastrar ator
                        case "2"://cadastrar ator
                        case "3"://cadastrar diretor
                        case "4"://adicionar ator a filme
                        case "5"://adicionar diretor a filme
                        case "6"://menu anterior
                    }

            }
        }






    }
}