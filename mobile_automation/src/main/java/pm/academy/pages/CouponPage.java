package pm.academy.pages;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CouponPage extends BasePage {

    @AndroidFindBy(accessibility = "quickBetPlaceButton")
    private MobileElement BetButton;

    public boolean isCouponPageDisplayed() {
        return waitForExpectedElement(BetButton).isDisplayed();
    }
    public void placeBetLogin() {
        waitForExpectedElement(BetButton).click();
    }

}
