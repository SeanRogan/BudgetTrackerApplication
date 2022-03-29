package com.budget.app;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
@AllArgsConstructor
public class Debit {
    @Getter
    @Setter
    private Float amount;
    private String category;
    private String transactionID;
}
