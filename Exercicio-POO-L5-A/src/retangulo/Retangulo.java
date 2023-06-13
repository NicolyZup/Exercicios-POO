package retangulo;

public class Retangulo {
    Double comprimento;
    Double largura;

    public Retangulo(Double comprimento, Double largura){
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public void mudarComprimento (Double novoComprimento){
        comprimento = novoComprimento;
    }

    public void mudarLargura (Double novaLargura){
        largura = novaLargura;
    }

    public void mostrarLados (){
        System.out.println("Comprimento: "+comprimento);
        System.out.println("Largura: "+largura);
    }

    public Double calcularArea(){
        double area = comprimento * largura;
        return area;
    }

    public Double calcularPerimetro() {
       double perimetro = (2*comprimento)+(2*largura);
       return  perimetro;
    }
}
