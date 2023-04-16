package com.gestion_venta.gestio_venta.model.entity;

import java.io.Serializable;

import jakarta.persistence.*;

@Data
@Entity
@Table(
        name = "customers",
        indexes = {@Index(name = "index_name", columnList = "name"),
                @Index(name = "index_fullname", columnList = "name, lastname")}
)
public class Customer implements Serializable {
    
}
