package ProjetoConta;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Account account1 = new Account("Thiago Fernandes", 50.00);
        Account account2 = new Account("Cristiane Medrado", -7.53);

        System.out.printf("%nNome do cliente da conta 1: %s%nSaldo do cliente: %.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%nNome do cliente da conta 2: %s%nSaldo do cliente: %.2f%n", account2.getName(), account2.getBalance());

        System.out.print("\nInforme um valor para depositar na conta 1: ");
        double depositAmount = input.nextDouble();
        System.out.printf("%nAdicionando %.2f à account1...%n", depositAmount);
        account1.deposit(depositAmount);

        System.out.println("Saldos atualizados:");
        System.out.printf("%s - Saldo: R$%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s - Saldo: R$%.2f%n", account1.getName(), account2.getBalance());

        System.out.print("\nInforme um valor para depositar na conta 2: ");
        depositAmount = input.nextDouble();
        System.out.printf("%nAdicionando %.2f à account2...%n", depositAmount);
        account2.deposit(depositAmount);

        System.out.println("Saldos atualizados:");
        System.out.printf("%s - Saldo: R$%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s - Saldo: R$%.2f%n", account1.getName(), account2.getBalance());

        input.close();
    }
}
