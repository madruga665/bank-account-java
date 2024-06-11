import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        DecimalFormat decimalFormat = new DecimalFormat("#.00");

        System.out.println("Por favor, digite o número da sua conta!");
        int accountNumber = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência!");
        String bankAgency = scanner.next();

        System.out.println("Por favor, digite o seu nome!");
        String customerName = scanner.next();

        System.out.println("Por favor, digite o seu saldo!");
        double accountBalance = scanner.nextDouble();

        System.out.println("Olá ".concat(customerName)
                + ", obrigado por criar uma conta em nosso banco, sua agência é: ".concat(bankAgency)
                + ", conta: ".concat(String.valueOf(accountNumber))
                + " e seu saldo R$".concat(String.valueOf(decimalFormat.format(accountBalance)))
                + " já está disponível para saque");

        scanner.close();
    }
}
