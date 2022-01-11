package amazon.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;





public class AmazonBase {
	public static WebDriver driver;
	public static Properties prop;
    static String dir = System.getProperty("user.dir");
	
	
	public AmazonBase() {
		try{
			prop =new Properties();
			FileInputStream ip = new FileInputStream(dir+"\\src\\main\\java\\amazon\\config\\config.properties");
			prop.load(ip);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
	}

	}
	public static void initialization() {
		String browserName=prop.getProperty("browser");
		if(browserName.equals("chrome")) {
			 System.setProperty("webdriver.chrome.driver",dir+ "\\Drivers\\chromedriver.exe");
			 driver = new ChromeDriver();
			
		}else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",dir+"\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		
		}
		
		
		
	
		
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));

	}
	

}
