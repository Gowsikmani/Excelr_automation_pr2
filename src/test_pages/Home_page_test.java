package test_pages;

import org.testng.annotations.Test;

import page_objects.Home_page;

import org.testng.annotations.BeforeMethod;

import java.io.IOException;

import org.testng.annotations.AfterMethod;

public class Home_page_test extends Home_page {
  @Test(priority=1)
  public void Register_acc_Tc_001() {
	  
	  Register_user();
	  
  }
  
  @Test(priority=2)
  public void valid_login_Tc_002() {
	  
	  Valid_login();
	  
  }
  
  @Test(priority=3)
  public void Invalid_login_Tc_003() {
	  
	  invalid_login();
	  
  }
  
  @Test(priority=4)
  public void logout_vrfy_Tc_004() {
	  
	  logout_vrfy();
	  
  }
  
  @Test(priority=5)
  public void existing_email_Tc_005() {
	  
	  existing_email();
	  
  }
  
  @Test(priority=6)
  public void contactus_form_Tc_006() {
	  
	  contactus_form();
	  
  }
  
  @Test(priority=7)
  public void testcase_pg_vrfy_Tc_007() {
	  
	  testcase_pg_vrfy();
	  
  }
  
  @Test(priority=10)
  public void subscription_vrfy_Tc_010() {
	  
	  subscription_vrfy();
	  
  }
  
  @Test(priority=11)
  public void scrollup_using_arrow_btn_verify_Tc_025() {
	  
	  scrollup_using_arrow_btn_verify();
	  
  }
  
  @Test(priority=12)
  public void scrollup_withoutusing_arrow_btn_verify_Tc_026() {
	  
	  scrollup_withoutusing_arrow_btn_verify();
	  
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
