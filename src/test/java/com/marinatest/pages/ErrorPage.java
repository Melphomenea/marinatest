package com.marinatest.pages;

import org.openqa.selenium.WebDriver;

public class ErrorPage extends BasePage<ErrorPage> {

    public ErrorPage (WebDriver driver) {super(driver);}

    public void goToErrorPage() {
        driver.get("http://uitest.duodecadits.com/error");}

    @Override
    public boolean isCorrectPage() {
        return driver.getTitle().equalsIgnoreCase("404 Error: File not found :-)"); }

    @Override
    protected ErrorPage getThis() {return this;}

}
