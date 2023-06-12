package pessoa;

public class Pessoa {
    String nome;
    Integer idade;
    Double peso;
    Double altura;

    public Pessoa(String nome, Integer idade, Double altura){
        this.nome=nome;
        this.idade=idade;
        this.peso=0.0;
        this.altura=altura;
    }

    public void envelhecer(Integer anos){
        idade += anos;
    }

    public void engordar(Double kilos){
        peso+=kilos;
    }

    public void emagrecer(Double kilos){
        peso-=kilos;
    }

    public void crescer(Double centrimetros){
        altura+=centrimetros;
    }
}
