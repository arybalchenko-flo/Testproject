package Test;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Pages.CartPage;
import Pages.MainPage;
import Pages.SearchResultPage;
import java.time.Duration;

public class TestCase
{
    WebDriver driver = new ChromeDriver(); // настройка драйвера
    MainPage main = new MainPage(driver);
    SearchResultPage result = new SearchResultPage(driver);
    CartPage cart = new CartPage(driver);

    @Before
    public void Beginning()
    {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        driver.manage().window().maximize(); // фуллскрин
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); //задержка
        driver.get("https://mvideo.ru"); //открыть сайт
    }

    @Test
    public void Test()
    {
        //Поиск товара
        main.search();

        //Добавить в корзину
        result.addtocart();
        //Перейти в корзину
        result.gotocart();
        //Проверка на наличие товара в корзине
        cart.emptycart();
        //Удаление товара из корзины
        cart.clickDelete();
        //Проверка на наличие товара в корзине
        cart.emptycart();
    }

    @After
    public void Ending()
    {
        driver.quit();
        System.out.println("Test completed successfully");
    }

}