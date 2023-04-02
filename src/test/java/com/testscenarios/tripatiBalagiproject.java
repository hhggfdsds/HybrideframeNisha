package com.testscenarios;

import org.testng.annotations.Test;

import com.utilities.ReUsableMethod;

public class tripatiBalagiproject extends ReUsableMethod {
  @Test
  public void f() throws Exception   {
	  OpenEdgeBrower();
	  getURL("tirupatibalaji_Url");
	  Thread.sleep(2000);
	  
	  clickByAnyLocator(loc.tirupatibalaji_DateofBiirthbutton);
	  Thread.sleep(2000);
	  selectByVisibleText(loc.tirupatibalaji_yeardropdown, "2012");
	  Thread.sleep(2000);
	  selectByVisibleText(loc.tirupatibalaji_Monthdropdown, "March"); 
	  Thread.sleep(2000);
	  clickByAnyLocator(loc.tirupatibalaji_DateofbirthselectkBox);
	  
	  takeScreenshot("tripatiBalagiproject");
  }
  }

