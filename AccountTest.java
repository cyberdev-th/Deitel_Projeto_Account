package ProjetoConta;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Account account1 = new Account("Thiago Fernandes");
        Account account2 = new Account("Nilo Nonnato");

        System.out.printf("Nome do cliente da conta 1: %s%n", account1.getName());
        System.out.printf("Nome do cliente da conta 2: %s%n", account2.getName());

        input.close();
    }
}
