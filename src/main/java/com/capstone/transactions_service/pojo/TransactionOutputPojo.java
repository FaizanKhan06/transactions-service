package com.capstone.transactions_service.pojo;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class TransactionOutputPojo {
    private int transactionId;
    private String email;
    private int communityId;
    private String transactionType;
    private double amount;
    private LocalDateTime transactionDateTime;
}
