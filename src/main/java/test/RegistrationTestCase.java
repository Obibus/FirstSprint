package test;
import org.junit.Test;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class RegistrationTestCase {
    @Test
    public void checkSubmit() {
        WebDriver driver = new ChromeDriver();
        Actions actions = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://pdr.infotech.gov.ua");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//div[@class='Header_btnWrap__LR71x']//button//span[text()='Реєстрація']")).click();
        WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='AuthModal_slidesWrap___piaZ']//form//input[@name='first_name']")));
        element1.sendKeys("obob");
        WebElement element2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='AuthModal_slidesWrap___piaZ']//form//input[@name='last_name']")));
        element2.sendKeys("Obebo");
        WebElement element3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='AuthModal_slidesWrap___piaZ']//form//input[@name='email']")));
        element3.sendKeys("dsdsfsdfdf@gmail.com");
        WebElement element4 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='AuthModal_slidesWrap___piaZ']//form//input[@name='password']")));
        element4.sendKeys("dsfsdfsdfsdf123");
        driver.findElement(By.xpath("//div[@class='AuthModal_label__FX_oh']//button")).click();
        WebElement element5 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='AuthModal_btnWrap__TuT_L']//button[@type='submit']")));
        element5.click();
    }

}
