import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;


public class ElementTextBoxTest {

    @Test(description = "Практика заполнение Text Box https://demoqa.com/text-box ")

    public void TextBox() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

        WebElement fullName = driver.findElement(By.xpath("//*[@id='userName']"));
        fullName.sendKeys("Max");

        WebElement email = driver.findElement(By.xpath("//*[@id='userEmail']"));
        email.sendKeys("max@mail.ru");

        WebElement currentAddress = driver.findElement(By.xpath("//*[@id='currentAddress']"));
        currentAddress.sendKeys("Balti, Index:3120, Republic of Moldova, str. Alecu Ruso, ap. 36");

        WebElement permanentAddress = driver.findElement(By.xpath("//*[@id='permanentAddress']"));
        permanentAddress.sendKeys("Balti, Index:3120, Republic of Moldova, str. Alecu Ruso, ap. 36");

        // Прокрутка к элементу, найденному по XPath
        WebElement element = driver.findElement(By.xpath("//*[@id='submit']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);

        WebElement buttonSubmit = driver.findElement(By.xpath("//*[@id='submit']"));
        buttonSubmit.click();

        WebElement fildName = driver.findElement(By.xpath("//*[@id='name']"));
        String name = fildName.getText();

        WebElement fildEmail = driver.findElement(By.xpath("//*[@id='email']"));
        String name1 = fildEmail.getText();

        WebElement fildCurrentAddress = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/form/div[6]/div/p[3]"));
        String name2 = fildCurrentAddress.getText();

        WebElement fildPermananetAddress = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/form/div[6]/div/p[4]"));
        String name3 = fildPermananetAddress.getText();

        Assert.assertEquals(name, "Name:Max");
        Assert.assertEquals(name1, "Email:max@mail.ru");
        Assert.assertEquals(name2,"Current Address :Balti, Index:3120, Republic of Moldova, str. Alecu Ruso, ap. 36");
        Assert.assertEquals(name3, "Permananet Address :Balti, Index:3120, Republic of Moldova, str. Alecu Ruso, ap. 36");

        driver.quit();
    }

    @Test (description = "Практика работы с check box https://demoqa.com/checkbox")

        public void testCheckBox() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/checkbox");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));

        WebElement toggleButtonHomeOn = driver.findElement(By.xpath("//*[@id='tree-node']/ol/li/span/button"));
        toggleButtonHomeOn.click();

        WebElement toggleButtonDesktopOn = driver.findElement(By.xpath("//*[@id='tree-node']/ol/li/ol/li[1]/span/button"));
        toggleButtonDesktopOn.click();

        WebElement checkBoxNotesOn = driver.findElement(By.xpath("//*[@id='tree-node']/ol/li/ol/li[1]/ol/li[1]/span/label/span[1]"));
        checkBoxNotesOn.click();

        WebElement checkBoxCommandsOn = driver.findElement(By.xpath("//*[@id='tree-node']/ol/li/ol/li[1]/ol/li[2]/span/label/span[1]"));
        checkBoxCommandsOn.click();

        WebElement checkBoxCommandsOff = driver.findElement(By.xpath("//*[@id='tree-node']/ol/li/ol/li[1]/ol/li[2]/span/label/span[1]"));
        checkBoxCommandsOff.click();

        WebElement checkBoxNotesOff = driver.findElement(By.xpath("//*[@id='tree-node']/ol/li/ol/li[1]/ol/li[1]/span/label/span[1]"));
        checkBoxNotesOff.click();

        WebElement toggleButtonHomeOff = driver.findElement(By.xpath("//*[@id='tree-node']/ol/li/span/button"));
        toggleButtonHomeOff.click();

        WebElement fieldCheckBoxHome = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div/ol/li/span/label/span[1]"));
        Assert.assertTrue(fieldCheckBoxHome.isEnabled(), "Чек бокс должен быть доступным для нажатия");

        WebElement openAllFolders = driver.findElement(By.xpath("//*[@id='tree-node']/div/button[1]"));
        openAllFolders.click();

        WebElement closeAllFolders = driver.findElement(By.xpath("//*[@id='tree-node']/div/button[2]"));
        closeAllFolders.click();

         driver.quit();
    }

    @Test(description = "Практика работы с radio button https://demoqa.com/radio-button")

        public void radioButton() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/radio-button");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));

        WebElement radioButtonYes = driver.findElement(By.xpath("//*[@id='app']/div/div/div/div[2]/div[2]/div[2]/label"));
        radioButtonYes.click();

        WebElement radioButtonImpressive = driver.findElement(By.xpath("//*[@id='app']/div/div/div/div[2]/div[2]/div[3]/label"));
        radioButtonImpressive.click();

        driver.quit();
    }

    @Test(description = "Практика работы с web tables https://demoqa.com/webtables")

        public void webTables() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/webtables");
        driver.manage().window().maximize();

        WebElement buttonAdd = driver.findElement(By.xpath("//*[@id='addNewRecordButton']"));
        buttonAdd.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement modal = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='userForm']")));

        WebElement firstName = modal.findElement(By.xpath("//*[@id='firstName']"));
        firstName.sendKeys("Max");

        WebElement lastName = modal.findElement(By.xpath("//*[@id='lastName']"));
        lastName.sendKeys("Pankratov");

        WebElement email = modal.findElement(By.xpath("//*[@id='userEmail']"));
        email.sendKeys("max@mail.ru");

        WebElement age = modal.findElement(By.xpath("//*[@id='age']"));
        age.sendKeys("43");

        WebElement salary = modal.findElement(By.xpath("//*[@id='salary']"));
        salary.sendKeys("10000");

        WebElement department = modal.findElement(By.xpath("//*[@id='department']"));
        department.sendKeys("QA Automation");

        WebElement submit = modal.findElement(By.xpath("//*[@id='submit']"));
        submit.click();

        WebElement tables = driver.findElement(By.xpath("//*[@id='app']/div/div/div/div[2]"));
        tables.click();

        WebElement searchBox = driver.findElement(By.xpath("//*[@id='searchBox']"));
        searchBox.sendKeys("Max");

        WebElement delete = driver.findElement(By.xpath("//*[@id='delete-record-4']"));
        delete.click();

        driver.quit();
    }

    @Test(description = "Практика нажатия click-click https://demoqa.com/buttons")

        public void buttonsClick() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/buttons");
        driver.manage().window().maximize();

        WebElement buttonsDoubleClick = driver.findElement(By.xpath("//*[@id='doubleClickBtn']"));
        Actions actions1 = new Actions(driver);
        actions1.doubleClick(buttonsDoubleClick).perform();

        WebElement buttonsRightClick = driver.findElement(By.xpath("//*[@id='rightClickBtn']"));
        Actions actions = new Actions(driver);
        actions.contextClick(buttonsRightClick).perform();

        WebElement buttonsClick = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div[3]/button"));
        buttonsClick.click();

        driver.quit();
    }
}
