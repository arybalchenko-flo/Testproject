package Pages;

import Base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class CartPage extends Base
{
    public CartPage(WebDriver driver)
    {
        this.driver = driver;
    }
    //Кнопка удалить
    By delFromCart = By.xpath("//div[@class='c-cart-item__delete-wrapper']/descendant::span/descendant::div/descendant::span/descendant::a[2]");
    //Подтвердить удаление
    By confirmDel = By.xpath("//div[@class='c-popup__content']/descendant::div/descendant::a");
    By emptyCart = By.cssSelector("div.c-cart__empty");
    //Удаление из корзины
    public void clickDelete()
    {
        driver.findElement(delFromCart).click();
        driver.findElement(confirmDel).click();
    }
//Чек пустой корзины
    public void emptyCart()
    {
        try
        {
            driver.findElement(emptyCart);
            System.out.println("Goods deleted from cart successfully");
        }
        catch (NoSuchElementException e)
        {
            System.out.println("Cart is not empty");
        }
    }
}

