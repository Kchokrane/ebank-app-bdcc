package org.kamal.accountservice.domain;

import java.math.BigDecimal;

public class Account {
    private String id;
    private String name;
    private Double balance;
    public Account() {
    }
    public Account(String id, String name, BigDecimal balance) {}
}
