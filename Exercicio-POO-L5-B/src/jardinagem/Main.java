package jardinagem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Serviços de jardinagem!");
        System.out.println("-----------------------");

        System.out.println("Informe o nome do jardim:");
        String nomeInformado = entrada.next();

        System.out.println("Informe a quantidade de metros do jardim:");
        Double qtdMetrosInformado = entrada.nextDouble();

        System.out.println("Informe a quantidade de plantas do jardim:");
        Integer qtdPlantasInformada = entrada.nextInt();

        System.out.println("Informe a quantidade de metros de grama do jardim:");
        Double qtdMetrosGramaInformado = entrada.nextDouble();

        System.out.println("Informe o valor do adubo:");
        Double valorAduboInformado = entrada.nextDouble();

        System.out.println("Informe o valor do metro da grama:");
        Double valorMetroGramaInformado = entrada.nextDouble();


        Jardim jardim = new Jardim(nomeInformado, qtdMetrosInformado,qtdPlantasInformada,qtdMetrosGramaInformado,
                valorAduboInformado,valorMetroGramaInformado);


        jardim.usarAdubo(qtdMetrosInformado);

        jardim.precoAdubo();

        jardim.precoCorteGrama();

    }
}
