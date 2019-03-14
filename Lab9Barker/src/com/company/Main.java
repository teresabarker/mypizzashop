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

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        final char EXIT_CODE = 'E';
        final char CUST_CODE = 'C';
        final char MENU_CODE = 'M';
        final char ORDE_CODE = 'O';
        final char TRAN_CODE = 'T';
        final char HELP_CODE = '?';
        char userAction;
        final String PROMPT_ACTION = "Add 'C'ustomer, List 'M'enu, Add 'O'rder, List 'T'ransaction or 'E'xit: ";
        ArrayList<Customer> cList = new ArrayList<>();
        ArrayList<Menu> mList = new ArrayList<>();
        ArrayList<Order> oList = new ArrayList<>();
        ArrayList<Transaction> tList = new ArrayList<>();

        Customer cust1 = new Customer(1, "Alex");
        Order order1 = new Order(1);
        Transaction trans1 = new Transaction(1);

        Menu menu1 = new Menu(1, "Fruit Smoothie", 3.99);
        Menu menu2 = new Menu(2, "Breakfast Sandwich", 4.99);
        Menu menu3 = new Menu(3, "Oatmeal", 3.49);
        Menu menu4 = new Menu(4, "Cereal & Milk", 2.99);
        Menu menu5 = new Menu(5, "Pancakes", 5.49);
        Menu menu6 = new Menu(6, "French Toast", 6.49);
        Menu menu7 = new Menu(7, "Coffee", 1.49);

        mList.add(menu1);
        mList.add(menu2);
        mList.add(menu3);
        mList.add(menu4);
        mList.add(menu5);
        mList.add(menu6);
        mList.add(menu7);

        //cList.add();
        oList.add(order1);
        tList.add(trans1);

        userAction = getAction(PROMPT_ACTION);

        while (userAction != EXIT_CODE) {
            switch(userAction) {
                case CUST_CODE : //addCustomer();
                    break;
                case MENU_CODE : Menu.listMenu(mList);
                    break;
                case ORDE_CODE : //addOrders();
                    break;
                case TRAN_CODE : //listTransactions();
                    break;
            }

            userAction = getAction(PROMPT_ACTION);
        }
    }
    public static char getAction(String prompt) {
        Scanner scnr = new Scanner(System.in);
        String answer = "";
        System.out.println(prompt);
        answer = scnr.nextLine().toUpperCase() + " ";
        char firstChar = answer.charAt(0);
        return firstChar;
    }
}

