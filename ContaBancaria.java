import java.util.Scanner;
import java.util.Locale;

public class ContaBancaria {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o nome do cliente: ");
        String nome = scanner.next();

        System.out.println("Numero da conta: ");
        int numero = scanner.nextInt();

        System.out.println("Agencia :");
        String agencia = scanner.next();

        System.out.println("Digite o saldo do conta: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " +agencia+ ", conta " +numero+" e seu saldo " +saldo+ " já está disponível para saque");
    }
}
