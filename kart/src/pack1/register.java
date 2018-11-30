package pack1;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class register {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\Selenium_Demp\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://apps.qaplanet.in/qaplanet-kart/");
	if(driver.getTitle().equals("Your Store"))
		System.out.println(driver.getTitle()+" is present");
	List<WebElement> li=driver.findElements(By.xpath("//ul[@class='nav navbar-nav']/li/a"));
	Iterator<WebElement> itr=li.iterator();
	while(itr.hasNext())
	{
		WebElement s=itr.next();
		if(s.isDisplayed()&&s.isEnabled())
			System.out.println(s.getText());
	}
}
}
