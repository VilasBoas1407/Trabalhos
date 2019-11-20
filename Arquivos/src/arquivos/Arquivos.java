/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Lucas
 */
public class Arquivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // Criar diretorio
        new File("C:/ArquivoTestes").mkdirs();
        FileWriter arq = new FileWriter("C:/ArquivoTestes/arquivo.txt");
        String texto;
        String nome = "C:/ArquivoTestes/arquivo.txt";
        PrintWriter gravarArq = new PrintWriter(arq);
        texto = "Lucas Vilas Boas - 119119592\n";
        escreverArquivo(texto, arq, gravarArq);
        texto = "“De onde viemos? Para onde vamos?”, pergunta o filósofo…\n";
        escreverArquivo(texto, arq, gravarArq);
        texto = "“Lá tem Internet?”, pergunta o programador.\n";
        escreverArquivo(texto, arq, gravarArq);
        texto = "“Uma caminhada de mil léguas começa com o primeiro passo”, diz o filósofo…\n";
        escreverArquivo(texto, arq, gravarArq);
        texto = "“int main0{”, diz o programador.\n";
        escreverArquivo(texto, arq, gravarArq);
        texto = "“É melhor ser iludido por sonhos, do que ser iludido por não sonhar.” - diz o filósofo…\n";
        escreverArquivo(texto, arq, gravarArq);
        texto = "“Tomara que não descubram esse bug! ” - programador.\n";
        escreverArquivo(texto, arq, gravarArq);
        texto = "“Nada é tão ruim que não possa piorar”, diz o filósofo.\n";
        escreverArquivo(texto, arq, gravarArq);
        texto = "“Tava funcionando lá em casa...”, diz o programador.\n";
        escreverArquivo(texto, arq, gravarArq);
        arq.close();

        System.out.println("\n \n");
        System.out.println("Lendo dados do arquivo....");
        System.out.println("\n\n");

        lerArquivo(nome);
    }

    public static void escreverArquivo(String texto, FileWriter arq, PrintWriter gravarArq) throws IOException {

        gravarArq.printf(texto);
    }

    public static void lerArquivo(String nome) throws IOException {
        FileReader arq = new FileReader(nome);
        BufferedReader lerArq = new BufferedReader(arq);
        String linha = lerArq.readLine(); 
        while (linha != null) {
            System.out.printf("%s\n", linha);
            linha = lerArq.readLine(); 
        }
        arq.close();
    }

}
