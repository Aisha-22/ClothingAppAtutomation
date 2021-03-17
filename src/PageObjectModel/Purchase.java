package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Purchase {
    private static WebElement element = null;
    //Method for Women Link
    public static WebElement WomenLink(WebDriver driver){
        element = driver.findElement(By.linkText("Women"));

        return element;
    }
    //Method on Actions to add Items into Cart
    public static void BlouseItem(WebDriver driver){
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.cssSelector("#center_column > ul > li:nth-child(2) > div > div.left-block > div")))
                .build().perform();
    }
    //Adding BlouseItem to Cart
    public static WebElement AddingItem1ToCart(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id='center_column']/ul/li[2]/div/div[2]/div[2]/a[1]/span"));

        return element;
    }
    //Working through Frames
    public static WebElement MoveInToFrame(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id='layer_cart']/div[1]/div[1]"));

        return element;
    }
    //Switching Into frames
    public static WebElement SwitchToFrames(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id='layer_cart']/div[1]/div[1]"));

        return element;
    }
}
