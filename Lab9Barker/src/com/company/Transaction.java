/*
Project: Lab 9
Purpose Details: Pizza ordering application
Course: IST 242
Author: Teresa Barker
Date Developed: 3/14/19
Last Date Changed: 3/14/19
Rev: 1
 */
package com.company;

public class Transaction {

    //Class Level Variables - Protect the data
    private int transactionId;

    //Constructor Method
    public Transaction(int _transactionId){
        this.transactionId = _transactionId;
    }

    //Setters and Getters
    public int getTransactionId() { return transactionId; }
    public void setTransactionId(int _transactionId) {this.transactionId = _transactionId;}

}
