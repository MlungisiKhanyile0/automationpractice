import PageObjects.*;
import PageObjects.creatAccount;
import Utility.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class WholeWebsite {
    WebDriver driver;
    ConnectionClass con = new ConnectionClass();
    Manubar manuCls= new Manubar();
    ContactPage cont = new ContactPage();
    loginPage log =new loginPage();
    creatAccount createUser = new creatAccount();

    private Properties properties;
    private final String propertyFilePath= "C:/Users/Mlungisi Khanyile/IdeaProjects/WholeWebsite/src/test/java/Utility/config.properties";
    BufferedReader reader;
    @BeforeTest
    public void connectWebdriver() throws Exception {
      try {
        reader = new BufferedReader(new FileReader(propertyFilePath));
        properties = new Properties();
       try {
           properties.load(reader);
           reader.close();
        } catch (IOException e) {
           e.printStackTrace();
        }
      } catch (FileNotFoundException e) {
          e.printStackTrace();
        throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
      }
        String driverPath= properties.getProperty("driverPath");
        String url= properties.getProperty("url");
        // Reading Property files
        // con.readjson();
       System.setProperty("webdriver.chrome.driver",driverPath);
       driver = new ChromeDriver();
       driver.get(url);
       driver.manage().window().maximize();
    // con.webdriverCon(driver);
       System.out.println("Hellow world");
    }
    @Test
    public void contactUs() {
        // click contact button
        manuCls.clickContactUs(driver);

        //select dropdown header
        cont.selDrpHeading(driver);

        //Enter email
        cont.insertEmail(driver);

        //Enter reference
        cont.insertReference(driver);

     /*Attach a file
       cont.AttachAFile(driver);*/

        //insert message
        cont.setMsg(driver);

        // click sent contact details
        cont.clickSend(driver);

        // Assert
        cont.testContact(driver);

        //  Go to home page

        manuCls.clickLogo(driver);
    }
    @Test
    public  void loginTest()
    {
      manuCls.clickLoginbtn(driver);
      log.EnterEmail(driver);
      log.Enterpassword(driver);
      log.loginBtn(driver);
      manuCls.clickLogo(driver);
    }
    @Test
    public void createAccount()
    {
      //click login button
       manuCls.clickLoginbtn(driver);
       //enter new user email
       createUser.EnterAccEmail(driver);
       //Click create account button
       createUser.clickCreateAccBTN(driver);

       //select user title
       createUser.userTitleMr(driver);

       // Enter first name
        createUser.firstName(driver);

      // Enter last name
      createUser.LastName(driver);
        // Enter password
        createUser.Enterpassword(driver);

        // Enter password
        createUser.Enterpassword(driver);
        //select birth day date
        createUser.selDrpbirthday(driver);
        //select birth day month
       createUser.selDrpbirthMonth(driver);
        //select birth day year
       createUser.selDrpbirthyears(driver);
        //Select newsletter
        createUser.selectNewsletter(driver);
        //Check special offers
       createUser.selectSpecialOffers(driver);
       //enter firstname



    //   manuCls.clickLogo(driver);
    }
//     @AfterMethod
//        public void teardown()
//        {
//        this.driver.quit();
//        }
}

