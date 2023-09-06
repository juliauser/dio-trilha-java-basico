import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) throws Exception {
    
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o seu nome completo: ");
        String nome = sc.nextLine();

        System.out.println("Por favor, digite o número da conta: ");
        int numeroConta = sc.nextInt();

        System.out.println("Por favor, digite a sua agência: ");
        String nomeAgencia = sc.next();

        System.out.println("Por favor, digite seu saldo: ");
        float saldo = sc.nextFloat();

        sc.close();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + nomeAgencia + ", conta " +numeroConta + " e seu saldo "+ saldo + " já está disponível para saque!");

    }
}