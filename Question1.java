package Task19;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Question1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver(); // intializing the fireFoxDriver
		driver.navigate().to("http://google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(3000);
		String url=driver.getCurrentUrl();
		System.out.println("The current url of the page:"+url);
		driver.navigate().refresh();
		driver.close();
	}

}
