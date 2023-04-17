package com.gestion_venta.gestio_venta.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.gestion_venta.gestio_venta.model.entity.Customer;

public interface ICustomerDao extends JpaRepository<Customer, Long> {
    // @Query("select c.first_surname, c.second_surname, c.name, o from customers c " +
    // "left join fetch order2 o on c.id = o.customer_id order by c.first_surname asc, c.second_surname asc, c.name asc = ?1")
    // public Customer findByName(String name);

    
}
