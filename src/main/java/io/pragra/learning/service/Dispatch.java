package io.pragra.learning.service;

import io.pragra.learning.model.Customer;
import io.pragra.learning.model.Order;

public class Dispatch {

    private int order_id;
    private String cust_name;
    private String cust_address;

    public Dispatch(Order order, Customer customer) {
        this.order_id = order.getOrder_id();
        this.cust_name = customer.getCust_name();
        this.cust_address = customer.getCust_address();
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
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

    @Override
    public String toString() {
        return "Dispatch{" +
                "order_id=" + order_id +
                ", cust_name='" + cust_name + '\'' +
                ", cust_address='" + cust_address + '\'' +
                '}';
    }
}
