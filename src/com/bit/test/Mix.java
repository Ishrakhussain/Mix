package com.bit.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Mix {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", 
			"C:\\\\\\\\Users\\\\\\\\Ishra\\\\\\\\Downloads\\\\\\\\geckodriver-v0.27.0-win64\\\\\\\\geckodriver.exe");		
	
WebDriver dr= new FirefoxDriver();
dr.manage().window().maximize();
dr.get("https://www.express.com/");
dr.findElement(By.xpath("html/body/div[6]/div/div/section[2]/button")).click();
dr.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/nav/ol/li[1]/a")).click();
JavascriptExecutor js=(JavascriptExecutor)dr;
js.executeScript("window.scrollBy(0,500)"); 
int msize=dr.findElements(By.xpath("//*[@id=\"content\"]/div/div[2]/div/div/div/div[2]/div/div[1]/div/div/div/div/div/div/div/a")).size();
System.out.println(msize);
for(int i=1; i<=msize; i++) {
dr.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/div/div/div[2]/div/div[1]/div/div/div/div["+i+"]/div/div/div/a")).click();
int ssize=dr.findElements(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div/div")).size();
System.out.println(ssize);
for (int j=1; j<=ssize; j++) {
	dr.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div/div["+j+"]")).click();
	dr.navigate().back();
}

}
}
}

