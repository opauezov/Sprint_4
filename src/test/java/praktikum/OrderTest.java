package praktikum;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import praktikum.pages.MainPage;
import praktikum.pages.OrderPage;


public class OrderTest {
//    private static ChromeDriver driver;
    private static FirefoxDriver driver;

    @BeforeClass
    public static void setupClass() {
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
    }

    @Test
    //Test 1
    public void checkOrderCreation1() {

        //Переход на страницу тестового приложения
        driver.get("https://qa-scooter.praktikum-services.ru/");
        driver.manage().window().maximize();

        //Нажать кнопку «Заказать»
        MainPage mainPage = new MainPage(driver);
        mainPage.moveToBodyOrderButton();
        mainPage.clickBodyOrderButton();

        //Заполнить форму заказа
        OrderPage orderPage = new OrderPage(driver);
        orderPage.setName("Иван");
        orderPage.setSurname("Иванов");
        orderPage.setAddress("Москва, Красная площадь1");
        orderPage.clickMetroDropdown();
        orderPage.clickMetroSelect();
        orderPage.setPhone("+7999999999");
        orderPage.clickFurtherButton();
        orderPage.setData("14.01.2022");
        orderPage.clickOnHeader();
        orderPage.clickSelectDaysDropdown();
        orderPage.clickSelectOneDay();
        orderPage.clickBlackColourCheckbox();
        orderPage.clickCreateOrderButton();
        orderPage.clickOrderButtonYes();

        //Проверить, что появилось всплывающее окно с сообщением об успешном создании заказа
        orderPage.waitForOrderCreated();
    }

    @Test
    //Test 2
    public void checkOrderCreation2() {

        //Переход на страницу тестового приложения
        driver.get("https://qa-scooter.praktikum-services.ru/");
        driver.manage().window().maximize();

        //Нажать кнопку «Заказать»
        MainPage mainPage = new MainPage(driver);
        mainPage.clickHeaderOrderButton();

        //Заполнить форму заказа
        OrderPage orderPage = new OrderPage(driver);
        orderPage.setName("Петр");
        orderPage.setSurname("Петров");
        orderPage.setAddress("Омск, Ленина 2");
        orderPage.clickMetroDropdown();
        orderPage.clickMetroSelect();
        orderPage.setPhone("+71111111111");
        orderPage.clickFurtherButton();
        orderPage.setData("22.02.2022");
        orderPage.clickOnHeader();
        orderPage.clickSelectDaysDropdown();
        orderPage.clickSelectTwoDays();
        orderPage.clickGreyColourCheckbox();
        orderPage.clickCreateOrderButton();
        orderPage.clickOrderButtonYes();

        //Проверить, что появилось всплывающее окно с сообщением об успешном создании заказа
        orderPage.waitForOrderCreated();
    }

    @After
    public void tearDown() {
        // Закрой браузер
        driver.quit();
    }
}
