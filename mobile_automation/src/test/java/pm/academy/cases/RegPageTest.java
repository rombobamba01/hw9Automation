package pm.academy.cases;

import org.assertj.core.api.Assertions;
import org.assertj.core.api.SoftAssertions;
import org.testng.annotations.Test;
import pm.academy.base.BaseTest;
import pm.academy.pages.*;

public class RegPageTest extends BaseTest {


    @Test
    /**тест страницы регистрации**/
    public void registraionPageTest() {
        SoftAssertions softAssertions = new SoftAssertions();
        softAssertions.assertThat(new RegistrationPage().isHeadTitleRegistrationDisplayed()).as("Head title registration is not displayed").isTrue();
        softAssertions.assertThat(new RegistrationPage().isPasswordRegDisplayed()).as(" Password field is not displayed").isTrue();
        softAssertions.assertThat(new RegistrationPage().isAgreeLabelDisplayed()).as("Agree label is not displayed").isTrue();
        softAssertions.assertThat(new RegistrationPage().isCloseRegPage()).as("Close Reg button is not displayed").isTrue();
        softAssertions.assertAll();
    }

    @Test
    public void cloreRegPage() {
        Assertions.assertThat(new RegistrationPage().isCloseRegPage())
                .as("not displayed")
                .isTrue();
    }

    @Test
    public void profilePageTest()/**тест страницы профиля**/
    {
        SoftAssertions softAssertions = new SoftAssertions();
        softAssertions.assertThat(new ProfilePage().isHeadTitleOfProfilepageDisplayed()).as("Head title pf Profile is not displayed").isTrue();
        softAssertions.assertThat(new ProfilePage().isRegButtonDisplayed()).as(" Reg button is not displayed").isTrue();
        softAssertions.assertThat(new ProfilePage().isLoginButtonDisplayed()).as("Login button is not displayed").isTrue();
        softAssertions.assertAll();
    }

    @Test
    public void goToSportsPade() {
        Assertions.assertThat(new ProfilePage().isLoginButtonDisplayed())
                .as("not displayed")
                .isTrue();

    }

    @Test
    public void sportsPageTest()/**тест страницы спорт**/
    {
        SoftAssertions softAssertions = new SoftAssertions();
        softAssertions.assertThat(new SportsPage().isSportNameDisplayed()).as("Sports name is not displayed").isTrue();
        softAssertions.assertThat(new SportsPage().isTitleSportDisplayed()).as(" Title sport is not displayed").isTrue();
        softAssertions.assertThat(new SportsPage().isSearchMatchDisplayed()).as("Search matches button is not displayed").isTrue();
        softAssertions.assertAll();
    }

    @Test
    public void winFirstTeamclick() {
        Assertions.assertThat(new SportsPage().isWinFirstTeam())
                .as("not displayed")
                .isTrue();
    }

    @Test/**тест купона**/
    public void couponPageTest() {
        SoftAssertions softAssertions = new SoftAssertions();
        softAssertions.assertThat(new CouponPage().isCouponPageDisplayed()).as("Sports name is not displayed").isTrue();
    }

    @Test
    public void placeBet() {
        Assertions.assertThat(new CouponPage().isCouponPageDisplayed())
                .as("not displayed")
                .isTrue();
    }

    @Test
    public void loginPageTest()/**тест страницы логина**/
    {
        SoftAssertions softAssertions = new SoftAssertions();
        softAssertions.assertThat(new LoginPage().isALoginTitleisDispayed()).as("Head title of Login is not displayed").isTrue();
        softAssertions.assertThat(new LoginPage().isPasswordFieldDisplayed()).as("Password Field is not displayed").isTrue();
        softAssertions.assertThat(new LoginPage().isPhonePhieldDisplayed()).as("PhoneField is not displayed").isTrue();
        softAssertions.assertAll();

    }
}


//    @Test
//    public void mainMenuTest() {
//        SoftAssertions softAssertions = new SoftAssertions();
//        softAssertions.assertThat(new MainPage().isHeadTitleDisplayed()).as("Head title is not displayed").isTrue();
//        softAssertions.assertThat(new MainPage().isMenuButtonDisplayed()).as(" Menu button is not displayed").isTrue();
//        softAssertions.assertThat(new MainPage().isPromoPanelDisplayed()).as("Promo title is not displayed").isTrue();
//        softAssertions.assertAll();
//    }
//
//
//    @Test
//    public void menuButtonTest2() {
//        Assertions.assertThat(new MainPage().isMenuButtonDisplayed())
//                .as("not displayed")
//                .isTrue();
//    }
////}
