package com.gestion_venta.gestio_venta.model.service;



import java.util.List;

import com.gestion_venta.gestio_venta.model.entity.Customer;

public interface ICustomerService {
public List<Customer> listCustomers();
public void saveCustomer(Customer customer);
}