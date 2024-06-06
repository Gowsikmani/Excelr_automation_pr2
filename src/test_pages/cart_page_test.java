package test_pages;

import org.testng.annotations.Test;
import page_objects.cart_page;
import org.testng.annotations.BeforeMethod;
import java.io.IOException;
import org.testng.annotations.AfterMethod;

public class cart_page_test extends cart_page {
  @Test(priority=1)
  public void cart_subscription_verify_Tc_011() {
	  
	  cart_subscription_verify();
  }
  
  @Test(priority=2)
  public void add_product_tocart_Tc_012() {
	  
	  add_product_tocart();
  }
  
  @Test(priority=3)
  public void verify_quantity_in_cart_Tc_013() {
	  
	  verify_quantity_in_cart();
  }
  
  @Test(priority=4)
  public void remove_prdctfrm_cart_verify_Tc_017() {
	  
	  remove_prdctfrm_cart_verify();
  }
  
  @Test(priority=5)
  public void addtocart_recomendeditem_verify_Tc_022() {
	  
	  addtocart_recomendeditem_verify();
  }
  
  
  @BeforeMethod
  public void beforeMethod() throws IOException {
	  launch_browser("https://automationexercise.com/");
  }

  @AfterMethod
  public void afterMethod() {
	  close_browser();
  }

}
