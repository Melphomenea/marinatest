package com.marinatest.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandingPage extends BasePage<LandingPage> {

    public LandingPage(WebDriver driver) {super(driver);}

    public void goToLandingPage() {
        driver.get("http://uitest.duodecadits.com/");}

    @Override
    public boolean isCorrectPage() {
        return driver.getTitle().equalsIgnoreCase("UI Testing Site"); }

    @Override
    protected LandingPage getThis() {return this;}


    /*=================================================================*/

    @FindBy (xpath = "//a[@id='form']")
    private WebElement navForm;

    @FindBy (xpath = "//a[@id='error']")
    private WebElement navError;

    @FindBy (xpath = "//li[@class='active']")
    private WebElement activeNav;

    @FindBy(id="dh_logo")
    private WebElement dhLogo;

    @FindBy(xpath = "//h1")
    private WebElement h1;

    @FindBy(className = "lead")
    private WebElement paragraphText;
    /*=================================================================*/

    /* Check if the page title is correct*/
    public boolean pageTitleIsCorrect(String pageTitle) {
       String title = driver.getTitle();
       return title!=null && title.toLowerCase().contains(pageTitle.toLowerCase());
    }

    public boolean isLogoDisplayed() {
        return dhLogo.isDisplayed();
    }

    public void h1TextShouldContainWelcomeSentence() {
        Assert.assertEquals("Welcome to the Docler Holding QA Department",h1.getText());
    }

    public void paragraphTextShouldContainTestingText() {
        Assert.assertEquals("This site is dedicated to perform some exercises and demonstrate automated web testing.", paragraphText.getText());
    }

    public void clickFormNavbar() {
        navForm.click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        boolean done = wait.until(ExpectedConditions.textToBePresentInElement(navForm, "Form"));
        Assert.assertTrue(done);
    }

    public void clickErrorNavbar() {
        navError.click();

    }

    public void isElementActive() {
        Assert.assertEquals(activeNav.getAttribute("class"), "active");
    }


}
