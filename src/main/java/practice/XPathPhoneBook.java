package practice;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class XPathPhoneBook {
    WebDriver driver = new ChromeDriver();
    @Test
    public void xPathSelectors() {
        driver.navigate().to("https://telranedu.web.app/home");
        driver.manage().window().maximize();

        WebElement elementH3 = driver.findElement(By.xpath("//*[contains(text(), 'QA Testing')]"));

        WebElement elementH1 = driver.findElement(By.xpath("//h1[text()='PHONEBOOK]"));

        WebElement elementLogin = driver.findElement(By.xpath("//body/div/div/a[last()]"));

        WebElement elementLogin1 = driver.findElement(By.xpath("//body//a[contains(text(),'L')]"));

        WebElement body = driver.findElement(By.xpath("//a(text()='LOGIN',]/../../.."));
        System.out.println(body.getTagName());


    }
    }
