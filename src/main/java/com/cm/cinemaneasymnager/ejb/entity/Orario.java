package com.cm.cinemaneasymnager.ejb.entity;

import javax.persistence.*;

@Entity
public class Orario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column
    private Integer id_giorni;

    @Column
    private String orario;

    public Orario(Integer id_giorni, String orario) {
        this.id_giorni = id_giorni;
        this.orario = orario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
