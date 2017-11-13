package com.marinatest.steps;

import com.marinatest.pages.ErrorPage;
import com.marinatest.pages.FormPage;
import com.marinatest.pages.LandingPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import javax.inject.Inject;

public class NavigationBarSteps {

    private WebDriver webDriver;
    private final LandingPage landingPage;
    private final FormPage formPage;
    private final ErrorPage errorPage;

    @Inject
    public NavigationBarSteps (WebDriver webDriver) {
        this.webDriver = webDriver;
        landingPage = PageFactory.initElements(this.webDriver, LandingPage.class);
        formPage = PageFactory.initElements(this.webDriver, FormPage.class);
        errorPage = PageFactory.initElements(this.webDriver, ErrorPage.class);
    }

    @After
    public void testCleanup()
    {
        webDriver.quit();
    }


    @And("^I click the UI Testing Button in the Navbar$")
    public void iClickUITestingButton() {
        formPage.clickUITestingButton();
    }

    @When("^I click on the Homepage in the header$")
    public void clickHomepageNavbar () {
        formPage.clickHomepageNavbar();
    }

    @When("^I click the Form button in the header$")
    public void clickFormNavbar() {
        landingPage.clickFormNavbar();
    }

    @Then ("^Homepage becomes active element$")
    public void navHomepageIsActive() {
        landingPage.isElementActive();
    }

    @Then ("^Form Page becomes active element$")
    public void navFormPageIsActive() {
        formPage.isElementActive();
    }

    @Then("^I should navigate to the Form Page$")
    public void iShouldNavigateToFormPage() {
        formPage.isFormPageDisplayed();
    }

    @When("^I click the Error button in the header$")
    public void clickErrorNavbar () {
        landingPage.clickErrorNavbar();
    }

    @Then("^I should navigate to Error Page$")
    public void iShouldNavigatetoErrorPage() {
        Assert.assertTrue(errorPage.isCorrectPage());
    }

}
