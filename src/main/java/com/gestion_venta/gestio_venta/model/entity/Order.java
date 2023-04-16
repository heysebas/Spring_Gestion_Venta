package com.gestion_venta.gestio_venta.model.entity;

import java.io.Serial;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.*;

@Entity
@Table(name = "order", indexes = { @Index(name = "index_description", columnList = "description") })
public class Order {
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

    @PrePersist
    public void PrePersist(){
        createdAt = new Date();
    }

    @Serial
    private static final long serialVersionUID = 4545L;
}