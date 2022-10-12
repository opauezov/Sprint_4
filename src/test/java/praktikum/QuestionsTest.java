package praktikum;

import org.hamcrest.MatcherAssert;
import org.junit.Test;
import praktikum.pages.MainPage;
import praktikum.settings.BaseTest;

import static org.hamcrest.CoreMatchers.containsString;


public class QuestionsTest extends BaseTest {

    @Test
    public void shouldOpenAndCheckTextForOneQuestion() {
        MainPage mainPage = new MainPage(driver);
        mainPage.acceptCookies();
        mainPage.clickOnTopicQuestionOne();
        String expected = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
        String actual = mainPage.getQuestionTextOne();
        MatcherAssert.assertThat("Текст не соответсвует ожидаемому результату", actual, containsString(expected));
    }

    @Test
    public void shouldOpenAndCheckTextForTwoQuestion() {
        MainPage mainPage = new MainPage(driver);
        mainPage.acceptCookies();
        mainPage.clickOnTopicQuestionTwo();
        String expected = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
        String actual = mainPage.getQuestionTextTwo();
        MatcherAssert.assertThat("Текст не соответсвует ожидаемому результату", actual, containsString(expected));
    }

    @Test
    public void shouldOpenAndCheckTextForThreeQuestion() {
        MainPage mainPage = new MainPage(driver);
        mainPage.acceptCookies();
        mainPage.clickOnTopicQuestionThree();
        String expected = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
        String actual = mainPage.getQuestionTextThree();
        MatcherAssert.assertThat("Текст не соответсвует ожидаемому результату", actual, containsString(expected));
    }

    @Test
    public void shouldOpenAndCheckTextForFourQuestion() {
        MainPage mainPage = new MainPage(driver);
        mainPage.acceptCookies();
        mainPage.clickOnTopicQuestionFour();
        String expected = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
        String actual = mainPage.getQuestionTextFore();
        MatcherAssert.assertThat("Текст не соответсвует ожидаемому результату", actual, containsString(expected));
    }

    @Test
    public void shouldOpenAndCheckTextForFiveQuestion() {
        MainPage mainPage = new MainPage(driver);
        mainPage.acceptCookies();
        mainPage.clickOnTopicQuestionFive();
        String expected = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
        String actual = mainPage.getQuestionTextFive();
        MatcherAssert.assertThat("Текст не соответсвует ожидаемому результату", actual, containsString(expected));
    }

    @Test
    public void shouldOpenAndCheckTextForSixQuestion() {
        MainPage mainPage = new MainPage(driver);
        mainPage.acceptCookies();
        mainPage.clickOnTopicQuestionSix();
        String expected = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
        String actual = mainPage.getQuestionTextSix();
        MatcherAssert.assertThat("Текст не соответсвует ожидаемому результату", actual, containsString(expected));
    }

    @Test
    public void shouldOpenAndCheckTextForSevenQuestion() {
        MainPage mainPage = new MainPage(driver);
        mainPage.acceptCookies();
        mainPage.clickOnTopicQuestionSeven();
        String expected = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
        String actual = mainPage.getQuestionTextSeven();
        MatcherAssert.assertThat("Текст не соответсвует ожидаемому результату", actual, containsString(expected));
    }

    @Test
    public void shouldOpenAndCheckTextForEightQuestion() {
        MainPage mainPage = new MainPage(driver);
        mainPage.acceptCookies();
        mainPage.clickOnTopicQuestionEight();
        String expected = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";
        String actual = mainPage.getQuestionTextEight();
        MatcherAssert.assertThat("Текст не соответсвует ожидаемому результату", actual, containsString(expected));
    }

}
