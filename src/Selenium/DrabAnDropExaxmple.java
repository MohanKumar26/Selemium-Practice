package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DrabAnDropExaxmple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\JAVA & Selenium\\selenium & Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("http://www.leafground.com/pages/drop.html");
		
		WebElement From = driver.findElement(By.id("draggable"));
		WebElement To = driver.findElement(By.id("droppable"));
		
		Actions action = new Actions(driver);
		
		//action.clickAndHold(From).moveToElement(To).release(To).build().perform();
		action.dragAndDrop(From, To).build().perform();
	}

}
