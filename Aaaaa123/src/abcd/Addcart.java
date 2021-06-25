package abcd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Addcart {
	
	
	
	
	
WebDriver driver;
By jacket=By.xpath("//*[@id='item_5_title_link']/div");
By cart=By.xpath("//*[@id='add-to-cart-sauce-labs-fleece-jacket']");
By cart2=By.xpath("//*[@id='shopping_cart_container']/a");


public Addcart(WebDriver driver){
	this.driver=driver;
}
public void jacket1(){
	driver.findElement(jacket).click();
}
public void cart1(){
	driver.findElement(cart).click();
}
public void cart3(){
	driver.findElement(cart2).click();
}


}
