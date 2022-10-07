package praktikum.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
    private WebDriver driver;
    //Кнопка заказать наверху страницы
    private By headerOrderButton = By.xpath("//*[@class=\"Header_Header__214zg\"][1]/div[2]/button[1]");
    //Кнопка заказать в центре страницы
    private By bodyOrderButton = By.xpath("//*[@class=\"Home_FinishButton__1_cWm\"]/button");

    public MainPage (WebDriver driver){
        this.driver = driver;
    }

    public void moveToBodyOrderButton() {
        WebElement element = driver.findElement(bodyOrderButton);
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].scrollIntoView()", element);
    }
    public void clickHeaderOrderButton() {
        driver.findElement(headerOrderButton).click();
    }
    public void clickBodyOrderButton() {
        driver.findElement(bodyOrderButton).click();
    }
}
