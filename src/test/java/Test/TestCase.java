package Test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Pages.Cart;
import Pages.MainPage;
import Pages.SearchRes;
import java.util.concurrent.TimeUnit;

public class TestCase {

    public static void main(String[] args) { //Требует мейн для запуска, с этим проблемка
    }

    @Test
    public void Test()
    {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        WebDriver driver = new ChromeDriver(); // настройка драйвера
        driver.manage().window().maximize(); // фуллскрин
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); //задержка
        driver.get("https://mvideo.ru"); //открыть сайт

        MainPage main = new MainPage(driver);

        SearchRes result = new SearchRes(driver);

        Cart cart = new Cart(driver);
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