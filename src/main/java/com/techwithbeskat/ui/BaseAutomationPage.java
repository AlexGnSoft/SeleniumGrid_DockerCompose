package com.techwithbeskat.ui;

import com.techwithbeskat.webdriver.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Value;

import java.time.Duration;

public class BaseAutomationPage {

    protected static final By acceptAll = By.xpath("//*[@id='yDmH0d']/c-wiz/div/div/div/div[2]/div[1]/div[3]/div[1]/form[2]/div/div/button");

    @Value("${test.default.wait.seconds}")
    protected int defaultWaitTimeSeconds;

    public WebDriver getDriver() {
        return WebDriverFactory.getDriver();
    }

    public WebElement findElementWaitForVisible(By by) {
        return new WebDriverWait(getDriver(), Duration.ofSeconds(defaultWaitTimeSeconds)).until(
                ExpectedConditions.visibilityOfElementLocated(by));
    }
}
