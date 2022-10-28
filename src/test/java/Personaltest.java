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
		
		
		ppage.clickonSearch();
		
		report.addLog(LogStatus.INFO, "Search icon tapped");
		report.addLog(LogStatus.PASS, "Search tray opened successfully");
		
		driver
		.manage()
		.timeouts()
		.implicitlyWait(Duration.ofSeconds(Constants.DEFAULT_TIMEOUT));
		
		
		ppage.searchText();
		
		report.addLog(LogStatus.INFO, "Search icon selected");
		report.addLog(LogStatus.INFO, "Search icon text supplied successfully");
		
		driver.
		manage().
		timeouts().
		implicitlyWait(Duration.ofSeconds(Constants.DEFAULT_TIMEOUT));
		
		String textVerify=ppage.searchCount();
		
		Assert.assertEquals(textVerify, "2 RESULTS");
		
		report.addLog(LogStatus.INFO, "Search count checking..");
		report.addLog(LogStatus.INFO, "Search count checked successfully..");
		
		driver.
		manage().
		timeouts()
		.implicitlyWait(Duration.ofSeconds(Constants.DEFAULT_TIMEOUT));
		
		
		report.compilereport();
		
		

	}

	@AfterMethod()
	public void tearDown()
	{
		driver.quit();
	}
}
