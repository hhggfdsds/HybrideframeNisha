package com.testscenarios;

import org.testng.annotations.Test;

import com.utilities.ReUsableMethod;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;

public class FbLoginHBP extends ReUsableMethod {
	
	//WebDriver driver;
  @Test
  public void f() throws Exception {
	  //find all the locators of fb page
	 // driver.findElement(By.name("email")).sendKeys("nisha@gmail.com");
	  sendKeyByAnyLocator(loc.FBloginpage_Emaileditbox,"email");
	  Thread.sleep(2000);
	 // driver.findElement(By.name("pass")).sendKeys("nisha@123");
	  sendKeyByAnyLocator(loc.FBloginpage_Passwordeditbox, "password");
	  Thread.sleep(2000);
	 // driver.findElement(By.name("login")).click();
	  clickByAnyLocator(loc.FBloginpage_loginbutton);
	  Thread.sleep(2000);
	  takeScreenshot("FBloginpage");
	  driver.quit();
	  
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() throws Exception {
	  //brower open with url
	  OpenEdgeBrower();
	  getURL("fbUrl");
	 // driver = new EdgeDriver();
	  //driver.manage().window().maximize();
	  //driver.get("https://www.facebook.);
  }

}
