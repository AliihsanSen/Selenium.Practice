package Day01_StartSelenium;

import AutomationExercise.TestBase;
import org.junit.Test;

public class Q03_ManageWindow extends TestBase {

    @Test
    public void name() throws InterruptedException {

        // 2. Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com/");

        // 3. Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println(driver.manage().window().getPosition());
        System.out.println(driver.manage().window().getSize());

        // 4. Sayfayi simge durumuna getirin
        driver.manage().window().minimize();

        // 5. simge durumunda 3 saniye bekleyip sayfayi maximize yapin
        Thread.sleep(3000);
        driver.manage().window().maximize();

        // 6. Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
        System.out.println(driver.manage().window().getPosition());
        System.out.println(driver.manage().window().getSize());

        // 7. Sayfayi fullscreen yapin
        driver.manage().window().fullscreen();

        // 8. Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
        System.out.println("FullScreen konumu : " + driver.manage().window().getPosition());
        System.out.println("FullScreen boyut : " + driver.manage().window().getSize());

        // 9. Sayfayi kapatin
        driver.quit();
    }
}
