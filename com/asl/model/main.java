//Alexander Morgan
//Lab 5
// 3/19/2023
package com.asl.model;
import java.util.ArrayList;

public class main {
   public static void main(String[] args) {
       // Create an example Address
       Address address = new Address("4382 Fire St", "Apt 4B", "Baltimore", "MD", "10001");

       // Create an example Transaction
       Transaction transaction = new Transaction(1, System.currentTimeMillis(), 234342.0);

       // Create an example Account with one Transaction
       ArrayList<Transaction> transactions = new ArrayList<>();
       transactions.add(transaction);
       Account account = new Account(1, System.currentTimeMillis(), null, transactions, 2000.0);

       // Create an example Customer with one Account
       ArrayList<Account> accounts = new ArrayList<>();
       accounts.add(account);
       Customer customer = new Customer("Alexander", "Morgan", "000-111-2222", "name@example.com", System.currentTimeMillis(), 910315, 1, address, accounts);

       // Create an example User
       User user = new User("Xander", "Morg", "555-555-5678", "janedoe@example.com", System.currentTimeMillis(), "amorg", "password", 1);

       // Output the example data
       System.out.println("User: " + user.getFirstName() + " " + user.getLastName() + " (" + user.getUsername() + ")");
       System.out.println("Customer: " + customer.getFirstName() + " " + customer.getLastName() + " (ID: " + customer.getId() + ")");
       System.out.println("Account balance: $" + account.getBalance());
       System.out.println("Transaction amount: $" + transaction.getAmount());
       System.out.println("Address: " + address.getAddressLine1() + ", " + address.getAddressLine2() + ", " + address.getCity() + ", " + address.getState() + " " + address.getZipCode());
   }
}