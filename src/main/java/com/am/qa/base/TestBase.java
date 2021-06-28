package com.am.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.am.qa.util.TestUtil;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	public static Logger log;
	
	
public TestBase() {
		
		try {
			prop = new Properties();
			FileInputStream file = new FileInputStream("C:\\Users\\George Mathew\\eclipse-workspace\\AMZTest\\src\\main\\java\\com\\am\\qa\\config\\config.properties");
			prop.load(file);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

	public static void initialization() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\George Mathew\\Documents\\chromedriver.exe");
		driver = new ChromeDriver();
		log = Logger.getLogger("Amazon");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		 

	}
//	public static HashMap<String, String> mapData() throws IOException {
//		try {
//			FileInputStream fileInput = new FileInputStream(prop.getProperty("exlpath"));
//			Workbook workbook = new XSSFWorkbook(fileInput);
//			Sheet sheet = workbook.getSheetAt(0);
//			
//			HashMap<String, String> Data = new HashMap<String, String>();
//			
//			
//		}
//		catch (FileNotFoundException e){
//			e.printStackTrace();
//		}
//		
//		
//		return mapData();
//	}

	public WebDriver getDriver() {
		return driver;
	}

	
	
	
	
	


	
	
}