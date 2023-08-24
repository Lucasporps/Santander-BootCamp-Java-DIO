public class Conta {
    
    // Classe conta serve para armazenar as informações da conta bancário do usuário,
    // os métodos set são para atribuir um valor as variáveis do objeto e os métodos get
    // são para retornar o valor das variáveis do objeto.
    
    private int numeroConta;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }
}
