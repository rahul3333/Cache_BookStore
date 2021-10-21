package com.devd.spring.bookstorecatalogservice;

import java.io.*;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.remote.*;

public class BookstoreCatalogServiceApplicationTests {

  private static ChromeDriverService service;
  private WebDriver driver;

  @Test
  public void testGoogleSearch() {
    driver.navigate().to("http://www.google.com");
    System.out.println("Title : "+driver.getTitle());
    driver.navigate().back();
    // rest of the test...
  }
}
