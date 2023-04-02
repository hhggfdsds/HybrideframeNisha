package com.testscenarios;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import com.objectrepository.Locators;

public class Opencarttest extends Locators {
  @Test
  public void f() throws Exception {
	  WebDriver driver;
	  driver = new EdgeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://opencart-prf.exense.ch");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  
	  
	  driver.findElement(OpenCart_Addtocartbutton).click();
	  Thread.sleep(2000);
	  driver.findElement(openCart_ShoppingCart).click();
	  Thread.sleep(2000);
	  driver.findElement(OpenCart_Checkouttbutton).click();
	  Thread.sleep(2000);
	   
  }
}