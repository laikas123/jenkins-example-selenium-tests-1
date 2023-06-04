package com.planetpope.seleniumtests.chrome;

import com.planetpope.seleniumtests.abstracts.AbstractJenkinsHomepage;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JenkinsHomepageTest extends AbstractJenkinsHomepage {
  @BeforeAll
  static void setupClass() {
    WebDriverManager.chromedriver().setup();
  }

  @BeforeEach
  void setupTest() {
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--headless");
    options.addArguments("--remote-allow-origins=*");
    driver = new ChromeDriver(options);
  }
}
