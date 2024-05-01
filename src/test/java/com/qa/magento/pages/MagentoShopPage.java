package com.qa.magento.pages;

import Utils.BrowserUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MagentoShopPage {

    @FindBy(xpath = "//span[.='Shop New Yoga']")
    WebElement shopLink;
    @FindBy(xpath = "//div[.='Category']")
    WebElement categoryLink;
    @FindBy(xpath = "//*[@id=\"narrow-by-list\"]/div[2]/div[2]/ol/li[3]/a/span")
    WebElement categoryFashion;
    @FindBy(xpath = "//img[@alt='Cruise Dual Analog Watch']")
     WebElement productLink;
    @FindBy(xpath = "//input[@id='qty']")
    WebElement quantityInput;
    @FindBy(id="product-addtocart-button")
    WebElement addToCartButton;
    @FindBy(xpath =" //span[.='Cruise Dual Analog Watch']")
    WebElement productName;
    @FindBy(xpath ="//span[@id='product-price-39'] ")
    WebElement productPrice;
    @FindBy(xpath ="  //span[.='In stock']")
    WebElement availability;
    @FindBy(xpath = "//a[.='shopping cart']")
    WebElement shoppingCart;
    @FindBy(xpath = "//span[.='Proceed to Checkout']")
    WebElement proceedToCheckoutButton;


    public MagentoShopPage(WebDriver driver){PageFactory.initElements(driver,this);}

    public void openShop() {
        shopLink.click();
    }
    public void openCategory() {
        categoryLink.click();
        categoryFashion.click();
    }
    public void openProduct() {
        productLink.click();
    }
    public void addMultipleQuantities() {
        quantityInput.clear();
        quantityInput.sendKeys("2");
        addToCartButton.click();
    }
    public void validateProductData(String expectedProductName, String expectedProductPrice, String expectedAvailability ) {
    Assert.assertEquals(expectedProductName, BrowserUtils.getText(productName));
    Assert.assertEquals(expectedProductPrice, BrowserUtils.getText(productPrice));
    Assert.assertEquals(expectedAvailability,BrowserUtils.getText(availability));
    }
    public void proceedToCheckout() {
        shoppingCart.click();
        proceedToCheckoutButton.click();
    }

}
