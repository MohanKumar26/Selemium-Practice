package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\JAVA & Selenium\\selenium & Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("http://www.leafground.com/pages/checkbox.html");
		
		WebElement java = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/input[1]"));
		java.click();
		
		WebElement selenium=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/input[2]"));
		boolean seleniumSelected = selenium.isSelected();
		System.out.println(seleniumSelected);
		
		WebElement firstElement = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/input[1]"));
		if (firstElement.isSelected()) {
			firstElement.click();
		}
		
		WebElement secondElement=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/input[2]"));
		if (secondElement.isSelected()) {
			secondElement.click();
		}
		WebElement option3Element=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/input[3]"));
		option3Element.click();
	}

}
