package bola;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Monte sua bola esportiva :)");
        System.out.println("---------------------------");

        System.out.println("Informe a circunferência da bola:");
        double circunferenciaInformada= entrada.nextDouble();

        System.out.println("Informe a cor da bola:");
        String corInformada= entrada.next();

        System.out.println("Informe a marca da bola:");
        String marcaInformada= entrada.next();

        System.out.println("Informe o material da bola:");
        String materialInformado= entrada.next();

        System.out.println("Informe a velocidade da bola:");
        double velocidadeInformada= entrada.nextDouble();

        //instanciando objeto bola
        Bolas bola = new Bolas(circunferenciaInformada, corInformada,
                marcaInformada,materialInformado, velocidadeInformada);

        //método que mostra cor da bola
        System.out.println("Cor informada: "+bola.mostrarCor());

        //método que altera cor da bola (deixar dinamico, usuario escolhe trocar e se trocar informar cor)
        bola.trocarCor("verde");
        System.out.println("Cor da bola alterada para: "+bola.mostrarCor());

        System.out.println("--------------------------------------");
        System.out.println("Veja abaixo como ficou:");
        System.out.println("circunferência: "+bola.circunferencia);
        System.out.println("cor: "+bola.cor);
        System.out.println("marca: "+bola.marca);
        System.out.println("material: "+bola.material);
        System.out.println("velocidade: "+bola.velocidade);
    }
}
