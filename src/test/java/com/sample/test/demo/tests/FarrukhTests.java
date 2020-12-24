package com.sample.test.demo.tests;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.sample.test.demo.TestBase;

public class FarrukhTests extends TestBase {
	
	
    @Test
    public void buyPizzaWithNoToppingsTest() {
    	
    	this.driver.findElement(pizza1).click();
    	this.driver.findElement(pizzaWithNoToppings).click();
    	this.driver.findElement(pizza1Quantity).sendKeys("1");
    	this.driver.findElement(name).sendKeys("Farrukh");
    	this.driver.findElement(phone).sendKeys("1-800-525-8888");
    	this.driver.findElement(placeOrderButton).click();
    	assertTrue(this.driver.findElement(dialog).isDisplayed());
    	assertTrue(this.driver.findElement(dialogText).getText().contains("Thank you for your order!"));
    	
    }
    @Test
    public void placeOrderWithoutRequiredFields()  {
    	this.navigateToSite();
    	this.driver.findElement(pizza1).click();
    	this.driver.findElement(pizzaWithNoToppings).click();
    	this.driver.findElement(pizza1Quantity).sendKeys("1");
    	this.driver.findElement(phone).sendKeys("1-800-525-8888");
//    	cannot order without name
    	assertFalse(this.driver.findElement(placeOrderButton).isEnabled());
    	this.driver.findElement(phone).clear();
    	this.driver.findElement(name).sendKeys("Farrukh");
//    	cannot order without phone number
    	assertFalse(this.driver.findElement(placeOrderButton).isEnabled());

    	
    }
}
