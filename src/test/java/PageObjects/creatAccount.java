package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class creatAccount {

    WebDriver driver;

    public void EnterAccEmail(WebDriver driver)
    {
        this.driver= driver;
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        WebElement accEmail = driver.findElement(By.xpath("//input[@id='email_create']"));
        accEmail.sendKeys("ml@gmil.com");
    }

    public void clickCreateAccBTN(WebDriver driver)
    {
        this.driver= driver;
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        WebElement accEmail = driver.findElement(By.xpath("//form[@id='create-account_form']//span[1]"));
        accEmail.click();
    }
    // select gender title
    public void userTitleMr(WebDriver driver)
    {
        this.driver= driver;
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        WebElement userTitle = driver.findElement(By.xpath("//input[@id='id_gender1']"));
        userTitle.click();
    }
    // Enter first name
    public void firstName(WebDriver driver)
    {
        this.driver= driver;
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        WebElement first= driver.findElement(By.xpath("//input[@id='customer_firstname']"));
        first.sendKeys("firstNamer");
    }
    // Enter first name
    public void LastName(WebDriver driver)
    {
        this.driver= driver;
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        WebElement last = driver.findElement(By.xpath("//input[@id='customer_lastname']"));
        last.sendKeys("lastNamer");
    }
    // Enter enter password
    public void Enterpassword(WebDriver driver)
    {
        this.driver= driver;
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        WebElement pass = driver.findElement(By.xpath("//input[@id='passwd']"));
        pass.sendKeys("password");
    }
 //select birthday
    public void selDrpbirthday(WebDriver driver)
    {
        //Select an option from dropdown
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        Select birthday =new Select (driver.findElement(By.xpath("//select[@id='days']")));
        birthday.selectByIndex(3);
    }
    //select birthMonth
    public void selDrpbirthMonth(WebDriver driver)
    {
        //Select an option from dropdown
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        Select birthMonth =new Select (driver.findElement(By.xpath("//select[@id='months']")));
        birthMonth.selectByIndex(4);
    }

    //select birthyears
    public void selDrpbirthyears(WebDriver driver)
    {
        //Select an option from dropdown
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        Select birthyears =new Select (driver.findElement(By.xpath("//select[@id='years']")));
        birthyears.selectByValue("2020");
    }
    // Select checkbox newsletter
    public void selectNewsletter(WebDriver driver)
    {
        this.driver= driver;
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        WebElement newsletter = driver.findElement(By.xpath("//label[contains(text(),'Sign up for our newsletter!')]"));
        newsletter.click();

        if(newsletter.isSelected())
        {System.out.println("newsletter");}
    }
    // Select checkbox selectSpecialOffers
    public void selectSpecialOffers(WebDriver driver)
    {
        this.driver= driver;
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        WebElement SpecialOffers = driver.findElement(By.xpath("//input[@id='optin']"));
        SpecialOffers.click();
    }


    // Enter first name
    public void EnterfirstName(WebDriver driver)
    {
        this.driver= driver;
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        WebElement first = driver.findElement(By.xpath("//input[@id='firstname']"));
        first.sendKeys("lastNamer");
    }
    // Enter enter password
    public void Enterpassword(WebDriver driver)
    {
        this.driver= driver;
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        WebElement pass = driver.findElement(By.xpath("//input[@id='passwd']"));
        pass.sendKeys("password");
    }

    }
