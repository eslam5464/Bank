/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

/**
 *
 * @author eslam
 */
public class Intern extends Employee {

    double intern_salary;

    public void Intern() {

    }

    public Intern(String name, int age, int social_sec_num, double base_salary, double sales, double intern_salary) {
        super(name, age, social_sec_num, base_salary, sales);
        this.intern_salary = intern_salary;
    }

    public Double calc_intern_salary() {
        intern_salary = 0.25 * base_salary;
        return intern_salary;
    }

    @Override
    public String toString() {
        System.out.println("Name: " + name + "\nage:" + age + "\nS.sec.num: " + social_sec_num + "\nsalary: " + intern_salary);
        return "";
    }

}
