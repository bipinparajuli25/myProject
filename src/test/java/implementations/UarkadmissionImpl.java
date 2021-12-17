package implementations;

import cucumber.api.java.eo.Se;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UarkadmissionImpl {
    WebDriver driver;

    public  void launchBrowser(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\19199\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver=new ChromeDriver();
        // Instantiate a ChromeDriver classs
    }

    public  void launchUarkwebsite(){
        // Launch Website
        driver.get("https://www.uark.edu/");

        //Maximize the browser
        driver.manage().window().maximize();


    }
    public  void clickOnAdmissions() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"mainnav\"]/li[1]/a")).click();
        Thread.sleep(10000);

    }
    public  void applyforAdmission() throws InterruptedException {
         driver.findElement(By.xpath("//*[@id=\"main-container\"]/section[2]/div/div/div[1]/ul/li[1]/a")).click();
         Thread.sleep(10000);
    }

    public void graduateApplication() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div/div[2]/div/p[1]/a")).click();
        Thread.sleep(10000);

    }


}
