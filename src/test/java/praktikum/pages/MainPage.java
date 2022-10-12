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

    //кнопка для куков "да все привыкли"
    private By buttonAcceptCookies = By.xpath("//button[text() = 'да все привыкли']");
    //элемент web-страницы со списком вопросов
    private By elementWithQuestions = By.xpath("//div[@class = 'accordion']");
    //первый вопрос
    private By questionThePrice = By.xpath("//div[@id= 'accordion__heading-0']");
    //второй вопрос
    private By questionSeveralScooters = By.xpath("//div[@id= 'accordion__heading-1']");
    //третий вопрос
    private By questionRentalTime = By.xpath("//div[@id= 'accordion__heading-2']");
    //четвертый вопрос
    private By questionOrderToday = By.xpath("//div[@id= 'accordion__heading-3']");
    //пятый вопрос
    private By questionReturnScooter = By.xpath("//div[@id= 'accordion__heading-4']");
    //шестой вопрос
    private By questionScooterCharging = By.xpath("//div[@id= 'accordion__heading-5']");
    //седьмой вопрос
    private By questionCancelOrder = By.xpath("//div[@id= 'accordion__heading-6']");
    //восьмой вопрос
    private By questionLifeMoscowRingRoad = By.xpath("//div[@id= 'accordion__heading-7']");
    //текст первого вопрос
    private By textOneQuestion = By.xpath("//div[@id= 'accordion__panel-0']");
    //текст второго вопроса
    private By textTwoQuestion = By.xpath("//div[@id= 'accordion__panel-1']");
    //текст третьего вопроса
    private By textThreeQuestion = By.xpath("//div[@id= 'accordion__panel-2']");
    //текст четвертого вопроса
    private By textForeQuestion = By.xpath("//div[@id= 'accordion__panel-3']");
    //текст пятого вопроса
    private By textFiveQuestion = By.xpath("//div[@id= 'accordion__panel-4']");
    //текст шестого вопроса
    private By textSixQuestion = By.xpath("//div[@id= 'accordion__panel-5']");
    //текст седьмого вопроса
    private By textSevenQuestion = By.xpath("//div[@id= 'accordion__panel-6']");
    //текст восьмого вопроса
    private By textEightQuestion = By.xpath("//div[@id= 'accordion__panel-7']");

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

    public void acceptCookies(){
        driver.findElement(buttonAcceptCookies).click();
    }

    public void clickOnTopicQuestionOne(){
        WebElement element = driver.findElement(elementWithQuestions);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(questionThePrice).click();

    }
    public void clickOnTopicQuestionTwo(){
        WebElement element = driver.findElement(elementWithQuestions);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(questionSeveralScooters).click();

    }

    public void clickOnTopicQuestionThree(){
        WebElement element = driver.findElement(elementWithQuestions);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(questionRentalTime).click();

    }

    public void clickOnTopicQuestionFour(){
        WebElement element = driver.findElement(elementWithQuestions);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(questionOrderToday).click();

    }

    public void clickOnTopicQuestionFive(){
        WebElement element = driver.findElement(elementWithQuestions);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(questionReturnScooter).click();
    }

    public void clickOnTopicQuestionSix(){
        WebElement element = driver.findElement(elementWithQuestions);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(questionScooterCharging).click();
    }

    public void clickOnTopicQuestionSeven(){
        WebElement element = driver.findElement(elementWithQuestions);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(questionCancelOrder).click();
    }
    public void clickOnTopicQuestionEight(){
        WebElement element = driver.findElement(elementWithQuestions);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(questionLifeMoscowRingRoad).click();
    }

    public String getQuestionTextOne(){
        driver.findElement(textOneQuestion).getText();
        return driver.findElement(textOneQuestion).getText();
    }

    public String getQuestionTextTwo(){
        driver.findElement(textTwoQuestion).getText();
        return driver.findElement(textTwoQuestion).getText();
    }
    public String getQuestionTextThree(){
        driver.findElement(textThreeQuestion).getText();
        return driver.findElement(textThreeQuestion).getText();
    }
    public String getQuestionTextFore(){
        driver.findElement(textForeQuestion).getText();
        return driver.findElement(textForeQuestion).getText();
    }
    public String getQuestionTextFive(){
        driver.findElement(textFiveQuestion).getText();
        return driver.findElement(textFiveQuestion).getText();
    }

    public String getQuestionTextSix(){
        driver.findElement(textSixQuestion).getText();
        return driver.findElement(textSixQuestion).getText();
    }

    public String getQuestionTextSeven(){
        driver.findElement(textSevenQuestion).getText();
        return driver.findElement(textSevenQuestion).getText();
    }
    public String getQuestionTextEight(){
        driver.findElement(textEightQuestion).getText();
        return driver.findElement(textEightQuestion).getText();
    }

}
