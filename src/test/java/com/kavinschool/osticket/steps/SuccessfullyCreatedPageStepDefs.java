package com.kavinschool.osticket.steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.kavinschool.osticket.hooks.DriverFactory;
import com.kavinschool.osticket.pages.SuccessfullyCreatedPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class SuccessfullyCreatedPageStepDefs {

    private WebDriver driver;
    private SuccessfullyCreatedPage successfullyCreatedPage;

    public SuccessfullyCreatedPageStepDefs(DriverFactory driverFactory) {
        driver = driverFactory.getDriver();
        successfullyCreatedPage
                = PageFactory.initElements(driver, SuccessfullyCreatedPage.class);
    }

    @When("^I waited for a new created message shows up with \"([^\"]*)\"$")
    public void iWaitedForANewCreatedMessageShowsUpWith(String expectedText) throws Throwable {
        successfullyCreatedPage.waitForMessageHeaderLabel(expectedText);
    }

    @And("^I verify that the message contains first name \"([^\"]*)\" and email address \"([^\"]*)\"$")
    public void iVerifyThatTheMessageContainsFirstNameAndEmailAddress(String expectedFirstName, String expectedEmail) throws Throwable {
        String actualLabel = successfullyCreatedPage.getSuccessMessageLabel();
        Assert.assertTrue("Checked for expected name", actualLabel.contains(expectedFirstName));

        actualLabel = successfullyCreatedPage.getSuccessEmailLabel();
        Assert.assertTrue("Checked for expected Email", actualLabel.contains(expectedEmail));
    }
}
