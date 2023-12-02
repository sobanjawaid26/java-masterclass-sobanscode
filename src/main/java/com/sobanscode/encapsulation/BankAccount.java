package com.sobanscode.encapsulation;

import java.math.BigDecimal;

public class BankAccount {

    String name;
    BigDecimal balance;
    boolean hasOverdraft;

    public BigDecimal withdraw(BigDecimal amount){
        if (balance.subtract(amount).compareTo(BigDecimal.ZERO) >= 0){
            this.balance = this.balance.subtract(amount);
            return amount;
        }
        return BigDecimal.ZERO;
    }

    public BankAccount(String name) {
        this.name = name;
        this.hasOverdraft = false;
        this.balance = BigDecimal.ZERO;
    }

    public BankAccount() {
    }

    public BankAccount(String name, BigDecimal balance, boolean hasOverdraft) {
        this.name = name;
        this.hasOverdraft = hasOverdraft;
        this.balance = balance;
    }
}
