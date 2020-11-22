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
public class Employee extends Person {

    Double base_salary;
    Double tax = 0.1;
    Double sales;

    Employee() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    // Double bonus = 0.02;

    public void Employee() {

    }

    public Employee(String name, int age, int social_sec_num, double base_salary, double sales) {
        super(name, age, social_sec_num);
        this.base_salary = base_salary;
        this.sales = sales;
    }

    public String toString() {
        return super.toString() + "\nsalary: " + base_salary + "\nSales: " + sales;
    }

    @Override
    public Double calc_tax() {
        base_salary = base_salary - (base_salary * tax);
        return base_salary;
    }

    @Override
    public Double raise() {
        base_salary = base_salary + 100;
        return base_salary;
    }
}

/* salary= salary*0.1
 return salary;
 */
