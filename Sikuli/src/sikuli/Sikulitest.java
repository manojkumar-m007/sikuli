package sikuli;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sikulitest 
{
	WebDriver driver;
	@Test
	public void testUploading() throws InterruptedException, FindFailed
	{
		driver.findElement(By.xpath("//input[@id='resume']")).click();
		String docFilepath="C:\\Users\\MANOJKUMAR M\\Downloads\\empee.docx";
		String textBoximagepath="C:/Users/MANOJKUMAR M/Pictures/Upload/TextBox.PNG";
		String openButtonimagepath="C:/Users/MANOJKUMAR M/Pictures/Upload/Open.PNG";
		
		
		Screen s=new Screen();
		
		Pattern textBox=new Pattern(textBoximagepath);
		Pattern openButton=new Pattern(openButtonimagepath);
		
		Thread.sleep(2000);
		s.wait(textBox,20);
		s.type(docFilepath);
		s.click(openButton);
		
		
	}
	@AfterTest
	public void tearDown()
	{
		//driver.close();
	}
	@BeforeTest
	public void setUp()
	{
		//driver=new FirefoxDriver();
		driver=new OperaDriver();
		driver.get("http://www.empeesoft.co.in/submit.html");
		driver.manage().window().maximize();
	}

}
