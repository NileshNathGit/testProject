package day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class testrt {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://teijin-test.zendesk.com/access/normal");
		driver.findElement(By.xpath("//div/label//following-sibling::input[@id='user_email']")).sendKeys("japanmanxyz@gmail.com");
		driver.findElement(By.xpath("//div/label//following-sibling::input[@id='user_password']")).sendKeys("welcome");
		driver.findElement(By.xpath("//button[@id='sign-in-submit-button']")).click();
		driver.get("https://teijin-test.zendesk.com/hc/ja/requests/new?ticket_form_id=9420552958877");


	}
}
