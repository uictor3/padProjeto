public class SpecialAccount extends AccountSystem{
    private double creditScore;

    boolean sacar(double valor){
        if (this.saldo >= valor){
            this.saldo = this.saldo - valor * 0.99;
            return true;
        }else {
            return false;
        }

    }
}
