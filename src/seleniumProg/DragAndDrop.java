package seleniumProg;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;
import com.gargoylesoftware.htmlunit.javascript.host.file.File;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\praveen\\OrangeHRM\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		/*driver.get("https://semantic-ui.com/modules/dropdown.html");
		driver.findElement(By.xpath("//*[@class='_2AkmmA _29YdH8']")).click();
		
		WebElement src=driver.findElement(By.xpath("(//div[@class='_2PX1l4']/div/img)[1]"));
		WebElement dest=driver.findElement(By.name("q"));
		
		Actions act=new Actions(driver);
		act.dragAndDrop(src, dest).build().perform();
		
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		js.executeScript("window.scrollBy(0,1500)");
		Thread.sleep(5000);
		WebElement s1=driver.findElement(By.xpath("//div[@class='ui fluid search dropdown selection multiple']/i"));
		s1.click();
		WebElement ss=driver.findElement(By.xpath("//div[contains(@class, 'ui fluid search dropdown selection multiple')]/select"));
		//ss.click();
		Select select=new Select(ss);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='menu transition visible']/div[contains(text(), 'Arizona')]")).click();
		*/
		/*select.selectByValue("AK");
		select.selectByVisibleText("Hawaii");
		select.selectByVisibleText("Illinois");
		select.selectByVisibleText("Maine");
		System.out.println(select.getAllSelectedOptions());*/
		
		
		driver.navigate().to("http://apps.qaplanet.in/hrm/index.php");
		driver.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
		driver.findElement(By.name("txtPassword")).sendKeys("lab1");
		driver.findElement(By.name("Submit")).click();
		driver.switchTo().frame("rightMenu");
		Select sel=new Select(driver.findElement(By.id("loc_code")));
		sel.selectByVisibleText("Emp. ID");
		List<WebElement> list=sel.getOptions();
		for(WebElement ele:list){
			System.out.println(ele.getText());
			
			TakesScreenshot scrShot =((TakesScreenshot)driver);
		}
	}
}
