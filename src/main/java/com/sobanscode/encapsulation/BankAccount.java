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
}
