package com.gestion_venta.gestio_venta.model.service;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gestion_venta.gestio_venta.model.entity.Customer;
import com.gestion_venta.gestio_venta.model.repository.ICustomerDao;

import java.util.List;
@Service
public class CustomerServiceImpl implements ICustomerService{

    private final ICustomerDao customerDao;
    // private  ICustomerDao customerDao;

    public CustomerServiceImpl (ICustomerDao customerDao){
        this.customerDao = customerDao;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Customer> listCustomers() {
        return customerDao.findAll();
    }

    @Override
    @Transactional
    public void saveCustomer(Customer customer) {
        customerDao.save(customer);
    }
}
