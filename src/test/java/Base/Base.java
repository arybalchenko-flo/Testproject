package Base;

import Test.TestCase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Base
{
public static WebDriver driver = new ChromeDriver(); // настройка драйвера
public static long waiting_time = 20;
public static WebDriverWait wait = new WebDriverWait(Base.driver, Duration.ofSeconds(Base.waiting_time)); //Настройка ожидания




    public static void click(By input_locator) //нахождение элемента и клик по нему
    {
        WebElement input = wait.until(ExpectedConditions.elementToBeClickable(input_locator));
        input.click();
    }
    public static void sendKey(By key_locator, String keysToSend) //нахождение элемента и отправка текста
    {
        WebElement sendKey = wait.until(ExpectedConditions.elementToBeClickable(key_locator));
        sendKey.sendKeys(keysToSend);
    }
    public static void find(By locator) //нахождение элемента
    {
        driver.findElement(locator); //
    }
}
