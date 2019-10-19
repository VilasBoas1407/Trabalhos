package stringjava;

import java.util.Scanner;

public class StringJava {

    public static void main(String[] args) {
        int opcao;
        Scanner ler = new Scanner(System.in);
        System.out.println("====================================================");
        System.out.println("\n");
        System.out.println("Trabalhando com STRING em JAVA \n");
        System.out.println("BEM VINDO!");
        System.out.println("Este projeto foi desenvolvido por:");
        System.out.println("119214091 - Fabiana Quelott Lopes Cançado");
        System.out.println("119119592 - Lucas Vilas Boas");
        System.out.println("\n");
        System.out.println("====================================================");
        System.out.println("\n [1] - Vetor de char e String\n [2] - Uso do CharAt\n [3] - Uso do codePointAt \n [4] - Método de toUpperCase\n [5] endsWith e startsWith \n [6] toCharArray \n [7] getBytes \n [8] isEmpty \n [9] split \n [10] substring e subSequence");

        System.out.println("Opção selecionada:");
        opcao = ler.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("\n Vetor de char e String \n");
                System.out.println("A principal diferença é que com o “char data[]” não tem-se todo o “poder” que a classe String nos proporciona para manipular esse vetor. \n");
                char data[] = {'P', 'E', 'A', 'R', 'L', ' ', 'J', 'A', 'M'};
                String str = new String(data);
                System.out.println(str);
                break;
            case 2:
                System.out.println("\n Uso do CharAt \n");
                System.out.println("Retorna a letra na posição informada \n");
                String valor = "Pearl Jam - Black";
                System.out.println("Palavra :" + valor);
                System.out.println("Valor na posição 0: " + valor.charAt(0));
                System.out.println("Valor na posição 10: " + valor.charAt(10));

                break;
            case 3:
                System.out.println("\n Uso do codePointAt \n");
                System.out.println("Retorna o valor em UNICODE do caractere especificado no index do parâmetro.\n");
                String value = "Pearl Jam - Black";
                System.out.println("Palavra :" + value);
                System.out.println("Valor da posição 0" + value.codePointAt(0));
                System.out.println("Valor da posição 10" + value.codePointAt(10));
                break;
            case 4:
                String palavra;
                System.out.println("\n Uso do toUpperCase e  toLowerCase \n");
                System.out.println("Se Eu tiVEsse ComeÇando AgoRa, Eu fArIa As cOisas De ManEirA MuiTo DiFeRente. \n - Mark Zuckerberg ");
                palavra = "Se Eu tiVEsse ComeÇando AgoRa, Eu fArIa As cOisas De ManEirA MuiTo DiFeRente. \n - Mark Zuckerberg ";
                System.out.println(palavra.toUpperCase());
                System.out.println(palavra.toLowerCase());
                break;
            case 5:
                System.out.println("\n Uso do endsWith e  startsWith \n");
                String end = "Eu quero colocar uma marca no universo. \n-Steve Jobs";
                System.out.println(end);
                System.out.println("Analisando se os direitos autorais da frase está com sobrenome correto...... Aguarde.");
                System.out.println(end.endsWith("Jobs"));
                System.out.println("A palavra -Eu- está a partir de qual número de caracter?");
                System.out.println(end.startsWith("Eu", ler.nextInt()));
                System.out.println("A palavra -quero- está a partir de qual número de caracter?");
                System.out.println(end.startsWith("quero", ler.nextInt()));
                break;
            case 6:

                String array = "Minha ambição sempre foi poder realizar os sonhos. \n-Bill Gates";
                System.out.println("\n Uso do toCharArray \n");
                for (char arrays : array.toCharArray()) {

                    System.out.println("Quebrando frase....." + arrays);

                }

                System.out.println("Descubra qual frase é!");
                break;
            case 7:
                System.out.println("\n Uso do getBytes \n");
                String bty = "Seja bom com os nerds. É muito provável que você acabe trabalhando para um. \n-Bill Gates";
                System.out.println(bty);
                System.out.println("Veja abaixo quantos bytes tem cada caracter:");
                for (byte a : bty.getBytes()) {

                    System.out.println("Bytes: " + a);

                }
                break;
            case 8:
                System.out.println("\n Uso do isEmpty \n");
                String vazia = "Olá, mundo!";
                System.out.println(vazia);
                System.out.println("Verificando se está vazia...");
                System.out.println(vazia.isEmpty());
                break;
            case 9:
                System.out.println("\n Uso do split \n");
                String bill = "Ter um diploma é um caminho muito mais certeiro para o sucesso. -Bill Gates";

                String[] bill_dois = bill.split("-");

                for (String x : bill_dois) {

                    System.out.println(x);

                }
                break;
            case 10:
                System.out.println("\n Uso do substring \n");
                String bills = "Gates Bill";
                System.out.println(bills);
                System.out.println("Desembaralhando nome.... \n");
                System.out.println(" ");
                System.out.print(bills.substring(5, 10) + " ");
                System.out.print(bills.substring(0, 5));

            default:
                System.out.println("Digite uma opção válida!");
        }

    }
}
