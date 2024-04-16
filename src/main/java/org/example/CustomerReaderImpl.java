package org.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CustomerReaderImpl implements CustomerReader{

  // if we switch from file to db, we need to update IOException to SQLException everywhere
  // so better to use custom DataException from the beginning
  @Override
  public Customer readCustomer() throws DataException {
    String[] customerData;
    try {
      BufferedReader reader = new BufferedReader(new FileReader("customer.txt"));
      customerData = reader.readLine().split(" ");
    } catch (IOException e) {
      throw new DataException(e);
    }
    Customer customer = new Customer(Long.getLong(customerData[0]), customerData[1], customerData[2]);
    return customer;
  }
}
