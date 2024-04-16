package org.example;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

  public static void main(String[] args) {
    try {
      throwsException();
    } catch (IOException e) { // catch specific exception, not Exception or Throwable
      // this is swallowing, you catch the exception but not handling it in any way
      // you should have some logging at least, throwing some other exception
    }
  }

  /**
   * Example method which is demonstrating throwing an exception.
   * Also that exception should be part of javadoc.
   *
   * @throws IOException
   */
  public static void throwsException() throws IOException { // use specific exception in specify
    throw new IOException("Exception from throwsException method");
  }

  public static void someOtherMethod() {
    System.out.println("someOtherMethod");
  }

  public static void shouldNotUseExceptionsToControlProgram() {
    // should not use try-catch instead of if-else
    try {
      throwsException();
    } catch (IOException e) {
      someOtherMethod(); // calling some method not related to exception handling should not be done
    }
  }
}