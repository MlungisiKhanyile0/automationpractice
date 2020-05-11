package Utility;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.*;
import java.util.Date;
import java.util.Properties;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class ConnectionClass {

    public WebDriver driver;
     String website="";
    public void readjson() throws Exception
    {
        //JSON parser object to parse read file
        JSONParser jsonParser = new JSONParser();

        try (FileReader reader = new FileReader("C:\\Users\\Mlungisi Khanyile\\IdeaProjects\\WholeWebsite\\src\\test\\java\\Utility\\DataFile.json"))
        {
            //Read JSON file
            Object obj = jsonParser.parse(reader);

            JSONArray employeeList = (JSONArray) obj;
          //  System.out.println(employeeList);

            //Iterate over employee array
       //   employeeList.forEach( emp -> parseEmployeeObject( (JSONObject) emp ) );

          for( Object emp: employeeList)
              //   parse ((JSONObject) emp);
              if ( emp instanceof JSONObject);
          //System.out.println(employeeList);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void parseEmployeeObject(JSONObject employee)
    {
        //Get employee object within list
        JSONObject employeeObject = (JSONObject) employee.get("employee");

        //Get employee first name
        String firstName = (String) employeeObject.get("firstName");
        System.out.println(firstName);

        //Get employee last name
        String lastName = (String) employeeObject.get("lastName");
        System.out.println(lastName);

        //Get employee website name
        website = (String) employeeObject.get("website");
        System.out.println(website);
    }

    public void webdriverCon(WebDriver driver) //throws IOException
    {

        System.setProperty("webdriver.chrome.driver","C://DeveloperTools//chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();


    }
}
