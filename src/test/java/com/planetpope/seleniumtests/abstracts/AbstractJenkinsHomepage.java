package com.planetpope.seleniumtests.abstracts;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class AbstractJenkinsHomepage {
  public WebDriver driver;
  
  @AfterEach
  void teardown() {
    if (driver != null) {
        driver.quit();
    }
  }

  @Test
  void test() {
    System.setProperty("webdriver.http.factory", "jdk-http-client");
    driver.get("https://www.screenpal.com/");
    Assertions.assertEquals("Jenkins", driver.getTitle());
  }
}
