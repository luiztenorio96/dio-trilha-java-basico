import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Bem vindo ao Banco Dio!");
    System.out.println("Informe o seu nome completo:");
    var nomeCliente = scanner.next();
    System.out.println("informe o número da agência:");
    var agencia = scanner.next();
    System.out.println("informe o numero da conta");
    var numeroConta = scanner.next();
    System.out.println("informe o saldo da conta:");
    var saldo = scanner.next();
    System.out.println(" olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agencia é " + agencia + ", conta "  + numeroConta + " e seu saldo R$ : " + saldo + " já esta disponível para saque!");
    scanner.close();
       
       
    }
}
