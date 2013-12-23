package com.rl.selenium;

import org.openqa.selenium.By;

public class NewProduct extends MainDriver{
	
	public static void ProductList(){
				
		driver.findElement(By.xpath("//form[@id='header:headerForm']/table/tbody/tr/td/a")).click();
		driver.findElement(By.linkText("home")).click();
	}

}
