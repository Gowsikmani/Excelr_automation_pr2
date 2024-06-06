package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import utilities.Base;

public class products_page extends Base{
	
	By Hpg_button = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[1]/a");
	By product_btn = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a");
	By productpg_ttle = By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/h2");
    By viewprdt_btn = By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div/div[2]/ul/li/a");
    By prdct_name = By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/h2");
    By category = By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[1]");
    By availability = By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[2]");
    By condition = By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[3]");
    By brand = By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[4]");
    
    public void product_detail_verify() {
    	
    	WebElement we1 = driver.findElement(Hpg_button);
		we1.click();
		WebElement we2 = driver.findElement(product_btn);
		we2.click();
		WebElement we3 = driver.findElement(productpg_ttle);
		String s1 = we3.getText();
		String s2 = excel_values(32,1);
		Assert.assertEquals(s1, s2);
		WebElement we4 = driver.findElement(viewprdt_btn);
		we4.click();
		WebElement we5 = driver.findElement(prdct_name);
		String s3 = we5.getText();
		String s4 = excel_values(33,1);
		Assert.assertEquals(s3, s4);
		WebElement we6 = driver.findElement(category);
		String s5 = we6.getText();
		String s6 = excel_values(34,1);
		Assert.assertEquals(s5, s6);
		WebElement we7 = driver.findElement(availability);
	    we7.getText();
		
		WebElement we8 = driver.findElement(condition);
	    we8.getText();
		
		WebElement we9 = driver.findElement(brand);
	    we9.getText();
			
    }
    
    By searchbox = By.xpath("//*[@id=\"search_product\"]");
    By search_btn = By.xpath("//*[@id=\"submit_search\"]");
    By searched_ttle = By.xpath("/html/body/section[2]/div/div/div[2]/div/h2");
    
    public void Search_product() {
    	
    	WebElement we1 = driver.findElement(Hpg_button);
		we1.click();
		WebElement we2 = driver.findElement(product_btn);
		we2.click();
		WebElement we3 = driver.findElement(productpg_ttle);
		String s1 = we3.getText();
		String s2 = excel_values(32,1);
		Assert.assertEquals(s1, s2);
		WebElement we4 = driver.findElement(searchbox);
		we4.sendKeys(excel_values(35,1));
		WebElement we5 = driver.findElement(search_btn);
		we5.click();
		WebElement we6 = driver.findElement(searched_ttle);
		String s3 = we6.getText();
		String s4 = excel_values(36,1);
		Assert.assertEquals(s3, s4);
		
    }
    
    By women_ctgry_btn = By.xpath("//*[@id=\"accordian\"]/div[1]/div[1]/h4");
    By wn_dress_tab = By.xpath("//*[@id=\"Women\"]/div/ul/li[1]");
    By wn_dresspg_title = By.xpath("/html/body/section/div/div[2]/div[2]/div/h2");
    By men_ctgry_btn = By.xpath("//*[@id=\"accordian\"]/div[2]/div[1]/h4/a");
    By men_tshirt_tab = By.xpath("//*[@id=\"Men\"]/div/ul/li[1]");
    By men_tshirtpg_title = By.xpath("/html/body/section/div/div[2]/div[2]/div/h2");
    
    public void view_category_prdct_verify() {
    	
    	WebElement we1 = driver.findElement(Hpg_button);
		we1.click();
		WebElement we2 = driver.findElement(women_ctgry_btn);
		we2.click();
		WebElement we3 = driver.findElement(wn_dress_tab);
		we3.click();
		WebElement we4 = driver.findElement(wn_dresspg_title);
		String s1 = we4.getText();
		String s2 = "WOMEN - DRESS PRODUCTS";
		Assert.assertEquals(s1, s2);
		WebElement we5 = driver.findElement(men_ctgry_btn);
		we5.click();
		WebElement we6 = driver.findElement(men_tshirt_tab);
		we6.click();
		WebElement we7 = driver.findElement(men_tshirtpg_title);
		String s3 = we7.getText();
		String s4 = "MEN - TSHIRTS PRODUCTS";
		Assert.assertEquals(s3, s4);
		
    }
    
    
    By frst_brand_btn = By.xpath("/html/body/section[2]/div[1]/div/div[1]/div/div[2]/div/ul/li[1]/a");
    By frst_brand_title = By.xpath("/html/body/section/div/div[2]/div[2]/div/h2");
    By scnd_brand_btn = By.xpath("/html/body/section/div/div[2]/div[1]/div[1]/div[2]/div/ul/li[2]/a");
    By scnd_brand_title = By.xpath("/html/body/section/div/div[2]/div[2]/div/h2");
    
    public void product_brand_verify() {
    	
    	WebElement we1 = driver.findElement(Hpg_button);
		we1.click();
		WebElement we2 = driver.findElement(product_btn);
		we2.click();
		WebElement we3 = driver.findElement(frst_brand_btn);
		we3.click();
		WebElement we4 = driver.findElement(frst_brand_title);
		String s1 = we4.getText();
		String s2 = "BRAND - POLO PRODUCTS";
		Assert.assertEquals(s1, s2);
		WebElement we5 = driver.findElement(scnd_brand_btn);
		we5.click();
		WebElement we6 = driver.findElement(scnd_brand_title);
	    String s3 = we6.getText();
	    String s4 = "BRAND - H&M PRODUCTS";
	    Assert.assertEquals(s3, s4);
		
    }
    
    By frst_prdct = By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div/div[1]/div[1]");
	By scnd_prdct =By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[3]/div/div[1]/div[1]");
	By continue_shopping = By.xpath("//*[@id=\"cartModal\"]/div/div/div[3]/button");
	By view_cart = By.xpath("//*[@id=\"cartModal\"]/div/div/div[2]/p[2]/a/u");
	By signuporlogin_btn = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a");
	By login_email = By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]");
	By login_pwd = By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[3]");
	By login_btn = By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button");
	By cart_btn = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a");
    
    public void searchproduct_afterlogin_cartverify() {
    	
    	WebElement we1 = driver.findElement(Hpg_button);
		we1.click();
		WebElement we2 = driver.findElement(product_btn);
		we2.click();
		WebElement we3 = driver.findElement(productpg_ttle);
		String s1 = we3.getText();
		String s2 = excel_values(32,1);
		Assert.assertEquals(s1, s2);
		WebElement we4 = driver.findElement(searchbox);
		we4.sendKeys(excel_values(35,1));
		WebElement we5 = driver.findElement(search_btn);
		we5.click();
		WebElement we6 = driver.findElement(searched_ttle);
		String s3 = we6.getText();
		String s4 = excel_values(36,1);
		Assert.assertEquals(s3, s4);
		
		WebElement we7 = driver.findElement(frst_prdct);
		Actions a = new Actions(driver);
		a.moveToElement(we7).perform();
	    driver.findElement(By.linkText("Add to cart")).click();
		
	    WebElement we8 = driver.findElement(continue_shopping);
	    we8.click();
		
		WebElement we9 = driver.findElement(scnd_prdct);
		Actions a2 = new Actions(driver);
		a2.moveToElement(we9).perform();
		driver.findElement(By.linkText("Add to cart")).click();
		
		WebElement we10 = driver.findElement(view_cart);
		we10.click();
		WebElement we11 = driver.findElement(signuporlogin_btn);
		we11.click();
		WebElement we14 = driver.findElement(login_email);
		we14.sendKeys(excel_values(17,1));
		WebElement we15 = driver.findElement(login_pwd);
		we15.sendKeys(excel_values(18,1));
		WebElement we16 = driver.findElement(login_btn);
		we16.click();
		WebElement we17 = driver.findElement(cart_btn);
		we17.click();
		
    }
    
    By review_title = By.xpath("/html/body/section/div/div/div[2]/div[3]/div[1]/ul/li/a");
    By review_name_box = By.xpath("//*[@id=\"name\"]");
    By review_mail_box = By.xpath("//*[@id=\"email\"]");
    By review_box = By.xpath("//*[@id=\"review\"]");
    By review_submit_btn = By.xpath("//*[@id=\"button-review\"]");
    By review_success_msg = By.xpath("//*[@id=\"review-section\"]/div/div/span");
    
    public void add_reviewon_prdct_verify() {
    	
    	WebElement we2 = driver.findElement(product_btn);
		we2.click();
		WebElement we3 = driver.findElement(productpg_ttle);
		String s1 = we3.getText();
		String s2 = excel_values(32,1);
		Assert.assertEquals(s1, s2);
		WebElement we4 = driver.findElement(viewprdt_btn);
		we4.click();
		WebElement we5 = driver.findElement(review_title);
		String s3 = we5.getText();
		String s4 = "Write Your Review";
		Assert.assertEquals(s3, s4);
		WebElement we6 = driver.findElement(review_name_box);
		we6.sendKeys(excel_values(26,1));
		WebElement we7 = driver.findElement(review_mail_box);
		we7.sendKeys(excel_values(27,1));
		WebElement we8 = driver.findElement(review_box);
		we8.sendKeys(excel_values(40,1));
		WebElement we9 = driver.findElement(review_submit_btn);
		we9.click();
		WebElement we10 = driver.findElement(review_success_msg);
		String s5 = we10.getText();
		String s6 = excel_values(41,1);
		Assert.assertEquals(s5, s6);
		

    }
    
    
}