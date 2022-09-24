package Day01_StartSelenium;

import AutomationExercise.TestBase;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;

public class Q04_ManageWindowSet extends TestBase {

    @Test
    public void name() {

        // 2. Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com/");

        // 3. Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println(driver.manage().window().getPosition());
        System.out.println(driver.manage().window().getSize());

        // 4. Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
        driver.manage().window().setPosition(new Point(10,15));
        driver.manage().window().setSize(new Dimension(757,720));

        // 5. Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
        System.out.println(driver.manage().window().getPosition());
        System.out.println(driver.manage().window().getSize());

        // 8. Sayfayi kapatin
        driver.close();
    }
}
