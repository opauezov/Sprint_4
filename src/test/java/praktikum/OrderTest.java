package praktikum;

import org.junit.Test;
import praktikum.pages.MainPage;
import praktikum.pages.OrderPage;
import praktikum.settings.BaseTest;

import static org.junit.Assert.assertTrue;


public class OrderTest extends BaseTest {

    @Test
    //Test 1
    public void checkOrderCreation1() {

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
        String actualString = orderPage.getOrderCreatedText();
        assertTrue(actualString.contains("Заказ оформлен"));
    }

    @Test
    //Test 2
    public void checkOrderCreation2() {

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
        String actualString = orderPage.getOrderCreatedText();
        assertTrue(actualString.contains("Заказ оформлен"));
    }

}
