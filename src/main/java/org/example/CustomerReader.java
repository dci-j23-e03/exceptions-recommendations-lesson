package org.example;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface CustomerReader {
  Customer readCustomer() throws DataException;
}
