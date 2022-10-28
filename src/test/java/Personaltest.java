import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.adcb.qa.base.BasePage;
import com.adcb.qa.page.Personal;
import com.adcb.qa.utility.Constants;
import com.adcb.qa.utility.Report;
import com.relevantcodes.extentreports.LogStatus;

import io.netty.util.Constant;

public class Personaltest extends BasePage {

	Personal ppage;
	Personaltest ppagetest;
	Report report=new Report();

	public Personaltest() {
		// TODO Auto-generated constructor stub
		super();
	}

	@BeforeMethod
	public void setUp() throws InterruptedException
	{
		Initialization();
		ppagetest=new Personaltest();
		ppage=new Personal(driver);
	}

	@Test
	public void oneActivity()
	{
		report.addLog(LogStatus.INFO, "Open browser is initiated");
		String webtitle=ppage.getWebPageTitle();
		Assert.assertEquals(webtitle, "ADCB | A Strong and Well Established Bank in the UAE");
		
		report.addLog(LogStatus.PASS, "Title is matched");
		
		driver
		.manage().
		timeouts().
		implicitlyWait
		(Duration.
		ofSeconds(Constants.DEFAULT_TIMEOUT));
		
		
		ppage.clickOnMenu();
		
		report.addLog(LogStatus.INFO, "Menu clicked");
		report.addLog(LogStatus.PASS, "Menu clicked successfully");
		

		driver
		.manage().
		timeouts().
		implicitlyWait
		(Duration.
		ofSeconds(Constants.DEFAULT_TIMEOUT));
		
		
		
		
		ppage.clickOnBusiness();
		
		report.addLog(LogStatus.INFO, "Business option selected");
		report.addLog(LogStatus.PASS, "Business option selected successfully");
		
		
		driver
		.manage().
		timeouts().
		implicitlyWait
		(Duration.
		ofSeconds(Constants.DEFAULT_TIMEOUT));
		
		
		report.compilereport();
		
		

	}

	@AfterMethod()
	public void tearDown()
	{
		driver.quit();
	}
}
