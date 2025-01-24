package sause;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class sause1 {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chromee.driver", "C:\\Users\\sai\\Downloads\\chromedriver-win64");
		//WebDriver d = new ChromeDriver(); 
		WebDriver d = new ChromeDriver();
		d.get("https://www.saucedemo.com/"); // Launch browser
		
		d.manage().window().maximize(); //maximize
		
		Thread.sleep(5000);	//delay
		
	//	d.manage().window().minimize(); //minimize
		
	//	Thread.sleep(5000);	//delay
		
	//	d.manage().window().maximize(); //maximize
		
	//	Thread.sleep(5000);	//delay
		
		WebElement loginbutton = d.findElement(By.xpath("//input[@type='submit']"));
		loginbutton.click(); //loginbutton
		
		Thread.sleep(5000);	//delay
		
		WebElement errorbutton = d.findElement(By.xpath("//button[@class='error-button']"));
		errorbutton.click(); //errorbutton
		
		Thread.sleep(5000);	//delay
		
		WebElement username= d.findElement(By.xpath("//input[@placeholder=\"Username\"]"));
		username.sendKeys("standard_user");
		loginbutton.click(); //username
		
		Thread.sleep(5000);	//delay
		
		WebElement errorbutton1 = d.findElement(By.xpath("//button[@class='error-button']"));
		errorbutton1.click(); //errorbutton1
		
		Thread.sleep(5000);	//delay
		
		//username.clear();  //clear user
		
		//username.sendKeys(Keys.BACK_SPACE);
		
		//Thread.sleep(5000);	//delay
		
		WebElement pwd =d.findElement(By.xpath("//input[@id=\"password\"]"));
		pwd.sendKeys("secret_sauce");
		
		username.clear();  //clear user
		Thread.sleep(5000);	//delay
		username.sendKeys("   ");
		loginbutton.click();  //pwd
		
		Thread.sleep(5000);	//delay

		WebElement errorbutton2 = d.findElement(By.xpath("//button[@class='error-button']"));
		errorbutton2.click(); //errorbutton2
		
		Thread.sleep(5000);	//delay
		
		username.clear();
		username.sendKeys("locked_out_user");  //locked_out_user
		loginbutton.click();
		
		Thread.sleep(5000);	//delay
		
		WebElement errorbutton3 = d.findElement(By.xpath("//button[@class='error-button']"));
		errorbutton3.click(); //errorbutton3
		
		Thread.sleep(5000);	//delay
		
		username.clear();
		Thread.sleep(5000);	//delay
		username.sendKeys("standard_user");
		loginbutton.click(); //username
		
		Thread.sleep(5000);	//delay
		
		JavascriptExecutor js =(JavascriptExecutor)d;
		
		js.executeScript("window.scrollBy(0,1000)"); //scroll down
		Thread.sleep(5000);	//delay
		js.executeScript("window.scrollBy(0,-1000)"); //scroll up
		Thread.sleep(5000);	//delay
		
		WebElement addcart1 =d.findElement(By.xpath("//button[@id=\"add-to-cart-sauce-labs-backpack\"]"));
		addcart1.click(); //add to cart
		
		WebElement addcart2 =d.findElement(By.xpath("//button[@id=\"add-to-cart-sauce-labs-bike-light\"]"));
		addcart2.click(); //add to cart
		
		Select dropdown = new Select(d.findElement(By.className("product_sort_container")));  
		dropdown.selectByVisibleText("Name (Z to A)");	// dropdown 1
		
		//
	}

}
