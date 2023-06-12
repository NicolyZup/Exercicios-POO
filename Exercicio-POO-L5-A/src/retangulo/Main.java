package retangulo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o comprimento do retângulo:");
        Double comprimentoInformado = entrada.nextDouble();

        System.out.println("Informe a largura do retângulo:");
        Double laguraInformada = entrada.nextDouble();

        Retangulo retangulo = new Retangulo(comprimentoInformado,laguraInformada);

        System.out.println("Deseja alterar o comprimento do retângulo? sim ou não:");
        String informarComprimento = entrada.next();

        if(informarComprimento.equals("sim")){
            System.out.println("Informe o novo valor do comprimento:");
            Double novoComprimentoInformado = entrada.nextDouble();
            retangulo.mudarComprimento(novoComprimentoInformado);
        }

        System.out.println("O comprimento do retângulo é: "+retangulo.comprimento);

        System.out.println("Deseja alterar a largura do retângulo? sim ou não:");
        String informarLargura = entrada.next();

        if(informarLargura.equals("sim")){
            System.out.println("Informe o novo valor da largura:");
            Double novaLarguraInformado = entrada.nextDouble();
            retangulo.mudarLargura(novaLarguraInformado);
        }

        System.out.println("A largura do retângulo é: "+retangulo.largura);

        System.out.println("Deseja calcular a área do retângulo? sim ou não:");
        String informarArea = entrada.next();

        if(informarArea.equals("sim")){
            System.out.println("A área do retângulo é: "+retangulo.calcularArea());
        }

        System.out.println("Deseja calcular o perímetro do retângulo? sim ou não:");
        String informarPerimetro = entrada.next();

        if(informarPerimetro.equals("sim")){
            System.out.println("O perímetro do retângulo é: "+retangulo.calcularPerimetro());
        }

    }
}
