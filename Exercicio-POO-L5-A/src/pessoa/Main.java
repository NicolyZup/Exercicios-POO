package pessoa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe seu nome:");
        String nomeInformado = entrada.next();

        System.out.println("Informe sua idade:");
        Integer idadeInformada = entrada.nextInt();

        System.out.println("Informe sua altura:");
        Double alturaInformada = entrada.nextDouble();

        Pessoa pessoa = new Pessoa(nomeInformado, idadeInformada,alturaInformada);

        System.out.println("Deseja informar seu peso?: sim /não");
        String informarPeso = entrada.next();

        if(informarPeso.equals("sim")){
            System.out.println("Informe seu peso: ");
            double pesoInformado = entrada.nextDouble();

            pessoa.peso=pesoInformado;
        } else {
            System.out.println("O peso ficará como 0.0");
        }

        //método de envelhecer
        pessoa.envelhecer(2);

        //método de crescer, com valores fixos (da para deixar dinamico)
        if(pessoa.idade < 21){
          double centrimetros = 12.0 * 0.5  ;
          pessoa.crescer(centrimetros);
        } else {
            pessoa.crescer(12.0);
        }

        //método de engordar
        pessoa.engordar(4.0);

        //método de emagrecer
        pessoa.emagrecer(3.0);

        System.out.println("Veja abaixo suas informações:");
        System.out.println("-----------------------------");
        System.out.println("Nome: "+pessoa.nome);
        System.out.println("Idade: "+pessoa.idade);
        System.out.println("Peso: "+pessoa.peso);
        System.out.println("Altura: "+pessoa.altura);
    }
}
