package test_pages;

import org.testng.annotations.Test;
import page_objects.Checkout_page;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

import org.testng.annotations.AfterMethod;

public class Checkout_page_test extends Checkout_page {
  @Test(priority=1)
  public void reg_while_chkout_vrfy_Tc_014() {
	  reg_while_chkout_vrfy();
  }
  @Test(priority=2)
  public void reg_before_chkout_vrfy_Tc_015() {
	  reg_before_chkout_vrfy();
  }
  
  @Test(priority=3)
  public void login_before_checkout_vrfy_Tc_016() {
	  login_before_checkout_vrfy();
  }
  
  @Test(priority=4)
  public void delivery_adress_verify_Tc_023() {
	  delivery_adress_verify();
  }
  
  @Test(priority=5)
  public void download_invoice_verify_Tc_024() {
	  download_invoice_verify();
  }
  
  @BeforeMethod
  public void beforeMethod() throws IOException {
	  launch_browser("https://automationexercise.com/");
  }

  @AfterMethod
  public void afterMethod() {
  }

}
