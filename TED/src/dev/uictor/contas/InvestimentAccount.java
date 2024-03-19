package dev.uictor.contas;

public class InvestimentAccount extends AccountSystem{
    double taxa = 1.01;
    int deadLine;

    public InvestimentAccount(int numero, double saldo, double taxa) {
        super(numero, saldo);
        this.taxa = taxa;
    }


    public InvestimentAccount(int numero, double saldo) {
        super(numero, saldo);
    }

    public void rendimento(double taxa){
        this.saldo+= this.saldo * taxa;
    }
    public boolean sacar(double valor){
        if (this.saldo >= valor){
            this.saldo = this.saldo - (valor * this.taxa);
            return true;
        }else {
            return false;
        }

    }
    public boolean depositar(double valor) {
        if (valor >= 0) {
            this.saldo = this.saldo + (valor * this.taxa);
            return true;
        } else{
            return false;
        }
    }
}
