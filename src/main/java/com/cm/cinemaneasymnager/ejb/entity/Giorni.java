package com.cm.cinemaneasymnager.ejb.entity;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "giorni")
public class Giorni {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

   @Column
    private String giorno ;

    @Column
    private Integer id_film ;


    @OneToMany( cascade = CascadeType.ALL, orphanRemoval = true  )
    @JoinColumn(name = "id_giorni")
    private Set<Orario> orari;


    public Giorni(String giorno, Integer id_film, Set<Orario> orari) {
        this.giorno = giorno;
        this.id_film = id_film;
        this.orari = orari;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGiorno() {
        return giorno;
    }

    public void setGiorno(String giorno) {
        this.giorno = giorno;
    }

    public Integer getId_film() {
        return id_film;
    }

    public void setId_film(Integer id_film) {
        this.id_film = id_film;
    }

    public Set<Orario> getOrari() {
        return orari;
    }

    public void setOrari(Set<Orario> orari) {
        this.orari = orari;
    }
}
