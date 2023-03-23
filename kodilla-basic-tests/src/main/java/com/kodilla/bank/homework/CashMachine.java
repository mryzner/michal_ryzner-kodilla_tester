package com.kodilla.bank.homework;

public class CashMachine {
    private int[] transactions;
    private int size;

    public CashMachine() {
        this.size = 0;
        this.transactions = new int[0];
    }

    public void addTransaction(int value) {
        if (value==0) { return; }
        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(transactions, 0, newTab, 0, transactions.length);
        newTab[this.size - 1] = value;
        this.transactions = newTab;
    }
    public int getBalance() {
        int sum = 0;
        for (int value: transactions) { sum = sum + value; }
        return sum;
    }
    public int getNumberOfTransactions() {
        return transactions.length;
    }
    public int getSumOfCashDeposits() {
        int sum = 0;
        for (int value : transactions) {
            if (value > 0) {
                sum = sum + value;
            }
        }
        return sum;
    }
    public int getSumOfCashWithdrawals() {
        int sum = 0;
        for (int value : transactions) {
            if (value < 0) {
                sum = sum + value ;
            }
        }
        return sum;
    }
    public int getNumberOfDepositTransactions() {
        int sum = 0;
        for (int value: transactions) {
            if (value > 0) {
                sum++;
            }
        }
        return sum;
    }
    public int getNumberOfWithdrawalTransactions() {
        int sum = 0;
        for (int value: transactions) {
            if (value < 0) {
                sum++;
            }
        }
        return sum;
    }
    public double getAverageDepositValue() {
        //if (transactions.length == 0) {
          //  return 0;
        //}
        double sum = 0;
        int count = 0;
        for (int value: transactions) {
            if (value > 0) {
                sum = sum + value;
                count++;
            }
        }
        return sum/count;
    }
    public double getAverageWithdrawalValue() {
        if (transactions.length == 0) {
            return 0;
        }
        double sum = 0;
        int count = 0;
        for (int value: transactions) {
            if (value < 0) {
                sum = sum + value;
                count++;
            }
        }
        return sum/count;
    }


}
