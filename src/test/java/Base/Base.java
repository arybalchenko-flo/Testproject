package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.*;
public class Base
{
public static WebDriver driver;

    public static void click(By input_locator) //нахождение элемента и клик по нему
    {
        WebElement input = driver.findElement(input_locator);
        input.click();
    }
    public static void sendKey(By key_locator, String keysToSend) //нахождение элемента и отправка текста
    {
        WebElement sendKey = driver.findElement(key_locator);
        sendKey.sendKeys(keysToSend);
    }
    public static void find(By locator) //нахождение элемента
    {
        driver.findElement(locator);
    }
}
