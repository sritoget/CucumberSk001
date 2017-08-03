package Steps;

import Base.BaseUtil;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginSteps extends BaseUtil {

    private BaseUtil base;

    public LoginSteps(BaseUtil base)
    {
        this.base=base;
    }


    @Given("^I Navigate to the login page of the application$")
    public void iNavigateTOLoginPage() throws Throwable
    {
        System.out.println("Navigate to Login Page");
        base.Driver.navigate().to("http://10.13.0.52/hubble/Login");
    }

    @And("^I enter the username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void iEnterTheUsernameAsAndPasswordAs(String userName, String password) throws Throwable
    {
        System.out.println("Entering UserName: "+userName+" and password is "+password);
    }

    @And("^I Click login button$")
    public void iClickLoginButton() throws Throwable
    {
        System.out.println("Clicking on Login Button");
    }

    @Then("^I Should see the home page$")
    public void iShouldSeeTheHomePage() throws Throwable
    {
        System.out.println("Should be able to see Home page of application");
    }


    @And("^I enter Gmail")
    public void iEnterGmailCom() throws Throwable {
        System.out.println("Entering Gmail.com");
    }

    @And("^I Click on Search button$")
    public void iClickOnSearchButton() throws Throwable {
        System.out.println("Click on search page");
    }
}
