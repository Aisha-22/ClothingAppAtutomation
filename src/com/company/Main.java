package com.company;

import PageObjectModel.Purchase;
import PageObjectModel.SignIn;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {
        //Set System Property to Chrom .exe file to invoke the browser below
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aisha Hlatshwayo\\Desktop\\chromedriver.exe");

        //Invoke the test in Chrome Driver
        WebDriver driver = new ChromeDriver();
        //Maximize screen
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/");

        //SignIn onto signin page, SignIn using Email and Password, then click on the Sign In Button
        SignIn.SignInPage(driver).click();
        SignIn.EmailField(driver).sendKeys("ash.hlatshwayo22@gmail.com");
        SignIn.PasswordField(driver).sendKeys("EnglishMan@1234");
        SignIn.SignInButton(driver).click();

        //Purchase Action and 'Add To Cart'
        Purchase.WomenLink(driver).click();

        //Method on Actions to add Items into Cart
        Purchase.BlouseItem(driver);

        //Adding BlouseItem to Cart
        Purchase.AddingItem1ToCart(driver).click();

        //Working through Frames
        Purchase.MoveInToFrame(driver).click();
    }
}
