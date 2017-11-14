package com.marinatest.steps;

import com.marinatest.pages.FormPage;
import com.marinatest.pages.HelloPage;
import com.marinatest.pages.LandingPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import javax.inject.Inject;

public class FormPageSteps {

    private WebDriver webDriver;
    private final FormPage formPage;
    private final LandingPage landingPage;
    private final HelloPage helloPage;

    @Inject
    public FormPageSteps (WebDriver webDriver) {
        this.webDriver = webDriver;
        formPage = PageFactory.initElements(this.webDriver, FormPage.class);
        landingPage = PageFactory.initElements(this.webDriver, LandingPage.class);
        helloPage = PageFactory.initElements(this.webDriver, HelloPage.class);
    }

    @Given("^I am on the form page$")
    public void iNavigateToTheFormPage() {
        formPage.goToFormPage();
    }

    @Then("^The page title on the FormPage should be \"(.*?)\"$")
    public void pageTitleIsCorrect (String pageTitle) {
        Assert.assertTrue("UI Testing Site", formPage.pageTitleIsCorrect(pageTitle));
    }

    @Then("^I should navigate to Home Page$")
    public void iShouldNavigateToHomePage () {
        Assert.assertTrue(landingPage.isCorrectPage());
    }

    @Then("^The company logo should be visible on the FormPage$")
    public void companyLogoShouldBeVisible () {
        Assert.assertTrue(formPage.isLogoDisplayed());
    }

    @Then("^A form should be visible$")
    public void formIsDisplayed() {
        Assert.assertTrue(formPage.isFormDisplayed());
    }

    @And("^Input box should be visible$")
    public void inputBoxDisplayed() {
        Assert.assertTrue(formPage.isInputBoxDisplayed());
    }

    @And("^Submit button should be visible$")
    public void submitButtonDisplayed() {
        Assert.assertTrue(formPage.isSubmitButtonDisplayed());
    }

    @And("^I type \"(.*?)\" in the form input field$")
    public void iTypeAValueInTheFormField (String formValue) {
        formPage.iTypeAValueInTheFormField(formValue);
    }

    @And("^I click Submit button$")
    public void iClickFormSubmitButton() {
        formPage.iClickSubmitButton();
    }

    @Then("^The text \"(.*?)\" should appear on the Hello page$")
    public void iShouldBeRedirectedToHelloPage(String formResult) {
        helloPage.isResultDisplayed(formResult);
    }
}
