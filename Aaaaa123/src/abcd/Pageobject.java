package abcd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Pageobject {
	
	
	
	
	
WebDriver driver;
By user=By.name("user-name");
By pass=By.name("password");
By button=By.id("login-button");

public Pageobject(WebDriver driver){
	this.driver=driver;
}
public void user1(String Uname){
	driver.findElement(user).sendKeys(Uname);
}
public void pass1(String pwd){
	driver.findElement(pass).sendKeys(pwd);
}
public void button1(){
	driver.findElement(button).click();
}







}
