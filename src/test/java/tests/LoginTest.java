package tests;

import base.BaseTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.DriverFactory;
import io.qameta.allure.*;

@Epic("Login Module")
@Feature("Valid Login")
@Listeners({io.qameta.allure.testng.AllureTestNg.class})
public class LoginTest extends BaseTest {
    @Test(description = "Verify that user can login with valid credentials")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Test Description: Login test with valid credentials")
    @Story("User logs in with correct username and password")
    public void testValidLogin() {
        DriverFactory.getDriver().get("https://practicetestautomation.com/practice-test-login/");
        System.out.println(">>> Running login test <<<");
        LoginPage login = new LoginPage(DriverFactory.getDriver());
        login.login("student", "Password123");
        System.out.println("Allure Output Dir: " + System.getProperty("allure.results.directory"));

    }
}
