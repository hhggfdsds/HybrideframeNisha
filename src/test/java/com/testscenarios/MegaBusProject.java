package com.testscenarios;

import org.testng.annotations.Test;

import com.objectrepository.Locators;
import com.utilities.ReUsableMethod;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;

public class MegaBusProject extends ReUsableMethod{
	
  @Test
  public void f() throws Exception {
	  OpenEdgeBrower();
	  getURL("megabusURL");
	  Thread.sleep(2000);
	  clickByAnyLocator(loc.megabus_Signupbutton);
	  Thread.sleep(2000);
	  sendKeyByAnyLocator(loc.megabus_Emaileditbox, "Email");
	  Thread.sleep(2000);
	  sendKeyByAnyLocator(loc.megabus_confirmEmaileditbox, "Confirm Email");
	  Thread.sleep(2000);
	  sendKeyByAnyLocator(loc.megabus_choosePasswordeditbox, "Choose a password");
	  Thread.sleep(2000);
	  sendKeyByAnyLocator(loc.megabus_confirmPasswordeditbox, "Confirm password");
	  Thread.sleep(2000);
	  clickByAnyLocator(loc.megabus_termandConditionbutton);
	  Thread.sleep(2000);
	  
  }
}
