/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade_2;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Atividade_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random gerador = new Random();
        int opcao;
        Scanner input = new Scanner(System.in);
        System.out.println("============================================");
        System.out.println("Alunos:");
        System.out.println("119214091 - Fabiana Quelott Lopes Cançado");
        System.out.println("119119592 - Lucas Vilas Boas Lage");
        System.out.println("============================================");
        System.out.println("[1] - Loja de artesanato");
        System.out.println("[2] - Dois Vetores");
        System.out.println("[3] - Diagonal principal ");
        System.out.println("[4] - Preencher matriz");
        System.out.println("\n");
        System.out.println("Selecione uma opção:");
        opcao = input.nextInt();

        switch (opcao) {
            case 1:
                double vetor_um[],
                 vetor_dois[];

                vetor_um = new double[11];
                vetor_dois = new double[11];
                double total = 0;
                double salario_vendedor = 545.00;
                double calculo,
                 calculo_dois;
                double mais_vendido = 0;
                int posicao = 0;

                for (int i = 1; i < 11; i++) {

                    System.out.println("O número do produto é: " + i);
                    System.out.println("Informe o valor do produto");
                    vetor_um[i] = input.nextDouble();
                    System.out.println("Informe o total vendido do produto:");
                    vetor_dois[i] = input.nextDouble();

                    if (vetor_dois[i] > mais_vendido) {

                        mais_vendido = vetor_dois[i];
                        posicao = i;

                    }

                }

                for (int x = 1; x < 11; x++) {
                    System.out.println("==================RELATÓRIO==================");
                    System.out.println("=============================================");
                    System.out.println("O quantidade vendida do produto " + x + " é:");
                    System.out.println(vetor_um[x]);
                    System.out.println("O valor únitário do produto " + x + " é:");
                    System.out.println(vetor_dois[x]);
                    System.out.println("O valor total da venda do produto " + x + " é");
                    double valor = (vetor_um[x] * vetor_dois[x]);
                    System.out.println(valor);
                    total = total + valor;

                }
                System.out.println("Valor total das vendas: ");
                System.out.println(total);
                calculo = ((total * 5) / 100);
                calculo_dois = calculo + salario_vendedor;
                System.out.println("O salário do vendedor com a comissão será de: \n" + calculo_dois);
                System.out.println("O valor da comissão é de: \n" + calculo);
                System.out.println("O produto mais vendido é o da posição: " + posicao);
                break;
            case 2:
                //Declaração de variavéis
                int x[],
                 y[],
                 uniao[],
                 diferenca[];

                x = new int[10];
                y = new int[10];
                uniao = new int[10];
                diferenca = new int[10];
                boolean existe = false;
                boolean dif = false;
                int soma = 0,mult  = 0;
                
                for (int i = 0; i < 10; i++) {
                    System.out.println("Digite o valor de X na posição [" + i + "]:");
                    x[i] = input.nextInt();
                    System.out.println("Digite o valor de Y na posição [" + i + "]:");
                    y[i] = input.nextInt();
                }

                for (int i = 0; i < 10; i++) {
                    for (int j = 0; j < 10; j++) {
                        if (x[i] == y[j]) {
                            for (int index = 0; index < 10; index++) {
                                if (uniao[index] == y[j]) {
                                    existe = true;
                                    break;
                                }
                            }

                            if (!existe) {
                                uniao[i] = y[j];
                                i++;
                            }
                        }
                    }
                }
                for (int i = 0; i < 10; i++) {
                    for (int j = 0; j < 10; j++) {
                        if (x[i] != y[j]) {
                            for (int index = 0; index < 10; index++) {
                                if (uniao[index] == y[j]) {
                                    dif = true;
                                    break;
                                }
                            }

                            if (!dif) {
                                diferenca[i] = y[j];
                                i++;
                            }
                        }
                    }
                }
                for(int i =0; i < 10;i++){
                    soma = x[i] + y[i];
                    mult = x[i] * y[i];
                    System.out.println("Soma dos vetores na posição [" + i + "] : " + soma);
                    System.out.println("O produto dos vetores é:" + mult);
                    
                }
                System.out.println("Resultado de União dos vetores X e Y: " + Arrays.toString(uniao));
                System.out.println("Resultado da diferença  dos vetores X e Y: " + Arrays.toString(diferenca));
                break;

            case 3:
                break;
            case 4:
                System.out.println("===========================================");
                System.out.println("           BOLETIM DOS ALUNOS");
                System.out.println("===========================================");
                double nota [] = new double[3];
                int alunos []  = new int[10];
                
                for(int a = 0;a < 10;a++){
                    System.out.println("Aluno ["+a+"]");
                    
                    
                        for(int n = 0; n < 3;n++){
                            System.out.println("Digite a pontuação do aluno na [" + n + "]");
                            nota[n]  = input.nextDouble();
                        }
                        System.out.println("Notas:");
                        System.out.println("Prova 1  --------- Prova 2 --------- Prova 3");
                        System.out.println(nota[0] + "                 " + nota[1] + "                    " + nota[2]);
                }
                break;
            default:
                System.out.println("Selecione uma opção válida!");

        }

    }

}
