/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab4;

/**
 *
 * @author Billy
 */
public class Account {
    String name;
    double b;
    int n;
    boolean d;
    boolean w;
    
    public Account(String name, int number, double initialBalance){
        this.name = name;
        n = number;
        b = initialBalance;
    }
    
    String getName(){
        return name;
    }
    
    double getBalance(){
        return b;
    }
    
    int getNumber(){
        return n;
    }
    
    boolean deposit(double amount){
        if(amount < 0 || amount == 0){
            return false;
        }else{
            b = amount + b;
            return true;
        }
    }
    
    boolean withdraw(double amount){
        if(amount>b){
            return false;
        }else if(amount == 0 || amount < 0){
            return false;
        }else{
          b = b - amount;
          return true;  
        }
    }
    
    
    


//@Override
    public String toString() {//DO NOT MODIFY
        return "(" + getName() + ", " + getNumber() + ", " +
        String.format("$%.2f", getBalance()) + ")";
    }
    
    
}
        
