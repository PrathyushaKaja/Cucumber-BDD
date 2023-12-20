package Practice.Seleniumday1;

public class Locator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Basic User\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
    webDriver driver = new chromeDriver();
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    
	}

}
