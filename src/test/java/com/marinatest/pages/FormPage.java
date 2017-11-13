package com.marinatest.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FormPage extends BasePage<FormPage> {

    public FormPage (WebDriver driver) {super(driver);}

    public void goToFormPage() {
        driver.get("http://uitest.duodecadits.com/form.html");}

    @Override
    public boolean isCorrectPage() {
        return driver.getTitle().equalsIgnoreCase("UI Testing Site"); }

    @Override
    protected FormPage getThis() {return this;}

    /*=================================================================*/

    @FindBy(xpath = "//a[@id='site']")
    private WebElement uiTestingButton;

    @FindBy(xpath="//a[@id='home']")
    private WebElement navHomepage;

    @FindBy(xpath = "//h1")
    private WebElement h1;

    @FindBy(id="dh_logo")
    private WebElement dhLogo;

    @FindBy (xpath = "//li[@class='active']")
    private WebElement activeNav;

    @FindBy(className="input-group")
    private WebElement formGroup;

    @FindBy(id="hello-input")
    private WebElement formInput;

    @FindBy(id="hello-submit")
    private WebElement formSubmit;

    /*=================================================================*/

    public boolean pageTitleIsCorrect(String pageTitle) {
        String title = driver.getTitle();
        return title!=null && title.toLowerCase().contains(pageTitle.toLowerCase());
    }

    public void isElementActive() {
        Assert.assertEquals(activeNav.getAttribute("class"), "active");
    }

    public void clickHomepageNavbar () {
        navHomepage.click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        boolean done = wait.until(ExpectedConditions.textToBePresentInElement(navHomepage, "Home"));
        Assert.assertTrue(done);
    }

    public void clickUITestingButton() {
        uiTestingButton.click();
    }

    public boolean isLogoDisplayed() {
        return dhLogo.isDisplayed();
    }

    public void isFormPageDisplayed() {
        Assert.assertEquals("Simple Form Submission",h1.getText());
    }

    public boolean isFormDisplayed() {
        return formGroup.isDisplayed();
    }

    public boolean isInputBoxDisplayed() {
        return formInput.isDisplayed();
    }

    public boolean isSubmitButtonDisplayed() {
        return formSubmit.isDisplayed();
    }

    public void iTypeAValueInTheFormField(String formValue) {
        formInput.sendKeys(formValue); }

    public void iClickSubmitButton() {
        formSubmit.click();
    }


}
