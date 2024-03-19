package dev.uictor.contas;

public class AccountSystem {


    private int numero;
   protected double saldo;

    public AccountSystem(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public boolean sacar(double valor){
        if (this.saldo >= valor){
            this.saldo = this.saldo - valor;
            return true;
        }else {
            return false;
        }

    }
    public boolean depositar(double valor) {
        if (valor >= 0) {
            this.saldo = this.saldo + valor;
            return true;
        } else{
            return false;
        }
    }
    public double getSaldo() {
        return this.saldo;
    }


}
