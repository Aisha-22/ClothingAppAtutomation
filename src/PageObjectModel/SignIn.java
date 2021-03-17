package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignIn {
    private static WebElement element = null;
    //Method for Sign-In(Using your Email and Password then click Sign In Button)
    public static WebElement SignInPage(WebDriver driver){
        element = driver.findElement(By.linkText("Sign in"));

        return element;
    }
    //Method for EmailField
    public static WebElement EmailField(WebDriver driver){
        element = driver.findElement(By.id("email"));

        return element;
    }
    //Method for PasswordField
    public static WebElement PasswordField(WebDriver driver){
        element = driver.findElement(By.id("passwd"));

        return element;
    }
    //Method for Sign In Button
    public static WebElement SignInButton(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id='SubmitLogin']/span"));

        return element;
    }
}
