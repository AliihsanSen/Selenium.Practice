package Practice03;

import AutomationExercise.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q01_Iframe extends TestBase {

    @Test
    public void name() {

        // go to the URL https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/
        driver.get("https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/");

        // ikinci emojiye tıklayın (hayvan emojisini seçin).
        WebElement iframe = driver.findElement(By.xpath("//iframe[@id='emoojis']"));
        driver.switchTo().frame(iframe);
        driver.findElement(By.xpath("(//span[@class='mdl-tabs__ripple-container mdl-js-ripple-effect'])[2]")).click();

        // tüm hayvan emojilerine tıklayın.
        List<WebElement> animals = driver.findElements(By.xpath("//div[@class='mdl-tabs__panel is-active']/div/img"));

        for (WebElement each : animals
        ) {
            each.click();
        }
        animals.forEach(t -> t.click());

        // formu doldurun (dilediğinizi yazabilirsiniz).
        driver.switchTo().defaultContent();
        List<WebElement> boxes = driver.findElements(By.xpath("//input[@class='mdl-textfield__input']"));
        List<String> text = new ArrayList<>(Arrays.asList("Türkiyenin", "en", "büyük", "klübü", "Galatasaray'ın", "harika", "forveti", "Icardi", "Cok iyi degil mi?", "", ""));

        for (int i = 0; i < boxes.size(); i++) {
            boxes.get(i).sendKeys(text.get(i));
        }

        // apply butonuna tıklayın.
        driver.findElement(By.xpath("//*[@class='mdl-button mdl-js-button mdl-button--raised mdl-button--colored']")).click();
    }
}
