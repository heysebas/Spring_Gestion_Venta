package com.gestion_venta.gestio_venta.model.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.gestion_venta.gestio_venta.model.entity.Customer;

public interface ICustomerDao extends JpaRepository<Customer, Long> {
@Query("select c from Customer c left join fetch c.invoices f where c.name = ?1")
public Customer findByName(String name);
}
