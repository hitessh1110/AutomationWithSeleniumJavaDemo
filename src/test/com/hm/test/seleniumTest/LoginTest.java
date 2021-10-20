package com.hm.test.seleniumTest;


import com.hm.test.pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTest {

    private WebDriver driver;

   @Before
   public  void  Initialize(){

       WebDriverManager.firefoxdriver().setup();
       driver = new FirefoxDriver();
       driver.get("https://demosite.executeautomation.com/Login.html");

   }


    @Test
    public void Login(){

//       driver.findElement(By.name("UserName")).sendKeys("admin");
//       driver.findElement(By.name("Password")).sendKeys("admin");
//       driver.findElement(By.name("Login")).submit();

        LoginPage page = new LoginPage(driver);
        page.Login("admin" , "admin");



    }



}
