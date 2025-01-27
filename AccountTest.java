package ProjetoConta;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Account account1 = new Account("Thiago Fernandes", 50.00);
        Account account2 = new Account("Cristiane Medrado", -7.53);

        account1.displayAccount();
        account2.displayAccount();

        System.out.print("\nInforme um valor para depositar na conta 1: ");
        double depositAmount = input.nextDouble();
        System.out.printf("%nAdicionando %.2f à account1...%n", depositAmount);
        account1.deposit(depositAmount);

        System.out.println("Saldos atualizados:");
        account1.displayAccount();
        account2.displayAccount();

        System.out.print("\nInforme um valor para depositar na conta 2: ");
        depositAmount = input.nextDouble();
        System.out.printf("%nAdicionando %.2f à account2...%n", depositAmount);
        account2.deposit(depositAmount);

        System.out.println("Saldos atualizados:");
        account1.displayAccount();
        account2.displayAccount();

        System.out.print("\nInforme um valor a ser sacado na conta 1:");
        double withdrawAmount = input.nextDouble();
        account1.withdraw(withdrawAmount);

        System.out.print("\nInforme um valor a ser sacado na conta 2:");
        withdrawAmount = input.nextDouble();
        account2.withdraw(withdrawAmount);

        System.out.println("Saldos atualizados:");
        account1.displayAccount();
        account2.displayAccount();

        input.close();
    }
}
