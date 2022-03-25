package com.qa.opencart.factory;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class DriverFactory {
	

	public WebDriver driver;
	public Properties prop;

	public WebDriver init_driver(Properties prop) {

		String browser = prop.getProperty("browser").trim();
		

		System.out.println("browser name is: " + browser);

		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

			
		}

		else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			
		}

		else if (browser.equalsIgnoreCase("safari")) {
			driver = new SafariDriver();
		} 
		
		else {
			System.out.println("please pass the right browser...." + browser);
		}
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url").trim());
		return driver;
	}


		public Properties init_prop() {
		prop = new Properties();
		FileInputStream ip = null;

		String env = System.getProperty("env");
		if (env == null) {
			System.out.println("Running on Environment: PROD Env.....");
			try {
				ip = new FileInputStream("./src/test/resources/config/config.properties");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}

		else {
			System.out.println("Running on Environment: " + env);
			try {
				switch (env) {
				case "qa":
					ip = new FileInputStream("./src/test/resources/config/qa.config.properties");
					break;
				case "dev":
					ip = new FileInputStream("./src/test/resources/config/dev.config.properties");
					break;
				case "stage":
					ip = new FileInputStream("./src/test/resources/config/stage.config.properties");
					break;
				default:
					break;
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
		try {
			prop.load(ip);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return prop;
	}

}


