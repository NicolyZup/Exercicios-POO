package bola;

public class Bolas {

    Double circunferencia;
    String cor;
    String marca;
    String material;
    Double velocidade;

    public Bolas(Double circunferencia, String cor, String marca, String material, Double velocidade){
        this.circunferencia =circunferencia;
        this.cor = cor;
        this.marca = marca;
        this.material = material;
        this.velocidade =velocidade;
    }

    public String mostrarCor(){
        return cor;
    }

    public void trocarCor(String corEnviada){
        cor = corEnviada;
    }
}
