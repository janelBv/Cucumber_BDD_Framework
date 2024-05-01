package com.qa.magento.stepdefinitions;

import Utils.ConfigReader;
import Utils.DriverHelper;
import com.qa.magento.pages.MagentoShopPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import static Utils.ConfigReader.readProperty;

public class MagentoStepDefinitions {
    WebDriver driver= DriverHelper.getDriver();
    MagentoShopPage magentoShopPage=new MagentoShopPage(driver);

    @Given("User navigate to Magento test website")
    public void user_navigate_to_magento_test_website() {
        driver.get(readProperty("url"));


    }
    @Given("User access the shop")
    public void user_access_the_shop() {
        MagentoShopPage shopPage = new MagentoShopPage(driver);
        shopPage.open();

    }
    @When("User filter for a certain category")
    public void user_filter_for_a_certain_category() {

    }
    @When("User open the product page")
    public void user_open_the_product_page() {

    }
    @Then("User should be able to add multiple product quantities to cart")
    public void user_should_be_able_to_add_multiple_product_quantities_to_cart() {

    }
    @Then("User should be able to perform a checkout")
    public void user_should_be_able_to_perform_a_checkout() {

    }


}
