public class AccountSystem {
    int numero;
   double saldo;

    boolean sacar(double valor){
        if (this.saldo >= valor){
            this.saldo = this.saldo - valor;
            return true;
        }else {
            return false;
        }

    }
    boolean depositar(double valor) {
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
