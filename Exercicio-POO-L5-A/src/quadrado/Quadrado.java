package quadrado;

public class Quadrado {
    Double lado;

    public Quadrado(Double lado){
        this.lado=lado;
    }

    public void mudarValorLado(Double valor){
        lado = valor;
    }

    public Double retornarValorLado(){
        return lado;
    }

    public Double calcularArea(){
        double area = lado *lado;
        return area;
    }
}
