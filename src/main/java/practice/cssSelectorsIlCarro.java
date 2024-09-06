package practice;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class cssSelectorsIlCarro {

    WebDriver driver = new ChromeDriver();

    @Test
    public void cssSelectors(){
    driver.navigate().to("https://ilcarro.web.app/search");
    driver.manage().window().maximize();
    pause(3);

    WebElement buttonSearch = driver.findElement(By.cssSelector("a[ng-reflect-router-link=search]"));
        System.out.println("1");
    pause(2);

    WebElement buttonLet = driver.findElement(By.xpath("//*[@id='1']"));
        System.out.println("2");
    pause(2);

    WebElement buttonTerms = driver.findElement(By.xpath("//*[@id='2']"));
        System.out.println("3");
    pause(2);

    WebElement buttonSingUp = driver.findElement(By.xpath("//*[@href='/registration?url=%2Fsearch']"));
        System.out.println("4");
    pause(2);

    WebElement buttonLogin = driver.findElement(By.xpath("//*[@href='/login?url=%2Fsearch']"));
    System.out.println("5");
    pause(2);


    WebElement buttonYalla = driver.findElement(By.cssSelector("button[type='submit']"));
    buttonYalla.click();
    System.out.println("correctly");
    pause(2);

    WebElement inputCity = driver.findElement(By.cssSelector("*[id='city']"));
    inputCity.click();
    pause(2);

    WebElement inputDates = driver.findElement(By.cssSelector("*[id='dates']"));
    inputDates.click();
    pause(2);

    pause(5);
    driver.quit();

    }
    private void pause(int time){
        try {
            Thread.sleep(time*1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
