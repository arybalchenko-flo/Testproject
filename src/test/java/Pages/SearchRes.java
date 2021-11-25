package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SearchRes {

    WebDriver driver;

    //Драйвер
    public SearchRes(WebDriver driver) {
        this.driver = driver;
    }

    //Добавить в корзину
    By addbutton = By.xpath("/html/body/mvid-root/div/mvid-srp/mvid-layout/div/main/mvid-product-list-block/div[2]/mvid-product-list/mvid-plp-product-cards-layout/div/mvid-product-cards-row/div[1]/mvid-plp-product-checkout[1]/div/div[1]/mvid-plp-checkout-tooltip/mvid-plp-cart-button/mvid-button/button/span");

    //Переход в корзину
    By carticon = By.cssSelector("a.link[title='Корзина']");


    //Добавить в корзину
    public void addtocart() {
        driver.findElement(addbutton).click();
    }
    //Переход в корзину
    public void gotocart() {
        try
        {
            Thread.sleep(10000); // 10 секунд ожидания, т.к. товар не сразу появляется в корзине при переходе по ссылке если ожидание не прописать
        }
        catch(InterruptedException e){};
        driver.findElement(carticon).click();
    }
}