package SeleniumEasyProject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase {

    @Test
    public void test1() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
        Thread.sleep(2000);
        driver.findElement(By.id("at-cv-lightbox-close")).click();
        Thread.sleep(2000);
        WebElement fieldA=driver.findElement(By.id("sum1"));
        fieldA.sendKeys("ChicagoEnter");
        WebElement fieldB=driver.findElement(By.id("sum2"));
        fieldB.sendKeys("IllinoisClick");
        WebElement totalButton = driver.findElement(By.xpath("//button[@onclick='return total()']"));
        totalButton.click();
    }

    @Test
    public void test2() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
        WebElement inputField1 = driver.findElement(By.xpath("//input[@id='sum1']"));
        inputField1.sendKeys("12");
        WebElement inputField2 = driver.findElement(By.xpath("//input[@id='sum2']"));
        inputField2.sendKeys("17");
        WebElement totalButton = driver.findElement(By.xpath("//button[@onclick='return total()']"));
        totalButton.click();
        WebElement getResult = driver.findElement(By.xpath("//div[@style='height: 50px; width: 100%;']"));
        String result = getResult.getText();
        Assert.assertEquals("Total a + b = 29", result);
    }

    @Test

    public void testCase4() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");

        WebElement checkBox = driver.findElement(By.id("isAgeSelected"));
        checkBox.click();
        Assert.assertTrue(checkBox.isSelected());



       WebElement checkPrint = driver.findElement(By.id("txtAge"));

       Assert.assertEquals(checkPrint.getText(),"Success - Check box is checked");
        checkBox.click();

        Assert.assertTrue(!checkPrint.isDisplayed());



    }

    @Test

    public void testCase7() {

        //Navigate to "https://www.seleniumeasy.com/test/basicradiobutton-demo.html"
        //Click on the Male radio button under Group Radio Buttons
        //Demo
        //Validate 'Male' is checked
        //Validate 'Female' is not checked
        //Select 15-50 "Age Group" under Group Radio Buttons Demo
        //Validate the message after clicking on Get Values button

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.seleniumeasy.com/test/basic-radiobutton-demo.html");


        WebElement radioButton = driver.findElement(By.id("isAgeSelected"));
        radioButton.click();
        Assert.assertTrue(radioButton.isSelected());


    }
}
