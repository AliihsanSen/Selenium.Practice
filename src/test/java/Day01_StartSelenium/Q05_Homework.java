package Day01_StartSelenium;

import AutomationExercise.TestBase;
import org.junit.Test;

public class Q05_Homework extends TestBase {

    @Test
    public void name() {
        // 2.ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “facebook”
        //oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
        driver.navigate().to("https://facebook.com");
        String actualTitle1 = driver.getTitle();
        String expectedTitle1 = "facebook";
        if (actualTitle1.contains(expectedTitle1)) {
            System.out.println("Title test is PASSED");
        } else {
            System.out.println(actualTitle1);
        }

        // 3.Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i
        //yazdirin.
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "facebook";
        if (actualUrl.contains(expectedUrl)) {
            System.out.println("URL test is PASSED");
        } else {
            System.out.println(actualUrl);
        }

        // 4.https://www.walmart.com/ sayfasina gidin.
        driver.navigate().to("https://www.walmart.com/");

        // 5. Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        String actualTitle2 = driver.getTitle();
        String expectedTitle2 = "Walmart.com";
        if (actualTitle2.contains(expectedTitle2)) {
            System.out.println("Title2 test is PASSED");
        } else {
            System.out.println("Title2 test is FAILED");
        }

        // 6. Tekrar “facebook” sayfasina donun
        driver.navigate().back();

        // 7. Sayfayi yenileyin
        driver.navigate().refresh();

        // 8.Sayfayi tam sayfa (maximize) yapin
        driver.manage().window().maximize();

        // 9.Browser’i kapatin
        driver.quit();
    }
}
