package contaCorrente;

public class Contas {
    Integer numeroConta;
    String nome;
    Double saldo;

    public Contas(Integer numeroConta, String nome){
        this.numeroConta =numeroConta;
        this.nome = nome;
        this.saldo = 0.0;
    }

    public void depositoConta(Double deposito){
        saldo+=deposito;
    }

    public void saqueConta(Double saque){
        saldo -= saque;
    }
}
