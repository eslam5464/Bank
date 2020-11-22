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
public class Manager extends Employee {
    // double comission;

    public void Manager() {

    }

    public Manager(String name, int age, int social_sec_num, double base_salary, double sales) {
        super(name, age, social_sec_num, base_salary, sales);
        //   this.comission=comission;
    }

    @Override
    public Double calc_man_salary() {
        base_salary = base_salary + (0.5 * sales);
        return base_salary;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
