package praktikum.settings;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
    //    private static ChromeDriver driver;
    protected static FirefoxDriver driver;
    protected static final String URL = "https://qa-scooter.praktikum-services.ru/";

    @Before
    public void setupClass() {
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get(URL);
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
        // Закрой браузер
        driver.quit();
    }
}
