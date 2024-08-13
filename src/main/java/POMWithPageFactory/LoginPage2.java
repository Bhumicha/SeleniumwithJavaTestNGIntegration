package POMWithPageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

/*
1. constructor
2. Locators
3. Action methods
 */
public class LoginPage2 {
    WebDriver driver;
    //constructor
    LoginPage2(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements( driver,this);
    }
    //locators
    @FindBy(xpath = "//input[@placeholder='Username']")
            WebElement txt_username;
    @FindBy(xpath = "//input[@placeholder='Password']")
            WebElement txt_password;
    @FindBy(xpath = "//button[normalize-space()='Login']")
            WebElement clickLogin;
    @FindBy(tagName = "a")
    List<WebElement> links;

    //Actions
    public void setUserName(String user)
    {
        txt_username.sendKeys(user);
    }
    public void setPassword(String password)
    {
        txt_password.sendKeys(password);
    }
    public void clickLogin()
    {
        clickLogin.click();
    }

};
