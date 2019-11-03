package atividadebanco;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class AtividadeBanco {

    public static void main(String[] args) throws InterruptedException {
        //Declaração de variavéis
        Scanner input = new Scanner(System.in);
        Cliente c[] = new Cliente[2];
        Util u = new Util();
        ContaBancaria cb[] = new ContaBancaria[2];
        int opcao;

        System.out.println("==============================");
        System.out.println("Grupo: \n"
                + "119119592 - Lucas Vilas Boas Lage \n"
                + "");

        System.out.println("Favor inserir os dados de 5 clientes:");
        for (int i = 0; i < 2; i++) {
            c[i] = new Cliente();
            cb[i] = new ContaBancaria();
            System.out.println("Dados do Cliente [" + i + "] :");
            System.out.print("Nome:");
            c[i].setNome(input.next());
            System.out.print("Endereço:");
            String endereco = input.next();
            c[i].setEndereco(endereco);
            System.out.print("Sexo:[M/F]");
            String sexo = input.next();
            c[i].setSexo(sexo);
            System.out.print("Renda Mensal:");
            c[i].setRenda_mensal(input.nextDouble());
            System.out.println("Dados do usúario salvos!");
            System.out.println("Por favor, insira os dados da conta:");
            System.out.print("Número da conta:");
            cb[i].setNumero(input.nextInt());
            System.out.print("Saldo:");
            cb[i].setSaldo(input.nextDouble());
            System.out.print("Limite de Transferência:");
            cb[i].setLmt_trans(input.nextDouble());
            System.out.print("Limite de Saque:");
            cb[i].setLmt_Saque(input.nextDouble());
            u.Espaco();
            System.out.println("Dados da conta do usúario salvos!");

        }

        u.Espaco();
        System.out.println("Opções do Sistema: \n"
                + "[1] - Transferência entre contas \n"
                + "[2] - Saque \n"
                + "[0] - Sair");
        System.out.print("Opção selecionada:");
        opcao = input.nextInt();
        switch (opcao) {
            case 1:
                u.Espaco();
                int conta1,
                 conta2;
                System.out.println("Transferência entre contas");
                System.out.println("Selecione a sua conta:");
                for (int i = 0; i < 2; i++) {
                    System.out.println("[" + (i + 1) + "]" + c[i].getNome());
                }
                System.out.println("Opção:");
                conta1 = input.nextInt();
                System.out.println("Selecione a conta que você deseja realizar a transferência:");
                for (int i = 0; i < 2; i++) {
                    System.out.println("[" + (i + 1) + "]" + c[i].getNome());
                }
                conta2 = input.nextInt();
                if (u.ContasDiferentes(conta1, conta2) == true) {

                    System.out.println("--------------------------------------------------");
                    conta1 = conta1 - 1; //Objeto começa a contar no valor 0,corrigindo posição
                    conta2 = conta2 - 1;
                    System.out.println("Dados da sua Conta:");
                    System.out.println("Número:" + cb[conta1].getNumero());
                    System.out.println("Nome:" + c[conta1].getNome());
                    System.out.println("Saldo:" + cb[conta1].getSaldo());
                    System.out.println("Limite transferência:" + cb[conta1].getLmt_trans());
                    System.out.println("--------------------------------------------------");
                    System.out.println("--------------------------------------------------");
                    System.out.println("Dados da Conta a receber transferência:");
                    System.out.println("Número:" + cb[conta2].getNumero());
                    System.out.println("Nome:" + c[conta2].getNome());
                    System.out.println("Saldo:" + cb[conta2].getSaldo());
                    System.out.println("Limite transferência:" + cb[conta2].getLmt_trans());
                    System.out.println("--------------------------------------------------");

                    System.out.println("Digite o valor que deseja transferir:");
                    double valor = input.nextDouble();
                    if (u.VerificaLimiteTrans(valor, cb[conta1].getLmt_trans()) == true) {
                        if (u.VerificaSaldo(valor, cb[conta1].getSaldo()) == true) {
                            cb[conta1].realiza_trans(valor);
                            cb[conta2].recebe_trans(valor);
                            System.out.println("Realizando transferência....");
                            TimeUnit.SECONDS.sleep(5); //Espera 5 segundos
                            u.Espaco();
                            System.out.println("--------------------------------------------------");
                            System.out.println("Dados da sua Conta:");
                            System.out.println("Número:" + cb[conta1].getNumero());
                            System.out.println("Nome:" + c[conta1].getNome());
                            System.out.println("Saldo:" + cb[conta1].getSaldo());
                            System.out.println("Limite transferência:" + cb[conta1].getLmt_trans());
                            System.out.println("--------------------------------------------------");
                            System.out.println("--------------------------------------------------");
                            System.out.println("Dados da Conta a receber transferência:");
                            System.out.println("Número:" + cb[conta2].getNumero());
                            System.out.println("Nome:" + c[conta2].getNome());
                            System.out.println("Saldo:" + cb[conta2].getSaldo());
                            System.out.println("Limite transferência:" + cb[conta2].getLmt_trans());
                            System.out.println("--------------------------------------------------");
                            break;
                        } else {
                            System.out.println("Saldo insuficiente!");
                            break;
                        }
                    } else {
                        System.out.println("O valor solicitado excede seu limite de transferência.");
                        break;
                    }
                } else {
                    System.out.println("Você não pode realizar uma transferência para sua conta.");
                    break;
                }
            case 2:
                u.Espaco();
                int conta;
                double valor;
                System.out.println("Realizar saque");
                System.out.println("Selecione a sua conta:");
                for (int i = 0; i < 2; i++) {
                    System.out.println("[" + (i + 1) + "]" + c[i].getNome());
                }
                conta = input.nextInt();
                conta = conta - 1;
                System.out.println("--------------------------------------------------");
                System.out.println("Dados da sua Conta:");
                System.out.println("Número:" + cb[conta].getNumero());
                System.out.println("Nome:" + c[conta].getNome());
                System.out.println("Saldo:" + cb[conta].getSaldo());
                System.out.println("Limite de saque:" + cb[conta].getLmt_Saque());
                System.out.println("--------------------------------------------------");
                System.out.print("Valor saque:");
                valor = input.nextDouble();
                if (u.VerificaLimiteSaque(valor, cb[conta].getLmt_Saque()) == true) {
                    if (u.VerificaSaldo(valor, cb[conta].getSaldo()) == true) {
                        
                        TimeUnit.SECONDS.sleep(5); //Espera 5 segundos  
                        cb[conta].realiza_saque(valor);
                        System.out.println("Realizando saque....");
                        u.Espaco();
                        System.out.println("--------------------------------------------------");
                        System.out.println("Dados da sua Conta:");
                        System.out.println("Número:" + cb[conta].getNumero());
                        System.out.println("Nome:" + c[conta].getNome());
                        System.out.println("Saldo:" + cb[conta].getSaldo());
                        System.out.println("--------------------------------------------------");
                    } else {
                        System.out.println("Saldo insuficiente!");
                        break;
                    }
                } else {
                    System.out.println("Você ultrapassou o limite de saque!");
                    break;
                }

            case 0:
                System.out.println("Programa encerrado!");
                break;
            default:
                System.out.println("Selecione uma opção válida!");
                break;
        }
    }

}
