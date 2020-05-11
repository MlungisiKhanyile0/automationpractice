package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;

public class loginPage {
    WebDriver driver;

    public void EnterEmail(WebDriver driver)
    {
        this.driver= driver;
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        WebElement loginEmail = driver.findElement(By.xpath("//input[@id='email']"));
        loginEmail.sendKeys("ml@gmil.com");
    }
    public void Enterpassword(WebDriver driver)
    {
        this.driver= driver;
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        WebElement loginPassword = driver.findElement(By.xpath("//input[@id='passwd']"));
        loginPassword.sendKeys("password");
    }
    public void loginBtn(WebDriver driver)
    {
        this.driver= driver;
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        WebElement loginBtn = driver.findElement(By.xpath("//p[@class='submit']//span[1]"));
        loginBtn.click();
    }
}
