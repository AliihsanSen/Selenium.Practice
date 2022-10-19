package Day02_LoginTest;


import Utilities.TestBaseBeforeMethodAfterMethod;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class Q01_LoginTest extends TestBaseBeforeMethodAfterMethod {

    @Test
    public void name() {

        // a.web sayfasına gidin. https://www.amazon.com/
        driver.get("https://www.amazon.com/");

        // b. Search(ara) “city bike”
        WebElement serachBox = driver.findElement(By.id("twotabsearchtextbox"));
        serachBox.sendKeys("city bike" + Keys.ENTER);

        // c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        WebElement result = driver.findElement(By.xpath("(//div[@class='a-section a-spacing-small a-spacing-top-small'])[1]"));
        System.out.println(result.getText());

        // d. Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
        driver.findElement(By.xpath("(//img[@class='s-image'])[1]")).click();
    }
}
