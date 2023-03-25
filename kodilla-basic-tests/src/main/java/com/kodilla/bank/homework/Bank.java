package com.kodilla.bank.homework;

import com.kodilla.school.Grades;

import java.sql.SQLOutput;

public class Bank {
    private CashMachine[] cashMachines = new CashMachine[0];
    private int size;

    public void addCashMachine(CashMachine cashMachine) {
        this.size++;
        CashMachine[] newTab = new CashMachine[this.size];
        System.arraycopy(cashMachines, 0, newTab, 0, cashMachines.length);
        newTab[this.size - 1] = cashMachine;
        this.cashMachines = newTab;
    }
    public int getTotalBalance() {
        int sum = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            sum = sum + cashMachines[i].getBalance();
        }
        return sum;
    }
    public int getDepositsNumber() {
        int sum = 0;
        for (int i=0; i<cashMachines.length; i++) {
            sum = sum+cashMachines[i].getNumberOfDepositTransactions();
        }
        return sum;
    }
    public int getWithdrawalsNumber() {
        int sum = 0;
        for (int i=0; i<cashMachines.length; i++) {
            sum = sum+cashMachines[i].getNumberOfWithdrawalTransactions();
        }
        return sum;
    }
    public double getAverageDepositsValue() {
        double sum = 0;
        int depositQuantity = 0;
        for (int i=0; i<cashMachines.length; i++) {
            sum = sum + cashMachines[i].getSumOfCashDeposits();
            depositQuantity = depositQuantity + cashMachines[i].getNumberOfDepositTransactions();
        }
        return sum/depositQuantity;
    }
    public double getAverageAllWithdrawalsValue() {
        double sum = 0;
        double withdrawalQuantity = 0;
        for (int i=0; i<cashMachines.length; i++) {
            sum = sum + cashMachines[i].getSumOfCashWithdrawals();
            withdrawalQuantity = withdrawalQuantity + cashMachines[i].getNumberOfWithdrawalTransactions();
        }
        return sum/withdrawalQuantity;
    }
}
