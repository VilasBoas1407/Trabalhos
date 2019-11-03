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
public class ContaBancaria {

    int numero;
    double Saldo, Lmt_trans, Lmt_Saque;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }

    public double getLmt_trans() {
        return Lmt_trans;
    }

    public void setLmt_trans(double Lmt_trans) {
        this.Lmt_trans = Lmt_trans;
    }

    public double getLmt_Saque() {
        return Lmt_Saque;
    }

    public void setLmt_Saque(double Lmt_Saque) {
        this.Lmt_Saque = Lmt_Saque;
    }

    public void recebe_trans(double valor){
        this.Saldo = Saldo + valor;
    }
    public void realiza_trans(double valor){
        this.Saldo = Saldo - valor;
    }
    public void realiza_saque(double valor){
        this.Saldo = Saldo - valor;
    }
}
