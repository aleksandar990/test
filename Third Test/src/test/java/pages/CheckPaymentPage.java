package pages;

import java.util.Map;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckPaymentPage {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(css = "a[title='About us']")
    @CacheLookup
    private WebElement aboutUs;

    @FindBy(css = "#order_step li:nth-of-type(3) a")
    @CacheLookup
    private WebElement address03;

    @FindBy(css = "a[title='Best sellers']")
    @CacheLookup
    private WebElement bestSellers;

    @FindBy(css = "a[title='Blouses']")
    @CacheLookup
    private WebElement blouses1;

    @FindBy(css = "a[title='Match your favorites blouses with the right accessories for the perfect look.']")
    @CacheLookup
    private WebElement blouses2;

    @FindBy(css = "a[title='View my shopping cart']")
    @CacheLookup
    private WebElement cart1ProductProducts1651;

    @FindBy(css = "#block_top_menu ul.sf-menu.clearfix.menu-content.sf-js-enabled.sf-arrows li:nth-of-type(1) ul.submenu-container.clearfix.first-in-line-xs li:nth-of-type(2) ul li:nth-of-type(1) a")
    @CacheLookup
    private WebElement casualDresses1;

    @FindBy(css = "#block_top_menu ul.sf-menu.clearfix.menu-content.sf-js-enabled.sf-arrows li:nth-of-type(2) ul.submenu-container.clearfix.first-in-line-xs li:nth-of-type(1) a")
    @CacheLookup
    private WebElement casualDresses2;

    @FindBy(css = "#footer div.row section:nth-of-type(2) div.category_footer.toggle-footer div.list ul.tree.dynamized li.last ul li:nth-of-type(2) ul li:nth-of-type(1) a")
    @CacheLookup
    private WebElement casualDresses3;

    @FindBy(id = "button_order_cart")
    @CacheLookup
    private WebElement checkOut;

    @FindBy(css = "a.account")
    @CacheLookup
    private WebElement christianBale;

    @FindBy(css = "a[title='Contact Us']")
    @CacheLookup
    private WebElement contactUs1;

    @FindBy(css = "a[title='Contact us']")
    @CacheLookup
    private WebElement contactUs2;

    @FindBy(css = "#block_top_menu ul.sf-menu.clearfix.menu-content.sf-js-enabled.sf-arrows li:nth-of-type(1) ul.submenu-container.clearfix.first-in-line-xs li:nth-of-type(2) a.sf-with-ul")
    @CacheLookup
    private WebElement dresses1;

    @FindBy(css = "#block_top_menu ul.sf-menu.clearfix.menu-content.sf-js-enabled.sf-arrows li:nth-of-type(2) a.sf-with-ul")
    @CacheLookup
    private WebElement dresses2;

    @FindBy(css = "#footer div.row section:nth-of-type(2) div.category_footer.toggle-footer div.list ul.tree.dynamized li.last ul li:nth-of-type(2) a")
    @CacheLookup
    private WebElement dresses3;

    @FindBy(css = "a._blank")
    @CacheLookup
    private WebElement ecommerceSoftwareByPrestashop;

    @FindBy(id = "newsletter-input")
    @CacheLookup
    private WebElement ecommerceSoftwareByPrestashop2014;

    @FindBy(css = "#block_top_menu ul.sf-menu.clearfix.menu-content.sf-js-enabled.sf-arrows li:nth-of-type(1) ul.submenu-container.clearfix.first-in-line-xs li:nth-of-type(2) ul li:nth-of-type(2) a")
    @CacheLookup
    private WebElement eveningDresses1;

    @FindBy(css = "#block_top_menu ul.sf-menu.clearfix.menu-content.sf-js-enabled.sf-arrows li:nth-of-type(2) ul.submenu-container.clearfix.first-in-line-xs li:nth-of-type(2) a")
    @CacheLookup
    private WebElement eveningDresses2;

    @FindBy(css = "a[title='Browse our different dresses to choose the perfect dress for an unforgettable evening!']")
    @CacheLookup
    private WebElement eveningDresses3;

    @FindBy(css = "a[href='https://www.facebook.com/groups/525066904174158/']")
    @CacheLookup
    private WebElement facebook;

    @FindBy(css = "a.cart_block_product_name")
    @CacheLookup
    private WebElement faded;

    @FindBy(css = "a.cart-images")
    @CacheLookup
    private WebElement fadedShortSleeveTshirts;

    @FindBy(css = "a[href='https://plus.google.com/111979135243110831526/posts']")
    @CacheLookup
    private WebElement googlePlus;

    @FindBy(css = "button.button.btn.btn-default.button-medium")
    @CacheLookup
    private WebElement iConfirmMyOrder;

    @FindBy(css = "a[title='Manage my customer account']")
    @CacheLookup
    private WebElement myAccount;

    @FindBy(css = "a[title='My addresses']")
    @CacheLookup
    private WebElement myAddresses;

    @FindBy(css = "a[title='My credit slips']")
    @CacheLookup
    private WebElement myCreditSlips;

    @FindBy(css = "a[title='My orders']")
    @CacheLookup
    private WebElement myOrders;

    @FindBy(css = "a[title='Manage my personal information']")
    @CacheLookup
    private WebElement myPersonalInfo;

    @FindBy(css = "a[title='New products']")
    @CacheLookup
    private WebElement newProducts;

    @FindBy(name = "submitNewsletter")
    @CacheLookup
    private WebElement ok;

    @FindBy(css = "a[title='Product detail']")
    @CacheLookup
    private WebElement orangeS;

    @FindBy(css = "a.button-exclusive.btn.btn-default")
    @CacheLookup
    private WebElement otherPaymentMethods;

    @FindBy(css = "a[title='Our stores']")
    @CacheLookup
    private WebElement ourStores;

    private final String pageLoadedText = "- Check owner and address information will be displayed on the next page";

    private final String pageUrl = "/index.php?fc=module&module=cheque&controller=payment";

    @FindBy(css = "a.btn.btn-default.button.button-medium")
    @CacheLookup
    private WebElement proceedToCheckout;

    @FindBy(id = "search_query_top")
    @CacheLookup
    private WebElement productSuccessfullyAddedToYourShopping;

    @FindBy(name = "submit_search")
    @CacheLookup
    private WebElement search;

    @FindBy(css = "a[href='http://automationpractice.com/index.php?controller=order&step=2&multi-shipping=0']")
    @CacheLookup
    private WebElement shipping04;

    @FindBy(css = "#order_step li:nth-of-type(2) a")
    @CacheLookup
    private WebElement signIn02;

    @FindBy(css = "a.logout")
    @CacheLookup
    private WebElement signOut1;

    @FindBy(css = "a[title='Sign out']")
    @CacheLookup
    private WebElement signOut2;

    @FindBy(css = "a[title='Sitemap']")
    @CacheLookup
    private WebElement sitemap;

    @FindBy(css = "a[title='Specials']")
    @CacheLookup
    private WebElement specials;

    @FindBy(css = "#order_step li:nth-of-type(1) a")
    @CacheLookup
    private WebElement summary01;

    @FindBy(css = "#block_top_menu ul.sf-menu.clearfix.menu-content.sf-js-enabled.sf-arrows li:nth-of-type(1) ul.submenu-container.clearfix.first-in-line-xs li:nth-of-type(2) ul li:nth-of-type(3) a")
    @CacheLookup
    private WebElement summerDresses1;

    @FindBy(css = "#block_top_menu ul.sf-menu.clearfix.menu-content.sf-js-enabled.sf-arrows li:nth-of-type(2) ul.submenu-container.clearfix.first-in-line-xs li:nth-of-type(3) a")
    @CacheLookup
    private WebElement summerDresses2;

    @FindBy(css = "a[title='Short dress, long dress, silk dress, printed dress, you will find the perfect dress for summer.']")
    @CacheLookup
    private WebElement summerDresses3;

    @FindBy(css = "a[href='mailto:%73%75%70%70%6f%72%74@%73%65%6c%65%6e%69%75%6d%66%72%61%6d%65%77%6f%72%6b.%63%6f%6d']")
    @CacheLookup
    private WebElement supportseleniumframeworkCom;

    @FindBy(css = "a[title='Terms and conditions of use']")
    @CacheLookup
    private WebElement termsAndConditionsOfUse;

    @FindBy(css = "a[title='Tops']")
    @CacheLookup
    private WebElement tops1;

    @FindBy(css = "#footer div.row section:nth-of-type(2) div.category_footer.toggle-footer div.list ul.tree.dynamized li.last ul li:nth-of-type(1) a")
    @CacheLookup
    private WebElement tops2;

    @FindBy(css = "#block_top_menu ul.sf-menu.clearfix.menu-content.sf-js-enabled.sf-arrows li:nth-of-type(1) ul.submenu-container.clearfix.first-in-line-xs li:nth-of-type(1) ul li:nth-of-type(1) a")
    @CacheLookup
    private WebElement tshirts1;

    @FindBy(css = "#block_top_menu ul.sf-menu.clearfix.menu-content.sf-js-enabled.sf-arrows li:nth-of-type(3) a")
    @CacheLookup
    private WebElement tshirts2;

    @FindBy(css = "#footer div.row section:nth-of-type(2) div.category_footer.toggle-footer div.list ul.tree.dynamized li.last ul li:nth-of-type(1) ul li:nth-of-type(1) a")
    @CacheLookup
    private WebElement tshirts3;

    @FindBy(css = "a[href='https://twitter.com/seleniumfrmwrk']")
    @CacheLookup
    private WebElement twitter;

    @FindBy(css = "a[title='Women']")
    @CacheLookup
    private WebElement women1;

    @FindBy(css = "#footer div.row section:nth-of-type(2) div.category_footer.toggle-footer div.list ul.tree.dynamized li.last a")
    @CacheLookup
    private WebElement women2;

    @FindBy(css = "a[href='https://www.youtube.com/channel/UCHl59sI3SRjQ-qPcTrgt0tA']")
    @CacheLookup
    private WebElement youtube;

    public CheckPaymentPage() {
    }

    public CheckPaymentPage(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public CheckPaymentPage(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public CheckPaymentPage(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on About Us Link.
     *
     * @return the CheckPaymentPage class instance.
     */
    public CheckPaymentPage clickAboutUsLink() {
        aboutUs.click();
        return this;
    }

    /**
     * Click on 03. Address Link.
     *
     * @return the CheckPaymentPage class instance.
     */
    public CheckPaymentPage clickAddressLink03() {
        address03.click();
        return this;
    }

    /**
     * Click on Best Sellers Link.
     *
     * @return the CheckPaymentPage class instance.
     */
    public CheckPaymentPage clickBestSellersLink() {
        bestSellers.click();
        return this;
    }

    /**
     * Click on Blouses Link.
     *
     * @return the CheckPaymentPage class instance.
     */
    public CheckPaymentPage clickBlouses1Link() {
        blouses1.click();
        return this;
    }

    /**
     * Click on Blouses Link.
     *
     * @return the CheckPaymentPage class instance.
     */
    public CheckPaymentPage clickBlouses2Link() {
        blouses2.click();
        return this;
    }

    /**
     * Click on Cart 1 Product Products 16.51 Empty Link.
     *
     * @return the CheckPaymentPage class instance.
     */
    public CheckPaymentPage clickCart1ProductProducts1651Link() {
        cart1ProductProducts1651.click();
        return this;
    }

    /**
     * Click on Casual Dresses Link.
     *
     * @return the CheckPaymentPage class instance.
     */
    public CheckPaymentPage clickCasualDresses1Link() {
        casualDresses1.click();
        return this;
    }

    /**
     * Click on Casual Dresses Link.
     *
     * @return the CheckPaymentPage class instance.
     */
    public CheckPaymentPage clickCasualDresses2Link() {
        casualDresses2.click();
        return this;
    }

    /**
     * Click on Casual Dresses Link.
     *
     * @return the CheckPaymentPage class instance.
     */
    public CheckPaymentPage clickCasualDresses3Link() {
        casualDresses3.click();
        return this;
    }

    /**
     * Click on Check Out Link.
     *
     * @return the CheckPaymentPage class instance.
     */
    public CheckPaymentPage clickCheckOutLink() {
        checkOut.click();
        return this;
    }

    /**
     * Click on Christian Bale Link.
     *
     * @return the CheckPaymentPage class instance.
     */
    public CheckPaymentPage clickChristianBaleLink() {
        christianBale.click();
        return this;
    }

    /**
     * Click on Contact Us Link.
     *
     * @return the CheckPaymentPage class instance.
     */
    public CheckPaymentPage clickContactUs1Link() {
        contactUs1.click();
        return this;
    }

    /**
     * Click on Contact Us Link.
     *
     * @return the CheckPaymentPage class instance.
     */
    public CheckPaymentPage clickContactUs2Link() {
        contactUs2.click();
        return this;
    }

    /**
     * Click on Dresses Link.
     *
     * @return the CheckPaymentPage class instance.
     */
    public CheckPaymentPage clickDresses1Link() {
        dresses1.click();
        return this;
    }

    /**
     * Click on Dresses Link.
     *
     * @return the CheckPaymentPage class instance.
     */
    public CheckPaymentPage clickDresses2Link() {
        dresses2.click();
        return this;
    }

    /**
     * Click on Dresses Link.
     *
     * @return the CheckPaymentPage class instance.
     */
    public CheckPaymentPage clickDresses3Link() {
        dresses3.click();
        return this;
    }

    /**
     * Click on Ecommerce Software By Prestashop Link.
     *
     * @return the CheckPaymentPage class instance.
     */
    public CheckPaymentPage clickEcommerceSoftwareByPrestashopLink() {
        ecommerceSoftwareByPrestashop.click();
        return this;
    }

    /**
     * Click on Evening Dresses Link.
     *
     * @return the CheckPaymentPage class instance.
     */
    public CheckPaymentPage clickEveningDresses1Link() {
        eveningDresses1.click();
        return this;
    }

    /**
     * Click on Evening Dresses Link.
     *
     * @return the CheckPaymentPage class instance.
     */
    public CheckPaymentPage clickEveningDresses2Link() {
        eveningDresses2.click();
        return this;
    }

    /**
     * Click on Evening Dresses Link.
     *
     * @return the CheckPaymentPage class instance.
     */
    public CheckPaymentPage clickEveningDresses3Link() {
        eveningDresses3.click();
        return this;
    }

    /**
     * Click on Facebook Link.
     *
     * @return the CheckPaymentPage class instance.
     */
    public CheckPaymentPage clickFacebookLink() {
        facebook.click();
        return this;
    }

    /**
     * Click on Faded... Link.
     *
     * @return the CheckPaymentPage class instance.
     */
    public CheckPaymentPage clickFadedLink() {
        faded.click();
        return this;
    }

    /**
     * Click on Faded Short Sleeve Tshirts Link.
     *
     * @return the CheckPaymentPage class instance.
     */
    public CheckPaymentPage clickFadedShortSleeveTshirtsLink() {
        fadedShortSleeveTshirts.click();
        return this;
    }

    /**
     * Click on Google Plus Link.
     *
     * @return the CheckPaymentPage class instance.
     */
    public CheckPaymentPage clickGooglePlusLink() {
        googlePlus.click();
        return this;
    }

    /**
     * Click on I Confirm My Order Button.
     *
     * @return the CheckPaymentPage class instance.
     */
    public CheckPaymentPage clickIConfirmMyOrderButton() {
        iConfirmMyOrder.click();
        return this;
    }

    /**
     * Click on My Account Link.
     *
     * @return the CheckPaymentPage class instance.
     */
    public CheckPaymentPage clickMyAccountLink() {
        myAccount.click();
        return this;
    }

    /**
     * Click on My Addresses Link.
     *
     * @return the CheckPaymentPage class instance.
     */
    public CheckPaymentPage clickMyAddressesLink() {
        myAddresses.click();
        return this;
    }

    /**
     * Click on My Credit Slips Link.
     *
     * @return the CheckPaymentPage class instance.
     */
    public CheckPaymentPage clickMyCreditSlipsLink() {
        myCreditSlips.click();
        return this;
    }

    /**
     * Click on My Orders Link.
     *
     * @return the CheckPaymentPage class instance.
     */
    public CheckPaymentPage clickMyOrdersLink() {
        myOrders.click();
        return this;
    }

    /**
     * Click on My Personal Info Link.
     *
     * @return the CheckPaymentPage class instance.
     */
    public CheckPaymentPage clickMyPersonalInfoLink() {
        myPersonalInfo.click();
        return this;
    }

    /**
     * Click on New Products Link.
     *
     * @return the CheckPaymentPage class instance.
     */
    public CheckPaymentPage clickNewProductsLink() {
        newProducts.click();
        return this;
    }

    /**
     * Click on Ok Button.
     *
     * @return the CheckPaymentPage class instance.
     */
    public CheckPaymentPage clickOkButton() {
        ok.click();
        return this;
    }

    /**
     * Click on Orange S Link.
     *
     * @return the CheckPaymentPage class instance.
     */
    public CheckPaymentPage clickOrangeSLink() {
        orangeS.click();
        return this;
    }

    /**
     * Click on Other Payment Methods Link.
     *
     * @return the CheckPaymentPage class instance.
     */
    public CheckPaymentPage clickOtherPaymentMethodsLink() {
        otherPaymentMethods.click();
        return this;
    }

    /**
     * Click on Our Stores Link.
     *
     * @return the CheckPaymentPage class instance.
     */
    public CheckPaymentPage clickOurStoresLink() {
        ourStores.click();
        return this;
    }

    /**
     * Click on Proceed To Checkout Link.
     *
     * @return the CheckPaymentPage class instance.
     */
    public CheckPaymentPage clickProceedToCheckoutLink() {
        proceedToCheckout.click();
        return this;
    }

    /**
     * Click on Search Button.
     *
     * @return the CheckPaymentPage class instance.
     */
    public CheckPaymentPage clickSearchButton() {
        search.click();
        return this;
    }

    /**
     * Click on 04. Shipping Link.
     *
     * @return the CheckPaymentPage class instance.
     */
    public CheckPaymentPage clickShippingLink04() {
        shipping04.click();
        return this;
    }

    /**
     * Click on 02. Sign In Link.
     *
     * @return the CheckPaymentPage class instance.
     */
    public CheckPaymentPage clickSignInLink02() {
        signIn02.click();
        return this;
    }

    /**
     * Click on Sign Out Link.
     *
     * @return the CheckPaymentPage class instance.
     */
    public CheckPaymentPage clickSignOut1Link() {
        signOut1.click();
        return this;
    }

    /**
     * Click on Sign Out Link.
     *
     * @return the CheckPaymentPage class instance.
     */
    public CheckPaymentPage clickSignOut2Link() {
        signOut2.click();
        return this;
    }

    /**
     * Click on Sitemap Link.
     *
     * @return the CheckPaymentPage class instance.
     */
    public CheckPaymentPage clickSitemapLink() {
        sitemap.click();
        return this;
    }

    /**
     * Click on Specials Link.
     *
     * @return the CheckPaymentPage class instance.
     */
    public CheckPaymentPage clickSpecialsLink() {
        specials.click();
        return this;
    }

    /**
     * Click on 01. Summary Link.
     *
     * @return the CheckPaymentPage class instance.
     */
    public CheckPaymentPage clickSummaryLink01() {
        summary01.click();
        return this;
    }

    /**
     * Click on Summer Dresses Link.
     *
     * @return the CheckPaymentPage class instance.
     */
    public CheckPaymentPage clickSummerDresses1Link() {
        summerDresses1.click();
        return this;
    }

    /**
     * Click on Summer Dresses Link.
     *
     * @return the CheckPaymentPage class instance.
     */
    public CheckPaymentPage clickSummerDresses2Link() {
        summerDresses2.click();
        return this;
    }

    /**
     * Click on Summer Dresses Link.
     *
     * @return the CheckPaymentPage class instance.
     */
    public CheckPaymentPage clickSummerDresses3Link() {
        summerDresses3.click();
        return this;
    }

    /**
     * Click on Supportseleniumframework.com Link.
     *
     * @return the CheckPaymentPage class instance.
     */
    public CheckPaymentPage clickSupportseleniumframeworkComLink() {
        supportseleniumframeworkCom.click();
        return this;
    }

    /**
     * Click on Terms And Conditions Of Use Link.
     *
     * @return the CheckPaymentPage class instance.
     */
    public CheckPaymentPage clickTermsAndConditionsOfUseLink() {
        termsAndConditionsOfUse.click();
        return this;
    }

    /**
     * Click on Tops Link.
     *
     * @return the CheckPaymentPage class instance.
     */
    public CheckPaymentPage clickTops1Link() {
        tops1.click();
        return this;
    }

    /**
     * Click on Tops Link.
     *
     * @return the CheckPaymentPage class instance.
     */
    public CheckPaymentPage clickTops2Link() {
        tops2.click();
        return this;
    }

    /**
     * Click on Tshirts Link.
     *
     * @return the CheckPaymentPage class instance.
     */
    public CheckPaymentPage clickTshirts1Link() {
        tshirts1.click();
        return this;
    }

    /**
     * Click on Tshirts Link.
     *
     * @return the CheckPaymentPage class instance.
     */
    public CheckPaymentPage clickTshirts2Link() {
        tshirts2.click();
        return this;
    }

    /**
     * Click on Tshirts Link.
     *
     * @return the CheckPaymentPage class instance.
     */
    public CheckPaymentPage clickTshirts3Link() {
        tshirts3.click();
        return this;
    }

    /**
     * Click on Twitter Link.
     *
     * @return the CheckPaymentPage class instance.
     */
    public CheckPaymentPage clickTwitterLink() {
        twitter.click();
        return this;
    }

    /**
     * Click on Women Link.
     *
     * @return the CheckPaymentPage class instance.
     */
    public CheckPaymentPage clickWomen1Link() {
        women1.click();
        return this;
    }

    /**
     * Click on Women Link.
     *
     * @return the CheckPaymentPage class instance.
     */
    public CheckPaymentPage clickWomen2Link() {
        women2.click();
        return this;
    }

    /**
     * Click on Youtube Link.
     *
     * @return the CheckPaymentPage class instance.
     */
    public CheckPaymentPage clickYoutubeLink() {
        youtube.click();
        return this;
    }

    /**
     * Fill every fields in the page.
     *
     * @return the CheckPaymentPage class instance.
     */
    public CheckPaymentPage fill() {
        setProductSuccessfullyAddedToYourShoppingTextField();
        setEcommerceSoftwareByPrestashopTextField2014();
        return this;
    }

    /**
     * Fill every fields in the page and submit it to target page.
     *
     * @return the http://automationpractice.com/index.php?fc&#x3D;module&amp;module&#x3D;cheque&amp;controller&#x3D;payment class instance.
     */


    /**
     * Set default value to 2014 Ecommerce Software By Prestashop Text field.
     *
     * @return the CheckPaymentPage class instance.
     */
    public CheckPaymentPage setEcommerceSoftwareByPrestashopTextField2014() {
        return setEcommerceSoftwareByPrestashopTextField2014(data.get("ECOMMERCE_SOFTWARE_BY_PRESTASHOP_2014"));
    }

    /**
     * Set value to 2014 Ecommerce Software By Prestashop Text field.
     *
     * @return the CheckPaymentPage class instance.
     */
    public CheckPaymentPage setEcommerceSoftwareByPrestashopTextField2014(String ecommerceSoftwareByPrestashopValue2014) {
        ecommerceSoftwareByPrestashop2014.sendKeys(ecommerceSoftwareByPrestashopValue2014);
        return this;
    }

    /**
     * Set default value to Product Successfully Added To Your Shopping Cart Text field.
     *
     * @return the CheckPaymentPage class instance.
     */
    public CheckPaymentPage setProductSuccessfullyAddedToYourShoppingTextField() {
        return setProductSuccessfullyAddedToYourShoppingTextField(data.get("PRODUCT_SUCCESSFULLY_ADDED_TO_YOUR_SHOPPING"));
    }

    /**
     * Set value to Product Successfully Added To Your Shopping Cart Text field.
     *
     * @return the CheckPaymentPage class instance.
     */
    public CheckPaymentPage setProductSuccessfullyAddedToYourShoppingTextField(String productSuccessfullyAddedToYourShoppingValue) {
        productSuccessfullyAddedToYourShopping.sendKeys(productSuccessfullyAddedToYourShoppingValue);
        return this;
    }

    /**
     * Submit the form to target page.
     *
     * @return the http://automationpractice.com/index.php?fc&#x3D;module&amp;module&#x3D;cheque&amp;controller&#x3D;payment class instance.
     */


    /**
     * Verify that the page loaded completely.
     *
     * @return the CheckPaymentPage class instance.
     */
    public CheckPaymentPage verifyPageLoaded() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getPageSource().contains(pageLoadedText);
            }
        });
        return this;
    }

    /**
     * Verify that current page URL matches the expected URL.
     *
     * @return the CheckPaymentPage class instance.
     */
    public CheckPaymentPage verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}
