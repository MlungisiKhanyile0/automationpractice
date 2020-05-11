package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class ContactPage {
    WebDriver driver;

    public void selDrpHeading(WebDriver driver)
    {
        //Select an option from dropdown
      driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
      Select drpHeading =new Select (driver.findElement(By.xpath("//select[@id='id_contact']")));
      drpHeading.selectByVisibleText("Customer service");
    }

    public void insertEmail(WebDriver driver) {
        //Insert email
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        WebElement sendEmail = driver.findElement(By.xpath("//input[@id='email']"));
        sendEmail.sendKeys("mlu@gmail.com");
    }
    public void insertReference(WebDriver driver) {
        //Insert Reference
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        WebElement sendREf = driver.findElement(By.xpath("//input[@id='id_order']"));
        sendREf.sendKeys("mluReff");

    }
    public void AttachAFile(WebDriver driver) {
        //Insert Reference
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        WebElement uploadElement = driver.findElement(By.xpath("//div[@id='uniform-fileUpload']"));
        uploadElement.sendKeys("C:\\fnb.PNG");
    }


    public void setMsg(WebDriver driver) {
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        WebElement sendMessage = driver.findElement(By.xpath("//textarea[@id='message']"));
        sendMessage.sendKeys("mlu@gmail.com");
    }

    public void clickSend(WebDriver driver) {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement clickSendbtn = driver.findElement(By.xpath("//button[@id='submitMessage']"));
        clickSendbtn.click();
    }
    public  void testContact (WebDriver driver)
    {
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      String s= driver.findElement(By.xpath("//p[@class='alert alert-success']")).getText();
      Assert.assertEquals("Your message has been successfully sent to our team.",s);
        System.out.println(s);
    }

}
