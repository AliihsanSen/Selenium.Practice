package Day01_StartSelenium;

import AutomationExercise.TestBase;
import org.junit.Assert;
import org.junit.Test;

public class Q01_DrivergetMethodlari extends TestBase {

    @Test
    public void name() {

        // 3. Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com/");

        // 4. Sayfa basligini(title) yazdirin
        System.out.println(driver.getTitle());

        // 5. Sayfa basliginin “Amazon” icerdigini test edin
        String actualTitle = driver.getTitle();
        String expectedTitle = "Amazon";
        Assert.assertTrue(actualTitle.contains(expectedTitle));
        // 6. Sayfa adresini(url) yazdirin
        System.out.println(driver.getCurrentUrl());

        // 7. Sayfa url’inin “amazon” icerdigini test edin.
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "amazon";
        Assert.assertTrue(actualUrl.contains(expectedUrl));
        // 8. Sayfa handle degerini yazdirin
        System.out.println(driver.getWindowHandle());

        // 9. Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
        String actualHTML = driver.getPageSource();
        String expectedHTML = "Gateaway";
        Assert.assertTrue(actualHTML.contains(expectedHTML));

        // 10. Sayfayi kapatin.
        driver.quit();

    }
}
