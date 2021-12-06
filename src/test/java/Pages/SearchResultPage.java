package Pages;

import Base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultPage extends Base
{
  public SearchResultPage(WebDriver driver)
    {
        Base.driver = driver;
    }
    //Локатор кнопки "Добавить в корзину"
    By addButton = By.xpath("//button[@type='submit'][@title='Добавить в корзину']");
    //Локатор кнопки перехода в корзину
    By cartIcon = By.cssSelector("a.link[title='Корзина']");
    //Добавить в корзину
    public void addToCart() {
        Base.click(addButton);
    }
    //Переход в корзину
    public void goToCart()
    {
        try
        {
            Thread.sleep(10000); // 10 секунд ожидания, т.к. товар не сразу появляется в корзине при переходе по ссылке, если ожидание не прописать
        }
        catch(InterruptedException e)
        {
        }
        Base.click(cartIcon);
    }
}