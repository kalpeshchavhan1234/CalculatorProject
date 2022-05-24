package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Calculator {
	WebDriver driver;
	@BeforeClass
	public void Setup(){
		System.setProperty("webdriver.chrome.driver", "chromedriver123.exe");
		driver=new ChromeDriver();
		driver.get("https://www.calculator.net/");
	}
	@Test
	public void Multiplication(){
		driver.findElement(By.xpath("//span[@onclick=\"r(4)\"]")).click();
		driver.findElement(By.xpath("//span[@onclick=\"r(2)\"]")).click();
		driver.findElement(By.xpath("//span[@onclick=\"r(3)\"]")).click();
		driver.findElement(By.xpath("//span[@onclick=\"r('*')\"]")).click();
		driver.findElement(By.xpath("//span[@onclick=\"r(5)\"]")).click();
		driver.findElement(By.xpath("//span[@onclick=\"r(2)\"]")).click();
		driver.findElement(By.xpath("//span[@onclick=\"r(5)\"]")).click();
int a=222075;
Assert.assertEquals(222075, a);
	}
@AfterMethod
public void Setup2(){
	driver.findElement(By.xpath("//span[@onclick=\"r('C')\"]")).click();
}
@Test
public void Division(){
	driver.findElement(By.xpath("//span[@onclick=\"r(4)\"]")).click();
	driver.findElement(By.xpath("//span[@onclick=\"r(0)\"]")).click();
	driver.findElement(By.xpath("//span[@onclick=\"r(0)\"]")).click();
	driver.findElement(By.xpath("//span[@onclick=\"r(0)\"]")).click();
	driver.findElement(By.xpath("//span[@onclick=\"r('/')\"]")).click();
	driver.findElement(By.xpath("//span[@onclick=\"r(2)\"]")).click();
	driver.findElement(By.xpath("//span[@onclick=\"r(0)\"]")).click();
	driver.findElement(By.xpath("//span[@onclick=\"r(0)\"]")).click();
int b=20;
Assert.assertEquals(20, b);

}
@Test
public void Addition(){
	driver.findElement(By.xpath("//span[@onclick=\"r('-')\"]")).click();
	driver.findElement(By.xpath("//span[@onclick=\"r(2)\"]")).click();
	driver.findElement(By.xpath("//span[@onclick=\"r(3)\"]")).click();
	driver.findElement(By.xpath("//span[@onclick=\"r(4)\"]")).click();
	driver.findElement(By.xpath("//span[@onclick=\"r(2)\"]")).click();
	driver.findElement(By.xpath("//span[@onclick=\"r(3)\"]")).click();
	driver.findElement(By.xpath("//span[@onclick=\"r(4)\"]")).click();
	driver.findElement(By.xpath("//span[@onclick=\"r('+')\"]")).click();
	driver.findElement(By.xpath("//span[@onclick=\"r(3)\"]")).click();
	driver.findElement(By.xpath("//span[@onclick=\"r(4)\"]")).click();
	driver.findElement(By.xpath("//span[@onclick=\"r(5)\"]")).click();
	driver.findElement(By.xpath("//span[@onclick=\"r(3)\"]")).click();
	driver.findElement(By.xpath("//span[@onclick=\"r(4)\"]")).click();
	driver.findElement(By.xpath("//span[@onclick=\"r(5)\"]")).click();
int c=111111;
Assert.assertEquals(111111, c);

}
@Test
public void Subtraction(){
	driver.findElement(By.xpath("//span[@onclick=\"r(2)\"]")).click();
	driver.findElement(By.xpath("//span[@onclick=\"r(3)\"]")).click();
	driver.findElement(By.xpath("//span[@onclick=\"r(4)\"]")).click();
	driver.findElement(By.xpath("//span[@onclick=\"r(8)\"]")).click();
	driver.findElement(By.xpath("//span[@onclick=\"r(2)\"]")).click();
	driver.findElement(By.xpath("//span[@onclick=\"r(3)\"]")).click();
	driver.findElement(By.xpath("//span[@onclick=\"r('-')\"]")).click();
	driver.findElement(By.xpath("//span[@onclick=\"r('-')\"]")).click();
	driver.findElement(By.xpath("//span[@onclick=\"r(2)\"]")).click();
	driver.findElement(By.xpath("//span[@onclick=\"r(3)\"]")).click();
	driver.findElement(By.xpath("//span[@onclick=\"r(0)\"]")).click();
	driver.findElement(By.xpath("//span[@onclick=\"r(9)\"]")).click();
	driver.findElement(By.xpath("//span[@onclick=\"r(4)\"]")).click();
	driver.findElement(By.xpath("//span[@onclick=\"r(8)\"]")).click();
	driver.findElement(By.xpath("//span[@onclick=\"r(2)\"]")).click();
	driver.findElement(By.xpath("//span[@onclick=\"r(3)\"]")).click();
	int d=23329646;
	Assert.assertEquals(23329646, d);

}

















}
