package Day02_LoginTest;

import AutomationExercise.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Q02_XPath extends TestBase {

    @Test
    public void name() {

        // 1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        // 2- Add Element butonuna basin
        driver.findElement(By.xpath("//*[text()='Add Element']")).click();

        // 3 Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButton = driver.findElement(By.xpath("//*[text()='Delete']"));
        Assert.assertTrue(deleteButton.isDisplayed());

        // 4 Delete tusuna basin
        deleteButton.click();

        // 5 “Add/Remove Elements” yazisinin gorunur oldugunu test edin
        Assert.assertTrue(driver.findElement(By.xpath("//*[text()='Add/Remove Elements']")).isDisplayed());
    }
}
