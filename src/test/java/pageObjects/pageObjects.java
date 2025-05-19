package pageObjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public  class pageObjects {
	  WebDriver driver;
	
	@FindBy(xpath="//div/input[@id='male']")
	static
	WebElement Gen_M;
	@FindBy (xpath="//div/input[@id='female']")
	static
	WebElement Gen_F;
	
	@FindBy (xpath = "//div/select[@id='country']")
	static
	WebElement drp_country;
	
	@FindBy (xpath = "//div/label[contains(text(),'Colors:')]//following-sibling::select")
	static
	WebElement drp_Colors;
	
	@FindBy(xpath="//div/label[@for='animals']//following-sibling::select")
	static
	WebElement drp_SortedList;
	
	@FindBy(xpath="//div/p[contains(text(),'Date Picker 1:')]/input")
	static
	WebElement datePicker1;
	
	@FindBy(xpath="//div[@class='ui-datepicker-title']")
	static
	WebElement date1title;
	
	@FindBy(xpath="//select[@class='ui-datepicker-month']")
	static
	WebElement datePickerMonth;
	@FindBy(xpath="//select[@class='ui-datepicker-year']")
	static
	WebElement datePickerYear;	
	@FindBy(xpath="//div/p[contains(text(),'Date Picker 2: ')]//input")
	static
	WebElement datePicker2;
	
	@FindBy(xpath="//div[@class='date-picker-box']//input[@id='start-date']")
	WebElement datePicker3StartDate;
	
	@FindBy(xpath="//div[@class='date-picker-box']//input[@id='end-date']")
	WebElement datePicker3EndDate;
	
	//single upload object
	@FindBy(xpath="//div/form[@id='singleFileForm']/input")
	WebElement SingleUp;
	
//	multiple uploads object
	@FindBy(xpath="//div/form[@id='multipleFilesForm']/input")
	WebElement multiUp;
	
	//Constructor
	public pageObjects(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	public  void male()
	{
		
		if(Gen_M.isEnabled() && !(Gen_M.isSelected()))
		Gen_M.click();
		else
			System.out.println("M Already Selected");
		
	}
	
	public  void female()
	{
		
		if(Gen_F.isEnabled() && !(Gen_F.isSelected()))
			Gen_F.click();
		else
			System.out.println("F Already Selected");
	}
	
	public  void SelectByValue(String i)
	{
		Select value = new Select(drp_country);
		value.selectByVisibleText(i);
		
	}
	
	public static void selectColors(String s) throws InterruptedException
	{
		Select value =new Select(drp_Colors);
		value.selectByVisibleText(s);
		System.out.println("Deselecting :"+s);
		value.deSelectByContainsVisibleText(s);
	}
	
	public static void selectAnimals(String s)
	{
		Select value = new Select(drp_SortedList);
		value.selectByVisibleText(s);
	}
	public static void sortedList()
	{
		Select value = new Select(drp_SortedList);
		List<WebElement> options = value.getOptions();
		ArrayList<String> orgList = new ArrayList<>();
		
		for(WebElement option : options)
		{
			orgList.add(option.getText().trim());
		}
		
		List<String> sorted = new ArrayList<>(orgList);
		Collections.sort(sorted);
		
		if(orgList.equals(sorted))
		
			System.out.println("✅ The dropdown list is sorted: " + orgList);
		else
			
			System.out.println("✅ The dropdown list is NOT sorted! : Original "+orgList+" | Sorted List : " +sorted);
		
	}
	
//	WebElement prev = driver.findElement(By.xpath("//a[@class='ui-datepicker-prev ui-corner-all']"));
	public  void day(String day)
	{
		WebElement date =driver.findElement(By.xpath("(//td[@data-handler='selectDay']/a[contains(text(),'"+day+"')])[1]"));
		date.click();
	}
	public  void datePicker1(String year, String month, String date)
	{
		datePicker1.click();
		while(true)
		{
			if(date1title.getText().equalsIgnoreCase(month+" "+year))
			{
				break;
			}
			driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all']")).click();
		}
		day(date);
		
		
	}
	
	public void datePicker2(String year, String month, String date)
	{
		datePicker2.click();
		Select valueMonth = new Select(datePickerMonth);
		Select valueYear = new Select(datePickerYear);
		valueMonth.selectByVisibleText(month);
		valueYear.selectByVisibleText(year);
		driver.findElement(By.xpath("//td[@data-handler='selectDay']/a[@data-date='"+date+"']")).click();
		
	}
	
	public  void datePicker3(String Start, String end)
	{
		datePicker3StartDate.sendKeys(Start);
		datePicker3StartDate.sendKeys(Keys.TAB);
		datePicker3EndDate.sendKeys(end);
		driver.findElement(By.xpath("//div[@class='date-picker-box']//button[@class='submit-btn']")).click();
		
		
	}
	public static final String url ="https://testautomationpractice.blogspot.com";
	
	
	public void singleUpload(String path) throws InterruptedException
	{
		SingleUp.sendKeys(path);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div/form[@id='singleFileForm']/button")).click();
	}
//	Action for multiple Upload
	public void multiUpload(String path,String path2) throws InterruptedException
	{
		multiUp.sendKeys(path);
		
		multiUp.sendKeys(path);
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div/form[@id='multipleFilesForm']/button")).click();
	}
	
}
	

