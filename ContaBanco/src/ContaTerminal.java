import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Por favor, digite o número da Agência: ");
            String agencia = scanner.nextLine();
            
            int numero = 0;
            while (true) {
                System.out.print("Por favor, digite o número da Conta: ");
                if (scanner.hasNextInt()) {
                    numero = scanner.nextInt();
                    scanner.nextLine();
                    break;
                } else {
                    System.out.println("Valor inválido! Digite um número inteiro para a conta.");
                    scanner.nextLine();
                }
            }
            
            System.out.print("Por favor, digite o nome do Cliente: ");
            String nomeCliente = scanner.nextLine();
            
            double saldo = 0.0;
            while (true) {
                System.out.print("Por favor, digite o saldo: ");
                if (scanner.hasNextDouble()) {
                    saldo = scanner.nextDouble();
                    break;
                } else {
                    System.out.println("Valor inválido! Digite um número válido para o saldo.");
                    scanner.nextLine();
                }
            }
            
            System.out.println("\nOlá " + nomeCliente
                    + ", obrigado por criar uma conta em nosso banco, sua agência é "
                    + agencia + ", conta " + numero
                    + " e seu saldo " + saldo + " já está disponível para saque.");
        }
    }
}