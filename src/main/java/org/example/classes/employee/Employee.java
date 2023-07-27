package org.example.classes.employee;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int pesel;
    private String email;
    private int phoneNumer;
    private EmployeePosition position;

    public Employee(int id, String firstName, String lastName,
                    int pesel, String email,
                    int phoneNumer, EmployeePosition position) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
        this.email = email;
        this.phoneNumer = phoneNumer;
        this.position = position;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPesel() {
        return pesel;
    }

    public void setPesel(int pesel) {
        this.pesel = pesel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumer() {
        return phoneNumer;
    }

    public void setPhoneNumer(int phoneNumer) {
        this.phoneNumer = phoneNumer;
    }

    public EmployeePosition getPosition() {
        return position;
    }

    public void setPosition(EmployeePosition position) {
        this.position = position;
    }
}
