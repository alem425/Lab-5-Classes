package com.asl.model;


class Transaction {
  private long id;
  private long transactionDate;
  private double amount;

  public Transaction(long id, long transactionDate, double amount) {
      this.id = id;
      this.transactionDate = transactionDate;
      this.amount = amount;
  }

  // Getters and setters
  public long getId() {
      return id;
  }

  public void setId(long id) {
      this.id = id;
  }

  public long getTransactionDate() {
      return transactionDate;
  }

  public void setTransactionDate(long transactionDate) {
      this.transactionDate = transactionDate;
  }

  public double getAmount() {
      return amount;
  }

  public void setAmount(double amount) {
      this.amount = amount;
  }
}