package implementations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonImpl {
    WebDriver driver;
    public void lauchTheAmazonapp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\19199\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.navigate().to("https://www.amazon.com/");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();

    }

    public void selectTheLanguage() throws InterruptedException {
        driver.findElement(By.xpath("//span[@class='icp-nav-flag icp-nav-flag-us']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@class='a-label a-radio-label' and contains(text(), 'Español - ES')]")).click();



    }

    public void clickonLinkText() throws InterruptedException {
        driver.findElement(By.linkText("Start here.")).click();
        driver.findElement(By.linkText("Sign-In")).click();
        driver.findElement(By.partialLinkText("Need")).click();




    }
}
