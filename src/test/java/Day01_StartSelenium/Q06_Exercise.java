package Day01_StartSelenium;

import AutomationExercise.TestBase;
import org.junit.Assert;
import org.junit.Test;

public class Q06_Exercise extends TestBase {

    @Test
    public void name() {

        // 2. Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını
        //doğrulayın (verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        driver.navigate().to("https://youtube.com");
        String actualTitle1 = driver.getTitle();
        String expectedTitle1 = "youtube";
        if (actualTitle1.contains(expectedTitle1)) {
            System.out.println("Title1 test is PASSED");
        } else {
            System.out.println(actualTitle1);
        } ;

        // 3. Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa
        //doğru URL'yi yazdırın.
        String actualUrl1=driver.getCurrentUrl();
        String expectedUrl1="youtube";
        Assert.assertTrue(actualUrl1.contains(expectedUrl1));

        // 4. Daha sonra Amazon sayfasina gidin https://www.amazon.com/
        driver.navigate().to("https://amazon.com");

        // 5. Youtube sayfasina geri donun
        driver.navigate().back();

        // 6. Sayfayi yenileyin
        driver.navigate().refresh();

        // 7. Amazon sayfasina donun
        driver.navigate().forward();

        // 8. Sayfayi tamsayfa yapin
        driver.manage().window().fullscreen();

        // 9. Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın,
        //Yoksa doğru başlığı(Actual Title) yazdırın.
        String actualTitle2=driver.getTitle();
        String expectedTitle2="Amazon";
        if (actualTitle2.contains(expectedTitle2)) {
            System.out.println("Title1 test is PASSED");
        } else {
            System.out.println(actualTitle2);
        } ;

        // 10.Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru
        //URL'yi yazdırın
        String actualUrl2=driver.getCurrentUrl();
        String expectedUrl2="https://www.amazon.com";
        Assert.assertTrue(actualUrl2.contains(expectedUrl2));

        // 11.Sayfayi kapatin
        driver.quit();
    }
}
