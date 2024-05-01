package com.qa.magento.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MagentoShopPage {

    @FindBy(linkText = "Shop")
    private WebElement shopLink;
    @FindBy(xpath = "")
    private WebElement categoryLink;

    @FindBy()
    private WebElement productLink;

    @FindBy()
    private WebElement quantityInput;

    @FindBy()
    private WebElement addToCartButton;

    @FindBy()
    private WebElement proceedToCheckoutButton;

    @FindBy()
    private WebElement checkoutHeading;








    public MagentoShopPage(WebDriver driver){PageFactory.initElements(driver,this);}
    public void open() {
        categoryLink.click();
    }

}
