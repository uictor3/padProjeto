package dev.uictor.contas;
import dev.uictor.contas.AccountSystem;

public class SpecialAccount extends AccountSystem{
    public SpecialAccount(int numero, double saldo, double creditScore) {
        super(numero, saldo);
        this.creditScore = creditScore;
    }

    private double creditScore;

    public SpecialAccount(int numero, double saldo) {
        super(numero, saldo);
    }

    public boolean sacar(double valor){
        if (this.saldo >= valor){
            this.saldo = this.saldo - valor * 0.99;
            return true;
        }else {
            return false;
        }

    }
}
