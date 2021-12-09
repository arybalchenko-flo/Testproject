package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.util.List;
import java.time.Duration;
import java.util.HashMap;

public class Base
{
    // HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
    // chromePrefs.put("download.default_directory", System.getProperty("//Users//floadmin//Documents//DownloadTest"));
    // ChromeOptions options = new ChromeOptions();
    // options.setExperimentalOption("prefs", chromePrefs); //вот эти строчки без метода не работают, работают только если все это включая драйвер залить в метод(и убрать паблик) и везде в итоге станет красным
public static WebDriver driver = new ChromeDriver();
public static long waiting_time = 20;
public static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(waiting_time)); //Настройка ожидания

    public static void click(By input_locator) //нахождение элемента и клик по нему
    {
        WebElement input = wait.until(ExpectedConditions.elementToBeClickable(input_locator));
        input.click();
    }
}
