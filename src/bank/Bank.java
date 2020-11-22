/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author eslam
 */
public class Bank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        final NewJFrame gui = new NewJFrame();
        
        // TODO code application logic here
        Employee emp1 = new Employee("Ahmed-emp", 20, 123123, 1000, 150);
        emp1.raise();
        emp1.calc_tax();
        System.out.println(emp1.toString());
        System.out.println("-------");

        Intern inter = new Intern("mahmoud-int", 22, 2463512, 1200, 150, 0);
        inter.calc_tax();
        inter.calc_intern_salary();
        System.out.println(inter.toString());
        System.out.println("-------");

        Manager man = new Manager("mohamed-man", 30, 321231, 2000, 500);
        man.calc_tax();
        man.calc_man_salary();
        System.out.println(man.toString());
        System.out.println("-------");

//        Customer client = new Customer("ibrahim-client", 24, 424723, 5000);
//        System.out.println(client.toString());
//        System.out.println("-------");InputMismatchException
        Scanner scn = new Scanner(System.in);
        System.out.print("\nenter name: ");
        String name= scn.next();
//        String name;
//        try{
//            name = scn.next();
//        }
//        catch(InputMismatchException e){
//            System.out.print("Please enter name in characters again");
//            name = scn.next();
//        }

        System.out.print("\nenter age: ");
        int age;
                 try{ 
                     age=scn.nextInt();
                 }
                 catch(Exception e){
                         System.out.println("Please enter age in numbers again");
                         age=scn.nextInt();
                 }
                 
        

        System.out.print("\nenter SS#: ");
        int ss = scn.nextInt();

        System.out.print("\nenter balance: ");
        int balance = scn.nextInt();

        Customer client = new Customer(name, age, ss, balance);
        System.out.println("-------");
        System.out.println(client.toString());
        System.out.println("-------");
        System.out.println("|| d:deposit, w:withdraw, e:exit ||");
        int exit = 0;
        while (exit != 1) {
            
            String ans = scn.next();
            String.valueOf(ans);
            switch (ans) {
                case "d":
                case "D":
                    double moneyD = scn.nextDouble();
                    client.deposit(moneyD);
                    System.out.println(client.get_balance());break;
                case "w":
                case "W":
                    double moneyW = scn.nextDouble();
                    client.withdraw(moneyW);
                    System.out.println(client.get_balance());break;
                case "e":
                case "E":
                    System.out.println("-------");
                    System.out.println(client.toString());
                    System.out.println("-------");
                    exit = 1;
                    break;
                default:
                    System.out.println("|| enter valid character ||");
                    exit = 0;
            }
        }
    }

}
