package org.example.classes.company;

public class Company {
    private int id;
    private String name;
    private int nip;
    private String owner;

    public Company(int id, String name, int nip, String owner) {
        this.id = id;
        this.name = name;
        this.nip = nip;
        this.owner = owner;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNip() {
        return nip;
    }

    public void setNip(int nip) {
        this.nip = nip;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
