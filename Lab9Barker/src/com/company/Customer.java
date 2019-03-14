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

public class Customer {
    //Class Level Variables - Protect the data
    private int customerId;
    private String customerFirstName;

    //Constructor Method
    public Customer(int _customerId, String _customerFirstName){
        this.customerId = _customerId;
        this.customerFirstName = _customerFirstName;
    }

    public Customer(){
    }

    //Setters and Getters
    public int getcustomerId() { return customerId; }
    public void setcustomerId(int _customerId) {
        this.customerId = _customerId;
    }

    public String getcustomerFirstName() { return customerFirstName;}
    public void setcustomerFirstName(String _customerName) {
        this.customerFirstName = _customerName;
    }
}