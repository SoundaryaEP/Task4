import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.assertTrue;

public class Test {
    static WebDriver driver=null;
    @Before
    public void setDriver(){
        driver=BrowserFactory.getDriver();
        driver.get("https://formy-project.herokuapp.com/form");
    }
    @org.junit.Test
    public void testUserRegistration() throws InterruptedException {
        User user = new UserBuilder()
                .withFirstname("A")
                .withLastname("B")
                .withJobTitle("Tester")
                .build();

        // Replace below withLas actual implementation of user registration
        // Using a dummy method for representative purpose
        boolean result = registerUser(user);

        assertTrue(result);
    }
    public boolean registerUser(User user) throws InterruptedException {
        //
        driver.findElement(By.id("first-name")).sendKeys(user.getUsername());
        driver.findElement(By.id("last-name")).sendKeys(user.getJobTitle());
        driver.findElement(By.id("job-title")).sendKeys(user.getLastname());

        driver.findElement(By.id("radio-button-3")).click();

        //select gender
        driver.findElement(By.id("checkbox-2")).click();

        //select experience
        WebElement selectElement = driver.findElement(By.id("select-menu"));
        new Select(selectElement).selectByVisibleText("0-1");

        // Type the desired date
        driver.findElement(By.id("datepicker")).sendKeys("15/07/2024");

        driver.findElement(By.xpath("/html/body/div[1]/form/div/div[8]/a")).click();
        Thread.sleep(2000);


        return driver.getCurrentUrl().equals("https://formy-project.herokuapp.com/thanks");
    }
    @After
    public void clear(){
        BrowserFactory.destroyDriver();
    }


}
