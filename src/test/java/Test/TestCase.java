package Test;

import Base.Base;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import Pages.MainPage;

import java.time.Duration;

public class TestCase extends Base
{
    @Before
    public void Beginning()
    {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        driver.manage().window().maximize(); // фуллскрин
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); //задержка
        driver.get("https://pexels.com"); //открыть сайт
    }

    @Test
    public void Test()
    {
        MainPage.moveToPhoto();
        //Нажатие кнопки скачать
        MainPage.downloadClick();
    }

    @After
    public void Ending()
    {

        driver.quit();
        System.out.println("Test completed successfully");
    }

}