public class Conta {
    private String conta;
    private String agencia;
    private Double saldo;
    private String nomeCliente;

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void imprimir(){
        System.out.println("conta = " + conta);
        System.out.println("agencia = " + agencia);
        System.out.println("saldo = " + saldo);
        System.out.println("nome do cliente = " + nomeCliente);
    }

    public int sacarValor(double valor) {
        if (saldo > 0) {
            if (valor > 0) {
                this.saldo -= valor;
                System.out.printf("Saque realizado");
                return 1;
            }
            System.out.printf("Saque não realizado");
            return 0;
        }
        else {
            System.out.printf("ERRO: Realize um deposito primeiro\n");
        }
        return 0;
    }

    public int depositarValor(double valor){
        if(valor > 0){
            this.saldo += valor;
            return 1;
        }
        return 0;
    }
}
