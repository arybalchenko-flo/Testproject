package Test;

import Base.Base;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Pages.CartPage;
import Pages.MainPage;
import Pages.SearchResultPage;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TestCase extends Base
{

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
        main.search("MGMT3RU/A\n");

        //Добавить в корзину
        result.addToCart();
        //Перейти в корзину
        result.goToCart();
        //Проверка на наличие товара в корзине
        cart.emptyCart();
        //Удаление товара из корзины
        cart.clickDelete();
        //Проверка товара на наличие в корзине
        cart.emptyCart();
    }

    @After
    public void Ending()
    {
        driver.quit();
        System.out.println("Test completed successfully");
    }

}