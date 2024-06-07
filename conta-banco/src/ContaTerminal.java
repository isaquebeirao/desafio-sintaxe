import java.math.BigDecimal;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor, digite o seu nome inteiro");
        String nome = scan.nextLine();

        System.out.println("Digite agora sua agência");
        String agencia = scan.nextLine();

        System.out.println("Digite o número da conta");
        int numeroConta = scan.nextInt();

        System.out.println("Pra finalizar, digite seu saldo");
        double saldo = scan.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f\n já está disponível para saque", nome, agencia, numeroConta, saldo);

    }
}
