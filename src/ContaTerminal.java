import java.util.Scanner;

public class ContaTerminal {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("insira o número da agência: ");
        int getNumber = sc.nextInt();
        System.out.println("insira o numéro da conta: ");
        int getNumberAccount = sc.nextInt();
        sc.nextLine();
        System.out.println("Insira o seu nome: ");
        String getNome = sc.nextLine();

        AccountUser user = new AccountUser(getNumberAccount, getNumber, getNome);

        System.out.println("Olá " + getNome + ", obrigado por criar uma conta em nosso banco, sua agência é "
        + getNumber +", conta " + getNumberAccount+ "e seu saldo " + user.getSaldo()+ "já esta disponivel para saque");



        sc.close();
    }
}