package Test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Pages.CartPage;
import Pages.MainPage;
import Pages.SearchResultPage;
import java.time.Duration;

public class TestCase {

    
    public static void main(String[] args) { //Требует мейн для запуска, с этим проблемка
    }

    @Test
    public void Test()
    {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        WebDriver driver = new ChromeDriver(); // настройка драйвера
        driver.manage().window().maximize(); // фуллскрин
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); //задержка
        driver.get("https://mvideo.ru"); //открыть сайт

        MainPage main = new MainPage(driver);

        SearchResultPage result = new SearchResultPage(driver);

        CartPage cart = new CartPage(driver);
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

       // driver.quit();
    }

}