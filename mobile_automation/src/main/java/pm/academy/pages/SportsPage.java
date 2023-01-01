package pm.academy.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SportsPage extends BasePage {
    @AndroidFindBy(accessibility = "sportName")
    private MobileElement SportName;

    @AndroidFindBy(accessibility = "Title Sports")
    private MobileElement TitleSport;

    @AndroidFindBy(id = "com.parimatch:id/ivToolbarSearch")
    private MobileElement SearchMatches;

    @AndroidFindBy(accessibility = "//*[@text='П1']")
    private MobileElement WinFirstteam;

    public boolean isSportNameDisplayed() {
        return waitForExpectedElement(SportName).isDisplayed();
    }


    public boolean isTitleSportDisplayed() {
        return waitForExpectedElement(TitleSport).isDisplayed();
    }

    public boolean isSearchMatchDisplayed() {

        return waitForExpectedElement(SearchMatches).isDisplayed();
    }

    public boolean isWinFirstTeam() {

        return waitForExpectedElement(WinFirstteam).isDisplayed();
    }

        public void clickWinFirstteam() {
            waitForExpectedElement(WinFirstteam).click();

        }
    }



