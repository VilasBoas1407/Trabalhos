/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Cliente;

/**
 *
 * @author rafaela.cruz
 */
public class ClienteDAO {

    private Connection connection;
    private int idC;
    private String cpfC, nomeC, rgC, telefoneC, emailC;
    PreparedStatement ps;

    public ClienteDAO() {
        this.connection = null;
        this.ps = null;
    }

    public void inserir(Cliente c) {

        String sql = "INSERT INTO cliente(idC, cpfC, nomeC, rgC, telefoneC, emailC)" + "VALUES(?,?,?,?,?,?)";
        try {
            this.connection = (Connection) new ConnectionFactory().getConnection();
            ps = connection.prepareStatement(sql);
            ps.setInt(1, c.getCodigo());
            ps.setString(2, c.getCpf());
            ps.setString(3, c.getNome());
            ps.setString(4, c.getRg());
            ps.setString(5, c.getTelefone());
            ps.setString(6, c.getEmail());
            ps.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir cliente no banco de dados!", "Erro", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão do banco de dados!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }

    }

    public void removeByID(int id) {
        String sql = "DELETE FROM cliente WHERE idC=?";

        try {
            this.connection = (Connection) new ConnectionFactory().getConnection();

            ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao remover cliente no banco de dados!", "Erro", JOptionPane.ERROR_MESSAGE);

        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão do banco de dados!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public void update(Cliente c) throws ParseException {
        String sql = "UPDATE cliente SET cpfC = ?, nomeC = ?, rgC = ?, telefoneC = ?, emailC = ? WHERE idC = ?";
        try {
            this.connection = (Connection) new ConnectionFactory().getConnection();
            ps = connection.prepareStatement(sql);
            ps.setString(1, c.getCpf());
            ps.setString(2, c.getNome());
            ps.setString(3, c.getRg());
            ps.setString(4, c.getTelefone());
            ps.setString(5, c.getEmail());
            ps.setInt(6, c.getCodigo());
            ps.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar cliente no banco de dados!", "Erro", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão do banco de dados!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public ArrayList readAll() {
        String sql = "SELECT * FROM cliente";
        ArrayList<Cliente> listClientes = new ArrayList();
        ResultSet rset = null;

        try {
            this.connection = (Connection) new ConnectionFactory().getConnection();
            ps = connection.prepareStatement(sql);
            rset = ps.executeQuery();
            while (rset.next()) {
                Cliente c = new Cliente();
                c.setCodigo(rset.getInt("idC"));
                c.setCpf(rset.getString("cpfC"));
                c.setNome(rset.getString("nomeC"));
                c.setRg(rset.getString("rgC"));
                c.setTelefone(rset.getString("telefoneC"));
                c.setEmail(rset.getString("emailC"));
                listClientes.add(c);
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao ler clientes no banco de dados!", "Erro", JOptionPane.ERROR_MESSAGE);
        } finally {

            try {
                if (rset != null) {
                    rset.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão do banco de dados!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
        return listClientes;
    }

    public int codigo() {

        ResultSet rset = null;
        String sql = "SELECT MAX(idC) FROM cliente";

        int ult_codigo = 0;
        try {
            this.connection = (Connection) new ConnectionFactory().getConnection();
            ps = connection.prepareStatement(sql);
            rset = ps.executeQuery();
            rset.next();
            Object result = rset.getObject(1);

            if (result != null) {
                ult_codigo = ((Integer) result) + 1;

            }
        } catch (SQLException | NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao retornar codigo no banco de dados!", "Erro", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (rset != null) {
                    rset.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão do banco de dados!", "Erro", JOptionPane.ERROR_MESSAGE);
            }

        }
        return ult_codigo;
    }
    
}
