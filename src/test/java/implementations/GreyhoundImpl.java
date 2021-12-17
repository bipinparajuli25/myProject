package implementations;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class GreyhoundImpl {
    WebDriver driver;

    public void lauchTheGreyhound() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\19199\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        System.out.println("chrome browser launched successfully!");
        //launching the website
        driver.get("https://www.greyhound.com/en");
        System.out.println("greyhound website launched successfully!");
        driver.manage().window().maximize();
        System.out.println("browser maximized successfully!");

    }

    public void clickExplorePlaces() {
        driver.findElement(By.xpath("//a[text()='Explore places' and @class='dropdown-parent']")).click();
        System.out.println("clicked on  Explore places tab successfully!");
    }

    public void clickOnTravelStories() {
        driver.findElement(By.xpath("//a[text()='Travel stories']")).click();
        System.out.println("clicked on travel stories");
    }

    public void verifyTheContent() {
        String content = driver.findElement(By.xpath("//h1[text()='Travel Stories']")).getText();
        Assert.assertTrue(content.contains("Travel Stories"));
    }


    public void fillTheReservation(String from, String to, String startDate, String returnDate, String passengerCount) throws InterruptedException {
       driver.findElement(By.xpath("//input[@id='fromLocation']")).sendKeys(from);
       System.out.println("entered the start location");
       driver.findElement(By.id("toLocation")).sendKeys(to);
        System.out.println("entered the to location");
        //for now i am skiping start and return date.
        driver.findElement(By.xpath("//div[@class='form-group form-group-dark withIcon']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[text()='Add adult passenger']")).click();


    }
}
