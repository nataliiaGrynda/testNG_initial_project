package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;

public class Driver {

  private Driver(){// private constructor, singleton to provide single instance of driver to be use in the project
  }

  private static WebDriver driver;// private instance variable

  public static WebDriver getDriver(){
  if(driver == null){
  String browser = "chrome";

  switch (browser){
    case "chrome":
      WebDriverManager.chromedriver().setup();
      driver = new ChromeDriver();
      break;
    case "fireFox":
      WebDriverManager.firefoxdriver().setup();
     driver = new FirefoxDriver();
     break;
    default:
      throw new NotFoundException("The browser is not defined");
  }
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}
  return driver;
  }

   public static void quitDriver(){
    try {
      Thread.sleep(3000);
    }catch (Exception e){
      e.printStackTrace();
    }
    if (driver != null){
//      driver.manage().deleteAllCookies();
      driver.quit();
      driver = null;
    }

   }
  }
