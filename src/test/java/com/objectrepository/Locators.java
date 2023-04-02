package com.objectrepository;

import org.openqa.selenium.By;

public class Locators {
	//public final by pagename_webelementname_ElementType_By.id("");
	public final  By OpenCart_Addtocartbutton = By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div[3]/button[1]/span");
	public final By openCart_ShoppingCart = By.xpath("(//button[@data-toggle='dropdown'])[2]");
	public final By OpenCart_Checkouttbutton = By.partialLinkText("Checkout");

	
//MegaBus signup  project
	public final By megabus_Signupbutton=By.xpath("//a[@data-gtm-id='account-management-sign-up']");
	public final By megabus_Emaileditbox=By.id("email");
	public final By megabus_confirmEmaileditbox=By.xpath("//*[@id=\"confirmEmail\"]");
	public final By megabus_choosePasswordeditbox=By.id("choosePassword");
	public final By megabus_confirmPasswordeditbox=By.id("confirmPassword");
	public final By megabus_termandConditionbutton=By.xpath("//*[text()=' I have read and accept the ']");
	public final By megabus_signupbutton=By.id("signup");
	
	//Tripathi bala gi website
	
	public final By tirupatibalaji_DateofBiirthbutton=By.id("regdob");
	public final By tirupatibalaji_yeardropdown=By.xpath("/html/body/div[18]/div/div[2]/div/div/select[2]");
	public final By tirupatibalaji_Monthdropdown=By.xpath("/html/body/div[18]/div/div[2]/div/div/select[1]");
	public final By tirupatibalaji_DateofbirthselectkBox=(By.xpath("/html/body/div[18]/div/div[2]/div/table/tbody/tr[3]/td[5]/a")); 
	//facebok login page
	public final By FBloginpage_Emaileditbox=By.name("email");
	public final By FBloginpage_Passwordeditbox=By.name("pass");
	public final By FBloginpage_loginbutton=By.name("login");
	
	

	
	
	
	
	

	

}
