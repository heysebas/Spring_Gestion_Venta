package com.gestion_venta.gestio_venta.model.entity;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name = "order")
// @Table(name = "order", indexes = { @Index(name = "index_order", columnList = "order") })
public class Order implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double amount;
    @Column(name = "create_at")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createdAt;

    @ManyToOne(fetch = FetchType.LAZY)
    private Customer customer;

    @ManyToOne(fetch = FetchType.LAZY)
    private Commercial commercial;

    @PrePersist
    public void PrePersist(){
        createdAt = new Date();
    }

    @Serial
    private static final long serialVersionUID = 45450201L;

  
}
