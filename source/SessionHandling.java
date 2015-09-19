package Advancedreport;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
public class SessionHandling {
@Test
public  void m() {
    //First session of WebDriver
    WebDriver driver = new FirefoxDriver();
    //Goto guru99 site
    driver.get("http://demo.guru99.com/V4/");
    driver.findElement(By.name("uid")).sendKeys("Driver 1"); 
}
@Test
public void m2(){
	
    //Second session of WebDriver
    WebDriver driver2 = new FirefoxDriver();
    //Goto guru99 site
    driver2.get("http://demo.guru99.com/V4/");
    driver2.findElement(By.name("uid")).sendKeys("Driver 1");
}
@Test
public void m3(){
	WebDriver driver3 = new FirefoxDriver();
    //Goto guru99 site
    driver3.get("http://demo.guru99.com/V4/");
    driver3.findElement(By.name("uid")).sendKeys("Driver 1");
}
}