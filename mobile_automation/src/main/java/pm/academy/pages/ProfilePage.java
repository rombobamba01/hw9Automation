package pm.academy.pages;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.function.IntPredicate;

public class ProfilePage extends BasePage {
    @AndroidFindBy(accessibility = "SIGN UP")
    private MobileElement RegButton;

    @AndroidFindBy(accessibility = "LOGIN")
    private MobileElement Login;

    @AndroidFindBy(accessibility = "USERNAME")
    private MobileElement HeadTitleOfProfilepage;
    @AndroidFindBy(xpath = "//*[@text='Спорт']")
    private MobileElement SportsButton;


    public boolean isHeadTitleOfProfilepageDisplayed() {
        return waitForExpectedElement(HeadTitleOfProfilepage).isDisplayed();
    }

    public boolean isLoginButtonDisplayed() {
        return waitForExpectedElement(Login).isDisplayed();
    }

    public boolean isRegButtonDisplayed() {
        return waitForExpectedElement(RegButton).isDisplayed();
    }

    public void clickSportsButtonDisplayed() {
        waitForExpectedElement(SportsButton).click();
    }
}
