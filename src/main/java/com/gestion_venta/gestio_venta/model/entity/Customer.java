package com.gestion_venta.gestio_venta.model.entity;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Data
@Entity
@Table(name = "customers", indexes = { @Index(name = "index_name", columnList = "name"),
                @Index(name = "index_fullname", columnList = "name, lastname") })
public class Customer implements Serializable {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        @NotEmpty
        private String name;
        @NotEmpty
        private String firstSurname;
        @NotEmpty
        private String secondSurname;
        @NotEmpty
        private String city;
        @NotEmpty
        private String category;
        @NotNull
        @Column(name = "create_at")
        @Temporal(TemporalType.DATE)
        @DateTimeFormat(pattern = "yyyy-MM-dd")
        private Date createAt;

        @OneToMany(mappedBy = "customer", fetch = FetchType.LAZY)
        private List<Order> order;

        public Customer() {
                order = new ArrayList<>();
        }

        // public void addOrder(Order order) {
        //         order.add(order);
        // }

        @Serial
        private static final long serialVersionUID = -4076903521346057017L;
}
