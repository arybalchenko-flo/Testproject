package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {

    WebDriver driver;
  //Драйвер
    public MainPage(WebDriver driver) {
        this.driver=driver;
    }
  //Поле для поиска
    By searchbar = By.className("input__field");
  //Поиск
    public void search() {
        driver.findElement(searchbar).sendKeys("MGMT3RU/A\n");
    }
}
