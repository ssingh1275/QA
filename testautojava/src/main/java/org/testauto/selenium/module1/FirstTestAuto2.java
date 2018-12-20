package org.testauto.selenium.module1;

import java.io.File;

import org.apache.xpath.operations.String;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.apache.commons.codec.EncoderException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestAuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// declaration and instantiation of objects/variables
		WebDriver driver;
		//File file = new File("C:\\driver4selenium\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sasingh\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		String baseUrl = "http://newtours.demoaut.com";
		String expectedTitle = "Welcome: Mercury Tours";
		String actualTitle = "";

		// launch Fire fox and direct it to the Base URL
		driver.get(baseUrl);

		// get the actual value of the title
		actualTitle = driver.getTitle();

		/*
		 * compare the actual title of the page with the expected one and print
		 * the result as "Passed" or "Failed"
		 */
		if (actualTitle.contentEquals(expectedTitle)) {
			System.out.println("Test Passed!");
		} else {
			System.out.println("Test Failed");
		}

		// close Fire fox
//		driver.close();

		// exit the program explicitly
		System.exit(0);
	}

}
