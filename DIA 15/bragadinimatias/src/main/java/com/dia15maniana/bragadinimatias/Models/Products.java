package com.dia15maniana.bragadinimatias.Models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Products")
public class Products {
    @Id
    @NotBlank
    @Size(max = 30)
    @Column(name = "code")
    private long code;

    @NotBlank
    @Size(max = 30)
    @Column (name = "name")
    private String name;

    @NotBlank
    @Size(max = 10)
    @Column(name = "ammount")
    private int ammount;

    @NotBlank
    @Size(max = 10)
    @Column(name = "price")
    private double price;

    public Products() {
    }

    public Products(long code, String name, int ammount, double price) {
        super();
        this.code = code;
        this.name = name;
        this.ammount = ammount;
        this.price = price;
    }

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmmount() {
        return ammount;
    }

    public void setAmmount(int ammount) {
        this.ammount = ammount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
