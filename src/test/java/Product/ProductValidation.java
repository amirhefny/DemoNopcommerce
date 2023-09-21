package Product;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseTests;
import Register.RegisterPage;

public class ProductValidation extends BaseTests {
	@Test
	public void validProduct() throws InterruptedException {
		ProductPage ProductPage =homePage.chooseProduct();
		ProductPage.buildYourOwnComputer();
		ProductPage.clickAddToCartButton();
		//Thread.sleep(2000);
		//ProductPage.clickAddToWishButton();
		Thread.sleep(2000);
	String a7a =	ProductPage.successMessageText();
	Assert.assertEquals(a7a, "The product has been added to your shopping cart");
	
	String expectedProductQty = "1";
	String aaa = ProductPage.cartItemsQuantity();
	Assert.assertTrue(aaa.contains(expectedProductQty),"Incorrect Product quantity");
	}
	
}
