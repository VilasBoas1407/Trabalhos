/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

import com.sun.jdi.connect.spi.Connection;

/**
 *
 * @author Lucas
 */
public class Conexao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String usuario = "hsegura_gerente";
        String senha = "123456";
        String url = "jdbc:sqlserver://sql.locadados.com.br:1433;databaseName=hsegura_tutorial"
                + ";user=" + usuario + ";password=" + senha + ";";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection conexao = DriverManager.getConnection(url);
        } catch (ClassNotFoundException e) {
            // Erro caso o driver JDBC não foi instalado
            e.printStackTrace();
        } catch (SQLException e) {
            // Erro caso haja problemas para se conectar ao banco de dados
            e.printStackTrace();
        }

    }

}
