package com.konrad.squadrons.dao.entity;

import javax.persistence.*;

@Entity
@Table(name = "pilots")

public class Pilots {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "squadron")
    private String squadron;

    public Pilots() {

    }

    public Pilots(Long id, String name, String surname, String squadron) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.squadron = squadron;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getSquadron() {
        return squadron;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setSquadron(String squadron) {
        this.squadron = squadron;
    }

}
