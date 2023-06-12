package carro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a quantidade de portas do seu carro:");
        Integer qtdInformada = entrada.nextInt();

        System.out.println("Informe o modelo do seu carro:");
        String modeloInformado = entrada.next();

        System.out.println("Informa a marca do seu carro:");
        String marcaInformada = entrada.next();

        Carros carro = new Carros(qtdInformada, modeloInformado,marcaInformada);

        System.out.println("Deseja informa a potência do seu carro? sim ou não:");
        String informarPotencia = entrada.next();

        if(informarPotencia.equals("sim")){
            System.out.println("Informe a potência do seu carro:");
            Double potenciaInformada = entrada.nextDouble();
            carro.potencia = potenciaInformada;
        }

        System.out.println("Deseja ligar o carro? sim ou não:");
        String ligarCarro = entrada.next();

        if(ligarCarro.equals("sim")){
            carro.ligarCarro();
        }

        System.out.println("----------------------------");
        System.out.println("Informações do seu carro:");
        System.out.println("Quantidade de portas: "+carro.qtdPortas);
        System.out.println("Modelo: "+carro.modelo);
        System.out.println("Marca: "+carro.marca);
        System.out.println("Potência: "+carro.potencia);
    }
}
