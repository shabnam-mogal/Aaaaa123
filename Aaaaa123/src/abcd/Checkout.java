package abcd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Checkout {
	
	
	
	
WebDriver driver;
By check=By.xpath("//*[@id='checkout']");
By first=By.xpath("//*[@id='first-name']");
By last=By.xpath("//*[@id='last-name']");
By pincode=By.xpath("//*[@id='postal-code']");
By continue1=By.xpath("//*[@id='continue']");
By finish=By.xpath("//*[@id='finish']");

public Checkout(WebDriver driver){
	this.driver=driver;
}
public void check1(){
	driver.findElement(check).click();
}
public void first1(){
	driver.findElement(first).sendKeys("salman");
}
public void last1(){
	driver.findElement(last).sendKeys("mogal");
}
public void pincode1(){
	driver.findElement(pincode).sendKeys("517172");
}
public void continue2(){
	driver.findElement(continue1).click();
}
public void finish1(){
	driver.findElement(finish).click();
}

}
