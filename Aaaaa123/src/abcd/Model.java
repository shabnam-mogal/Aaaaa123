package abcd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Model {
	
	
	
	public static void main(String[] args) {

		
System.setProperty("webdriver.chrome.driver", "E:/chrome91/chromedriver.exe");
WebDriver driver=new ChromeDriver();
Pageobject login=new Pageobject(driver);
Addcart add=new Addcart(driver);
Checkout out=new Checkout(driver);


driver.get("https://www.saucedemo.com/");

login.user1("standard_user");
login.pass1("secret_sauce");
login.button1();
//driver.navigate().to("https://www.saucedemo.com/inventory.html");
add.jacket1();

add.cart1();
add.cart3();
out.check1();
out.first1();
out.last1();
out.pincode1();
out.continue2();
out.finish1();



	}

}
