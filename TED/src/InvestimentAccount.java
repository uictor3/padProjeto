public class InvestimentAccount extends AccountSystem{

    double taxa = 0.1;
    int deadLine;

    public double remdimento(double taxa){
        this.saldo+= this.saldo * taxa;
        return this.saldo;
    }
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
}
