package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\JAVA & Selenium\\selenium & Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Button.html");
		
		WebElement getPosition=driver.findElement(By.id("position"));
		org.openqa.selenium.Point xypoint=getPosition.getLocation();
		int xvalue=xypoint.getX();
		int yvalue=xypoint.getY();
		System.out.println("X= "+ xvalue+"Y= "+yvalue);
		
		WebElement colorButton=driver.findElement(By.id("color"));
		String color=colorButton.getCssValue("background-color");
		System.out.println("The Button color is:"+color);
		
		WebElement sizeButton=driver.findElement(By.id("size"));
		int height=sizeButton.getSize().getHeight();
		int width=sizeButton.getSize().getWidth();
		System.out.println("H="+height+"W="+width);
		
		//WebElement homeButton=driver.findElement(By.id("home"));
		//homeButton.click();
	}

}
