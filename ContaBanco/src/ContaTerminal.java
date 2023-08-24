import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Conta contaBancaria = new Conta();
        Scanner entradaUsuario = new Scanner( System.in );

        // Informa o que o usuário precisa digitar e lê o que foi digitado 
        System.out.println("Por favor, digite seu nome: ");
        contaBancaria.setNomeCliente(entradaUsuario.nextLine());
        
        System.out.println("Por favor, digite o número da conta: ");
        contaBancaria.setNumeroConta(Integer.parseInt(entradaUsuario.nextLine()));
        
        System.out.println("Por favor, digite o número da agência: ");
        contaBancaria.setAgencia(entradaUsuario.nextLine());
        
        System.out.println("Por favor, digite seu saldo: ");
        contaBancaria.setSaldo(Double.parseDouble(entradaUsuario.nextLine()));
        
        // Imprimi as informações da conta
        System.out.println("Olá " + contaBancaria.getNomeCliente() + 
        ", obrigado por criar uma conta em nosso banco, sua agência é " + contaBancaria.getAgencia() +
        ", conta " + contaBancaria.getNumeroConta() +
        " e seu saldo " + contaBancaria.getSaldo() + " já está disponível para saque.");
    }
}
