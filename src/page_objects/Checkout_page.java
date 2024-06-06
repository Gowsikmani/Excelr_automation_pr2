package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import utilities.Base;

public class Checkout_page extends Base {
	
	By Hpg_button = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[1]/a");
	By prdct_btn = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a");
	By frst_prdct = By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div/div[1]/div[1]");
	By view_cart = By.xpath("//*[@id=\"cartModal\"]/div/div/div[2]/p[2]/a/u");
	By checkout_btn = By.xpath("//*[@id=\"do_action\"]/div[1]/div/div/a");
	By reg_login_btn = By.xpath("//*[@id=\"checkoutModal\"]/div/div/div[2]/p[2]/a/u");
	By name_field = By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]");
	By mail_field = By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]");
	By signup_btn = By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button");
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
	By cart_btn = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a");
	By description_box = By.xpath("//*[@id=\"ordermsg\"]/textarea");
	By place_order_btn = By.xpath("//*[@id=\"cart_items\"]/div/div[7]/a");
	By nameoncard_fld = By.xpath("//*[@id=\"payment-form\"]/div[1]/div/input");
	By card_num_fld = By.xpath("//*[@id=\"payment-form\"]/div[2]/div/input");
	By cv_fld = By.xpath("//*[@id=\"payment-form\"]/div[3]/div[1]/input");
	By month_fld = By.xpath("//*[@id=\"payment-form\"]/div[3]/div[2]/input");
	By year_fld = By.xpath("//*[@id=\"payment-form\"]/div[3]/div[3]/input");
	By cnfrm_order_btn = By.xpath("//*[@id=\"submit\"]");
	By order_sucess_msg = By.xpath("//*[@id=\"form\"]/div/div/div/p");
	By deleteacc_btn = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a");
	By accdeleted_msg = By.xpath("//*[@id=\"form\"]/div/div/div/h2/b");
	By con_btn = By.xpath("//*[@id=\"form\"]/div/div/div/div/a");
	
	public void reg_while_chkout_vrfy() {
		WebElement we1 = driver.findElement(Hpg_button);
		we1.click();
		WebElement we2 = driver.findElement(prdct_btn);
		we2.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement we3 = driver.findElement(frst_prdct);
		Actions a = new Actions(driver);
		a.moveToElement(we3).perform();
	    driver.findElement(By.linkText("Add to cart")).click();
	    
	    WebElement we4 = driver.findElement(view_cart);
		we4.click();
		WebElement we5 = driver.findElement(checkout_btn);
		we5.click();
		WebElement we6 = driver.findElement(name_field);
		we6.sendKeys(excel_values(2,1));
		WebElement we7 = driver.findElement(mail_field);
		we7.sendKeys(excel_values(3,1));
		WebElement we07 = driver.findElement(signup_btn);
		we07.click();
		
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
		
		WebElement we26 = driver.findElement(loggedin_msg);
		String s8 = we26.getText();
		String s9 = excel_values(14,1);
		Assert.assertEquals(s8, s9);
		WebElement we27 = driver.findElement(cart_btn);
		we27.click();
		WebElement we28 = driver.findElement(checkout_btn);
		we28.click();
		WebElement we29 = driver.findElement(description_box);
		String x= "good product";
		we29.sendKeys(x);
		WebElement we30 = driver.findElement(place_order_btn);
		we30.click();
		WebElement we31 = driver.findElement(nameoncard_fld);
		String x2= "ram";
		we31.sendKeys(x2);
		WebElement we32 = driver.findElement(card_num_fld);
		String x3= "4567893337324576";
		we32.sendKeys(x3);
		WebElement we33 = driver.findElement(cv_fld);
		String x4= "345";
		we33.sendKeys(x4);
		WebElement we34 = driver.findElement(month_fld);
		String x5= "03";
		we34.sendKeys(x5);
		WebElement we35 = driver.findElement(year_fld);
		String x6= "2035";
		we35.sendKeys(x6);
		WebElement we36 = driver.findElement(cnfrm_order_btn);
		we36.click();
		WebElement we37 = driver.findElement(order_sucess_msg);
		String x9 = "Congratulations! Your order has been confirmed!";
		String x8 = we37.getText();
		Assert.assertEquals(x8, x9);
		
		WebElement we38 = driver.findElement(deleteacc_btn);
		we38.click();
		WebElement we39 = driver.findElement(accdeleted_msg);
		String x11 = we39.getText();
		String x12 = excel_values(15,1);
		Assert.assertEquals(x11, x12);
		WebElement we40 = driver.findElement(con_btn);
		we40.click();

		
	}
	
	
	By signuporlogin_btn = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a");
	public void reg_before_chkout_vrfy() {
		WebElement we1 = driver.findElement(Hpg_button);
		we1.click();
		WebElement we2 = driver.findElement(signuporlogin_btn);
		we2.click();
		WebElement we6 = driver.findElement(name_field);
		we6.sendKeys(excel_values(2,1));
		WebElement we7 = driver.findElement(mail_field);
		we7.sendKeys(excel_values(3,1));
		WebElement we07 = driver.findElement(signup_btn);
		we07.click();
		
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
		
		WebElement we26 = driver.findElement(loggedin_msg);
		String s8 = we26.getText();
		String s9 = excel_values(14,1);
		Assert.assertEquals(s8, s9);
		WebElement we02 = driver.findElement(prdct_btn);
		we02.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement we3 = driver.findElement(frst_prdct);
		Actions a = new Actions(driver);
		a.moveToElement(we3).perform();
	    driver.findElement(By.linkText("Add to cart")).click();
	    
	    WebElement we4 = driver.findElement(view_cart);
		we4.click();
		WebElement we5 = driver.findElement(checkout_btn);
		we5.click();
		WebElement we27 = driver.findElement(cart_btn);
		we27.click();
		WebElement we28 = driver.findElement(checkout_btn);
		we28.click();
		WebElement we29 = driver.findElement(description_box);
		String x= "good product";
		we29.sendKeys(x);
		WebElement we30 = driver.findElement(place_order_btn);
		we30.click();
		WebElement we31 = driver.findElement(nameoncard_fld);
		String x2= "ram";
		we31.sendKeys(x2);
		WebElement we32 = driver.findElement(card_num_fld);
		String x3= "4567893337324576";
		we32.sendKeys(x3);
		WebElement we33 = driver.findElement(cv_fld);
		String x4= "345";
		we33.sendKeys(x4);
		WebElement we34 = driver.findElement(month_fld);
		String x5= "03";
		we34.sendKeys(x5);
		WebElement we35 = driver.findElement(year_fld);
		String x6= "2035";
		we35.sendKeys(x6);
		WebElement we36 = driver.findElement(cnfrm_order_btn);
		we36.click();
		WebElement we37 = driver.findElement(order_sucess_msg);
		String x9 = "Congratulations! Your order has been confirmed!";
		String x8 = we37.getText();
		Assert.assertEquals(x8, x9);
		
		WebElement we38 = driver.findElement(deleteacc_btn);
		we38.click();
		WebElement we39 = driver.findElement(accdeleted_msg);
		String x11 = we39.getText();
		String x12 = excel_values(15,1);
		Assert.assertEquals(x11, x12);
		WebElement we40 = driver.findElement(con_btn);
		we40.click();
		
	}
	
    
    By login_email = By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]");
   	By login_pwd = By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[3]");
   	By login_btn = By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button");
	
	public void login_before_checkout_vrfy() {
		
		WebElement we1 = driver.findElement(Hpg_button);
		we1.click();
		WebElement we2 = driver.findElement(signuporlogin_btn);
		we2.click();
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
		WebElement we3 = driver.findElement(frst_prdct);
		Actions a = new Actions(driver);
		a.moveToElement(we3).perform();
	    driver.findElement(By.linkText("Add to cart")).click();
	    
	    WebElement we24 = driver.findElement(view_cart);
		we24.click();
		WebElement we25 = driver.findElement(checkout_btn);
		we25.click();
		WebElement we27 = driver.findElement(cart_btn);
		we27.click();
		WebElement we28 = driver.findElement(checkout_btn);
		we28.click();
		WebElement we29 = driver.findElement(description_box);
		String x= "good product";
		we29.sendKeys(x);
		WebElement we30 = driver.findElement(place_order_btn);
		we30.click();
		WebElement we31 = driver.findElement(nameoncard_fld);
		String x2= "ram";
		we31.sendKeys(x2);
		WebElement we32 = driver.findElement(card_num_fld);
		String x3= "4567893337324576";
		we32.sendKeys(x3);
		WebElement we33 = driver.findElement(cv_fld);
		String x4= "345";
		we33.sendKeys(x4);
		WebElement we34 = driver.findElement(month_fld);
		String x5= "03";
		we34.sendKeys(x5);
		WebElement we35 = driver.findElement(year_fld);
		String x6= "2035";
		we35.sendKeys(x6);
		WebElement we36 = driver.findElement(cnfrm_order_btn);
		we36.click();
		WebElement we37 = driver.findElement(order_sucess_msg);
		String x9 = "Congratulations! Your order has been confirmed!";
		String x8 = we37.getText();
		Assert.assertEquals(x8, x9);
		
		WebElement we38 = driver.findElement(deleteacc_btn);
		we38.click();
		WebElement we39 = driver.findElement(accdeleted_msg);
		String x11 = we39.getText();
		String x12 = excel_values(15,1);
		Assert.assertEquals(x11, x12);
		WebElement we40 = driver.findElement(con_btn);
		we40.click();
	}
	
	By download_invoice_btn = By.xpath("//*[@id=\"form\"]/div/div/div/a");
	
	public void download_invoice_verify() {
		
		WebElement we1 = driver.findElement(Hpg_button);
		we1.click();
		WebElement we2 = driver.findElement(prdct_btn);
		we2.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement we3 = driver.findElement(frst_prdct);
		Actions a = new Actions(driver);
		a.moveToElement(we3).perform();
	    driver.findElement(By.linkText("Add to cart")).click();
	    
	    WebElement we4 = driver.findElement(view_cart);
		we4.click();
		WebElement we5 = driver.findElement(checkout_btn);
		we5.click();
		WebElement we6 = driver.findElement(name_field);
		we6.sendKeys(excel_values(2,1));
		WebElement we7 = driver.findElement(mail_field);
		we7.sendKeys(excel_values(3,1));
		WebElement we07 = driver.findElement(signup_btn);
		we07.click();
		
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
		
		WebElement we26 = driver.findElement(loggedin_msg);
		String s8 = we26.getText();
		String s9 = excel_values(14,1);
		Assert.assertEquals(s8, s9);
		WebElement we27 = driver.findElement(cart_btn);
		we27.click();
		WebElement we28 = driver.findElement(checkout_btn);
		we28.click();
		WebElement we29 = driver.findElement(description_box);
		String x= "good product";
		we29.sendKeys(x);
		WebElement we30 = driver.findElement(place_order_btn);
		we30.click();
		WebElement we31 = driver.findElement(nameoncard_fld);
		String x2= "ram";
		we31.sendKeys(x2);
		WebElement we32 = driver.findElement(card_num_fld);
		String x3= "4567893337324576";
		we32.sendKeys(x3);
		WebElement we33 = driver.findElement(cv_fld);
		String x4= "345";
		we33.sendKeys(x4);
		WebElement we34 = driver.findElement(month_fld);
		String x5= "03";
		we34.sendKeys(x5);
		WebElement we35 = driver.findElement(year_fld);
		String x6= "2035";
		we35.sendKeys(x6);
		WebElement we36 = driver.findElement(cnfrm_order_btn);
		we36.click();
		WebElement we37 = driver.findElement(order_sucess_msg);
		String x9 = "Congratulations! Your order has been confirmed!";
		String x8 = we37.getText();
		Assert.assertEquals(x8, x9);
		WebElement we41 = driver.findElement(download_invoice_btn);
		we41.click();
		
		WebElement we38 = driver.findElement(deleteacc_btn);
		we38.click();
		WebElement we39 = driver.findElement(accdeleted_msg);
		String x11 = we39.getText();
		String x12 = excel_values(15,1);
		Assert.assertEquals(x11, x12);
		WebElement we40 = driver.findElement(con_btn);
		we40.click();
	}
	
	
	By delivery_adress_box = By.xpath("//*[@id=\"address_delivery\"]");
	
	public void delivery_adress_verify() {
		
		WebElement we1 = driver.findElement(Hpg_button);
		we1.click();
		WebElement we2 = driver.findElement(prdct_btn);
		we2.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement we3 = driver.findElement(frst_prdct);
		Actions a = new Actions(driver);
		a.moveToElement(we3).perform();
	    driver.findElement(By.linkText("Add to cart")).click();
	    
	    WebElement we4 = driver.findElement(view_cart);
		we4.click();
		WebElement we5 = driver.findElement(checkout_btn);
		we5.click();
		WebElement we6 = driver.findElement(name_field);
		we6.sendKeys(excel_values(2,1));
		WebElement we7 = driver.findElement(mail_field);
		we7.sendKeys(excel_values(3,1));
		WebElement we07 = driver.findElement(signup_btn);
		we07.click();
		
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
		
		WebElement we26 = driver.findElement(loggedin_msg);
		String s8 = we26.getText();
		String s9 = excel_values(14,1);
		Assert.assertEquals(s8, s9);
		WebElement we27 = driver.findElement(cart_btn);
		we27.click();
		WebElement we28 = driver.findElement(checkout_btn);
		we28.click();
		WebElement we29 = driver.findElement(delivery_adress_box);
		String s11 = we29.getText();
		String s12 = excel_values(43,1);
		Assert.assertEquals(s11, s12);
		WebElement we38 = driver.findElement(deleteacc_btn);
		we38.click();
		WebElement we39 = driver.findElement(accdeleted_msg);
		String x11 = we39.getText();
		String x12 = excel_values(15,1);
		Assert.assertEquals(x11, x12);
		WebElement we40 = driver.findElement(con_btn);
		we40.click();
		
	}
	
}
