package Pages;

import Base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends Base
{
    public MainPage(WebDriver driver)
    {
        Base.driver=driver;
    }
  //Поле для поиска
    By searchBar = By.className("input__field");
  // Поиск
    public void search(String keysToSend)
    {
        Base.sendKey(searchBar, keysToSend);
    }
}
