import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.time.Duration;

import static java.lang.Thread.sleep;

public class ElementTextBoxTest {
    @Test(description = "Практика заполнение Text Box https://demoqa.com/text-box ")

    public void TextBox() throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

        WebElement fullName = driver.findElement(By.xpath("//*[@id=\"userName\"]"));
        fullName.sendKeys("Max");

        WebElement email = driver.findElement(By.xpath("//*[@id=\"userEmail\"]"));
        email.sendKeys("max@mail.ru");

        WebElement currentAddress = driver.findElement(By.xpath("//*[@id=\"currentAddress\"]"));
        currentAddress.sendKeys("Balti, Index:3120, Republic of Moldova, str. Alecu Ruso, ap. 36");

        WebElement permanentAddress = driver.findElement(By.xpath("//*[@id=\"permanentAddress\"]"));
        permanentAddress.sendKeys("Balti, Index:3120, Republic of Moldova, str. Alecu Ruso, ap. 36");

        // Прокрутка к элементу, найденному по XPath
        WebElement element = driver.findElement(By.xpath("//*[@id=\"submit\"]"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);

        sleep(2000);

        WebElement buttonSubmit = driver.findElement(By.xpath("//*[@id=\"submit\"]"));
        buttonSubmit.click();

        driver.quit();
    }

}
