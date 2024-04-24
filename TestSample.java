package natwestTest;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;

public class TestSample
{
public static void main(String[] args)
{
String exepath = "Chrome Driver Path in Local";

System.setProperty("webdriver.chrome.driver", exepath);

WebDriver driver = new ChromeDriver();

driver.get("https://www.saucedemo.com/");

driver.manage().window().maximize();

WebElement Username = driver.findElement(By.xpath("//input[@id='user-name']"));

WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));

WebElement LoginButton = driver.findElement(By.xpath("//input[@id='login-button']"));

Username.sendKeys("standard_user");

Password.sendKeys("secret_sauce");

Thread.sleep(1000);

LoginButton.click();

Alert simpleAlert = driver.switchTo().alert();

simpleAlert.accept();

WebElement Product1 = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));

WebElement Product2 = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']"));

WebElement Product3 = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']"));

Product1.click();

Product2.click();

Product3.click();

WebElement CartLink = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
 
CartLink.click();

Thread.sleep(1000);
 
WebElement Checkout = driver.findElement(By.xpath("//button[@id='checkout']"));
 
Checkout.click();

WebElement Cancel = driver.findElement(By.xpath("//button[@id='cancel']"));
 
Cancel.click();

WebElement Remove1 = driver.findElement(By.xpath("//button[@id='remove-sauce-labs-backpack']"));

WebElement Remove2 = driver.findElement(By.xpath("//button[@id='remove-sauce-labs-bike-light']"));

WebElement Remove3 = driver.findElement(By.xpath("//button[@id='remove-sauce-labs-bolt-t-shirt']"));

Remove1.click();

Remove2.click();

Remove3.click();

WebElement BurgerButton = driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']"));
 
BurgerButton.click();

WebElement Logout = driver.findElement(By.xpath("//a[@id='logout_sidebar_link']"));
 
Logout.click();

Thread.sleep(1000);

Username.sendKeys("performance_glitch_user");

Password.sendKeys("secret_sauce");

Thread.sleep(1000);

LoginButton.click();

Thread.sleep(7000);

Alert simpleAlert = driver.switchTo().alert();

simpleAlert.accept();

WebElement Product1 = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));

WebElement Product2 = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']"));

WebElement Product3 = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']"));

Product1.click();

Product2.click();

Product3.click();

WebElement CartLink = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
 
CartLink.click();

Thread.sleep(7000);
 
WebElement Checkout = driver.findElement(By.xpath("//button[@id='checkout']"));
 
Checkout.click();

Thread.sleep(7000);

WebElement Cancel = driver.findElement(By.xpath("//button[@id='cancel']"));
 
Cancel.click();

Thread.sleep(7000);

WebElement Remove1 = driver.findElement(By.xpath("//button[@id='remove-sauce-labs-backpack']"));

WebElement Remove2 = driver.findElement(By.xpath("//button[@id='remove-sauce-labs-bike-light']"));

WebElement Remove3 = driver.findElement(By.xpath("//button[@id='remove-sauce-labs-bolt-t-shirt']"));

Remove1.click();

Remove2.click();

Remove3.click();

WebElement BurgerButton = driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']"));
 
BurgerButton.click();

WebElement Logout = driver.findElement(By.xpath("//a[@id='logout_sidebar_link']"));
 
Logout.click();

driver.close();

  }
}