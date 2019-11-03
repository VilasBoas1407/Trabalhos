/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadebanco;

/**
 *
 * @author Lucas
 */
public class Cliente {

    String Nome, Endereco, Sexo;

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public double getRenda_mensal() {
        return renda_mensal;
    }

    public void setRenda_mensal(double renda_mensal) {
        this.renda_mensal = renda_mensal;
    }
    double renda_mensal;

 
}
