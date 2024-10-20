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

        sleep(500);

        WebElement buttonSubmit = driver.findElement(By.xpath("//*[@id=\"submit\"]"));
        buttonSubmit.click();

        sleep(500);

        driver.quit();
    }

        @Test (description = "Практика работы с check box https://demoqa.com/checkbox")

    public void checkBox() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/checkbox");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));

        WebElement toggleButtonHomeOn = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/span/button"));
        toggleButtonHomeOn.click();
        sleep(500);

        WebElement toggleButtonDesktopOn = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/span/button"));
        toggleButtonDesktopOn.click();
        sleep(500);

        WebElement checkBoxNotesOn = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/ol/li[1]/span/label/span[1]"));
        checkBoxNotesOn.click();
        sleep(500);

        WebElement checkBoxCommandsOn = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/ol/li[2]/span/label/span[1]"));
        checkBoxCommandsOn.click();
        sleep(500);

        WebElement checkBoxCommandsOff = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/ol/li[2]/span/label/span[1]"));
        checkBoxCommandsOff.click();
        sleep(500);

        WebElement checkBoxNotesOff = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/ol/li[1]/span/label/span[1]"));
        checkBoxNotesOff.click();
        sleep(500);

        WebElement toggleButtonDessktopOff = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/span/button"));
        toggleButtonDessktopOff.click();
        sleep(500);

        WebElement toggleButtonOff = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/span/button"));
        toggleButtonOff.click();
        sleep(500);

        WebElement openAllFolders = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/div/button[1]"));
        openAllFolders.click();
        sleep(500);
        WebElement closeAllFolders = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/div/button[2]"));
        closeAllFolders.click();
        sleep(500);

         driver.quit();
    }
}
