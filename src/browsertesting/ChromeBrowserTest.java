package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserTest {
    public static void main(String[] args) {
        String baseUrl = "http://the-internet.herokuapp.com/login";

        //Launch the Chrome Browser
        WebDriver driver = new ChromeDriver();

        //OpenURL into Browser
        driver.get(baseUrl);

        //Print the title of the page
        String title = driver.getTitle();
        System.out.println(title);

        //Print the current URL
        System.out.println("Print Current URL : " + driver.getCurrentUrl());

        //Print page source
        System.out.println("Print page source : " + driver.getPageSource());

        //Enter email into email field
        WebElement emailField = driver.findElement(By.id("username"));
        emailField.sendKeys("has123@gmail.com");

        //Enter the password into password field
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("Abc123");

        //Close the Browser
        driver.close();
    }
}
