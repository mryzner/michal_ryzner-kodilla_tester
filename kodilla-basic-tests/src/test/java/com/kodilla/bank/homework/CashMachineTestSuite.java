package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {
    @Test
    public void shouldReturnZero() {
        CashMachine cashMachine = new CashMachine();
        assertEquals(0, cashMachine.getNumberOfTransactions());
    }
    @Test
    public void shouldAddTransactionAndValue() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(100);
        assertEquals(1, cashMachine.getNumberOfTransactions());
        assertEquals(100, cashMachine.getBalance());
    }
    @Test
    public void shouldNotCountZeroTransactions() { // do metody add trzeba dodać return if value==0 żeby test przeszedł
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(100);
        cashMachine.addTransaction(200);
        cashMachine.addTransaction(0);
        cashMachine.addTransaction(-100);
        cashMachine.addTransaction(0);
        assertEquals(3,cashMachine.getNumberOfTransactions());
    }
    @Test
    public void shouldCountBalance() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(100);
        cashMachine.addTransaction(50);
        cashMachine.addTransaction(-70);
        assertEquals(80, cashMachine.getBalance());
    }
    @Test
    public void shouldCountOnlyDeposits() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(-100);
        cashMachine.addTransaction(100);
        cashMachine.addTransaction(100);
        cashMachine.addTransaction(0);
        assertEquals(2, cashMachine.getNumberOfDepositTransactions());
    }
    @Test
    public void shouldSumOnlyDeposits() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(-100);
        cashMachine.addTransaction(100);
        cashMachine.addTransaction(100);
        cashMachine.addTransaction(0);
        assertEquals(200, cashMachine.getSumOfCashDeposits());
    }
    @Test
    public void shouldCountOnlyWithdrawals() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(-100);
        cashMachine.addTransaction(-100);
        cashMachine.addTransaction(100);
        cashMachine.addTransaction(0);
        assertEquals(2, cashMachine.getNumberOfWithdrawalTransactions());
    }
    @Test
    public void shouldSumOnlyWithdrawals() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(-100);
        cashMachine.addTransaction(-100);
        cashMachine.addTransaction(100);
        cashMachine.addTransaction(0);
        assertEquals(-200, cashMachine.getSumOfCashWithdrawals());
    }
    @Test
    public void shouldCalculateAverageDeposit() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(-100);
        cashMachine.addTransaction(100);
        cashMachine.addTransaction(700);
        cashMachine.addTransaction(0);
        assertEquals(400, cashMachine.getAverageDepositValue());
    }
    @Test
    public void shouldCalculateAverageWithdrawal() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(-100);
        cashMachine.addTransaction(-300);
        cashMachine.addTransaction(200);
        cashMachine.addTransaction(0);
        assertEquals(-200, cashMachine.getAverageWithdrawalValue());
    }
}
