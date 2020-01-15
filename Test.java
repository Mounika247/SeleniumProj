import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;



public class Test {

	WebDriver driver;

	public void launchBrowser() {
		
		
		
		System.setProperty("webdriver.gecko.driver","/Users/sudhirgorantla/Downloads/geckodriver" );
		
		driver =new FirefoxDriver();
		
		driver.get("https://spec.atsspecsolutions.com/");
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("/html/body/div/div[17]/div/div[2]/div/div[2]/div[4]/form/div/div[2]/div[1]/div/div/div/input")).sendKeys("dovini5510@one-mail.top");
		
		driver.findElement(By.xpath("/html/body/div/div[17]/div/div[2]/div/div[2]/div[4]/form/div/div[2]/div[2]/div/div/div/input")).sendKeys("Ats123456");
		
		driver.findElement(By.xpath("/html/body/div/div[17]/div/div[2]/div/div[2]/div[4]/form/div/div[2]/div[3]/button/span[1]")).click();
		
		driver.findElement(By.xpath("/html/body/div[1]/div[17]/div/div[2]/div/div/div[3]/div[3]/div/div/main/div/span/div/div/div[2]/div[2]/div/div/div/div[2]/div/div[2]/div/div[2]/div[4]/a/span[1]")).click();
	
		
		/*Step1*/
		
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div/div[1]/div/div/div/div/div/div/form/div[1]/div[1]/div/div/div/input")).sendKeys("1234");
		
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div/div[1]/div/div/div/div/div/div/form/div[1]/div[2]/div/div/div/input")).sendKeys("MyFirstProj");
		
		
		
		driver.findElement(By.name("location.country.id")).sendKeys("Canada");
		
		driver.findElement(By.name("location.province.id")).sendKeys("Ontario");
		
		driver.findElement(By.name("location.city.id")).sendKeys("Brampton");
		
		
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div/div[1]/div/div/div/div/div/div/form/div[1]/div[6]/div/div/div/textarea[1]")).sendKeys("Clark Blvd");
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div/div[1]/div/div/div/div/div/div/form/div[1]/div[7]/div/div/div/input")).sendKeys("2020-01-15");
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div/div[1]/div/div/div/div/div/div/form/div[1]/div[8]/div/div/div/input")).sendKeys("3500");
		
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div/div[1]/div/div/div/div/div/div/form/button/span[1]")).click();
		
		/*<Step2>*/
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div/div[3]/div/div/div/div/div/div/form/div[1]/div[2]/div/label/span[1]/span[1]/span[1]/input")).click();
		
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div/div[3]/div/div/div/div/div/div/form/div[2]/div[8]/div/div")).click();
		
		
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div/div[3]/div/div/div/div/div/div/form/div[4]/button[2]")).click();
		/*Step3*/
		
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div/div[5]/div/div/div/div/div/form/div[1]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[4]/div/label/span[1]/span[1]/input")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div/div[5]/div/div/div/div/div/form/div[1]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[5]/div/label/span[1]/span[1]/input")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div/div[5]/div/div/div/div/div/form/div[1]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[6]/div/label/span[1]/span[1]/input")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div/div[5]/div/div/div/div/div/form/button[2]/span[1]")).click();
	}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Test txt= new Test();
			txt.launchBrowser();
		}
}
