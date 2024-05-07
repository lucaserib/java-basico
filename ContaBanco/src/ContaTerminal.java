import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TOdo: conhecer e importar a classe Scanner
        Scanner  scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o número da agência: ");
        int numeroAgencia = scanner.nextInt();

        System.out.print("Agora, digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Digite o saldo inicial da conta: ");
        double saldo = scanner.nextDouble();

        System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco! Sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo é R$" + saldo + ". Seu saldo já está disponível para saque.");

        scanner.close();
    }
}
