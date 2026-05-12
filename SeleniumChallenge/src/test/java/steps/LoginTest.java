package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest {

    private final Hooks hooks;
    private WebDriver driver;
    private LoginPage loginPage;
    private HomePage homePage;
    private final String PRODUCT_TITLE = "Products";

    public LoginTest(Hooks hooks) {
        this.hooks = hooks;
    }

    @Given("a user, goes to the login page")
    public void goToLoginPage() {
        driver = hooks.getDriver();
        loginPage = new LoginPage(driver);
        loginPage.navigateToLoginPage();
    }

    @When("the user enters {string} and {string}")
    public void userEnterUserAndPass(String username, String password) {
        loginPage.login(username, password);
    }

    @Then("the user should see the home page with the products")
    public void userRedirectToProductsPage() {
        homePage = new HomePage(driver);
        Assertions.assertEquals(PRODUCT_TITLE, homePage.getProductText());
    }

    @Then("the user should see an alert message that said {string}")
    public void userReceiveALoginErrorMessage(String errorMessage) {
        Assertions.assertEquals(errorMessage, loginPage.getErrorLoginMessage());
    }
}
