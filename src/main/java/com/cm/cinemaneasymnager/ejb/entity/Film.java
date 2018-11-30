package com.cm.cinemaneasymnager.ejb.entity;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "film")

public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column
    private String name;
    @Column
    private String tipologia;
    @Column
    private String attori;
    @Column
    private String regia;
    @Column
    private Integer durata;
    @Column
    private String descrizione;

    @OneToMany( cascade = CascadeType.ALL, orphanRemoval = true  )
    @JoinColumn(name = "id")
    private Set<Giorni> giorni;


    public Film(String name, String tipologia, String attori, String regia, Integer durata, String descrizione, Set<Giorni> giorni) {
        this.name = name;
        this.tipologia = tipologia;
        this.attori = attori;
        this.regia = regia;
        this.durata = durata;
        this.descrizione = descrizione;
        this.giorni = giorni;
    }

    public Film() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTipologia() {
        return tipologia;
    }

    public void setTipologia(String tipologia) {
        this.tipologia = tipologia;
    }

    public String getAttori() {
        return attori;
    }

    public void setAttori(String attori) {
        this.attori = attori;
    }

    public String getRegia() {
        return regia;
    }

    public void setRegia(String regia) {
        this.regia = regia;
    }

    public Integer getDurata() {
        return durata;
    }

    public void setDurata(Integer durata) {
        this.durata = durata;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public Set<Giorni> getGiorni() {
        return giorni;
    }

    public void setGiorni(Set<Giorni> giorni) {
        this.giorni = giorni;
    }
}
