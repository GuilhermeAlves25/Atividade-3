public class ContaCorrente {
    private String numero;
    private double saldo;
    private boolean status;
    private double limite;

    public ContaCorrente(String numero, double saldo, boolean status, double limite) {
        this.numero = numero;
        this.saldo = saldo;
        this.status = status;
        this.limite = limite;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    public void saque(double valor) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saque realizado no valor de R$ " + valor);
        } else {
            System.out.println("Saldo insuficiente");
        }

    }
    public void deposito(double valor) {
        setSaldo(getSaldo() + valor);
        System.out.println("Deposito Realizado no valor de R$ " + valor);
    }
    public void consultaSaldo() {
        System.out.println(getSaldo());
    }
    public void chequeEspecial(){
        if(isStatus()){
            System.out.println("O cliente esta usando cheque especial");
        }else{
            System.out.println("O cliente não esta usando cheque especial");
        }
    }
}
