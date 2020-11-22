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
public class Person {

    String name;
    int age;
    int social_sec_num;

    public Person() {

    }

    public Person(String name, int age, int social_sec_num) {
        this.name = name;
        this.age = age;
        this.social_sec_num = social_sec_num;
    }

    public String toString() {
        return "Name: " + name + "\nage:" + age + "\nS.sec.num: " + social_sec_num;
    }

    public Double calc_tax() {
        return 0.0;

    }

    public Double raise() {
        return 0.0;
    }

    public Double calc_man_salary() {
        return 0.0;
    }
}
