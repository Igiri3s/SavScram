package org.example.classes.employee;

import lombok.*;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int pesel;
    private String email;
    private int phoneNumer;
    private EmployeePosition position;

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public int getPesel() {
        return pesel;
    }

    public void setPesel(final int pesel) {
        this.pesel = pesel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public int getPhoneNumer() {
        return phoneNumer;
    }

    public void setPhoneNumer(final int phoneNumer) {
        this.phoneNumer = phoneNumer;
    }

    public EmployeePosition getPosition() {
        return position;
    }

    public void setPosition(final EmployeePosition position) {
        this.position = position;
    }

    public Employee(final int id, final String firstName, final String lastName, final int pesel, final String email, final int phoneNumer, final EmployeePosition position) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
        this.email = email;
        this.phoneNumer = phoneNumer;
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", pesel=" + pesel +
                ", email='" + email + '\'' +
                ", phoneNumer=" + phoneNumer +
                ", position=" + position +
                '}';
    }
}