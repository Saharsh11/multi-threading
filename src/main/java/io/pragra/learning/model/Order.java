package io.pragra.learning.model;

public class Order {
    private int order_id;
    private String order_name;
    private double amount;
    private int cust_id;

    public Order( int order_id,String order_name, double amount, int cust_id) {
        this.order_id = order_id;
        this.order_name = order_name;
        this.amount = amount;
        this.cust_id = cust_id;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public String getOrder_name() {
        return order_name;
    }

    public void setOrder_name(String order_name) {
        this.order_name = order_name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getCust_id() {
        return cust_id;
    }

    public void setCust_id(int cust_id) {
        this.cust_id = cust_id;
    }

    @Override
    public String toString() {
        return "Order{" +
                "order_id=" + order_id +
                ", order_name='" + order_name + '\'' +
                ", amount=" + amount +
                ", cust_id=" + cust_id +
                '}';
    }


}
