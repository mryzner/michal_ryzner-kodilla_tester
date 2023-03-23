package com.kodilla.bank.homework;

import com.kodilla.school.Grades;

import java.sql.SQLOutput;

public class Bank {
    private CashMachine cashMachine1;
    private CashMachine cashMachine2;
    private CashMachine cashMachine3;

    public Bank() {
        this.cashMachine1 = new CashMachine();
        this.cashMachine2 = new CashMachine();
        this.cashMachine3 = new CashMachine();
        CashMachine[] cashMachines = new CashMachine[] {cashMachine1, cashMachine2, cashMachine3};
    }
    public int getTotalBalance() {
        int sum = cashMachine1.getBalance() + cashMachine2.getBalance() + cashMachine3.getBalance();
        return sum;
    }
    public int getDepositsNumber() {
        int sum = cashMachine1.getNumberOfDepositTransactions() + cashMachine2.getNumberOfDepositTransactions() + cashMachine3.getNumberOfDepositTransactions();
        return sum;
    }
    public int getWithdrawalsNumber() {
        int sum = cashMachine1.getNumberOfWithdrawalTransactions() + cashMachine2.getNumberOfWithdrawalTransactions() + cashMachine3.getNumberOfWithdrawalTransactions();
        return sum;
    }
    public double getAverageAllDepositsValue() {
        double sum1 = cashMachine1.getAverageDepositValue() + cashMachine2.getAverageDepositValue() + cashMachine3.getAverageDepositValue();
        double sum2 = cashMachine1.getNumberOfDepositTransactions() + cashMachine2.getNumberOfDepositTransactions() + cashMachine3.getNumberOfDepositTransactions();
        return sum1/sum2;
    }
    public double getAverageAllWithdrawalsValue() {
        double sum1 = cashMachine1.getAverageWithdrawalValue() + cashMachine2.getAverageWithdrawalValue() + cashMachine3.getAverageWithdrawalValue();
        double sum2 = cashMachine1.getNumberOfWithdrawalTransactions() + cashMachine2.getNumberOfWithdrawalTransactions() + cashMachine3.getNumberOfWithdrawalTransactions();
        return sum1/sum2;
    }
    public CashMachine getCashMachine1() { return this.cashMachine1; }
    public CashMachine getCashMachine2() { return this.cashMachine2; }
    public CashMachine getCashMachine3() { return this.cashMachine3; }

    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.getCashMachine1().addTransaction(-100);
        bank.getCashMachine2().addTransaction(100);
        bank.getCashMachine3().addTransaction(-100);
        bank.getCashMachine1().addTransaction(100);
        bank.getCashMachine2().addTransaction(50);
        bank.getCashMachine3().addTransaction(0);
        double result = bank.getAverageAllDepositsValue();
        System.out.println(result);

    }
}
