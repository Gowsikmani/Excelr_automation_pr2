package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.openqa.selenium.JavascriptExecutor;
import utilities.Base;

public class cart_page extends Base{
	
	By Hpg_button = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[1]/a");
	By cart_btn = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a");
	By footer = By.xpath("//*[@id=\"footer\"]");
	By sub_ttle= By.xpath("//*[@id=\"footer\"]/div[1]/div/div[1]/div[2]/div/h2");
	By sub_mail_box = By.xpath("//*[@id=\"susbscribe_email\"]");
	By sub_btn = By.xpath("//*[@id=\"subscribe\"]");
	By sub_succs_msg = By.xpath("//*[@id=\"success-subscribe\"]/div");
	
	public void cart_subscription_verify() {
		
		WebElement we1 = driver.findElement(Hpg_button);
		we1.click();
		WebElement we7 = driver.findElement(cart_btn);
		we7.click();
		WebElement we2 = driver.findElement(footer);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", we2);
		WebElement we3 = driver.findElement(sub_ttle);
		String s1 = we3.getText();
		String s2 = excel_values(37,1);
		Assert.assertEquals(s1, s2);
		WebElement we4 = driver.findElement(sub_mail_box);
		we4.sendKeys(excel_values(38,1));
		WebElement we5 = driver.findElement(sub_btn);
		we5.click();
		WebElement we6 = driver.findElement(sub_succs_msg);
		String s3 = we6.getText();
		String s4 = excel_values(39,1);
		Assert.assertEquals(s3, s4);
		System.out.println(s3);
	}
	
	By prdct_btn = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a");
	By frst_prdct = By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div/div[1]/div[1]");
	By scnd_prdct =By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[3]/div/div[1]/div[1]");
	By continue_shopping = By.xpath("//*[@id=\"cartModal\"]/div/div/div[3]/button");
	By view_cart = By.xpath("//*[@id=\"cartModal\"]/div/div/div[2]/p[2]/a/u");
	By frstprdctname_in_prdct = By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div/div[1]/div[1]/p");
	By scndprdctname_in_prdct = By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[3]/div/div[1]/div[1]/p");
	By frstprdctprice_in_prdct = By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div/div[1]/div[1]/h2");
	By scndprdctprice_in_prdct = By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[3]/div/div[1]/div[1]/h2");
	By frstprdctname_in_cart = By.xpath("//*[@id=\"product-1\"]/td[2]/h4/a");
	By scndprdctname_in_cart = By.xpath("//*[@id=\"product-2\"]/td[2]/h4/a");
	By frstprdctprice_in_cart = By.xpath("//*[@id=\"product-1\"]/td[3]/p");
	By scndprdctprice_in_cart = By.xpath("//*[@id=\"product-2\"]/td[3]/p");
	
	public void add_product_tocart() {
	
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
		WebElement we7 = driver.findElement(frstprdctname_in_prdct);
		String s1 = we7.getText();
		WebElement we8 = driver.findElement(scndprdctname_in_prdct);
		String s2 = we8.getText();
		WebElement we9 = driver.findElement(frstprdctprice_in_prdct);
		String s3 = we9.getText();
		WebElement we10 = driver.findElement(scndprdctprice_in_prdct);
		String s4 = we10.getText();
		
		WebElement we3 = driver.findElement(frst_prdct);
		Actions a = new Actions(driver);
		a.moveToElement(we3).perform();
	    driver.findElement(By.linkText("Add to cart")).click();
		
	    WebElement we4 = driver.findElement(continue_shopping);
	    we4.click();
		
		WebElement we5 = driver.findElement(scnd_prdct);
		Actions a2 = new Actions(driver);
		a2.moveToElement(we5).perform();
		driver.findElement(By.linkText("Add to cart")).click();
		
		WebElement we6 = driver.findElement(view_cart);
		we6.click();
		
		WebElement we11 = driver.findElement(frstprdctname_in_cart);
		String s5 = we11.getText();
		WebElement we12 = driver.findElement(scndprdctname_in_cart);
		String s6 = we12.getText();
		WebElement we13 = driver.findElement(frstprdctprice_in_cart);
		String s7 = we13.getText();
		WebElement we14 = driver.findElement(scndprdctprice_in_cart);
		String s8 = we14.getText();
		Assert.assertEquals(s5, s1);
		Assert.assertEquals(s6, s2);
		Assert.assertEquals(s7, s3);
		Assert.assertEquals(s8, s4);
		
	}
	
	By viewcart_btn = By.xpath("/html/body/section[2]/div[1]/div/div[2]/div[1]/div[2]/div/div[2]/ul/li/a/i");
	By frstprdct_title = By.xpath("/html/body/section[2]/div[1]/div/div[2]/div[1]/div[2]/div/div[1]/div[1]/p");
	By prdct_title_indetailpg = By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/h2");
	
	By quantity_box = By.xpath("//*[@id=\'quantity\']");
	
	public void verify_quantity_in_cart() {
		
		WebElement we1 = driver.findElement(Hpg_button);
		we1.click();
		WebElement we2 = driver.findElement(frstprdct_title);
		String s1 = we2.getText();
		WebElement we3 = driver.findElement(viewcart_btn);
		we3.click();
		WebElement we4 = driver.findElement(prdct_title_indetailpg);
		String s2 = we4.getText();
		Assert.assertEquals(s2, s1);
		WebElement we5 = driver.findElement(quantity_box);
		String s3 = "4";
		we5.sendKeys(s3);
		
		
	}
	
	By hp_cart_btn = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a");
	By cartpg_verify = By.xpath("//*[@id=\"cart_items\"]/div/div[1]/ol/li[2]");
	By remove_prdct_btn = By.xpath("//*[@id=\"product-1\"]/td[6]/a");
	By cart_empty_msg = By.xpath("//*[@id=\"empty_cart\"]/p/b");
	
	
	public void remove_prdctfrm_cart_verify() {
		
		WebElement we1 = driver.findElement(Hpg_button);
		we1.click();
		WebElement we3 = driver.findElement(frst_prdct);
		Actions a = new Actions(driver);
		a.moveToElement(we3).perform();
	    driver.findElement(By.linkText("Add to cart")).click();
		
	    WebElement we4 = driver.findElement(continue_shopping);
	    we4.click();
	    WebElement we5 = driver.findElement(hp_cart_btn);
	    we5.click();
	    WebElement we6 = driver.findElement(cartpg_verify);
	    String s1 = we6.getText();
	    String s2 = "Shopping Cart";
	    Assert.assertEquals(s1, s2);
	    WebElement we7 = driver.findElement(remove_prdct_btn);
	    we7.click();
	    WebElement we8 = driver.findElement(cart_empty_msg);
	    String s3 = we8.getText();
	    String s4 = "Cart is empty!";
	    Assert.assertEquals(s3, s4);	
	}
	
	By rec_item_title = By.xpath("/html/body/section[2]/div[1]/div/div[2]/div[2]/h2");
	By rec_frst_prdctin_cart = By.xpath("//*[@id=\"product-1\"]/td[2]/h4/a");
	By rec_addtocart_btn = By.xpath("//*[@id=\"recommended-item-carousel\"]/div/div[1]/div[1]/div/div/div/a");
	By rec_viewcart_btn = By.xpath("//*[@id=\"cartModal\"]/div/div/div[2]/p[2]/a/u");

	
	public void addtocart_recomendeditem_verify() {
		
		JavascriptExecutor js = (JavascriptExecutor) dr;
		js.executeScript("window.scrollBy(0,7500)", "");
		
		WebElement we2 = driver.findElement(rec_item_title);
		String s1 = we2.getText();
		String s2 = "RECOMMENDED ITEMS";
		Assert.assertEquals(s1, s2);
		WebElement we3 = driver.findElement(rec_addtocart_btn);
		we3.click();
		WebElement we4 = driver.findElement(rec_viewcart_btn);
		we4.click();
		WebElement we5 = driver.findElement(rec_frst_prdctin_cart);
		String s3= we5.getText();
		String s4 = "Blue Top";
		Assert.assertEquals(s3, s4);  
		
	}

}
