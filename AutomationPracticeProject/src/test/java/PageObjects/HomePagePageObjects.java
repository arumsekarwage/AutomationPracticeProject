package PageObjects;

import Utilities.Hooks;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class HomePagePageObjects {

    WebDriver driver;

    public HomePagePageObjects(WebDriver driver) {
        this.driver = Hooks.driver;
        PageFactory.initElements(driver, this);
    }
    public void NavigateToWebsite() throws InterruptedException {
        driver.get("https://automationpractice.com/");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
        Thread.sleep(7000);
    }
    public void HomePageTitle() {
        Assert.assertEquals("My Store", driver.getTitle());
    }
    public void CallUsNowElementExists() {
        Assert.assertEquals("0123-456-789", driver.findElement(By.xpath("//strong[text()[contains(.,'0123-456-789')]]")));
    }
    public void WomenTabElementExists() {
        driver.findElement(By.xpath("(//a[text()[contains(.,'Women')]])[0]")).isDisplayed();
    }
    public void DressesTabElementExists() {
        driver.findElement(By.xpath("(//a[text()[contains(.,'Dresses')]])[4]")).isDisplayed();
    }
    public void TShirtsTabElementExists() {
        driver.findElement(By.xpath("(//a[text()[contains(.,'T-shirts')]])[1]")).isDisplayed();
    }
    public void PopularTabElementExists() {
        driver.findElement(By.xpath("//a[text()[contains(.,'Popular')]]")).isDisplayed();
    }
    public void BestSellersTabElementExists() {
        driver.findElement(By.xpath("//a[text()[contains(.,'Best Sellers')]]")).isDisplayed();
    }
    public void FacebookElementExists() {
        driver.findElement(By.cssSelector("a[href='https://www.facebook.com/groups/525066904174158/']")).isDisplayed();
    }
    public void TwitterElementExists() {
        driver.findElement(By.cssSelector("a[href='https://twitter.com/seleniumfrmwrk']")).isDisplayed();
    }
    public void YoutubeElementExists() {
        driver.findElement(By.cssSelector("a[href='https://www.youtube.com/channel/UCHl59sI3SRjQ-qPcTrgt0tA']")).isDisplayed();
    }
    public void GooglePlusElementExists() {
        driver.findElement(By.cssSelector("a[href='https://plus.google.com/111979135243110831526/posts']")).isDisplayed();
    }
    public void MouseOverWomenTab() {
        Actions builder = new Actions(driver);
        builder.moveToElement(driver.findElement(By.xpath("(//a[text()[contains(.,'Women')]])[0]"))).perform();
    }
    public void TopsCategoryElementExists() {
        driver.findElement(By.cssSelector("a[title='Tops']")).isDisplayed();
    }
    public void DressesCategoryElementExists() {
        driver.findElement((By.cssSelector("(a[title='Dresses'])[0]"))).isDisplayed();
    }
    public void ClickWomenTab(){
        driver.findElement(By.xpath("(//a[text()[contains(.,'Women')]])[0]")).click();
    }
    public void WomenTabPage(){
        driver.findElement(By.xpath("//strong[text()[contains(.,'You will find here all woman fashion collections.')]]")).isDisplayed();
    }
    public void MouseOverDressesTab() {
        Actions builder = new Actions(driver);
        builder.moveToElement(driver.findElement(By.xpath("(//a[text()[contains(.,'Dresses')]])[0]"))).perform();
    }
    public void CasualCategoryElementExists() {
        driver.findElement(By.xpath("(//a[text()[contains(.,'Casual Dresses')]])[0]")).isDisplayed();
    }
    public void EveningCategoryElementExists() {
        driver.findElement(By.xpath("(//a[text()[contains(.,'Evening Dresses')]])[0]")).isDisplayed();
    }
    public void SummerCategoryElementExists() {
        driver.findElement(By.xpath("(//a[text()[contains(.,'Summer Dresses')]])[0]")).isDisplayed();
    }
    public void ClickDressesTab() {
        driver.findElement(By.xpath("(//a[text()[contains(.,'Dresses')]])[4]")).click();
    }
    public void DressTabPage() {
        driver.findElement(By.xpath("//p[text()[contains(.,'Find your favorites dresses from our wide choice of evening, casual or summer dresses!')]]")).isDisplayed();
    }
    public void ClickTshirtsTab() {
        driver.findElement(By.xpath("(//a[text()[contains(.,'T-shirts')]])[0]")).click();
    }
    public void TshirtsTabPage() {
        driver.findElement(By.xpath("//p[text()[contains(.,'The must have of your wardrobe, take a look at our different colors,')]]")).isDisplayed();
    }
    public void ClickContactUs() {

    }
    public void ContactUsPage() {

    }
    public void SendAMessage() {

    }
    public void ClickSend() {

    }
    public void GreenMessage() {

    }
    public void ClickSignIn() {

    }
    public void SignInPage() {

    }
    public void ClickSpecials() {

    }
    public void SpecialsPage() {

    }
}
