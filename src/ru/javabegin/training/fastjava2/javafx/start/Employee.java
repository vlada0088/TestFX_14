package ru.javabegin.training.fastjava2.javafx.start;

/**
 * Created by User on 29.04.2015.
 */
public class Employee {
    private int id;
    private String full_name;
    private String phone_num;

    public Employee(){}
    public Employee(int id, String full_name, String phone_num) {
        this.id = id;
        this.full_name = full_name;
        this.phone_num = phone_num;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getPhone_num() {
        return phone_num;
    }

    public void setPhone_num(String phone_num) {
        this.phone_num = phone_num;
    }
}
