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
    By addbutton = By.xpath("//button[@type='submit'][@title='Добавить в корзину']");

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