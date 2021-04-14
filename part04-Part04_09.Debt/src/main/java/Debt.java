/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bryan
 */
public class Debt {
    private double balance;
    private double interestRate;
    
    public Debt(double iBalance, double iRate){
        this.balance = iBalance;
        this.interestRate = iRate;
    }
    
    public void printBalance(){
        System.out.println(balance);
    }
    
    public void waitOneYear(){
        balance *= interestRate;    
    }
}
