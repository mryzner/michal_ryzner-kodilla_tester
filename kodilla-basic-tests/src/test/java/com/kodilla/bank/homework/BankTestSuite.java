package com.kodilla.bank.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {
    Bank bank = new Bank();
    CashMachine cashMachine1 = new CashMachine();
    CashMachine cashMachine2 = new CashMachine();
    CashMachine cashMachine3 = new CashMachine();

    @BeforeEach
    public void setup() {
        bank.addCashMachine(cashMachine1);
        bank.addCashMachine(cashMachine2);
        bank.addCashMachine(cashMachine3);
        cashMachine1.addTransaction(100);
        cashMachine2.addTransaction(40);
        cashMachine3.addTransaction(10);
        cashMachine2.addTransaction(-100);
        cashMachine1.addTransaction(0);
        cashMachine1.addTransaction(-311);
        cashMachine3.addTransaction(0);
        cashMachine2.addTransaction(100);
    }
   @Test
    public void shouldCalculateTotalBalance() {
        assertEquals(-161, bank.getTotalBalance());
   }
    @Test
    public void shouldCalculateDepositTransactionsQuantity() {
        assertEquals(4, bank.getDepositsNumber());
    }
    @Test
    public void shouldCalculateWithdrawalTransactionsQuantity() {
        assertEquals(2, bank.getWithdrawalsNumber());
    }
    @Test
    public void shouldCalculateAverageDepositValue() {
        assertEquals(62.5, bank.getAverageDepositsValue(), 0.001);
    }
    @Test
    public void shouldCalculateAverageWithdrawalValue() {
        assertEquals(-205.5, bank.getAverageAllWithdrawalsValue(), 0.001);
    }
}
