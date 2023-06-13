package jardinagem;

public class Jardim {
    String nomeJardim;
    Double qtdMetros;
    Integer qtdPlantas;
    Double qtdMetrosGrama;
    Double gramaAdubo;
    Double valorAdubo;
    Double valorMetroGrama;
    Double valorCorteGrama;

    public Jardim(String nomeJardim, Double qtdMetros, Integer qtdPlantas, Double qtdMetrosGrama,
                  Double valorAdubo, Double valorMetroGrama){

        this.nomeJardim=nomeJardim;
        this.qtdMetros=qtdMetros;
        this.qtdPlantas=qtdPlantas;
        this.qtdMetrosGrama=qtdMetrosGrama;
        this.gramaAdubo = 0.0;
        this.valorAdubo =valorAdubo;
        this.valorMetroGrama = valorMetroGrama;
        this.valorCorteGrama = 0.0;
    }

    //se a cada 2 metros é 100g de adubo, a cada 1 metro é 50g de adubo
    public void usarAdubo (Double metros){
        Double calculoAdubo = metros * 50;
        gramaAdubo = calculoAdubo;
        System.out.println("A quantidade de adubo a ser usada no jardim informado é: "+gramaAdubo+ " gramas");
    }

    public void precoAdubo(){
        Double valorAPagar = gramaAdubo * valorAdubo;
        System.out.printf("O valor a pagar pelo adubo usado no jardim informado é R$%.2f\r\n", valorAPagar);
    }

    public void precoCorteGrama(){
        valorCorteGrama = qtdMetrosGrama * valorMetroGrama;
        System.out.printf("O valor a pagar pelo corte da grama do jardim informado é R$%.2f", valorCorteGrama);
    }

}
