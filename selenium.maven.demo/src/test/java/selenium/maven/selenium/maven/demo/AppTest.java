package selenium.maven.selenium.maven.demo;

import static org.junit.Assert.assertTrue;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AppTest {

    public static void main(String[] args) throws IOException, InterruptedException {
       
		System.setProperty("webdriver.chrome.driver","C:\\Users\\abine\\OneDrive\\Documents\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();    	
        String baseUrl = "https://www.redbus.in/";       
        driver.get(baseUrl);
        driver.manage().window().maximize();
        Properties obj = new Properties();
        FileInputStream objfile = new 
        FileInputStream(System.getProperty("user.dir")+"\\application.properties");
        obj.load(objfile);        
        driver.findElement(By.xpath(obj.getProperty("btn.arrival"))).click();
        driver.findElement(By.xpath(obj.getProperty("btn.arrival"))).sendKeys("Chennai");
        Thread.sleep(3000);
        driver.findElement(By.xpath(obj.getProperty("btn.arrivalselect"))).click();
        driver.findElement(By.xpath(obj.getProperty("btn.destination"))).click();
        driver.findElement(By.xpath(obj.getProperty("btn.destination"))).sendKeys("Bangalore");
        Thread.sleep(3000);
        driver.findElement(By.xpath(obj.getProperty("btn.destinationsel"))).click();
        driver.findElement(By.xpath(obj.getProperty("btn.date"))).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(obj.getProperty("btn.bookingdate"))).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(obj.getProperty("btn.search"))).click();
        Thread.sleep(5000);
        driver.close(); 
    }
}
