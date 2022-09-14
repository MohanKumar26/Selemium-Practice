package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditTextBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\JAVA & Selenium\\selenium & Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Edit.html");
		
		WebElement emailbox=driver.findElement(By.id("email"));
		emailbox.sendKeys("amdsdh@gmail.com");
		
		WebElement appendBox=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/input"));
		appendBox.sendKeys("Text");
		
		WebElement username=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/input"));
		String value=username.getAttribute("value");
		System.out.println(value);
		
		WebElement clearbox=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div/div/input"));
		clearbox.clear();
		
		WebElement disablebox=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[5]/div/div/input"));
		boolean enable= disablebox.isEnabled();
		System.out.println(enable);
	}

}
