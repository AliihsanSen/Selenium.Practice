package Day01_StartSelenium;

import AutomationExercise.TestBase;
import org.junit.Test;

public class Q02_NavigationMethods extends TestBase {

    @Test
    public void name() {

        // 2. Youtube ana sayfasina gidelim . https://www.youtube.com/
        driver.navigate().to("https://www.youtube.com/");

        // 3. Amazon soyfasina gidelim. https://www.amazon.com/
        driver.navigate().to("https://www.amazon.com/");

        // 4. Tekrar YouTube’sayfasina donelim
        driver.navigate().back();

        // 5. Yeniden Amazon sayfasina gidelim
        driver.navigate().forward();

        // 6. Sayfayi Refresh(yenile) yapalim
        driver.navigate().refresh();

        // 7. Sayfayi kapatalim / Tum sayfalari kapatalim
        driver.quit();
    }
}
