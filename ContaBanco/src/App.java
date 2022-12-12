import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

       Scanner sc = new Scanner(System.in).useLocale(Locale.US);

       System.out.println("Por favor digite o número da agência");
       String agencia = sc.next();
       System.out.println("Por favor digite o número da conta");
       int numero = sc.nextInt();
       System.out.println("Por favor digite o saldo");
       double saldo = sc.nextDouble();
       System.out.println("Por favor digite o número o nome do titular");
       String nomeCliente = sc.next();

       sc.close();

       ContaTerminal novaConta = new ContaTerminal(numero, agencia,nomeCliente, saldo);



       System.out.println("Olá "+novaConta.nomeCliente+ ", obrigado por criar uma conta em nosso banco, sua agência é "+novaConta.agencia+", conta "+novaConta.numero +"e seu saldo "+ novaConta.saldo + " já está disponível para saque.");
    }
}
