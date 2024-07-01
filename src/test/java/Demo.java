import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.github.dockerjava.api.model.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo 
{
	public static void main(String args[]) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.opencart.com/");
		Thread.sleep(3000);
		WebElement features=driver.findElement(By.xpath("//*[@id=\"navbar-collapse-header\"]/ul/li[1]/a"));
		WebElement name=driver.findElement(By.xpath("//*[@id=\"cms-feature\"]/div/div/h1"));
		
		features.click();
		Thread.sleep(3000);
		String text=name.getText();
		
		if(name.getText().equals(name.isDisplayed()))
		{
			System.out.println("Test case pass");
		}
		else
		{
			System.out.println("Test case failed");
		}
		driver.quit();
		
		
		
		
	}
}
