package quadrado;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o lado do quadrado:");
        Double ladoInformado = entrada.nextDouble();

        Quadrado quadrado = new Quadrado(ladoInformado);

        System.out.println("Deseja alterar o lado do quadrado? sim ou não:");
        String informarLado = entrada.next();

        if(informarLado.equals("sim")){
            System.out.println("Informe o novo valor do lado:");
            Double novoLadoInformado = entrada.nextDouble();
            quadrado.mudarValorLado(novoLadoInformado);
        }

        System.out.println("O lado do quadrado é: "+quadrado.retornarValorLado());

        System.out.println("Deseja calcular área do quadrado? sim ou não:");
        String informarArea = entrada.next();

        if(informarArea.equals("sim")){
            System.out.println("A área do quadrado é: "+quadrado.calcularArea());
        }
    }
}
