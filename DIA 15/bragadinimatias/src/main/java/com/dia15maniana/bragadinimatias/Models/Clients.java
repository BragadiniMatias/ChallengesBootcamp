package com.dia15maniana.bragadinimatias.Models;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table (name = "Clients", uniqueConstraints = {@UniqueConstraint(columnNames = "phone")})

public class Clients {

    @Id
    @NotBlank
    @Size(max = 50)
    @Email
    @Column(name = "dni")
    private String dni;

    @NotBlank
    @Size(max = 30)
    @Column(name = "name")
    private String name;

    @NotBlank
    @Size(max = 20)
    @Column(name = "lastName")
    private String lastname;

    @NotBlank
    @Size(max = 20)
    @Column(name = "phone")
    private String phone;


    public Clients() {
    }

    public Clients(String dni, String name, String lastname, String phone) {
        super();
        this.dni = dni;
        this.name = name;
        this.lastname = lastname;
        this.phone = phone;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
