package Task19;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question2 {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver(); // intializing the chromeDriver
		driver.manage().window().maximize();
		driver.navigate().to("https://www.demoblaze.com");
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String title=driver.getTitle();
		if(title.equalsIgnoreCase("STORE")) {
			System.out.println("Page landed on correct website:"+title);
		}else {
			System.out.println("Page not landed on correct website");
		}
		driver.close();
	}

}
