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

public class Order {
    //Class Level Variables - Protect the data
    private int orderId;

    //Constructor Method
    public Order(int _orderId){
        this.orderId = _orderId;
    }

    //Setters and Getters
    public int getorderId() { return orderId; }
    public void setorderId(int _orderId) {this.orderId = _orderId;}

}
