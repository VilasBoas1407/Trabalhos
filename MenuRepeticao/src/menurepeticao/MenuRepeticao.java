package menurepeticao;

import java.util.Scanner; // Importando biblioteca
import java.util.Random; // Biblioteca para gerar números aleatórios

/**
 * @author Lucas
 */
public class MenuRepeticao {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Declarando um nome para o Scanner
        Random gerador = new Random();
        int opcao; // Variavel para usar no switch
        while (true) {
            //Criando Menu que será visível na tela
            System.out.println("\n\n-----------------------------------------");
            System.out.println("Menu de atividades:");
            System.out.println("[0] - Sair");
            System.out.println("[1] - Números pares");
            System.out.println("[2] - Diagonal Principal");
            System.out.println("[3] - Diagonal Secundária");
            System.out.println("-----------------------------------------");
            System.out.println("Opção selecionada:");
            opcao = input.nextInt(); // Recebendo a opção selecionada e armazenando na variavél opção.

            switch (opcao) { //Inicio do switch

                case 0:
                    System.exit(0);// Saindo do programa
                    break;
                case 1: // Primeira atividade
                    System.out.println("Você selecionou a primeira opção!");
                    System.out.println("Vou listar todos os números pares de 1 - 10!");
                    for (int x = 0; x <= 10; x++) { // Criando for para ele repetir até que x seja menor ou igual a 10
                        int resto; //Declarando variavel
                        resto = x % 2; // Pegando o resto da divisão de x (Declarado no for) por 2
                        if (resto == 0) { // Caso o resto da divisão seja igual a 0, o número é par!
                            System.out.println(x); // Mostrando o número na tela
                        }
                    }
                    System.out.println("Fim da execução!!!");
                    System.out.println("---------------------------------");
                    break; // O break serve para mostrar aonde o 'case 1' vai terminar
                case 2:
                    System.out.println("Você selecionou a segunda opção!");
                    System.out.println("Vou imprimir os números da diagonal pricipal de uma matriz!\n\n");// o \n serve para dar uma quebra de linha
                    int linha = 0,
                     coluna = 0;// Nesta atividade vamos montar uma matriz 10x10 e mostrar a sua diagonal principal
                    while (linha < 9) {//A diagonal pricipal é quando a linha é igual a coluna. Por ex:1x1 | 2x2... até 10x10
                        /*
                        Essa parte ficou um pouco confusa, mas o primeiro while é para escrever a linha, enquanto
                        a linha for diferente de 9 ele vai continuar.
                        Quando a linha for igual a 9 e a coluna não for 9 ele vai criar uma nova linha.
                         */
                      
                        linha++; // É o mesmo que linha = linha + 1
                        while (linha == 9 && coluna != 9) {
                            
                            coluna++; // Mesmo que coluna = coluna + 1
                            linha = 0; // Aqui estou zerando linha para ele começar uma nova

                        }
                        if (coluna == linha) {//A atividade pede que você escreva a diagonal principal e esse if verifica se é a diagonal principal
                            System.out.println("Linha:" + linha + " Coluna:" + coluna + "Valor da matriz:" + gerador.nextInt(10));//Se linha for igual a coluna ele vai escrever um número aleatório para representar a diagonal principal
                        }

                    }
                    break;
                    
                default:
                    System.out.println("Selecione uma opção válida!!!");

            }

        }

    }

}
