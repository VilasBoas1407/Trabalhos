/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leitorexcel;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.io.PrintWriter;
/**
 *
 * @author Lucas
 */
public class LeitorExcel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        String nome = "D:/Projetos/Trabalhos/Trabalhos/LeitorExcel/user.csv";
        //lerArquivo(nome);
        ContarLinhas(nome);
    }
    public static void lerArquivo(String nome) throws IOException {
         User u[]  = new User[4];
        
        FileReader arq = new FileReader(nome);
        BufferedReader lerArq = new BufferedReader(arq);
        String linha = lerArq.readLine(); 
        int i = 0;
        while (linha != null) {
            String array[] = new String[2];
            u[i] = new User();
            linha = lerArq.readLine(); 
            array = linha.split(";");
            u[i].setNome(array[0]);
            u[i].setLogin(array[1]);
            u[i].setSenha(array[2]);
            System.out.println("["+i+"] - Nome: " + u[i].getNome() + "Login: " + u[i].getLogin() + "Senha:" + u[i].getSenha());
            i++;
        }
        arq.close();
       
    }
    
    public static void ContarLinhas(String nome) throws FileNotFoundException{
        
         LineNumberReader lineCounter = new LineNumberReader(new InputStreamReader(new FileInputStream(nome)));
	String nextLine = null;

	try {
		while ((nextLine = lineCounter.readLine()) != null) {
			if (nextLine == null)
				break;
			System.out.println(nextLine);
		}
                 String caminho = System.getProperty("user.dir") + "/user.csv";
                 System.out.println(caminho);
		System.out.println("Total number of line in this file " + lineCounter.getLineNumber());
                
	} catch (Exception done) {
		done.printStackTrace();
	}
 
    }
    
    
}
