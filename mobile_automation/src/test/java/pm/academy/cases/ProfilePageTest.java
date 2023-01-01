//package pm.academy.cases;
//
//import org.assertj.core.api.Assertions;
//import org.assertj.core.api.SoftAssertions;
//import org.testng.annotations.Test;
//import pm.academy.base.BaseTest;
//import pm.academy.pages.ProfilePage;
//
//public class ProfilePageTest extends BaseTest {
//
//    @Test
//    public void mainMenuTest() {
//        SoftAssertions softAssertions = new SoftAssertions();
//        softAssertions.assertThat(new ProfilePage().is()).as("Head title pf Profile is not displayed").isTrue();
//        softAssertions.assertThat(new ProfilePage().isRegButtonDisplayed()).as(" Reg button is not displayed").isTrue();
//        softAssertions.assertThat(new ProfilePage().isLoginButtonDisplayed()).as("Login button is not displayed").isTrue();
//        softAssertions.assertAll();
//
//    }
//
//
////    @Test
////    public void menuButtonTest2() {
////        Assertions.assertThat(new MainPage().isMenuButtonDisplayed())
////                .as("not displayed")
////                .isTrue();
////    }
//}
