package sause;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class sause2 {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chromee.driver", "C:\\Users\\sai\\Downloads\\chromedriver-win64");
		//WebDriver d = new ChromeDriver(); 
		WebDriver d = new ChromeDriver();
		d.get("https://www.saucedemo.com/inventory.html"); // Launch browser
		
		d.manage().window().maximize(); //maximize
		
		Thread.sleep(5000);	//delay
		
		WebElement username= d.findElement(By.xpath("//input[@placeholder=\"Username\"]"));
		username.sendKeys("standard_user");
		
		WebElement pwd =d.findElement(By.xpath("//input[@id=\"password\"]"));
		pwd.sendKeys("secret_sauce");
		
		WebElement loginbutton = d.findElement(By.xpath("//input[@type='submit']"));
		loginbutton.click(); //loginbutton
		
	//	WebElement testDropDown = d.findElement(By.id("header_container"));  
	//	Select dropdown = new Select(testDropDown);  
		
	//	dropdown.selectByVisibleText("Database Testing"); 
		
		Select dropdown = new Select(d.findElement(By.className("product_sort_container")));  
		dropdown.selectByVisibleText("Name (Z to A)");  
		Thread.sleep(5000);	//delay
	 
	//	dropdown.selectByValue("lohi");
		
		
}
}
