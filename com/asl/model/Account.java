package com.asl.model;
import java.util.ArrayList;

class Account {
  private long id;
  private long createDate;
  private Customer owner;
  private ArrayList<Transaction> transactions;
  private double balance;

  public Account(long id, long createDate, Customer owner, ArrayList<Transaction> transactions, double balance) {
      this.id = id;
      this.createDate = createDate;
      this.owner = owner;
      this.transactions = transactions;
      this.balance = balance;
  }

  // Getters and setters
  public long getId() {
      return id;
  }

  public void setId(long id) {
      this.id = id;
  }

  public long getCreateDate() {
      return createDate;
  }

  public void setCreateDate(long createDate) {
      this.createDate = createDate;
  }

  public Customer getOwner() {
      return owner;
  }

  public void setOwner(Customer owner) {
      this.owner = owner;
  }

  public ArrayList<Transaction> getTransactions() {
      return transactions;
  }

  public void setTransactions(ArrayList<Transaction> transactions) {
      this.transactions = transactions;
  }

  public double getBalance() {
      return balance;
  }

  public void setBalance(double balance) {
      this.balance = balance;
  }
}