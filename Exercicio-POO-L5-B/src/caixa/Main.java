package caixa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Bem-vindo(a) ao Caixa!");
        System.out.println("----------------------");
        System.out.println("Informe quantos lançamentos deseja realizar:");
        int lancamentos = entrada.nextInt();

        Caixa caixa = new Caixa();

        for(int i = 1; i <= lancamentos;i++){
            System.out.println("Será crédito ou débito?");
            String operacao = entrada.next();

            if(operacao.equals("crédito") || operacao.equals("credito")){
                System.out.println("Informe o valor de entrada no crédito:");
                Double valorCredito = entrada.nextDouble();
                caixa.credito(valorCredito);
            } else if (operacao.equals("débito") || operacao.equals("debito")) {
                System.out.println("Valor a ser passado no débito:");
                Double valorDebito = entrada.nextDouble();
                caixa.debito(valorDebito);
            }
        }

        System.out.println("---------------------------------------------");
        System.out.println("Seu saldo final é R$"+caixa.saldo);
    }
}
