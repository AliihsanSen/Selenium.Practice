package Day03_Maven;


import Utilities.TestBaseBeforeMethodAfterMethod;
import org.junit.Test;
import org.openqa.selenium.By;

public class Q01_IlkTest extends TestBaseBeforeMethodAfterMethod {

    @Test
    public void name() {

        // 1. http://zero.webappsecurity.com sayfasina gidin
        driver.get("http://zero.webappsecurity.com");

        // 2. Signin buttonuna tiklayin
        driver.findElement(By.xpath("//*[@id='signin_button']")).click();

        // 3. Login alanine “username” yazdirin
        driver.findElement(By.xpath("//*[@id='user_login']")).sendKeys("username");

        // 4. Password alanine “password” yazdirin
        driver.findElement(By.xpath("//*[@id='user_password']")).sendKeys("password");

        // 5. Sign in buttonuna tiklayin
        driver.findElement(By.xpath("//*[@name='submit']")).click();
    }
}
