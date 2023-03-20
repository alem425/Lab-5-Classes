package com.asl.model;
import java.util.ArrayList;

class Customer {
  private String firstName;
  private String lastName;
  private String phoneNumber;
  private String email;
  private long createDate;
  private int dateOfBirth;
  private long id;
  private Address address;
  private ArrayList<Account> accounts;

  public Customer(String firstName, String lastName, String phoneNumber, String email, long createDate,
                  int dateOfBirth, long id, Address address, ArrayList<Account> accounts) {
      this.firstName = firstName;
      this.lastName = lastName;
      this.phoneNumber = phoneNumber;
      this.email = email;
      this.createDate = createDate;
      this.dateOfBirth = dateOfBirth;
      this.id = id;
      this.address = address;
      this.accounts = accounts;
  }

  // Getters and setters
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

  public String getPhoneNumber() {
      return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
      this.phoneNumber = phoneNumber;
  }

  public String getEmail() {
      return email;
  }

  public void setEmail(String email) {
      this.email = email;
  }

  public long getCreateDate() {
      return createDate;
  }

  public void setCreateDate(long createDate) {
      this.createDate = createDate;
  }

  public int getDateOfBirth() {
      return dateOfBirth;
  }

  public void setDateOfBirth(int dateOfBirth) {
      this.dateOfBirth = dateOfBirth;
  }

  public long getId() {
      return id;
  }

  public void setId(long id) {
      this.id = id;
  }

  public Address getAddress(){
    return address;
  }
  public void setAddress(Address address) {
    this.address = address;
}

public ArrayList<Account> getAccounts() {
    return accounts;
}

public void setAccounts(ArrayList<Account> accounts) {
    this.accounts = accounts;
}
}
