package test_pages;

import org.testng.annotations.Test;
import page_objects.products_page;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

import org.testng.annotations.AfterMethod;

public class product_page_test extends products_page{
  @Test(priority=1)
  public void product_detail_verify_Tc_008() {
	  
	  product_detail_verify();
  }
  
  @Test(priority=2)
  public void Search_product_Tc_009() {
	  
	  Search_product();
  }
  
  @Test(priority=3)
  public void view_category_prdcts_verify_Tc_018() {
	  
	  view_category_prdct_verify();
	  
  }
  
  @Test(priority=4)
  public void product_brand_verify_Tc_019() {
	  
	  product_brand_verify();
	  
  }
  
  @Test(priority=5)
  public void searchproduct_afterlogin_cartverify_Tc_020() {
	  
	  searchproduct_afterlogin_cartverify();
	  
  }
  
  @Test(priority=6)
  public void add_reviewon_prdct_verify_Tc_021() {
	  
	  add_reviewon_prdct_verify();
	  
  }
  
  @BeforeMethod
  public void beforeMethod() throws IOException {
	  launch_browser("https://automationexercise.com/");
  }

  @AfterMethod
  public void afterMethod() {
	  //close_browser();
  }

}
