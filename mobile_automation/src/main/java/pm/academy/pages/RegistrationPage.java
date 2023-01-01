package pm.academy.pages;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class RegistrationPage extends BasePage {
    @AndroidFindBy(accessibility = "registration_page_title")
    private MobileElement HeadTitleRegistration;

    @AndroidFindBy(accessibility ="agreement_label" )
    private MobileElement AgreeLabel;

    @AndroidFindBy(id = "password_field")
    private MobileElement PasswordReg;

    @AndroidFindBy(accessibility = "close_button")
    private MobileElement CloseRegPage ;

    public boolean isAgreeLabelDisplayed(){
        return waitForExpectedElement(AgreeLabel).isDisplayed();
    }
    public boolean isHeadTitleRegistrationDisplayed(){
        return waitForExpectedElement(HeadTitleRegistration).isDisplayed();
    }
    public boolean isPasswordRegDisplayed(){
        return waitForExpectedElement(PasswordReg).isDisplayed();
    }
    public boolean isCloseRegPage(){
        return waitForExpectedElement(CloseRegPage).isDisplayed();
    }
    public void clickCloseRegPage() {
        waitForExpectedElement(CloseRegPage).click();

    }
}
