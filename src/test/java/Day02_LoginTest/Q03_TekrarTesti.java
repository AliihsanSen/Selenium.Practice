package Day02_LoginTest;

import AutomationExercise.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class Q03_TekrarTesti extends TestBase {

    @Test
    public void name() {

        // 2- https://www.amazon.com/ adresine gidin
        driver.navigate().to("https://www.amazon.com/");

        // 3- Browseri tam sayfa yapin
        driver.manage().window().fullscreen();

        // 4- Sayfayi “refresh” yapin
        driver.navigate().refresh();

        // 5 Sayfa basliginin “Spend less” ifadesi icerdigini test edin
        Assert.assertTrue(driver.getTitle().contains("Spend less"));

        // 6 Gift Cards sekmesine basin
        driver.findElement(By.xpath("(//*[@class='nav-a  '])[4]")).click();

        // 7 Birthday butonuna basin
        driver.findElement(By.xpath("//*[@alt='Birthday gift cards']")).click();

        // 8 Best Seller bolumunden ilk urunu tiklayin
        driver.findElement(By.xpath("(//*[@alt='Amazon.com eGift Card'])[1]")).click();

        // 9- Gift card details’den 25 $’i secin
        driver.findElement(By.xpath("(//*[@id='gc-mini-picker-amount-1'])[1]")).click();

        // 10-Urun ucretinin 25$ oldugunu test edin
        Assert.assertTrue(driver.findElement(By.xpath("(//*[@id='gc-mini-picker-amount-1'])[1]")).isEnabled());

        // 11-Sayfayi kapatin
        driver.quit();
    }
}
