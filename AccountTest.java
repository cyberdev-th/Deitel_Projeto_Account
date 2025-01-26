package ProjetoConta;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Account myAccount = new Account();

        System.out.printf("Nome inicial da conta: %s%n%n", myAccount.getName());

        System.out.print("Por favor, informe o nome: ");
        String accountName = input.nextLine();
        myAccount.setName(accountName);
        System.out.println();

        System.out.printf("Nome atualizado do cliente: %s%n", myAccount.getName());

        input.close();
    }
}
