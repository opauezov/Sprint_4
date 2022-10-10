package praktikum.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class OrderPage {
    private WebDriver driver;
    //Заголовок страницы заказа
    private By header = By.className("Order_Header__BZXOb");

    //Поле Имя
    private By nameField = By.xpath("//*[@class=\"Order_Form__17u6u\"]/div[1]/input");
    //Поле Фамилия
    private By surnameField = By.xpath("//*[@class=\"Order_Form__17u6u\"]/div[2]/input");
    //Поле адреса
    private By addressField = By.xpath("//*[@class=\"Order_Form__17u6u\"]/div[3]/input");
    //Дропдаун выбора метро
    private By metroDropdown = By.className("select-search__input");
    //Список метро
    private By metroSelect = By.className("select-search__select");
    //Поле телефон
    private By phoneField = By.xpath("//*[@class=\"Order_Form__17u6u\"]/div[5]/input");
    //Кнопка далее
    private By furtherButton = By.xpath("//*[@class=\"Order_NextButton__1_rCA\"]/button");

    //Поле выбора даты
    private By dataField = By.xpath("//*[@class=\"react-datepicker-wrapper\"]/div/input");
    //Календарь
    private By selectDaysDropdown = By.className("Dropdown-control");
    //Поля срока аренды
    private By selectOneDay = By.xpath("//*[@class=\"Dropdown-menu\"]/div[1]");
    private By selectTwoDays = By.xpath("//*[@class=\"Dropdown-menu\"]/div[2]");
    //Поля выбора цвета самоката
    private By blackColourCheckbox = By.xpath("//*[@class=\"Order_Checkboxes__3lWSI\"]/label[1]");
    private By greyColourCheckbox = By.xpath("//*[@class=\"Order_Checkboxes__3lWSI\"]/label[2]");
    //Кнопка создания заказа
    private By createOrderButton = By.xpath("//*[@class=\"Order_Buttons__1xGrp\"]/button[2]");

    //Кнопка подтверждения создания заказа
    private By orderButtonYes = By.xpath("//*[@class='Button_Button__ra12g Button_Middle__1CSJM' and contains(text(),'Да')]");

    //Окно подтверждения создания заказа
    private By orderCreated = By.xpath("//*[@class='Order_ModalHeader__3FDaJ' and contains(text(),'Заказ оформлен')]");


    public OrderPage (WebDriver driver){
        this.driver = driver;
    }

    public void setName(String name) {
        driver.findElement(nameField).sendKeys(name);
    }
    public void setSurname(String surname) {
        driver.findElement(surnameField).sendKeys(surname);
    }
    public void setAddress(String address) {
        driver.findElement(addressField).sendKeys(address);
    }
    public void clickMetroDropdown() {
        driver.findElement(metroDropdown).click();
    }
    public void clickMetroSelect() {
        driver.findElement(metroSelect).click();
    }
    public void setPhone(String phone) {
        driver.findElement(phoneField).sendKeys(phone);
    }
    public void clickFurtherButton() {
        driver.findElement(furtherButton).click();
    }
    public void setData(String data) {
        driver.findElement(dataField).sendKeys(data);
    }
    public void clickOnHeader(){
        driver.findElement(header).click();
    }
    public void clickSelectDaysDropdown() {
        driver.findElement(selectDaysDropdown).click();
    }
    public void clickSelectOneDay() {
        driver.findElement(selectOneDay).click();
    }
    public void clickSelectTwoDays() {
        driver.findElement(selectTwoDays).click();
    }
    public void clickBlackColourCheckbox() {
        driver.findElement(blackColourCheckbox).click();
    }
    public void clickGreyColourCheckbox() {
        driver.findElement(greyColourCheckbox).click();
    }
    public void clickCreateOrderButton() {
        driver.findElement(createOrderButton).click();
    }
    public void clickOrderButtonYes() {
        driver.findElement(orderButtonYes).click();
    }
    public void waitForOrderCreated(){
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOfElementLocated(orderCreated));
    }
    public String getOrderCreatedText() {
        String text = driver.findElement(orderCreated).getText();
        return text;
    }

}
