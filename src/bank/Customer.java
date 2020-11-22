/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

/**
 *
 * @author King Cobra
 */
public class Customer extends Person {

    double balance;
    int deposit_fee = 50;

    public Customer(String name, int age, int social_sec_num, double balance) {
        super(name, age, social_sec_num);
        this.balance = balance;
    }

    public int chk_amount(double amount) {
        if (amount >= 5000) {
            return deposit_fee = 100;
        }
        if (amount >= 10000) {
            return deposit_fee = 200;
        } else {
            return deposit_fee = 50;
        }
    }

    public double withdraw(double amount) {
        if (amount > balance ) {
            System.out.println("--------------------------------------------\n|| withdraw is bigger than the balance!!! ||"
                    + "\n--------------------------------------------");
            return balance;
        } 
        else {
            balance -= amount;
            return balance;
        }
        
    }

    public double deposit(double amount) {
        if (amount < deposit_fee && balance > 0) {
            chk_amount(balance);
            balance += amount;
            return balance;
        } else {
            chk_amount(balance);
            balance = balance + amount - deposit_fee;
            return balance;
        }
    }

    public String get_balance() {
        return "balance: " + balance;
    }

    @Override
    public String toString() {
        return super.toString() + "\nbalance: " + balance;
    }
}
