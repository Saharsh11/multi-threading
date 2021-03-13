package io.pragra.learning.manager;

import io.pragra.learning.model.Customer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class CustomerManager {
    Logger logger = LogManager.getLogger(CustomerManager.class);
    private List<Customer> customerList = new ArrayList<>();

    public void addCustomer(Customer customer){
        customerList.add(customer);
    }
}
