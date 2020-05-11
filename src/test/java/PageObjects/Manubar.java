package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;

public class Manubar {
   WebDriver driver;

    public void clickContactUs(WebDriver driver)
    {
     this.driver= driver;
     driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
     WebElement contact = driver.findElement(By.xpath("//div[@id='contact-link']//a[contains(text(),'Contact us')]"));
     contact.click();
    }

 public void clickLoginbtn(WebDriver driver)
 {
  this.driver= driver;
  driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
  WebElement loginbtn = driver.findElement(By.xpath("//a[@class='login']"));
  loginbtn.click();
 }
 public void clickLogo(WebDriver driver)
 {
  this.driver= driver;
  driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
  WebElement logo = driver.findElement(By.xpath("//img[@class='logo img-responsive']"));
  logo.click();
 }


}
