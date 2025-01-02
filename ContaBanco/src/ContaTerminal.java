import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        int numero;
        String agencia;
        String nomeCliente;
        float saldo;
        System.out.println("Por favor, digite o nome do cliente:");
        nomeCliente = ler.nextLine();
        System.out.println("Por favor, digite o número da Agência:");
        agencia = ler.next();
        System.out.println("Por favor, digite o número da conta:");
        numero = ler.nextInt();
        System.out.println("Por favor, digite o saldo da conta:");
        saldo = ler.nextFloat();
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
    }
}