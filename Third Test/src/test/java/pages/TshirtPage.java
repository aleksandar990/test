package pages;

import java.util.Map;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TshirtPage {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(css = "#informations_block_left_1 div.block_content.list-block ul li:nth-of-type(4) a")
    @CacheLookup
    private WebElement aboutUs1;

    @FindBy(css = "#block_various_links_footer ul.toggle-footer li:nth-of-type(7) a")
    @CacheLookup
    private WebElement aboutUs2;

    @FindBy(xpath = "//*[@id=\"add_to_cart\"]/button")
    @CacheLookup
    private WebElement addToCart;

    @FindBy(css = "a.add_to_compare")
    @CacheLookup
    private WebElement addToCompare;

    @FindBy(css = "a.addToWishlist.wishlistProd_1")
    @CacheLookup
    private WebElement addToWishlist;

    @FindBy(css = "a[title='All specials']")
    @CacheLookup
    private WebElement allSpecials;

    @FindBy(css = "a[title='Best sellers']")
    @CacheLookup
    private WebElement bestSellers;

    @FindBy(css = "a[title='Blouses']")
    @CacheLookup
    private WebElement blouses1;

    @FindBy(css = "a[title='Match your favorites blouses with the right accessories for the perfect look.']")
    @CacheLookup
    private WebElement blouses2;

    @FindBy(id = "layered_id_attribute_group_14")
    @CacheLookup
    private WebElement blue11;

    @FindBy(css = "a[href='http://automationpractice.com/index.php?id_category=5&controller=category#color-blue']")
    @CacheLookup
    private WebElement blue12;

    @FindBy(css = "a[title='View my shopping cart']")
    @CacheLookup
    private WebElement cart0ProductProductsEmpty;

    @FindBy(id = "layered_id_feature_11")
    @CacheLookup
    private WebElement casual11;

    @FindBy(css = "a[href='http://automationpractice.com/index.php?id_category=5&controller=category#styles-casual']")
    @CacheLookup
    private WebElement casual12;

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

    @FindBy(css = "#center_column div:nth-of-type(2) div:nth-of-type(2) form.compare-form button.btn.btn-default.button.button-medium.bt_compare.bt_compare")
    @CacheLookup
    private WebElement compare01;

    @FindBy(css = "button.btn.btn-default.button.button-medium.bt_compare.bt_compare_bottom")
    @CacheLookup
    private WebElement compare02;

    @FindBy(css = "a[title='Contact Us']")
    @CacheLookup
    private WebElement contactUs1;

    @FindBy(css = "a[title='Contact us']")
    @CacheLookup
    private WebElement contactUs2;

    @FindBy(id = "layered_id_feature_5")
    @CacheLookup
    private WebElement cotton11;

    @FindBy(css = "a[href='http://automationpractice.com/index.php?id_category=5&controller=category#compositions-cotton']")
    @CacheLookup
    private WebElement cotton12;

    @FindBy(css = "a[title='Delivery']")
    @CacheLookup
    private WebElement delivery;

    @FindBy(css = "#stores_block_left div.block_content.blockstore div a.btn.btn-default.button.button-small")
    @CacheLookup
    private WebElement discoverOurStores;

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

    @FindBy(css = "#viewed-products_block_left div.block_content.products-block ul li:nth-of-type(2) div.product-content h5 a.product-name")
    @CacheLookup
    private WebElement fadedShortSleeve;

    @FindBy(css = "#center_column ul.product_list.grid.row li.ajax_block_product.col-xs-12.col-sm-6.col-md-4.first-in-line.last-line.first-item-of-tablet-line.first-item-of-mobile-line.last-mobile-line div.product-container div:nth-of-type(2) h5 a.product-name")
    @CacheLookup
    private WebElement fadedShortSleeveTshirt;

    @FindBy(id = "layered_manufacturer_1")
    @CacheLookup
    private WebElement fashionManufacturer11;

    @FindBy(css = "a[href='http://automationpractice.com/index.php?id_category=5&controller=category#manufacturer-fashion_manufacturer']")
    @CacheLookup
    private WebElement fashionManufacturer12;

    @FindBy(css = "a[href='https://plus.google.com/111979135243110831526/posts']")
    @CacheLookup
    private WebElement googlePlus;

    @FindBy(css = "a[title='Grid']")
    @CacheLookup
    private WebElement grid;

    @FindBy(id = "layered_quantity_1")
    @CacheLookup
    private WebElement inStock11;

    @FindBy(css = "a[href='http://automationpractice.com/index.php?id_category=5&controller=category#availability-in_stock']")
    @CacheLookup
    private WebElement inStock12;

    @FindBy(css = "a[href='http://automationpractice.com/index.php?id_cms_category=1&controller=cms']")
    @CacheLookup
    private WebElement information;

    @FindBy(id = "layered_id_attribute_group_3")
    @CacheLookup
    private WebElement l11;

    @FindBy(css = "a[href='http://automationpractice.com/index.php?id_category=5&controller=category#size-l']")
    @CacheLookup
    private WebElement l12;

    @FindBy(css = "a[title='Legal Notice']")
    @CacheLookup
    private WebElement legalNotice;

    @FindBy(css = "a[title='List']")
    @CacheLookup
    private WebElement list;

    @FindBy(id = "layered_id_attribute_group_2")
    @CacheLookup
    private WebElement m11;

    @FindBy(css = "a[href='http://automationpractice.com/index.php?id_category=5&controller=category#size-m']")
    @CacheLookup
    private WebElement m12;

    @FindBy(css = "a.button.lnk_view.btn.btn-default")
    @CacheLookup
    private WebElement more;

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

    @FindBy(id = "layered_condition_new")
    @CacheLookup
    private WebElement new11;

    @FindBy(css = "a[href='http://automationpractice.com/index.php?id_category=5&controller=category#condition-new']")
    @CacheLookup
    private WebElement new12;

    @FindBy(css = "a[title='New products']")
    @CacheLookup
    private WebElement newProducts;

    @FindBy(name = "submitNewsletter")
    @CacheLookup
    private WebElement ok;

    @FindBy(id = "layered_id_attribute_group_13")
    @CacheLookup
    private WebElement orange11;

    @FindBy(css = "a[href='http://automationpractice.com/index.php?id_category=5&controller=category#color-orange']")
    @CacheLookup
    private WebElement orange12;

    @FindBy(css = "#informations_block_left_1 div.block_content.list-block ul li:nth-of-type(6) a")
    @CacheLookup
    private WebElement ourStores1;

    @FindBy(css = "#stores_block_left p.title_block a")
    @CacheLookup
    private WebElement ourStores2;

    @FindBy(css = "#block_various_links_footer ul.toggle-footer li:nth-of-type(4) a")
    @CacheLookup
    private WebElement ourStores3;

    private final String pageLoadedText = "Terms and conditions of use";

    private final String pageUrl = "/index.php?id_category=5&controller=category";

    @FindBy(css = "a[title='Printed Chiffon Dress']")
    @CacheLookup
    private WebElement printedChiffonDress;

    @FindBy(css = "#viewed-products_block_left div.block_content.products-block ul li:nth-of-type(1) div.product-content h5 a.product-name")
    @CacheLookup
    private WebElement printedDress;

    @FindBy(css = "a.btn.btn-default.button.button-medium")
    @CacheLookup
    private WebElement proceedToCheckout;

    @FindBy(id = "search_query_top")
    @CacheLookup
    private WebElement productSuccessfullyAddedToYourShopping;

    @FindBy(css = "a.quick-view")
    @CacheLookup
    private WebElement quickView;

    @FindBy(id = "layered_id_attribute_group_1")
    @CacheLookup
    private WebElement s11;

    @FindBy(css = "a[href='http://automationpractice.com/index.php?id_category=5&controller=category#size-s']")
    @CacheLookup
    private WebElement s12;

    @FindBy(name = "submit_search")
    @CacheLookup
    private WebElement search;

    @FindBy(css = "a[title='Secure payment']")
    @CacheLookup
    private WebElement securePayment;

    @FindBy(id = "layered_id_feature_17")
    @CacheLookup
    private WebElement shortSleeve11;

    @FindBy(css = "a[href='http://automationpractice.com/index.php?id_category=5&controller=category#properties-short_sleeve']")
    @CacheLookup
    private WebElement shortSleeve12;

    @FindBy(css = "a.logout")
    @CacheLookup
    private WebElement signOut1;

    @FindBy(css = "a[title='Sign out']")
    @CacheLookup
    private WebElement signOut2;

    @FindBy(css = "a[title='Sitemap']")
    @CacheLookup
    private WebElement sitemap;

    @FindBy(id = "selectProductSort")
    @CacheLookup
    private WebElement sortBy;

    @FindBy(css = "#special_block_right p.title_block a")
    @CacheLookup
    private WebElement specials1;

    @FindBy(css = "#block_various_links_footer ul.toggle-footer li:nth-of-type(1) a")
    @CacheLookup
    private WebElement specials2;

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

    @FindBy(css = "#informations_block_left_1 div.block_content.list-block ul li:nth-of-type(3) a")
    @CacheLookup
    private WebElement termsAndConditionsOfUse1;

    @FindBy(css = "#block_various_links_footer ul.toggle-footer li:nth-of-type(6) a")
    @CacheLookup
    private WebElement termsAndConditionsOfUse2;

    @FindBy(css = "#block_top_menu ul.sf-menu.clearfix.menu-content.sf-js-enabled.sf-arrows li:nth-of-type(1) ul.submenu-container.clearfix.first-in-line-xs li:nth-of-type(1) a.sf-with-ul")
    @CacheLookup
    private WebElement tops1;

    @FindBy(css = "#columns div:nth-of-type(1) a:nth-of-type(3)")
    @CacheLookup
    private WebElement tops2;

    @FindBy(css = "#footer div.row section:nth-of-type(2) div.category_footer.toggle-footer div.list ul.tree.dynamized li.last ul li:nth-of-type(1) a")
    @CacheLookup
    private WebElement tops3;

    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[3]/a")
    @CacheLookup
    private WebElement Tshirt1;

    @FindBy(css = "#block_top_menu ul.sf-menu.clearfix.menu-content.sf-js-enabled.sf-arrows li:nth-of-type(3) a")
    @CacheLookup
    private WebElement Tshirt2;

    @FindBy(css = "#footer div.row section:nth-of-type(2) div.category_footer.toggle-footer div.list ul.tree.dynamized li.last ul li:nth-of-type(1) ul li:nth-of-type(1) a")
    @CacheLookup
    private WebElement Tshirt3;

    @FindBy(css = "a[href='https://twitter.com/seleniumfrmwrk']")
    @CacheLookup
    private WebElement twitter;

    @FindBy(css = "#block_top_menu ul.sf-menu.clearfix.menu-content.sf-js-enabled.sf-arrows li:nth-of-type(1) a.sf-with-ul")
    @CacheLookup
    private WebElement women1;

    @FindBy(css = "#columns div:nth-of-type(1) a:nth-of-type(2)")
    @CacheLookup
    private WebElement women2;

    @FindBy(css = "#footer div.row section:nth-of-type(2) div.category_footer.toggle-footer div.list ul.tree.dynamized li.last a")
    @CacheLookup
    private WebElement women3;

    @FindBy(css = "a[href='https://www.youtube.com/channel/UCHl59sI3SRjQ-qPcTrgt0tA']")
    @CacheLookup
    private WebElement youtube;

    public TshirtPage() {
    }

    public TshirtPage(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public TshirtPage(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public TshirtPage(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on About Us Link.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage clickAboutUs1Link() {
        aboutUs1.click();
        return this;
    }

    /**
     * Click on About Us Link.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage clickAboutUs2Link() {
        aboutUs2.click();
        return this;
    }

    /**
     * Click on Add To Cart Link.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage clickAddToCartLink() {
        addToCart.click();
        return this;
    }

    /**
     * Click on Add To Compare Link.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage clickAddToCompareLink() {
        addToCompare.click();
        return this;
    }

    /**
     * Click on Add To Wishlist Link.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage clickAddToWishlistLink() {
        addToWishlist.click();
        return this;
    }

    /**
     * Click on All Specials Link.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage clickAllSpecialsLink() {
        allSpecials.click();
        return this;
    }

    /**
     * Click on Best Sellers Link.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage clickBestSellersLink() {
        bestSellers.click();
        return this;
    }

    /**
     * Click on Blouses Link.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage clickBlouses1Link() {
        blouses1.click();
        return this;
    }

    /**
     * Click on Blouses Link.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage clickBlouses2Link() {
        blouses2.click();
        return this;
    }

    /**
     * Click on Blue 1 Link.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage clickBlue11Link() {
        blue11.click();
        return this;
    }

    /**
     * Click on Blue 1 Link.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage clickBlue12Link() {
        blue12.click();
        return this;
    }

    /**
     * Click on Cart 0 Product Products Empty Link.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage clickCart0ProductProductsEmptyLink() {
        cart0ProductProductsEmpty.click();
        return this;
    }

    /**
     * Click on Casual 1 Link.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage clickCasual11Link() {
        if (!casual11.isSelected()) {
            casual11.click();
        }
        return this;
    }

    /**
     * Click on Casual 1 Link.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage clickCasual12Link() {
        casual12.click();
        return this;
    }

    /**
     * Click on Casual Dresses Link.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage clickCasualDresses1Link() {
        casualDresses1.click();
        return this;
    }

    /**
     * Click on Casual Dresses Link.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage clickCasualDresses2Link() {
        casualDresses2.click();
        return this;
    }

    /**
     * Click on Casual Dresses Link.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage clickCasualDresses3Link() {
        casualDresses3.click();
        return this;
    }

    /**
     * Click on Check Out Link.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage clickCheckOutLink() {
        checkOut.click();
        return this;
    }

    /**
     * Click on Christian Bale Link.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage clickChristianBaleLink() {
        christianBale.click();
        return this;
    }

    /**
     * Click on Compare 0 Button.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage clickCompare01Button() {
        compare01.click();
        return this;
    }

    /**
     * Click on Compare 0 Button.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage clickCompare02Button() {
        compare02.click();
        return this;
    }

    /**
     * Click on Contact Us Link.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage clickContactUs1Link() {
        contactUs1.click();
        return this;
    }

    /**
     * Click on Contact Us Link.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage clickContactUs2Link() {
        contactUs2.click();
        return this;
    }

    /**
     * Click on Cotton 1 Link.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage clickCotton11Link() {
        if (!cotton11.isSelected()) {
            cotton11.click();
        }
        return this;
    }

    /**
     * Click on Cotton 1 Link.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage clickCotton12Link() {
        cotton12.click();
        return this;
    }

    /**
     * Click on Delivery Link.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage clickDeliveryLink() {
        delivery.click();
        return this;
    }

    /**
     * Click on Discover Our Stores Link.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage clickDiscoverOurStoresLink() {
        discoverOurStores.click();
        return this;
    }

    /**
     * Click on Dresses Link.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage clickDresses1Link() {
        dresses1.click();
        return this;
    }

    /**
     * Click on Dresses Link.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage clickDresses2Link() {
        dresses2.click();
        return this;
    }

    /**
     * Click on Dresses Link.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage clickDresses3Link() {
        dresses3.click();
        return this;
    }

    /**
     * Click on Ecommerce Software By Prestashop Link.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage clickEcommerceSoftwareByPrestashopLink() {
        ecommerceSoftwareByPrestashop.click();
        return this;
    }

    /**
     * Click on Evening Dresses Link.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage clickEveningDresses1Link() {
        eveningDresses1.click();
        return this;
    }

    /**
     * Click on Evening Dresses Link.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage clickEveningDresses2Link() {
        eveningDresses2.click();
        return this;
    }

    /**
     * Click on Evening Dresses Link.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage clickEveningDresses3Link() {
        eveningDresses3.click();
        return this;
    }

    /**
     * Click on Facebook Link.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage clickFacebookLink() {
        facebook.click();
        return this;
    }

    /**
     * Click on Faded Short Sleeve... Link.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage clickFadedShortSleeveLink() {
        fadedShortSleeve.click();
        return this;
    }

    /**
     * Click on Faded Short Sleeve Tshirt Link.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage clickFadedShortSleeveTshirtLink() {
        fadedShortSleeveTshirt.click();
        return this;
    }

    /**
     * Click on Fashion Manufacturer 1 Link.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage clickFashionManufacturer11Link() {
        if (!fashionManufacturer11.isSelected()) {
            fashionManufacturer11.click();
        }
        return this;
    }

    /**
     * Click on Fashion Manufacturer 1 Link.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage clickFashionManufacturer12Link() {
        fashionManufacturer12.click();
        return this;
    }

    /**
     * Click on Google Plus Link.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage clickGooglePlusLink() {
        googlePlus.click();
        return this;
    }

    /**
     * Click on Grid Link.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage clickGridLink() {
        grid.click();
        return this;
    }

    /**
     * Click on In Stock 1 Link.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage clickInStock11Link() {
        if (!inStock11.isSelected()) {
            inStock11.click();
        }
        return this;
    }

    /**
     * Click on In Stock 1 Link.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage clickInStock12Link() {
        inStock12.click();
        return this;
    }

    /**
     * Click on Information Link.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage clickInformationLink() {
        information.click();
        return this;
    }

    /**
     * Click on L 1 Link.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage clickL11Link() {
        if (!l11.isSelected()) {
            l11.click();
        }
        return this;
    }

    /**
     * Click on L 1 Link.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage clickL12Link() {
        l12.click();
        return this;
    }

    /**
     * Click on Legal Notice Link.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage clickLegalNoticeLink() {
        legalNotice.click();
        return this;
    }

    /**
     * Click on List Link.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage clickListLink() {
        list.click();
        return this;
    }

    /**
     * Click on M 1 Link.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage clickM11Link() {
        if (!m11.isSelected()) {
            m11.click();
        }
        return this;
    }

    /**
     * Click on M 1 Link.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage clickM12Link() {
        m12.click();
        return this;
    }

    /**
     * Click on More Link.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage clickMoreLink() {
        more.click();
        return this;
    }

    /**
     * Click on My Account Link.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage clickMyAccountLink() {
        myAccount.click();
        return this;
    }

    /**
     * Click on My Addresses Link.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage clickMyAddressesLink() {
        myAddresses.click();
        return this;
    }

    /**
     * Click on My Credit Slips Link.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage clickMyCreditSlipsLink() {
        myCreditSlips.click();
        return this;
    }

    /**
     * Click on My Orders Link.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage clickMyOrdersLink() {
        myOrders.click();
        return this;
    }

    /**
     * Click on My Personal Info Link.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage clickMyPersonalInfoLink() {
        myPersonalInfo.click();
        return this;
    }

    /**
     * Click on New 1 Link.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage clickNew11Link() {
        if (!new11.isSelected()) {
            new11.click();
        }
        return this;
    }

    /**
     * Click on New 1 Link.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage clickNew12Link() {
        new12.click();
        return this;
    }

    /**
     * Click on New Products Link.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage clickNewProductsLink() {
        newProducts.click();
        return this;
    }

    /**
     * Click on Ok Button.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage clickOkButton() {
        ok.click();
        return this;
    }

    /**
     * Click on Orange 1 Link.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage clickOrange11Link() {
        orange11.click();
        return this;
    }

    /**
     * Click on Orange 1 Link.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage clickOrange12Link() {
        orange12.click();
        return this;
    }

    /**
     * Click on Our Stores Link.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage clickOurStores1Link() {
        ourStores1.click();
        return this;
    }

    /**
     * Click on Our Stores Link.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage clickOurStores2Link() {
        ourStores2.click();
        return this;
    }

    /**
     * Click on Our Stores Link.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage clickOurStores3Link() {
        ourStores3.click();
        return this;
    }

    /**
     * Click on Printed Chiffon Dress Link.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage clickPrintedChiffonDressLink() {
        printedChiffonDress.click();
        return this;
    }

    /**
     * Click on Printed Dress Link.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage clickPrintedDressLink() {
        printedDress.click();
        return this;
    }

    /**
     * Click on Proceed To Checkout Link.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage clickProceedToCheckoutLink() {
        proceedToCheckout.click();
        return this;
    }

    /**
     * Click on Quick View Link.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage clickQuickViewLink() {
        quickView.click();
        return this;
    }

    /**
     * Click on S 1 Link.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage clickS11Link() {
        if (!s11.isSelected()) {
            s11.click();
        }
        return this;
    }

    /**
     * Click on S 1 Link.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage clickS12Link() {
        s12.click();
        return this;
    }

    /**
     * Click on Search Button.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage clickSearchButton() {
        search.click();
        return this;
    }

    /**
     * Click on Secure Payment Link.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage clickSecurePaymentLink() {
        securePayment.click();
        return this;
    }

    /**
     * Click on Short Sleeve 1 Link.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage clickShortSleeve11Link() {
        if (!shortSleeve11.isSelected()) {
            shortSleeve11.click();
        }
        return this;
    }

    /**
     * Click on Short Sleeve 1 Link.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage clickShortSleeve12Link() {
        shortSleeve12.click();
        return this;
    }

    /**
     * Click on Sign Out Link.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage clickSignOut1Link() {
        signOut1.click();
        return this;
    }

    /**
     * Click on Sign Out Link.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage clickSignOut2Link() {
        signOut2.click();
        return this;
    }

    /**
     * Click on Sitemap Link.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage clickSitemapLink() {
        sitemap.click();
        return this;
    }

    /**
     * Click on Specials Link.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage clickSpecials1Link() {
        specials1.click();
        return this;
    }

    /**
     * Click on Specials Link.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage clickSpecials2Link() {
        specials2.click();
        return this;
    }

    /**
     * Click on Summer Dresses Link.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage clickSummerDresses1Link() {
        summerDresses1.click();
        return this;
    }

    /**
     * Click on Summer Dresses Link.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage clickSummerDresses2Link() {
        summerDresses2.click();
        return this;
    }

    /**
     * Click on Summer Dresses Link.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage clickSummerDresses3Link() {
        summerDresses3.click();
        return this;
    }

    /**
     * Click on Supportseleniumframework.com Link.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage clickSupportseleniumframeworkComLink() {
        supportseleniumframeworkCom.click();
        return this;
    }

    /**
     * Click on Terms And Conditions Of Use Link.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage clickTermsAndConditionsOfUse1Link() {
        termsAndConditionsOfUse1.click();
        return this;
    }

    /**
     * Click on Terms And Conditions Of Use Link.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage clickTermsAndConditionsOfUse2Link() {
        termsAndConditionsOfUse2.click();
        return this;
    }

    /**
     * Click on Tops Link.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage clickTops1Link() {
        tops1.click();
        return this;
    }

    /**
     * Click on Tops Link.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage clickTops2Link() {
        tops2.click();
        return this;
    }

    /**
     * Click on Tops Link.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage clickTops3Link() {
        tops3.click();
        return this;
    }

    /**
     * Click on Tshirt Link.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage clickTshirt1Link() {
        Tshirt1.click();
        return this;
    }

    /**
     * Click on Tshirt Link.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage clickTshirt2Link() {
        Tshirt2.click();
        return this;
    }

    /**
     * Click on Tshirt Link.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage clickTshirt3Link() {
        Tshirt3.click();
        return this;
    }

    /**
     * Click on Twitter Link.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage clickTwitterLink() {
        twitter.click();
        return this;
    }

    /**
     * Click on Women Link.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage clickWomen1Link() {
        women1.click();
        return this;
    }

    /**
     * Click on Women Link.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage clickWomen2Link() {
        women2.click();
        return this;
    }

    /**
     * Click on Women Link.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage clickWomen3Link() {
        women3.click();
        return this;
    }

    /**
     * Click on Youtube Link.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage clickYoutubeLink() {
        youtube.click();
        return this;
    }

    /**
     * Fill every fields in the page.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage fill() {
        setProductSuccessfullyAddedToYourShoppingTextField();
        clickS11Link();
        clickM11Link();
        clickL11Link();
        clickCotton11Link();
        clickCasual11Link();
        clickShortSleeve11Link();
        clickInStock11Link();
        clickFashionManufacturer11Link();
        clickNew11Link();
        setSortByDropDownListField();
        setEcommerceSoftwareByPrestashopTextField2014();
        return this;
    }

    /**
     * Fill every fields in the page and submit it to target page.
     *
     * @return the http://automationpractice.com/index.php?id_category&#x3D;5&amp;controller&#x3D;category class instance.
     */
 

    /**
     * Set default value to 2014 Ecommerce Software By Prestashop Text field.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage setEcommerceSoftwareByPrestashopTextField2014() {
        return setEcommerceSoftwareByPrestashopTextField2014(data.get("ECOMMERCE_SOFTWARE_BY_PRESTASHOP_2014"));
    }

    /**
     * Set value to 2014 Ecommerce Software By Prestashop Text field.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage setEcommerceSoftwareByPrestashopTextField2014(String ecommerceSoftwareByPrestashopValue2014) {
        ecommerceSoftwareByPrestashop2014.sendKeys(ecommerceSoftwareByPrestashopValue2014);
        return this;
    }

    /**
     * Set default value to Product Successfully Added To Your Shopping Cart Text field.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage setProductSuccessfullyAddedToYourShoppingTextField() {
        return setProductSuccessfullyAddedToYourShoppingTextField(data.get("PRODUCT_SUCCESSFULLY_ADDED_TO_YOUR_SHOPPING"));
    }

    /**
     * Set value to Product Successfully Added To Your Shopping Cart Text field.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage setProductSuccessfullyAddedToYourShoppingTextField(String productSuccessfullyAddedToYourShoppingValue) {
        productSuccessfullyAddedToYourShopping.sendKeys(productSuccessfullyAddedToYourShoppingValue);
        return this;
    }

    /**
     * Set default value to Sort By Drop Down List field.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage setSortByDropDownListField() {
        return setSortByDropDownListField(data.get("SORT_BY"));
    }

    /**
     * Set value to Sort By Drop Down List field.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage setSortByDropDownListField(String sortByValue) {
        new Select(sortBy).selectByVisibleText(sortByValue);
        return this;
    }

    /**
     * Submit the form to target page.
     *
     * @return the http://automationpractice.com/index.php?id_category&#x3D;5&amp;controller&#x3D;category class instance.
     */



    /**
     * Unset Casual 1 Checkbox field.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage unsetCasual1CheckboxField() {
        if (casual11.isSelected()) {
            casual11.click();
        }
        return this;
    }

    /**
     * Unset Cotton 1 Checkbox field.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage unsetCotton1CheckboxField() {
        if (cotton11.isSelected()) {
            cotton11.click();
        }
        return this;
    }

    /**
     * Unset Fashion Manufacturer 1 Checkbox field.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage unsetFashionManufacturer1CheckboxField() {
        if (fashionManufacturer11.isSelected()) {
            fashionManufacturer11.click();
        }
        return this;
    }

    /**
     * Unset In Stock 1 Checkbox field.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage unsetInStock1CheckboxField() {
        if (inStock11.isSelected()) {
            inStock11.click();
        }
        return this;
    }

    /**
     * Unset L 1 Checkbox field.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage unsetL1CheckboxField() {
        if (l11.isSelected()) {
            l11.click();
        }
        return this;
    }

    /**
     * Unset M 1 Checkbox field.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage unsetM1CheckboxField() {
        if (m11.isSelected()) {
            m11.click();
        }
        return this;
    }

    /**
     * Unset New 1 Checkbox field.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage unsetNew1CheckboxField() {
        if (new11.isSelected()) {
            new11.click();
        }
        return this;
    }

    /**
     * Unset S 1 Checkbox field.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage unsetS1CheckboxField() {
        if (s11.isSelected()) {
            s11.click();
        }
        return this;
    }

    /**
     * Unset Short Sleeve 1 Checkbox field.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage unsetShortSleeve1CheckboxField() {
        if (shortSleeve11.isSelected()) {
            shortSleeve11.click();
        }
        return this;
    }

    /**
     * Unset default value from Sort By Drop Down List field.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage unsetSortByDropDownListField() {
        return unsetSortByDropDownListField(data.get("SORT_BY"));
    }

    /**
     * Unset value from Sort By Drop Down List field.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage unsetSortByDropDownListField(String sortByValue) {
        new Select(sortBy).deselectByVisibleText(sortByValue);
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the TshirtPage class instance.
     */
    public TshirtPage verifyPageLoaded() {
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
     * @return the TshirtPage class instance.
     */
    public TshirtPage verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}
