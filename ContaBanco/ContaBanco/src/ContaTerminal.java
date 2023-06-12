
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {

            System.out.println("Digite  o numero da sua agencia: ");
            int agencia = scanner.nextInt();

            System.out.println("Digite o numero da conta com traço e digito");
            String numero = scanner.next();
            
            System.out.println("Digite seu Nome");
            String nome = scanner.next();

            System.out.println("Digite seu Sobrenome");
            String sobrenome = scanner.next();

            double saldo = 237.48;
           
            System.out.println("Digite  o numero da sua senha: ");
            int senha = scanner.nextInt();
            if (senha == 123456) {
                System.out.println(
                        "Ola,  " + nome + " " + sobrenome + ",bem vinda ao Bradesco " + agencia + " " + numero);

                System.out.println("Seu saldo é " + saldo + " Reais");
            } else {
                  System.out.println("Senha invalida");
            }

            // imprimindo os dados obtidos pelo usuario

        }

    }
}
