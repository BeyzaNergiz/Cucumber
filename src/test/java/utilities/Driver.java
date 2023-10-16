package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class Driver {

    /* JUnit'de WebDriver objesi TestBaas'den geliyordu.
    TestNG extends ile bağlanma zorunluluğunu otrtadan kaldirmak
    ve testi yazanlara daha fazla kontrol imkani vermek icin
    TestBase yerine Driver class'inda static 2 method ile
    driver olusturma ve kapatma islemlerini yapmayi tercih etmistir
     */
    static WebDriver driver;

    public static WebDriver getDriver() {

        if (driver == null) {

            String browser = ConfigReader.getProperty("browser");

            switch (browser) {

                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "safari":
                    WebDriverManager.safaridriver().setup();
                    driver = new SafariDriver();
                    break;
                case "edge":
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    break;
                default:
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
            }
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        }


        return driver;
}

    public static void closeDriver(){
        if (driver != null){
            driver.close();
            driver=null;
        }
    }
}
