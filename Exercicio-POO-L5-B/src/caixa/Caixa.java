package caixa;

public class Caixa {
    Double saldo;

    public Caixa(){
        this.saldo = 1000.00;
    }

    public void credito(Double valorCredito){
        saldo += valorCredito;
    }

    public void debito(Double valorDebito){
        if(valorDebito > saldo){
            System.out.println("Você não possui saldo suficiente para essa operação :(");
        } else {
            saldo -= valorDebito;
        }
    }
}
