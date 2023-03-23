package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {
    @Test
    public void shouldCalculateTotalBalance() {
        Bank bank = new Bank();
        bank.getCashMachine1().addTransaction(100);
        bank.getCashMachine2().addTransaction(100);
        assertEquals(200, bank.getTotalBalance());
    }
    @Test
    public void shouldCalculateDepositNumber() {
        Bank bank = new Bank();
        bank.getCashMachine1().addTransaction(100);
        bank.getCashMachine2().addTransaction(100);
        bank.getCashMachine3().addTransaction(-100);
        bank.getCashMachine1().addTransaction(100);
        bank.getCashMachine2().addTransaction(100);
        bank.getCashMachine3().addTransaction(0);
        assertEquals(4, bank.getDepositsNumber());
    }
    @Test
    public void shouldCalculateWithdrawalNumber() {
        Bank bank = new Bank();
        bank.getCashMachine1().addTransaction(-100);
        bank.getCashMachine2().addTransaction(100);
        bank.getCashMachine3().addTransaction(-100);
        bank.getCashMachine1().addTransaction(100);
        bank.getCashMachine2().addTransaction(100);
        bank.getCashMachine3().addTransaction(0);
        assertEquals(2, bank.getWithdrawalsNumber());
    }
    //@Test
    /*public void shouldCalculateAverageDepositValue() {
        Bank bank = new Bank();
        bank.getCashMachine1().addTransaction(-100);
        bank.getCashMachine2().addTransaction(100);
        bank.getCashMachine3().addTransaction(-100);
        bank.getCashMachine1().addTransaction(100);
        bank.getCashMachine2().addTransaction(50);
        bank.getCashMachine3().addTransaction(0);
        assertEquals(83.333, bank.getAverageAllDepositsValue(), 0.001); */
    //}
}
