package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;


public class CartPage {
    WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    //Кнопка удалить
    By delfromcart = By.xpath("//div[@class='c-cart-item__delete-wrapper']/descendant::span/descendant::div/descendant::span/descendant::a[2]");
    //Подтвердить удаление
   // By confirmdel = By.xpath("/html/body/div[10]/div/div[2]/div/a");
    By confirmdel = By.xpath("//div[@class='c-popup__content']/descendant::div/descendant::a");
    By emptycart = By.cssSelector("div.c-cart__empty");



    //Удаление из корзины
    public void clickDelete() {
        driver.findElement(delfromcart).click();

        driver.findElement(confirmdel).click();
    }
//Чек пустой корзины
    public void emptycart() {
        try {
            driver.findElement(emptycart);
        }
        catch (NoSuchElementException e) {
            System.out.println("Cart is not empty");
        }
    }
}

