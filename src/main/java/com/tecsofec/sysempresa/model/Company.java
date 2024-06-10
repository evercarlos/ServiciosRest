package com.tecsofec.sysempresa.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "empresa")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer id;
    private String ruc;
    @Column(name = "nombre")
    private String name;
    @Column(name = "tipo")
    private String type;
    private boolean state = Boolean.TRUE;
}
