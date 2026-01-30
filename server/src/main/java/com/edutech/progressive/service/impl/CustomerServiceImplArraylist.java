package com.edutech.progressive.service.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.edutech.progressive.entity.Customers;
import com.edutech.progressive.service.CustomerService;

public class CustomerServiceImplArraylist implements CustomerService {
    private static final List<Customers> customersList = new ArrayList<>();



    @Override
    public int addCustomer(Customers customers) throws SQLException {
        customersList.add(customers);
        return customersList.size();
    }

    @Override
    public List<Customers> getAllCustomers() throws SQLException {
       return customersList;
    }

    @Override
    public List<Customers> getAllCustomersSortedByName() throws SQLException {
        // List<Customers> sorted = new ArrayList<>();
        // Collections.sort(sorted);
        // return sorted;
        Collections.sort(customersList);
        return customersList;
       
    }

    @Override
    public void emptyArrayList() {
        customersList.clear();
    }

}