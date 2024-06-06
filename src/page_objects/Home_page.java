package page_objects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import utilities.Base;

public class Home_page extends Base {
	
	By Hpg_button = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[1]/a");
	By signuporlogin_btn = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a");
	By newuser_title = By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/h2");
	By name_field = By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]");
	By email_field = By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]");
	By signup_btn = By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button");
	By acctinfo_title = By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/h2/b");
	By Title_Mr_btn = By.xpath("//*[@id=\"id_gender1\"]");
	By Password_field = By.xpath("//*[@id=\"password\"]");
	By Dob_day = By.xpath("//*[@id=\"days\"]/option[11]");
	By Dob_month = By.xpath("//*[@id=\"months\"]/option[5]");
	By Dob_year = By.xpath("//*[@id=\"years\"]/option[23]");
	By newsletter_chkbox = By.xpath("//*[@id=\'newsletter\']");
	By sploff_chkbox = By.xpath("//*[@id=\'optin\']");
	By firstname = By.xpath("//*[@id=\"first_name\"]");
	By lastname = By.xpath("//*[@id=\"last_name\"]");
	By address = By.xpath("//*[@id=\"address1\"]");
	By country = By.xpath("//*[@id=\"country\"]/option[1]");
	By state = By.xpath("//*[@id=\"state\"]");
	By city = By.xpath("//*[@id=\"city\"]");
	By pincode = By.xpath("//*[@id=\"zipcode\"]");
	By mobile_num = By.xpath("//*[@id=\"mobile_number\"]");
	By createacc_btn = By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/button");
	By createacc_msg = By.xpath("//*[@id=\"form\"]/div/div/div/h2/b");
	By contenu_btn = By.xpath("//*[@id=\"form\"]/div/div/div/div/a");
	By loggedin_msg = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]/a");
	By deleteacc_btn = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a");
	By accdeleted_msg = By.xpath("//*[@id=\"form\"]/div/div/div/h2/b");
	By con_btn = By.xpath("//*[@id=\"form\"]/div/div/div/div/a");
	
	public void Register_user() {
		
		WebElement we1 = driver.findElement(Hpg_button);
		we1.click();
		WebElement we2 = driver.findElement(signuporlogin_btn);
		we2.click();
		WebElement we3 = driver.findElement(newuser_title);
		String s1 = we3.getText();
		String s2 = excel_values(1,1);
		s1.equals(s2);
		WebElement we4 = driver.findElement(name_field);
		we4.sendKeys(excel_values(2,1));
		WebElement we5 = driver.findElement(email_field);
		we5.sendKeys(excel_values(3,1));
		WebElement we6 = driver.findElement(signup_btn);
		we6.click();
		WebElement we7 = driver.findElement(acctinfo_title);
		String s4= we7.getText();
		String s5 = excel_values(4,1);
		Assert.assertEquals(s4, s5);
		WebElement we8 = driver.findElement(Title_Mr_btn);
		we8.click();
		WebElement we9 = driver.findElement(Password_field);
		we9.sendKeys(excel_values(5,1));
		WebElement we10 = driver.findElement(Dob_day);
		we10.click();
		WebElement we11 = driver.findElement(Dob_month);
		we11.click();
		WebElement we12 = driver.findElement(Dob_year);
		we12.click();
		WebElement we13 = driver.findElement(newsletter_chkbox);
		we13.click();
		WebElement we14 = driver.findElement(sploff_chkbox);
		we14.click();
		WebElement we15 = driver.findElement(firstname);
		we15.sendKeys(excel_values(6,1));
		WebElement we16 = driver.findElement(lastname);
		we16.sendKeys(excel_values(7,1));
		WebElement we17 =  driver.findElement(address);
		we17.sendKeys(excel_values(8,1));
		WebElement we18 = driver.findElement(country);
		we18.click();
		WebElement we19 = driver.findElement(state);
		we19.sendKeys(excel_values(9,1));
		WebElement we20 = driver.findElement(city);
		we20.sendKeys(excel_values(10,1));
		WebElement we21 = driver.findElement(pincode);
		we21.sendKeys(excel_values(11,1));
		WebElement we22 = driver.findElement(mobile_num);
		we22.sendKeys(excel_values(12,1));
		WebElement we23 = driver.findElement(createacc_btn);
		we23.click();
		WebElement we24 = driver.findElement(createacc_msg);
		String s6 = we24.getText();
		String s7 = excel_values(13,1);
		Assert.assertEquals(s6, s7);
		WebElement we25 = driver.findElement(contenu_btn);
		we25.click();
		/*Alert a = driver.switchTo().alert();
		a.dismiss();*/
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement we26 = driver.findElement(loggedin_msg);
		String s8 = we26.getText();
		String s9 = excel_values(14,1);
		Assert.assertEquals(s8, s9);
		WebElement we27 = driver.findElement(deleteacc_btn);
		we27.click();
		WebElement we28 = driver.findElement(accdeleted_msg);
		String s11 = we28.getText();
		String s12 = excel_values(15,1);
		Assert.assertEquals(s11, s12);
		WebElement we29 = driver.findElement(con_btn);
		we29.click();
		}
	
	
	By login_title=By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/h2");
	By login_email = By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]");
	By login_pwd = By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[3]");
	By login_btn = By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button");
	
	public void Valid_login() {
		
		WebElement we1 = driver.findElement(Hpg_button);
		we1.click();
		WebElement we2 = driver.findElement(signuporlogin_btn);
		we2.click();
		WebElement we3 = driver.findElement(login_title);
		String s1 = we3.getText();
		String s2 = excel_values(16,1);
		Assert.assertEquals(s1, s2);
		WebElement we4 = driver.findElement(login_email);
		we4.sendKeys(excel_values(17,1));
		WebElement we5 = driver.findElement(login_pwd);
		we5.sendKeys(excel_values(18,1));
		WebElement we6 = driver.findElement(login_btn);
		we6.click();
		WebElement we7 = driver.findElement(loggedin_msg);
		String s3 = we7.getText();
		String s4 = excel_values(19,1);
		Assert.assertEquals(s3, s4);
		
		
	}
	
	By invalidlogin_errormsg = By.xpath("//*[@id=\"form\"]/div/div/div[1]/div[1]/form/p");
	
	public void invalid_login() {
		
		WebElement we1 = driver.findElement(Hpg_button);
		we1.click();
		WebElement we2 = driver.findElement(signuporlogin_btn);
		we2.click();
		WebElement we3 = driver.findElement(login_title);
		String s1 = we3.getText();
		String s2 = excel_values(16,1);
		Assert.assertEquals(s1, s2);
		WebElement we4 = driver.findElement(login_email);
		we4.sendKeys(excel_values(21,1));
		WebElement we5 = driver.findElement(login_pwd);
		we5.sendKeys(excel_values(22,1));
		WebElement we6 = driver.findElement(login_btn);
		we6.click();
		WebElement we7 = driver.findElement(invalidlogin_errormsg);
		String s3 = we7.getText();
		String s4 = excel_values(23,1);
		Assert.assertEquals(s3, s4);
		
	}
	
	By logout_btn = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a");
	
	public void logout_vrfy() {
		
		WebElement we1 = driver.findElement(Hpg_button);
		we1.click();
		WebElement we2 = driver.findElement(signuporlogin_btn);
		we2.click();
		WebElement we3 = driver.findElement(login_title);
		String s1 = we3.getText();
		String s2 = excel_values(16,1);
		Assert.assertEquals(s1, s2);
		WebElement we4 = driver.findElement(login_email);
		we4.sendKeys(excel_values(17,1));
		WebElement we5 = driver.findElement(login_pwd);
		we5.sendKeys(excel_values(18,1));
		WebElement we6 = driver.findElement(login_btn);
		we6.click();
		WebElement we7 = driver.findElement(loggedin_msg);
		String s3 = we7.getText();
		String s4 = excel_values(19,1);
		Assert.assertEquals(s3, s4);
		WebElement we8 = driver.findElement(logout_btn);
		we8.click();
		WebElement we9 = driver.findElement(login_title);
		String s5 = we9.getText();
		String s6 = excel_values(16,1);
		Assert.assertEquals(s5, s6);
	}
	
	By existingmail_errmsg = By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/p");
	
	public void existing_email() {
		
		WebElement we1 = driver.findElement(Hpg_button);
		we1.click();
		WebElement we2 = driver.findElement(signuporlogin_btn);
		we2.click();
		WebElement we3 = driver.findElement(newuser_title);
		String s1 = we3.getText();
		String s2 = excel_values(1,1);
		s1.equals(s2);
		WebElement we4 = driver.findElement(name_field);
		we4.sendKeys(excel_values(2,1));
		WebElement we5 = driver.findElement(email_field);
		we5.sendKeys(excel_values(17,1));
		WebElement we6 = driver.findElement(signup_btn);
		we6.click();
		WebElement we7 = driver.findElement(existingmail_errmsg);
		String s3 = we7.getText();
		String s4 = excel_values(24,1);
		Assert.assertEquals(s3, s4);
		
	}
	
	By contactus_form_btn = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[8]/a");
	By getin_ttle = By.xpath("//*[@id=\"contact-page\"]/div[2]/div[1]/div/h2");
	By con_name_fld = By.xpath("//*[@id=\"contact-us-form\"]/div[1]/input");
	By con_mail_fld = By.xpath("//*[@id=\"contact-us-form\"]/div[2]/input");
	By con_subject_fld = By.xpath("//*[@id=\"contact-us-form\"]/div[3]/input");
	By con_msg_field = By.xpath("//*[@id=\"message\"]");
	By con_uploadfile = By.xpath("//*[@id=\"contact-us-form\"]/div[5]/input");
	By submit_btn = By.xpath("//*[@id=\"contact-us-form\"]/div[6]/input");
	By success_msg = By.xpath("//*[@id=\"contact-page\"]/div[2]/div[1]/div/div[2]");
	By home_btn = By.xpath("//*[@id=\"form-section\"]/a/span");
	
	
	public void contactus_form() {
		
		WebElement we1 = driver.findElement(contactus_form_btn);
		we1.click();
		
		WebElement we2 = driver.findElement(getin_ttle);
		String s1 = we2.getText();
		String s2 = excel_values(25,1);
		Assert.assertEquals(s1, s2);
		WebElement we3 = driver.findElement(con_name_fld);
		we3.sendKeys(excel_values(26,1));
		WebElement we4 = driver.findElement(con_mail_fld);
		we4.sendKeys(excel_values(27,1));
		WebElement we5 = driver.findElement(con_subject_fld);
		we5.sendKeys(excel_values(28,1));
		WebElement we6 = driver.findElement(con_msg_field);
		we6.sendKeys(excel_values(29,1));
		WebElement we7 = driver.findElement(con_uploadfile);
		we7.sendKeys("D:\\Documents\\sanjai research paper.docx");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement we8 = driver.findElement(submit_btn);
		we8.click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Alert a = driver.switchTo().alert();
		a.accept();
		WebElement we9 = driver.findElement(success_msg);
		String s3 = we9.getText();
		String s4 = excel_values(30,1);
		Assert.assertEquals(s3, s4);
		WebElement we10 = driver.findElement(home_btn);
		we10.click();
	}

	By testcase_btn = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a");
	By tc_pgt_tle = By.xpath("//*[@id=\"form\"]/div/div[1]/div/h2/b");
	
	public void testcase_pg_vrfy() {
		
		WebElement we1 = driver.findElement(Hpg_button);
		we1.click();
		WebElement we2 = driver.findElement(testcase_btn);
		we2.click();
		WebElement we3 = driver.findElement(tc_pgt_tle);
		String s1 = we3.getText();
		String s2 = excel_values(31,1);
		Assert.assertEquals(s1, s2);
		
	}
	
	By footer = By.xpath("//*[@id=\"footer\"]/div[1]");
	By subr_title = By.xpath("//*[@id=\"footer\"]/div[1]/div/div/div[2]/div/h2");
	By subr_mailbox = By.xpath("//*[@id=\"susbscribe_email\"]");
	By subr_submit_btn = By.xpath("//*[@id=\"subscribe\"]");
	By subscrip_sucmsg = By.xpath("//*[@id=\"success-subscribe\"]/div");
	
	public void subscription_vrfy() {
		
		WebElement we1 = driver.findElement(Hpg_button);
		we1.click();
		WebElement we2 = driver.findElement(footer);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", we2);
		WebElement we3 = driver.findElement(subr_title);
		String s1 = we3.getText();
		String s2 = excel_values(37,1);
		Assert.assertEquals(s1, s2);
		WebElement we4 = driver.findElement(subr_mailbox);
		we4.sendKeys(excel_values(38,1));
		WebElement we5 = driver.findElement(subr_submit_btn);
		we5.click();
		WebElement we6 = driver.findElement(subscrip_sucmsg);
		String s3 = we6.getText();
		String s4 = excel_values(39,1);
		Assert.assertEquals(s3, s4);
		System.out.println(s3);
		
	}
	
	By scrollup_btn = By.xpath("//*[@id=\"scrollUp\"]");
	By fullfledged_title = By.xpath("//*[@id=\"slider-carousel\"]/div/div[3]/div[1]/h2");
	
	public void scrollup_using_arrow_btn_verify() {
		
		WebElement we1 = driver.findElement(Hpg_button);
		we1.click();
		WebElement we2 = driver.findElement(footer);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", we2);
		WebElement we3 = driver.findElement(subr_title);
		String s1 = we3.getText();
		String s2 = excel_values(37,1);
		Assert.assertEquals(s1, s2);
		WebElement we4 = driver.findElement(scrollup_btn);
		we4.click();
		WebElement we5 = driver.findElement(fullfledged_title);
		String s3 = we5.getText();
		String s4 = "Full-Fledged practice website for Automation Engineers";
		Assert.assertEquals(s3, s4);
		
	}
	
	public void scrollup_withoutusing_arrow_btn_verify() {
		
		WebElement we1 = driver.findElement(Hpg_button);
		we1.click();
		WebElement we2 = driver.findElement(footer);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", we2);
		WebElement we3 = driver.findElement(subr_title);
		String s1 = we3.getText();
		String s2 = excel_values(37,1);
		Assert.assertEquals(s1, s2);
		JavascriptExecutor jss = (JavascriptExecutor) driver;
		jss.executeScript("window.scrollBy(0,-9183)", "");
		WebElement we5 = driver.findElement(fullfledged_title);
		String s3 = we5.getText();
		String s4 = "Full-Fledged practice website for Automation Engineers";
		Assert.assertEquals(s3, s4);
		
	}
	
}	
