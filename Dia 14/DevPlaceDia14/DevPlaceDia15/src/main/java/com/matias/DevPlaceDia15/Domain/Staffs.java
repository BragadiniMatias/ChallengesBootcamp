package com.matias.DevPlaceDia15.Domain;

import javax.persistence.*;

@Entity
@Table(name = "Staffs")
public class Staffs {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name= "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "atrribute")
    private String attribute;

    @Column(name = "stats")
    private long stats;

    public Staffs(){
    }

    public Staffs(String name, String description, String attribute, long stats) {
        super();
        this.name = name;
        this.description = description;
        this.attribute = attribute;
        this.stats = stats;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public long getStats() {
        return stats;
    }

    public void setStats(long stats) {
        this.stats = stats;
    }

    public long getId() {
        return id;
    }
}
