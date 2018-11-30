package com.cm.cinemaneasymnager.ejb.entity;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "configuration")

public class Configuration {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column
    private String name;
    @Column
    private String type;
    @Column
    private String key;
    @Column
    private String value;
    @Column
    private Integer description;


    public Configuration(String name, String type, String key, String value, Integer description) {
        this.name = name;
        this.type = type;
        this.key = key;
        this.value = value;
        this.description = description;
    }

    public Configuration() {
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Integer getDescription() {
        return description;
    }

    public void setDescription(Integer description) {
        this.description = description;
    }
}