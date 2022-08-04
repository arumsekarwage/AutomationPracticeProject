package StepDefinitions;

import PageObjects.HomePagePageObjects;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;

import java.time.Duration;

import static Utilities.Hooks.driver;

public class HomePageSteps {

    HomePagePageObjects HomePage;

    @Given("I navigate to Automation Practice website")
    public void iNavigateToAutomationPracticeWebsite() throws InterruptedException {
        HomePage = new HomePagePageObjects(driver);
        HomePage.NavigateToWebsite();
        Thread.sleep(10000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        HomePage.HomePageTitle();
    }

    @When("I scroll around the home page")
    public void iScrollAroundTheHomePage() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
    }

    @Then("I will see the Call Us Now number")
    public void iWillSeeTheCallUsNowNumber() {
        HomePage.CallUsNowElementExists();
    }

    @And("I will see the three main tabs for Women, Dresses and T-shirts")
    public void iWillSeeTheThreeMainTabsForWomenDressesAndTShirts() {
        HomePage.WomenTabElementExists();
        HomePage.DressesTabElementExists();
        HomePage.TShirtsTabElementExists();
    }

    @And("I will see another two main tabs for Popular and Best Sellers")
    public void iWillSeeAnotherTwoMainTabsForPopularAndBestSellers() {
        HomePage.PopularTabElementExists();
        HomePage.BestSellersTabElementExists();
    }

    @And("I will see the Follow Us section which redirects to their Social Media pages")
    public void iWillSeeTheFollowUsSectionWhichRedirectsToTheirSocialMediaPages() {
        HomePage.FacebookElementExists();
        HomePage.TwitterElementExists();
        HomePage.YoutubeElementExists();
        HomePage.GooglePlusElementExists();
    }

    @When("I hover to Woman tab")
    public void iHoverToWomanTab() {
        HomePage.MouseOverWomenTab();
    }

    @Then("I will see the Tops and Dresses category")
    public void iWillSeeTheTopsAndDressesCategory() {
        HomePage.TopsCategoryElementExists();
        HomePage.DressesCategoryElementExists();
    }

    @When("I click the Woman tab")
    public void iClickTheWomanTab() {
        HomePage.ClickWomenTab();
    }

    @Then("I will be redirected to Women tab page")
    public void iWillBeRedirectedToWomenTabPage() {
        HomePage.WomenTabPage();
    }

    @When("I hover to Dresses tab")
    public void iHoverToDressesTab() {
        HomePage.MouseOverDressesTab();
    }

    @Then("I will see the Casual, Evening, and Summer Dresses category")
    public void iWillSeeTheCasualEveningAndSummerDressesCategory() {
        HomePage.CasualCategoryElementExists();
        HomePage.EveningCategoryElementExists();
        HomePage.SummerCategoryElementExists();
    }

    @When("I click the Dresses tab")
    public void iClickTheDressesTab() {
        HomePage.ClickDressesTab();
    }

    @Then("I will be redirected to Dresses tab page")
    public void iWillBeRedirectedToDressesTabPage() {
        HomePage.DressTabPage();
    }

    @When("I click the T-shirts tab")
    public void iClickTheTShirtsTab() {
        HomePage.ClickTshirtsTab();
    }

    @Then("I will be redirected to T-shirts tab page")
    public void iWillBeRedirectedToTShirtsTabPage() {
        HomePage.TshirtsTabPage();
    }

    @When("I click Contact Us button")
    public void iClickContactUsButton() {
    }

    @Then("I will navigate to Contact Us Page")
    public void iWillNavigateToContactUsPage() {
    }

    @And("I fill all the empty fields in the Send a Message section")
    public void iFillAllTheEmptyFieldsInTheSendAMessageSection() {
    }

    @When("I click Send button")
    public void iClickSendButton() {
    }

    @Then("There will be green successful message")
    public void thereWillBeGreenSuccessfulMessage() {
    }

    @When("I click the Sign In button")
    public void iClickTheSignInButton() {
    }

    @Then("I will navigate to Sign In page")
    public void iWillNavigateToSignInPage() {
    }

    @When("I click Specials on its Information section")
    public void iClickSpecialsOnItsInformationSection() {
    }

    @Then("I will navigate to Specials page")
    public void iWillNavigateToSpecialsPage() {
    }

    @Then("I will navigate to New Products page")
    public void iWillNavigateToNewProductsPage() {
    }

    @Then("I will navigate to Best Sellers page")
    public void iWillNavigateToBestSellersPage() {
    }

    @Then("I will navigate to Our Stores page")
    public void iWillNavigateToOurStoresPage() {
    }

    @Then("I will navigate to Terms and Conditions of Use page")
    public void iWillNavigateToTermsAndConditionsOfUsePage() {
    }

    @Then("I will navigate to About Us page")
    public void iWillNavigateToAboutUsPage() {
    }


}
