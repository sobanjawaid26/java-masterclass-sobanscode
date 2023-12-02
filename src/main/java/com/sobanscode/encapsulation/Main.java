package com.sobanscode.encapsulation;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        BankAccount account = new BankAccount(
                "Soban",
                BigDecimal.TEN,
                false);

        System.out.println(account.withdraw(new BigDecimal("9.0")));
        System.out.println("New Balance : " + account.balance);
        System.out.println(account.withdraw(new BigDecimal("1.0")));
        System.out.println("New Balance : " + account.balance);

        // WE can fudge/trick the system

        System.out.println("Current Balance : " + account.balance);
        account.balance = new BigDecimal("100.0");
        System.out.println("New Balance : " + account.balance);
        // This code can be used to increase bank balance to any number
        // We have direct access to the balance


    }
}
