package com.marinatest.steps;

import com.marinatest.pages.LandingPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import javax.inject.Inject;

public class LandingPageSteps {

    private WebDriver webDriver;
    private final LandingPage landingPage;

    @Inject
    public LandingPageSteps (WebDriver webDriver) {
        this.webDriver = webDriver;
        landingPage= PageFactory.initElements(this.webDriver, LandingPage.class);
    }

    @After
    public void testCleanup()
    {
        webDriver.quit();
    }

    @Given("^I open the landing page$")
    public void iOpenTheLandingPage() {
        landingPage.goToLandingPage();
    }

    @Then("^The page title should be \"(.*?)\"$")
    public void pageTitleIsCorrect (String pageTitle) {
        Assert.assertTrue("UI Testing Site", landingPage.pageTitleIsCorrect(pageTitle));
    }

    @Then("^The company logo should be visible$")
    public void companyLogoShouldBeVisible () {
    Assert.assertTrue(landingPage.isLogoDisplayed());
    }

    @Then("^The H1 text should contain welcome sentence$")
    public void h1TextShouldContainWelcomeSentence() {
        landingPage.h1TextShouldContainWelcomeSentence();
    }

    @Then("^The paragraph should contain the testing text$")
    public void paragraphShouldContainTestingText () {
        landingPage.paragraphTextShouldContainTestingText();
    }

}
