package PageObjectModelPattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/*
1. constructor
2. Locators
3. Action methods
 */
public class LoginPage {
    WebDriver driver;
    //constructor
    LoginPage(WebDriver driver)
    {
        this.driver=driver;
    }
    //locators
    By txtusername_loc= By.xpath("//input[@placeholder='Username']");
    By txtpassword_loc= By.xpath("//input[@placeholder='Password']");
    By btnlogin_loc= By.xpath("//button[normalize-space()='Login']");

    //Actions
    public void setUserName(String user)
    {
        driver.findElement(txtusername_loc).sendKeys(user);
    }
    public void setPassword(String password)
    {
        driver.findElement(txtpassword_loc).sendKeys(password);
    }
    public void clickLogin()
    {
        driver.findElement(btnlogin_loc).click();
    }

};
