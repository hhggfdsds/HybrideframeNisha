package com.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.objectrepository.Locators;

public class ReUsableMethod {
	public WebDriver driver;
	public FileInputStream fi;
	public Locators loc = new Locators();
	public Properties p = new Properties();
	public String propertyFilePath = ".\\src\\test\\resources\\testdata\\QA.properties";
	
	//open edge brower
	public void OpenEdgeBrower() {
		driver = new EdgeDriver();
		driver.manage().window().maximize();}
		
		public void getURL(String URL) throws IOException {
			fi = new FileInputStream(propertyFilePath);
			p.load(fi);
			driver.get(p.getProperty(URL));
		}
			/** SendKeys using any locator 
			 * @throws Exception ***/
			public void sendKeyByAnyLocator(By locatorName, String inputDataVariable) throws Exception {
				fi = new FileInputStream(propertyFilePath);
				p.load(fi);
			
				WebElement ele = driver.findElement(locatorName);
				if (driver.findElements(locatorName).size() > 0) {
					if (ele.isEnabled()) {
						ele.clear();
						//highlightElement(ele);
						ele.sendKeys(p.getProperty(inputDataVariable));
					} else {
						System.out.println("The given locator is not enabled, please check");
					}
				} else {
					System.out.println("The given locator is not displayed on screen, please check the locator");
				}
	}
		// Click on any Button/Image/HyperLink/Checkbox/Radiobutton
		public void clickByAnyLocator(By locatorName) throws Exception {
			WebElement ele = driver.findElement(locatorName);
			if (driver.findElements(locatorName).size() > 0) {
				if (ele.isEnabled()) {
					//highlightElement(ele);
					ele.click();
				} else {
					System.out.println("The given locator is not enabled, please check");
				}
			} else {
				System.out.println("The given locator is not displayed on screen, please check the locator");
			}
		}
		
		/****************** Dropdown selection 
		 * @throws IOException **************************************/

		public void selectByVisibleText(By locater, String visibleText) throws IOException {
//			fi = new FileInputStream(propertyFilePath);
//			p.load(fi);
			
			WebElement element = driver.findElement(locater);
			if (driver.findElements(locater).size() > 0) {
				if (element.isEnabled()) {
					Select dropdown = new Select(element);
					dropdown.selectByVisibleText(visibleText);
				} else {
					System.out.println("The webelement is NOT Enabled, please check**************");
				}
			} else {
				System.out.println("The webelement is NOT displayed, please check**************");
			}

		}
		
		public void selectByIndex(By locater, int index) {
			WebElement element = driver.findElement(locater);
			if (driver.findElements(locater).size() > 0) {
				if (element.isEnabled()) {
					Select dropdown = new Select(element);
					dropdown.selectByIndex(index);
				} else {
					System.out.println("The webelement is NOT Enabled, please check**************");
				}
			} else {
				System.out.println("The webelement is NOT displayed, please check**************");
			}

		}
		public void selectByValue(By locater, String value) {
			WebElement element = driver.findElement(locater);
			if (driver.findElements(locater).size() > 0) {
				// isEnabled()
				if (element.isEnabled()) {
					Select dropdown = new Select(element);
					dropdown.selectByValue(value);
				} else {
					System.out.println("The webelement is NOT Enabled, please check**************");
				}
			} else {
				System.out.println("The webelement is NOT displayed, please check**************");
			}

		}
		
		public void printAllDropdownValues(By locater) {
			WebElement element = driver.findElement(locater);

			if (driver.findElements(locater).size() > 0) {
				// isEnabled()
				if (element.isEnabled()) {
					Select dropdown = new Select(element);
					List<WebElement> dropdownValues = dropdown.getOptions();
					// Print the size of dropdown values
					System.out.println(dropdownValues.size());
					// Print the dropdown values
					for (int i = 0; i < dropdownValues.size(); i++) {
						System.out.println(dropdownValues.get(i).getText());
					}
				} else {
					System.out.println("The webelement is NOT Enabled, please check**************");
				}
			} else {
				System.out.println("The webelement is NOT displayed, please check**************");
			}

		}

		public void selectCustomiseOptionFromTheDropdownValues(By locater, String visibleText) {
			WebElement element = driver.findElement(locater);
			if (driver.findElements(locater).size() > 0) {
				// isEnabled()
				if (element.isEnabled()) {

					Select dropdown = new Select(element);
					List<WebElement> dropdownValues = dropdown.getOptions();
					// Print the size of dropdown values
					System.out.println(dropdownValues.size());
					// Print the dropdown values
					for (int i = 0; i < dropdownValues.size(); i++) {
						System.out.println(dropdownValues.get(i).getText());

						// Select Aug option from the dropdown
						if (dropdownValues.get(i).getText().equals(visibleText)) {
							dropdown.selectByIndex(i);
							break;
						}
					}

				} else {
					System.out.println("The webelement is NOT Enabled, please check**************");
				}
			} else {
				System.out.println("The webelement is NOT displayed, please check**************");
			}

		}
		
		/************ waits inselenium ***********************/

		public void implicitWait(int waitTime) {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(waitTime));
			System.out.println("Implicit wait method used***");
		}

		public void waitForElementToBevisibilityOf(By locator, int waitTime) {
			WebElement element = driver.findElement(locator);
			try {
				new WebDriverWait(driver, Duration.ofSeconds(waitTime)).ignoring(StaleElementReferenceException.class)
						.until(ExpectedConditions.visibilityOf(element));
				System.out.println("element To Be visibilityOf***");
			} catch (Exception Ex) {
				System.out.println(Ex);
				System.out.println("element To Be not visibilityOf***");
			}
		}

		public void waitForElementToBeClickable(By locator, int waitTime) {
			WebElement element = driver.findElement(locator);
			try {
				new WebDriverWait(driver, Duration.ofSeconds(waitTime)).ignoring(StaleElementReferenceException.class)
						.until(ExpectedConditions.elementToBeClickable(element));
				System.out.println("element To Be lickable***");
			} catch (Exception Ex) {
				System.out.println(Ex);
				System.out.println("element To Be not Clickable***");
			}
		}

		public void waitForElementToBeClickable(int waitTime) {
			try {
				new WebDriverWait(driver, Duration.ofSeconds(waitTime)).ignoring(StaleElementReferenceException.class)
						.until(ExpectedConditions.alertIsPresent());
				System.out.println("alert Is Present***");
			} catch (Exception Ex) {
				System.out.println(Ex);
				System.out.println("alert Is not Present****");
			}
		}

		/***
		 * instead of fluent wait use customized While loop statement**@throws Exception
		 *****/

		public void waitforElement(By locater) throws Exception {
			int i = 0;
			while (driver.findElements(locater).size() < 1) {
				Thread.sleep(500);
				System.out.println("Wait for the element***************");
				// Suppose system has not present the element it will repeat 30 time
				// then stop
				// the execution using break
				if (i > 30) {
					System.out.println("Element is not present");
					break;
				}
				i++;
			}
		}
		

		/*********** timestamp **********/
		public String timestamp() {
			Date d = new Date();
			DateFormat df = new SimpleDateFormat("ddMMMyyy_HHmmss");
			String timeTamp = df.format(d);
			return timeTamp;
		}
		
		/*****
		 * takescreenshot
		 * 
		 * @throws Exception
		 ************/
		public void takeScreenshot(String name) throws Exception {
			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			String screenshotPath = ".\\Screenshots\\";
			FileHandler.copy(scrFile, new File(screenshotPath + name + timestamp() + ".PNG"));
			System.out.println("Screenshot taken*** ");
		}

		

}







