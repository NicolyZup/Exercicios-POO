package carro;

public class Carros {
    Integer qtdPortas;
    String modelo;
    String marca;
    Double potencia;

    public Carros (Integer qtdPortas, String modelo, String marca){
        this.qtdPortas = qtdPortas;
        this.modelo = modelo;
        this.marca=marca;
        this.potencia = 2.0;
    }

    public void ligarCarro (){
        System.out.println("Carro ligado!");
    }
}
