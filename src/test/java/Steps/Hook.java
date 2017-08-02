package Steps;

import Base.BaseUtil;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hook extends BaseUtil{

    private BaseUtil base;

    public Hook(BaseUtil base)
    {
        this.base=base;
    }


    @Before
    public void Init()
    {
        System.out.println(" Opening Browser");
        System.setProperty("webdriver.chrome.driver","C:\\Selenium libs\\chromedriver.exe");
        base.Driver = new ChromeDriver();
    }

    @After
    public void TearDown()
    {
        base.Driver.quit();
        System.out.println(" Cleaning ");
    }
}
