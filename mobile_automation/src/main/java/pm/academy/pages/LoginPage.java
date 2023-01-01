package pm.academy.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginPage extends BasePage{
    @AndroidFindBy(accessibility = "Login title")
    private MobileElement LoginTitle;

    @AndroidFindBy(accessibility ="Phone field")
    private MobileElement PhoneField;

    @AndroidFindBy(accessibility = "password_field")
    private MobileElement Passwordfield;


    public boolean isALoginTitleisDispayed(){
        return waitForExpectedElement(LoginTitle).isDisplayed();
    }
    public boolean isPhonePhieldDisplayed(){
        return waitForExpectedElement(PhoneField).isDisplayed();
    }
    public boolean isPasswordFieldDisplayed(){
        return waitForExpectedElement(Passwordfield).isDisplayed();
    }

}

