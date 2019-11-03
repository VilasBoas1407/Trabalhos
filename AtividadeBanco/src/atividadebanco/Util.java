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
public class Util {

    public void Espaco() {
        for (int j = 0; j < 50; j++) {
            System.out.println("\n");
        }
    }

    public boolean ContasDiferentes(int conta1, int conta2) {
        if (conta1 != conta2) {
            return true;
        } else {
            return false;
        }

    }

    public boolean VerificaLimiteTrans(double valor, double lmt_trans) {

        if (valor < lmt_trans) {
            return true;
        }
        return false;
    }

    public boolean VerificaLimiteSaque(double valor, double lmt_saque) {

        if (valor < lmt_saque) {
            return true;
        }
        return false;
    }

    public boolean VerificaSaldo(double valor, double Saldo) {

        if (valor < Saldo) {
            return true;
        }
        return false;
    }
}
