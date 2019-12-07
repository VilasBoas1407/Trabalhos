/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import dao.ClienteDAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import model.Cliente;

/**
 *
 * @author rafa
 */
public class TestConnection {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException, ParseException {

        Connection connection = (Connection) new ConnectionFactory().getConnection();
        if (connection != null) {
            System.out.println("Conexão aberta!");
            connection.close();
        }
        ClienteDAO cd = new ClienteDAO();
        
 
       
       Cliente c = new Cliente(3, "4556354", "rafael", "4345454", "5454215", "44243");
        cd.update(c);
    }
}