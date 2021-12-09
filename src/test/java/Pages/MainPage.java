package Pages;

import Base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MainPage extends Base
{

    //Кнопка скачать
   private static final By downloadBtn = By.cssSelector("a.js-download");
   private static final By photoSelect = By.cssSelector("article.photo-item");

    //Наведение курсора на фото
    public static void moveToPhoto()
    {
        WebElement photo = wait.until(ExpectedConditions.visibilityOfElementLocated(photoSelect));
        Actions actions = new Actions(driver);
        actions.moveToElement(photo);
        actions.perform();
    }

    //Клик на кнопку скачать
    public static void downloadClick()
    {
        Base.click(downloadBtn);
        try
        {
            Thread.sleep(5000); // 5 секунд ожидания загрузки
        }
        catch (InterruptedException e)
        {
        }
    }
}
