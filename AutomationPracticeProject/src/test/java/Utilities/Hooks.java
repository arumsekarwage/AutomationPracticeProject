package Utilities;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Hooks {

    public static WebDriver driver;

    @Before
    public void BeforeScenario() {
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.EAGER);
        System.setProperty("web-driver.chrome.driver","C:\\Users\\Arum\\IdeaProjects\\AutomationPracticeProject\\src\\test\\resources\\WebDriver\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }
    @BeforeStep
    public void BeforeStep() throws InterruptedException {
        Thread.sleep(2000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }
    @AfterStep
    public void AfterStep() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }
    @After
    public void AfterScenario() {
        driver.close();
        driver.quit();
    }
}