package contaCorrente;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Cadastre aqui sua conta corrente!");
        System.out.println("----------------------------------");

        System.out.println("Informe seu nome:");
        String nomeInformado = entrada.next();

        System.out.println("Informe o número da conta:");
        Integer contaInformada = entrada.nextInt();

        Contas conta = new Contas(contaInformada, nomeInformado);

        System.out.println("Deseja informar seu saldo atual? sim ou não:");
        String informarSaldo = entrada.next();

        if (informarSaldo.equals("sim")){
            System.out.println("Informe seu saldo:");
            Double saldoInformado = entrada.nextDouble();
            conta.saldo = saldoInformado;
        } else {
            System.out.println("Saldo terá valor padrão 0.");
        }

        System.out.println("Deseja depositar algum valor? sim ou não:");
        String informarDeposito = entrada.next();

        if(informarDeposito.equals("sim")){
            System.out.println("Informe a quantidade a ser depositada:");
            Double valorDeposito = entrada.nextDouble();
            conta.depositoConta(valorDeposito);

            System.out.println("Depósito concluído com sucesso! Seu saldo atual é R$" + conta.saldo);
        }

        System.out.println("Deseja realizar um saque? sim ou não:");
        String informarSaque = entrada.next();

        if(informarSaque.equals("sim")){
            System.out.println("Informe o valor do saque:");
            Double valorSaque = entrada.nextDouble();

            if(valorSaque > conta.saldo){
                System.out.println("Saldo insuficiente para saque.");
            }else{
                conta.saqueConta(valorSaque);
                System.out.println("Saque concluído com sucesso! Seu saldo atual é R$" + conta.saldo);
            }
        }

        System.out.println("-------------------------------------------------------");
        System.out.println("Informações:");
        System.out.println("Nome: "+conta.nome);
        System.out.println("Conta: "+conta.numeroConta);
        System.out.println("Saldo: R$"+conta.saldo);
    }
}
