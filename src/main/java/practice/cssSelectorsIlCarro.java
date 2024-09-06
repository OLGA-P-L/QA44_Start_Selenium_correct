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

    WebElement inputCity = driver.findElement(By.cssSelector("*[id='city']"));
    inputCity.click();
    pause(2);

    WebElement inputDates = driver.findElement(By.cssSelector("*[id='dates']"));
    inputDates.click();
    pause(2);

    //WebElement buttonYalla = driver.findElement(By.cssSelector("button[type='submit']"));
    //buttonYalla.click();
    //System.out.println("correctly");
    //pause(2);


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
