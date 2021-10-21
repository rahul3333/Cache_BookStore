package com.devd.spring.bookstorecatalogservice;

import java.io.*;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.remote.*;

public class BookstoreCatalogServiceApplicationTests {

  private static ChromeDriverService service;
  private WebDriver driver;

  @BeforeClass
  public static void createAndStartService() throws IOException {
    service = new ChromeDriverService.Builder()
        .usingDriverExecutable(new File("C:\\Users\\I524918\\Downloads\\chromedriver.exe"))
        .usingAnyFreePort()
        .build();
    service.start();
  }

  @AfterClass
  public static void stopService() {
    service.stop();
  }

  @Before
  public void createDriver() {
    driver = new RemoteWebDriver(service.getUrl(), new ChromeOptions());
  }

  @After
  public void quitDriver() {
    driver.quit();
  }

  @Test
  public void testGoogleSearch() {
    driver.navigate().to("http://www.google.com");
    System.out.println("Title : "+driver.getTitle());
    driver.navigate().back();
    // rest of the test...
  }
}
