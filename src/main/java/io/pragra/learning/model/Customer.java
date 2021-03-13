package io.pragra.learning.model;

import java.util.Random;



public class Customer {
    private String cust_name;
    private String cust_address;
    private int cust_id;

    public Customer(int cust_id, String name, String address) {
        this.cust_name = name;
        this.cust_address = address;
        this.cust_id = cust_id;
    }

    public String getCust_name() {
        return cust_name;
    }

    public void setCust_name(String cust_name) {
        this.cust_name = cust_name;
    }

    public String getCust_address() {
        return cust_address;
    }

    public void setCust_address(String cust_address) {
        this.cust_address = cust_address;
    }

    public int getCust_id() {
        return cust_id;
    }

    public void setCust_id(int cust_id) {
        this.cust_id = cust_id;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "cust_name='" + cust_name + '\'' +
                ", cust_address='" + cust_address + '\'' +
                ", cust_id=" + cust_id +
                '}';
    }
}
