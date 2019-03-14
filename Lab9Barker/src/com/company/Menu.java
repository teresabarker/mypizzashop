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

public class Menu {

    //Class Level Variables - Protect the data
    private int menuId;
    private String menuItem;
    private double menuPrice;

    //Constructor Method
    public Menu(int _menuId, String _menuItem, double _menuPrice){
        this.menuId = _menuId;
        this.menuItem = _menuItem;
        this.menuPrice = _menuPrice;
    }

    //Setters and Getters
    public int getmenuId() { return menuId; }
    public void setmenuId(int _menuId) {this.menuId = _menuId;}

    public String getmenuItem() { return menuItem; }
    public void setmenuItem(String _menuItem) {this.menuItem = _menuItem;}

    public double getmenuPrice() { return menuPrice; }
    public void setmenuPrice(double _menuPrice) {this.menuPrice = _menuPrice;}

    public static void listMenu(ArrayList<Menu> mList){
        System.out.println("Welcome to Teresa's Breakfast Corner! Here's our menu:\n");
        for (Menu menu: mList){
            System.out.println(menu.getmenuItem() + ", $" + menu.getmenuPrice());
        }
    }
}
