package org.kamal.accountservice.sevices;

import org.kamal.accountservice.repository.TransactionRepository;

public class EbankService {
    private TransactionRepository transactionRepository;
    public TransactionRepository getTransactionRepository() {
        return transactionRepository;
    }
    public void setTransactionRepository(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;

    }
}
