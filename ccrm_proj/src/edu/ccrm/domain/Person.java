package edu.ccrm.domain;

public abstract class Person {
    protected String id;
    protected String name;
    protected String email;

    public Person(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public void setName(String name) { this.name = name; }
    public void setEmail(String email) { this.email = email; }

    // Abstraction: abstract method
    public abstract String getRole();

    // Polymorphism: override toString
    @Override
    public String toString() {
        return getRole() + ": " + name + " (ID: " + id + ", Email: " + email + ")";
    }
}
