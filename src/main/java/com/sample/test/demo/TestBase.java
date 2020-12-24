package com.sample.test.demo;

import static org.testng.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase {

    private Configuration config;
    protected WebDriver driver;
    protected String url;
    protected By pizza1 = By.id("pizza1Pizza");
    protected By pizzaWithNoToppings = By.cssSelector("#pizza1Pizza option[value='Small 6 Slices - no toppings']");
    protected By pizza1Toppings1 = By.xpath("//div[@id='pizza1']//select[@class='toppings1']");
    protected By pizza1Toppings2 = By.xpath("//div[@id='pizza1']//select[@class='toppings2']");
    protected By pizza1Quantity  = By.id("pizza1Qty");
    protected By pizza1Cost      = By.id("pizza1Cost");
    protected By radioCreditCard  = By.id("ccpayment");
    protected By radioCash        = By.id("cashpayment");
    protected By email            = By.id("email");
    protected By name             =By.id("name");
    protected By phone            =By.id("phone");
       
    protected By placeOrderButton  =By.id("placeOrder");
    protected By resetButton       =By.id("reset");

    protected By dialog            =By.id("dialog");
    protected By dialogText        =By.xpath("//div[@id='dialog']/p");         



    @BeforeClass(alwaysRun = true)
    public void init() throws Throwable {
        config = new Configuration();
        url = config.getUrl();
        initializelDriver();
        navigateToSite();
    }

    protected void navigateToSite() {
        driver.get(url);
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        try {
            driver.quit();

        } catch (Exception e) {
        }
    }

    private void initializelDriver() {
        if (config.getBrowser().equalsIgnoreCase("chrome")) {
            if (config.getPlatform().equalsIgnoreCase("mac")) {
                System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver/mac/chromedriver");
            } else {
                System.setProperty("webdriver.chrome.driver",
                        "src/test/resources/chromedriver/windows/chromedriver.exe");
            }
            driver = new ChromeDriver();
        }
        else {
            fail("Unsupported bfrowser " + config.getBrowser());
        }
       
    }


}
