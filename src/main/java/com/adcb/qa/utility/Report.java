package com.adcb.qa.utility;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Report {
	public ExtentReports extent;
	public ExtentTest test;
	

	public Report() {
		// TODO Auto-generated constructor stub
		extent=new ExtentReports(System.getProperty("user.dir")+"\\reports\\TestResult.html");
		String baseurl="https://www.adcb.com/en/personal/";
		test=extent.startTest(baseurl);
	}
	
	public void addLog(LogStatus status, String message)
	{
		try 
		{
			test.log(status, message);
		}catch (Exception ex)
		{
			test.log(LogStatus.FAIL, ex.getMessage());
		}
	}

	public void compilereport()
	{
		extent.endTest(test);
		extent.flush();
	}
}
