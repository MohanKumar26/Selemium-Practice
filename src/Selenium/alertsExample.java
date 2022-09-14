package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\JAVA & Selenium\\selenium & Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("http://www.leafground.com/pages/Alert.html");
		
		WebElement alertBox= driver.findElement(By.xpath("//*[@id='contentblock']/section/div[1]/div/div/button"));
		alertBox.click();
		
		Alert alert= driver.switchTo().alert();
				alert.accept();

		WebElement confrimBox=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		confrimBox.click();
		
		Alert confirmAlert = driver.switchTo().alert();
		confirmAlert.dismiss();
		
		WebElement Promptbox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/button"));
		Promptbox.click();
		
		Alert PromptAlert = driver.switchTo().alert();
		PromptAlert.sendKeys("Bye");
		PromptAlert.accept();
	}

}
