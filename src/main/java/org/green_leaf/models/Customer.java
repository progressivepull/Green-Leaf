package org.green_leaf.models;

public class Customer {
	
    private String name;
    private String email;
    private String mailingAddress;

    // Constructors
    public Customer() {}

    public Customer(String name, String email, String mailingAddress) {
        this.name = name;
        this.email = email;
        this.mailingAddress = mailingAddress;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getMailingAddress() {
        return mailingAddress;
    }
    public void setMailingAddress(String mailingAddress) {
        this.mailingAddress = mailingAddress;
    }

}
